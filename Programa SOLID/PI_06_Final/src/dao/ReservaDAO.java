package dao;

import model.Reserva;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ReservaDAO {

    private final Connection conn;

    public ReservaDAO(Connection conn) {
        this.conn = conn;
    }

    public boolean insert(Reserva reserva) {
        String query = "INSERT INTO reserva (hospede_id, telefoneHospede, quarto_id, valorTotal, checkIn, checkOut) "
                + "VALUES (?, ?, ?, ?, ?, ?)";

        try ( PreparedStatement pst = conn.prepareStatement(query)) {
            pst.setInt(1, reserva.getHospedeId());
            pst.setString(2, reserva.getTelefoneHospede());
            pst.setInt(3, reserva.getQuartoId());
            pst.setDouble(4, reserva.getValorTotal());
            pst.setDate(5, Date.valueOf(reserva.getCheckIn()));
            pst.setDate(6, Date.valueOf(reserva.getCheckOut()));

            return pst.executeUpdate() > 0;
        } catch (SQLException e) {
            System.err.println("Erro ao inserir reserva: " + e.getMessage());
            return false;
        }
    }

    public List<Reserva> getReservas() {
        List<Reserva> reservas = new ArrayList<>();
        String query = "SELECT * FROM reserva";

        try ( PreparedStatement pst = conn.prepareStatement(query);  ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {
                Reserva reserva = new Reserva();
                reserva.setId(rs.getInt("id"));
                reserva.setHospedeId(rs.getInt("hospede_id"));
                reserva.setTelefoneHospede(rs.getString("telefoneHospede"));
                reserva.setQuartoId(rs.getInt("quarto_id"));
                reserva.setValorTotal(rs.getDouble("valorTotal"));
                reserva.setCheckIn(rs.getDate("checkIn").toLocalDate());
                reserva.setCheckOut(rs.getDate("checkOut").toLocalDate());
                reservas.add(reserva);
            }

        } catch (SQLException e) {
            System.err.println("Erro ao recuperar reservas: " + e.getMessage());
        }

        return reservas;
    }

    public Integer excluirReservaRetornandoQuartoId(int reservaId) {
        String buscarQuartoSql = "SELECT quarto_id FROM reserva WHERE id = ?";
        String excluirSql = "DELETE FROM reserva WHERE id = ?";

        try ( PreparedStatement stmtBuscar = conn.prepareStatement(buscarQuartoSql)) {
            stmtBuscar.setInt(1, reservaId);
            ResultSet rs = stmtBuscar.executeQuery();
            if (!rs.next()) {
                // Reserva não existe
                return null;
            }
            int quartoId = rs.getInt("quarto_id");

            try ( PreparedStatement stmtExcluir = conn.prepareStatement(excluirSql)) {
                stmtExcluir.setInt(1, reservaId);
                int rows = stmtExcluir.executeUpdate();
                if (rows > 0) {
                    return quartoId;
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro ao excluir reserva: " + e.getMessage());
        }
        return null;
    }

}
