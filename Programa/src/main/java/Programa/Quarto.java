package Programa;

public class Quarto {
    private String numero;
    private String tipo;
    private double precoDiaria;
    private String status;

    public Quarto(String numero, String tipo, double precoDiaria) {
        this.numero = numero;
        this.tipo = tipo;
        this.precoDiaria = precoDiaria;
        this.status = "Disponível";
    }

    public void atualizarStatus(String novoStatus) {
        this.status = novoStatus;
    }

    public boolean consultarDisponibilidade() {
        return status.equals("Disponível");
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecoDiaria() {
        return precoDiaria;
    }

    public void setPrecoDiaria(double precoDiaria) {
        this.precoDiaria = precoDiaria;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    
}
