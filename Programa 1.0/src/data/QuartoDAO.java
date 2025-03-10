package data;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class QuartoDAO {

    private Connection conn;

    // Construtor da classe QuartoDAO
    public QuartoDAO() {
        this.conn = new Conect().getConect();
    }

    // Método para obter todos os quartos do banco de dados
    public List<Quarto> getQuartos() {
        List<Quarto> quartos = new ArrayList<>();
        String sql = "SELECT * FROM quarto";

        try ( PreparedStatement stmt = conn.prepareStatement(sql);  ResultSet rs = stmt.executeQuery()) {

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
        }

        return quartos;
    }
    // Método para Atulizar as Tabelas
    public void atualizar(int quartoId, boolean disponivel) {
        String sql = "UPDATE quarto SET disponivel = ? WHERE id = ?";

        try ( PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setBoolean(1, disponivel);
            stmt.setInt(2, quartoId);

            int linhasAfetadas = stmt.executeUpdate();

            if (linhasAfetadas > 0) {
                System.out.println("Status do quarto atualizado para " + (disponivel ? "vago" : "ocupado") + " com sucesso!");
            } else {
                System.out.println("Nenhum quarto foi atualizado. Verifique se o quartoId (" + quartoId + ") está correto.");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar status do quarto: " + e.getMessage());
        }
    }

}
