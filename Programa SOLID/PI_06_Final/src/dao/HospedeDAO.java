package dao;

import model.Hospede;
import java.sql.*;

public class HospedeDAO {
    private final Connection conn;

    public HospedeDAO(Connection conn) {
        this.conn = conn;
    }

    public int inserir(Hospede hospede) {
        String sql = "INSERT INTO hospede (nome, cpf, telefone) VALUES (?, ?, ?)";
        int idHospede = -1;
        try (PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            stmt.setString(1, hospede.getNome());
            stmt.setString(2, hospede.getCpf());
            stmt.setString(3, hospede.getTelefone());
            stmt.executeUpdate();

            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                idHospede = rs.getInt(1);
            }

            System.out.println("Hóspede inserido com sucesso! ID gerado: " + idHospede);
        } catch (SQLException e) {
            System.out.println("Erro ao inserir hóspede: " + e.getMessage());
        }
        return idHospede;
    }

    public Hospede buscarPorCpf(String cpf) {
        String sql = "SELECT * FROM hospede WHERE cpf = ?";
        Hospede hospede = null;
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, cpf);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                hospede = new Hospede();
                hospede.setId(rs.getInt("id"));
                hospede.setNome(rs.getString("nome"));
                hospede.setCpf(rs.getString("cpf"));
                hospede.setTelefone(rs.getString("telefone"));
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar hóspede por CPF: " + e.getMessage());
        }
        return hospede;
    }
}
