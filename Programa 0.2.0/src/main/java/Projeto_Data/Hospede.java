package Projeto_Data;

public class Hospede {

    private String nome;
    private String cpf;
    private String telefone;
    
    // Variável estática para armazenar um hóspede atual
    private static Hospede hospedeAtual;

    public Hospede(String nome, String cpf, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    // Acessar o hóspede atual
    public static Hospede getHospedeAtual() {
        return hospedeAtual;
    }

    // Configurar o hóspede atual
    public static void setHospedeAtual(Hospede hospede) {
        hospedeAtual = hospede;
    }

}