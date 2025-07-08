package dao;

import model.Quarto;
import java.sql.*;
import java.util.*;

public class QuartoDAO {
    private final Connection conn;

    public QuartoDAO(Connection conn) {
        this.conn = conn;
    }

    public List<Quarto> getQuartos() {
        List<Quarto> quartos = new ArrayList<>();
        String sql = "SELECT * FROM quarto";

        try (PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Quarto quarto = new Quarto();
                quarto.setId(rs.getInt("id"));
                quarto.setNumero(rs.getString("numero"));
                quarto.setTipo(rs.getString("tipo"));
                quarto.setDiaria(rs.getDouble("diaria"));
                quarto.setDisponivel(rs.getBoolean("disponivel"));
                quartos.add(quarto);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar quartos: " + e.getMessage());
        }

        return quartos;
    }

    public void atualizarDisponibilidade(int quartoId, boolean disponivel) {
        String sql = "UPDATE quarto SET disponivel = ? WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setBoolean(1, disponivel);
            stmt.setInt(2, quartoId);

            int linhasAfetadas = stmt.executeUpdate();
            if (linhasAfetadas > 0) {
                System.out.println("Status do quarto atualizado com sucesso.");
            } else {
                System.out.println("Nenhum quarto atualizado.");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar disponibilidade: " + e.getMessage());
        }
    }
}
