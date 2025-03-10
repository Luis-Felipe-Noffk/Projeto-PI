package Programa;

import java.util.ArrayList;
import java.util.List;

public class Hospede {
    private String nome;
    private String cpf;
    private String telefone;
    private String endereco;
    private List<Reserva> listaReservas;

    public Hospede(String nome, String cpf, String telefone, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
        this.listaReservas = new ArrayList<>();
    }

    public void fazerReserva(Reserva reserva) {
        listaReservas.add(reserva);
        System.out.println("Reserva realizada para o hóspede: " + nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<Reserva> getListaReservas() {
        return listaReservas;
    }

    public void setListaReservas(List<Reserva> listaReservas) {
        this.listaReservas = listaReservas;
    }
    
    
}
