package service;

import dao.HospedeDAO;
import dao.QuartoDAO;
import dao.ReservaDAO;
import model.Hospede;
import model.Quarto;
import model.Reserva;

import java.sql.Connection;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Scanner;

public class ReservaService {

    private final HospedeDAO hospedeDAO;
    private final QuartoDAO quartoDAO;
    private final ReservaDAO reservaDAO;
    private final Scanner sc;
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public ReservaService(Connection conn, Scanner sc) {
        this.hospedeDAO = new HospedeDAO(conn);
        this.quartoDAO = new QuartoDAO(conn);
        this.reservaDAO = new ReservaDAO(conn);
        this.sc = sc;
    }

    public void agendarReserva() {
        try {
            String nome = lerNome();
            String cpf = lerCpf();
            String telefone = lerTelefone();

            Quarto quarto = escolherQuarto();

            LocalDate checkIn = lerData("Check-in");
            LocalDate checkOut = lerData("Check-out", checkIn);

            double valorTotal = calcularValorTotal(checkIn, checkOut, quarto.getDiaria());

            Hospede hospede = new Hospede();
            hospede.setNome(nome);
            hospede.setCpf(cpf);
            hospede.setTelefone(telefone);
            int idHospede = hospedeDAO.inserir(hospede);

            Reserva reserva = new Reserva();
            reserva.setHospedeId(idHospede);
            reserva.setTelefoneHospede(telefone);
            reserva.setQuartoId(quarto.getId());
            reserva.setValorTotal(valorTotal);
            reserva.setCheckIn(checkIn);
            reserva.setCheckOut(checkOut);

            if (reservaDAO.insert(reserva)) {
                quartoDAO.atualizarDisponibilidade(quarto.getId(), false);
                System.out.println("Reserva efetuada com sucesso!");
            }
        } catch (Exception e) {
            System.out.println("Erro ao agendar reserva: " + e.getMessage());
        }
    }

    // ===== Métodos auxiliares de validação =====
    private String lerNome() {
        String nome;
        do {
            System.out.print("Nome do hóspede: ");
            nome = sc.nextLine().trim();
            if (nome.isEmpty()) {
                System.out.println("Nome não pode estar vazio.");
            }
        } while (nome.isEmpty());
        return nome;
    }

    public String lerCpf() {
        String cpf;
        while (true) {
            System.out.print("CPF (000.000.000-00): ");
            cpf = sc.nextLine();
            if (!cpf.matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}")) {
                System.out.println("Formato de CPF inválido.");
            } else if (hospedeDAO.buscarPorCpf(cpf) != null) {
                System.out.println("CPF já cadastrado. Informe um CPF diferente.");
            } else {
                return cpf;
            }
        }
    }

    public String lerTelefone() {
        String telefone;
        while (true) {
            System.out.print("Telefone (0000-0000): ");
            telefone = sc.nextLine();
            if (telefone.matches("\\d{4}-\\d{4}")) {
                return telefone;
            }
            System.out.println("Formato de telefone inválido. Tente novamente.");
        }
    }

    private Quarto escolherQuarto() {
        List<Quarto> quartos = quartoDAO.getQuartos();
        System.out.println("\nQuartos disponíveis:");
        quartos.stream().filter(Quarto::isDisponivel)
                .forEach(q -> System.out.printf("ID: %d - Número: %s - Tipo: %s - Diária: %.2f\n",
                q.getId(), q.getNumero(), q.getTipo(), q.getDiaria()));

        while (true) {
            System.out.print("Digite o ID do quarto: ");
            if (sc.hasNextInt()) {
                int quartoId = sc.nextInt();
                sc.nextLine();
                return quartos.stream()
                        .filter(q -> q.getId() == quartoId && q.isDisponivel())
                        .findFirst()
                        .orElseGet(() -> {
                            System.out.println("Quarto inválido ou indisponível. Escolha novamente.");
                            return null;
                        });
            } else {
                System.out.println("Entrada inválida. Digite um número.");
                sc.nextLine();
            }
        }
    }

    private LocalDate lerData(String tipo) {
        while (true) {
            try {
                System.out.printf("Data %s (dd/MM/yyyy): ", tipo);
                LocalDate data = LocalDate.parse(sc.nextLine(), formatter);
                if (tipo.equals("Check-in") && data.isBefore(LocalDate.now())) {
                    System.out.println("Check-in não pode ser em data passada.");
                    continue;
                }
                return data;
            } catch (DateTimeParseException e) {
                System.out.println("Formato de data inválido. Use dd/MM/yyyy.");
            }
        }
    }

    private LocalDate lerData(String tipo, LocalDate checkIn) {
        while (true) {
            LocalDate checkOut = lerData(tipo);
            if (!checkOut.isAfter(checkIn)) {
                System.out.println("Check-out deve ser após o check-in.");
            } else {
                return checkOut;
            }
        }
    }

    // ===== Métodos auxiliares de negócio =====
    public void listarReservas() {
        List<Reserva> reservas = reservaDAO.getReservas();
        if (reservas.isEmpty()) {
            System.out.println("Nenhuma reserva encontrada.");
        } else {
            reservas.forEach(r -> System.out.printf(
                    "ID: %d | HóspedeID: %d | Telefone: %s | QuartoID: %d | Valor: %.2f | Check-in: %s | Check-out: %s\n",
                    r.getId(), r.getHospedeId(), r.getTelefoneHospede(), r.getQuartoId(),
                    r.getValorTotal(), r.getCheckIn(), r.getCheckOut()));
        }
    }

    public void listarQuartos() {
        List<Quarto> quartos = quartoDAO.getQuartos();
        if (quartos.isEmpty()) {
            System.out.println("Nenhum quarto encontrado.");
        } else {
            quartos.forEach(q -> System.out.printf(
                    "ID: %d | Número: %s | Tipo: %s | Diária: %.2f | Disponível: %b\n",
                    q.getId(), q.getNumero(), q.getTipo(), q.getDiaria(), q.isDisponivel()));
        }
    }

    public void excluirReserva() {
        listarReservas();

        System.out.print("Digite o ID da reserva a ser excluída: ");
        int reservaId = sc.nextInt();
        sc.nextLine();

        Integer quartoId = reservaDAO.excluirReservaRetornandoQuartoId(reservaId);
        if (quartoId != null) {
            quartoDAO.atualizarDisponibilidade(quartoId, true);
            System.out.println("Reserva excluída e quarto liberado.");
        } else {
            System.out.println("Reserva não encontrada ou erro ao excluir.");
        }
    }

    public double calcularValorTotal(LocalDate checkIn, LocalDate checkOut, double diaria) {
        long dias = checkOut.toEpochDay() - checkIn.toEpochDay();
        return dias * diaria;
    }
}
