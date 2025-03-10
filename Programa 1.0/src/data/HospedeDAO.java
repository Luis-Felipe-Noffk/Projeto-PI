package data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class HospedeDAO {

    private Conect conect;
    private Connection conn;

    public HospedeDAO() {
        this.conect = new Conect();
        this.conn = this.conect.getConect();
    }

    public int inserir(Hospede hospede) {
        String sql = "INSERT INTO hospede (nome, cpf, telefone) VALUES (?, ?, ?)";
        int idHospede = -1;  // Variável para armazenar o ID gerado
        try {
            // Usando o método RETURN_GENERATED_KEYS para capturar o ID gerado
            PreparedStatement stmt = this.conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            stmt.setString(1, hospede.getNome());
            stmt.setString(2, hospede.getCpf());
            stmt.setString(3, hospede.getTelefone());
            stmt.executeUpdate();  // Execute o insert

            // Obter o ID gerado
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                idHospede = rs.getInt(1);  // O ID gerado estará na primeira coluna
            }

            System.out.println("Hóspede inserido com sucesso! ID gerado: " + idHospede);
        } catch (SQLException e) {
            System.out.println("Erro ao inserir hóspede: " + e.getMessage());
        }
        return idHospede;  // Retorna o ID gerado
    }
    
    // Método para buscar um hóspede pelo idHospede
    public Hospede buscarHospedePorId(int idHospede) {
        String sql = "SELECT nome, telefone FROM hospede WHERE id = ?";
        Hospede hospede = null;
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setInt(1, idHospede);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                // Criando um objeto Hospede com os dados do banco
                hospede = new Hospede();
                hospede.setNome(rs.getString("nome"));
                hospede.setTelefone(rs.getString("telefone"));
            }

        } catch (SQLException e) {
            System.out.println("Erro ao buscar hóspede: " + e.getMessage());
        }
        return hospede;
    }
}
