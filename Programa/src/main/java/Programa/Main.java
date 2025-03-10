package Programa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            sdf.setLenient(false);
            
            Recepcao recepcao = new Recepcao();
            Quarto quarto1 = new Quarto("101", "Simples", 200.00);
            Quarto quarto2 = new Quarto("102", "Duplo", 400.00);
            Quarto quarto3 = new Quarto("103", "Luxo", 600.00);
            recepcao.getListaQuartos().add(quarto1);
            recepcao.getListaQuartos().add(quarto2);
            recepcao.getListaQuartos().add(quarto3);
            
            int opcao;
            do {
                System.out.println("\n----- Sistema de Reservas -----");
                System.out.println("[1] Fazer reserva");
                System.out.println("[2] Cancelar reserva");
                System.out.println("[3] Ver histórico de reservas");
                System.out.println("[0] Sair");
                System.out.print("Escolha uma opção: ");
                opcao = scanner.nextInt();
                scanner.nextLine();
                
                switch (opcao) {
                    case 1 -> {
                        boolean quartosDisponiveis = recepcao.getListaQuartos().stream()
                            .anyMatch(Quarto::consultarDisponibilidade);

                        if (!quartosDisponiveis) {
                            System.out.println("Não há quartos disponíveis no momento. Retornando ao menu...");
                            break;
                        }

                        System.out.print("----- Cadastro de Hóspede -----\n\n");
                        System.out.print("Nome do hóspede: ");
                        String nome = scanner.nextLine();
                        System.out.print("CPF do hóspede: ");
                        String cpf = scanner.nextLine();
                        System.out.print("Telefone do hóspede: ");
                        String telefone = scanner.nextLine();
                        System.out.print("Endereço do hóspede: ");
                        String endereco = scanner.nextLine();

                        Hospede hospede = new Hospede(nome, cpf, telefone, endereco);
                        recepcao.getListaHospedes().add(hospede);

                        Quarto quartoEscolhido = null;
                        while (quartoEscolhido == null) {
                            System.out.println("\nQuartos disponíveis:");
                            for (Quarto quarto : recepcao.getListaQuartos()) {
                                if (quarto.consultarDisponibilidade()) {
                                    System.out.println("Quarto: " + quarto.getNumero() + " - Tipo: " + quarto.getTipo() +
                                            " - Preço Diária: R$ " + quarto.getPrecoDiaria());
                                }
                            }

                            System.out.print("\nEscolha o número do quarto: ");
                            String numeroQuarto = scanner.nextLine();
                            quartoEscolhido = recepcao.getListaQuartos().stream()
                                    .filter(q -> q.getNumero().equals(numeroQuarto) && q.consultarDisponibilidade())
                                    .findFirst()
                                    .orElse(null);

                            if (quartoEscolhido == null) {
                                System.out.println("Quarto inválido ou indisponível. Tente novamente.");
                            }
                        }

                        Date checkIn = null, checkOut = null;
                        while (checkIn == null) {
                            try {
                                System.out.print("Data de Check-In (dd/MM/yyyy): ");
                                checkIn = sdf.parse(scanner.nextLine());
                                if (checkIn.before(new Date())) {
                                    System.out.println("A data de check-in não pode ser no passado. Tente novamente.");
                                    checkIn = null;
                                }
                            } catch (ParseException e) {
                                System.out.println("Data inválida. Use o formato dd/MM/yyyy.");
                            }
                        }

                        while (checkOut == null) {
                            try {
                                System.out.print("Data de Check-Out (dd/MM/yyyy): ");
                                checkOut = sdf.parse(scanner.nextLine());
                                if (checkOut.before(checkIn)) {
                                    System.out.println("A data de check-out deve ser posterior à data de check-in. Tente novamente.");
                                    checkOut = null;
                                }
                            } catch (ParseException e) {
                                System.out.println("Data inválida. Use o formato dd/MM/yyyy.");
                            }
                        }

                        Reserva reserva = new Reserva(checkIn, checkOut, hospede, quartoEscolhido);
                        recepcao.fazerReserva(hospede, quartoEscolhido, reserva);
                        System.out.println("Reserva realizada com sucesso!");
                    }
                    
                    case 2 -> {
                        System.out.print("Informe o CPF do hóspede: ");
                        String cpf = scanner.nextLine();
                        Hospede hospede = recepcao.getListaHospedes().stream()
                                .filter(h -> h.getCpf().equals(cpf))
                                .findFirst()
                                .orElse(null);
                        
                        if (hospede == null) {
                            System.out.println("Hóspede não encontrado.");
                            break;
                        }
                        
                        if (hospede.getListaReservas().isEmpty()) {
                            System.out.println("Este hóspede não possui reservas ativas.");
                            break;
                        }
                        
                        int numReserva = -1;
                        while (numReserva < 1 || numReserva > hospede.getListaReservas().size()) {
                            System.out.println("\nReservas ativas do hóspede:");
                            for (int i = 0; i < hospede.getListaReservas().size(); i++) {
                                Reserva r = hospede.getListaReservas().get(i);
                                System.out.println((i + 1) + ". Quarto: " + r.getQuarto().getNumero() +
                                        " - Check-In: " + sdf.format(r.getDataCheckIn()) +
                                        " - Check-Out: " + sdf.format(r.getDataCheckOut()));
                            }
                            
                            System.out.print("Informe o número da reserva a ser cancelada: ");
                            numReserva = scanner.nextInt();
                            scanner.nextLine();
                            
                            if (numReserva < 1 || numReserva > hospede.getListaReservas().size()) {
                                System.out.println("Número de reserva inválido. Tente novamente.");
                            }
                        }
                        
                        Reserva reservaCancelada = hospede.getListaReservas().remove(numReserva - 1);
                        reservaCancelada.getQuarto().atualizarStatus("Disponível");
                        System.out.println("Reserva cancelada com sucesso!");
                    }
                    
                    case 3 -> {
                        System.out.print("Informe o CPF do hóspede: ");
                        String cpf = scanner.nextLine();
                        Hospede hospede = recepcao.getListaHospedes().stream()
                                .filter(h -> h.getCpf().equals(cpf))
                                .findFirst()
                                .orElse(null);
                        
                        if (hospede == null) {
                            System.out.println("Hóspede não encontrado.");
                            break;
                        }
                        
                        System.out.println("\nHistórico de reservas:");
                        for (Reserva r : hospede.getListaReservas()) {
                            System.out.println("Quarto: " + r.getQuarto().getNumero() +
                                    " - Check-In: " + sdf.format(r.getDataCheckIn()) +
                                    " - Check-Out: " + sdf.format(r.getDataCheckOut()) +
                                    " - Valor Total: R$ " + r.getValorTotal());
                        }
                    }
                    
                    case 0 -> System.out.println("Saindo do sistema...");
                    default -> System.out.println("Opção inválida. Tente novamente.");
                }
            } while (opcao != 0);
        }
    }
}
