package Programa;

import java.util.Date;

public class Reserva {
    private Date dataCheckIn;
    private Date dataCheckOut;
    private Hospede hospede;
    private Quarto quarto;
    private double valorTotal;

    public Reserva(Date dataCheckIn, Date dataCheckOut, Hospede hospede, Quarto quarto) {
        this.dataCheckIn = dataCheckIn;
        this.dataCheckOut = dataCheckOut;
        this.hospede = hospede;
        this.quarto = quarto;
        this.valorTotal = calcularValorTotal();
    }

    private double calcularValorTotal() {
        long diff = dataCheckOut.getTime() - dataCheckIn.getTime();
        int dias = (int) (diff / (1000 * 60 * 60 * 24));
        return dias * quarto.getPrecoDiaria();
    }

    public Date getDataCheckIn() {
        return dataCheckIn;
    }

    public void setDataCheckIn(Date dataCheckIn) {
        this.dataCheckIn = dataCheckIn;
    }

    public Date getDataCheckOut() {
        return dataCheckOut;
    }

    public void setDataCheckOut(Date dataCheckOut) {
        this.dataCheckOut = dataCheckOut;
    }

    public Hospede getHospede() {
        return hospede;
    }

    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    
}
