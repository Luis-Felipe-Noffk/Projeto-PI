package Projeto_Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Reserva {

    private String nomeHospede;
    private String telefoneHospede;
    private String numeroQuarto;
    private double valorTotal;
    private Date checkIn;
    private Date checkOut;

    private static List<Reserva> reservas = new ArrayList<>();

    public Reserva(String nomeHospede, String telefoneHospede, String numeroQuarto, double valorTotal, Date checkIn, Date checkOut) {
        this.nomeHospede = nomeHospede;
        this.telefoneHospede = telefoneHospede;
        this.numeroQuarto = numeroQuarto;
        this.valorTotal = valorTotal;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }
    
    public String getNomeHospede() {
        return nomeHospede;
    }

    public void setNomeHospede(String nomeHospede) {
        this.nomeHospede = nomeHospede;
    }

    public String getNumeroQuarto() {
        return numeroQuarto;
    }

    public String getTelefoneHospede() {
        return telefoneHospede;
    }

    public void setTelefoneHospede(String telefoneHospede) {
        this.telefoneHospede = telefoneHospede;
    }

    public void setNumeroQuarto(String numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }

    // Método para adicionar uma nova reserva à lista
    public static void adicionarReserva(Reserva novaReserva) {
        reservas.add(novaReserva);
    }

    // Método para obter todas as reservas
    public static List<Reserva> getReservas() {
        return reservas;
    }
    
}
