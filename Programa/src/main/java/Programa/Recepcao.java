package Programa;

import java.util.ArrayList;
import java.util.List;

public class Recepcao {
    private String agenda;
    private List<Hospede> listaHospedes;
    private List<Quarto> listaQuartos;
    private List<Reserva> listaReservas;

    public Recepcao() {
        this.listaHospedes = new ArrayList<>();
        this.listaQuartos = new ArrayList<>();
        this.listaReservas = new ArrayList<>();
    }

    public void fazerReserva(Hospede hospede, Quarto quarto, Reserva reserva) {
        if (quarto.consultarDisponibilidade()) {
            listaReservas.add(reserva);
            hospede.fazerReserva(reserva);
            quarto.atualizarStatus("Ocupado");
            System.out.println("Reserva confirmada para o quarto: " + quarto.getNumero());
        } else {
            System.out.println("Quarto indisponível.");
        }
    }

    public String getAgenda() {
        return agenda;
    }

    public void setAgenda(String agenda) {
        this.agenda = agenda;
    }

    public List<Hospede> getListaHospedes() {
        return listaHospedes;
    }

    public void setListaHospedes(List<Hospede> listaHospedes) {
        this.listaHospedes = listaHospedes;
    }

    public List<Quarto> getListaQuartos() {
        return listaQuartos;
    }

    public void setListaQuartos(List<Quarto> listaQuartos) {
        this.listaQuartos = listaQuartos;
    }

    public List<Reserva> getListaReservas() {
        return listaReservas;
    }

    public void setListaReservas(List<Reserva> listaReservas) {
        this.listaReservas = listaReservas;
    }

    
}

