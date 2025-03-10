package Projeto_Data;

import java.util.ArrayList;
import java.util.List;

public class Quarto {
    private String numero;
    private String tipo;
    private double precoDiaria;
    private boolean status;
    
    private static List<Quarto> quartos = new ArrayList<>();

    public Quarto(String numero, String tipo, double precoDiaria, boolean status) {
        this.numero = numero;
        this.tipo = tipo;
        this.precoDiaria = precoDiaria;
        this.status = status;
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

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    // Método para inicializar a lista de quartos
    public static void iniciarQuartos() {
        if (!quartos.isEmpty()) return;

        quartos.add(new Quarto("401", "Luxo", 600.0, true));
        quartos.add(new Quarto("402", "Luxo", 600.0, true));
        quartos.add(new Quarto("301", "Duplo", 400.0, true));
        quartos.add(new Quarto("302", "Duplo", 400.0, true));
        quartos.add(new Quarto("303", "Duplo", 400.0, true));
        quartos.add(new Quarto("201", "Simples", 200.0, true));
        quartos.add(new Quarto("202", "Simples", 200.0, true));
        quartos.add(new Quarto("203", "Simples", 200.0, true));
        quartos.add(new Quarto("101", "Simples", 200.0, true));
        quartos.add(new Quarto("102", "Simples", 200.0, true));
        quartos.add(new Quarto("103", "Simples", 200.0, true));
    }

    // Método para retornar todos os quartos
    public static List<Quarto> getQuartos() {
        return quartos;
    }
}
