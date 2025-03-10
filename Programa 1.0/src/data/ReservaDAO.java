package data;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ReservaDAO {

    // Método para inserir
    public boolean insert(Reserva reserva) {
        String query = "INSERT INTO reserva (hospede_id, telefoneHospede, quarto_id, valorTotal, checkIn, checkOut) VALUES (?, ?, ?, ?, ?, ?)";

        try ( Connection conn = new Conect().getConect();  PreparedStatement pst = conn.prepareStatement(query)) {

            pst.setInt(1, reserva.getHospedeId());
            pst.setString(2, reserva.getTelefoneHospede());
            pst.setInt(3, reserva.getQuartoId());
            pst.setDouble(4, reserva.getValorTotal());
            pst.setDate(5, Date.valueOf(reserva.getCheckIn()));
            pst.setDate(6, Date.valueOf(reserva.getCheckOut()));

            int rowsAffected = pst.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            System.out.println("Erro ao inserir reserva: " + e.getMessage());
            return false;
        }
    }

    // Método para recuperar todas as reservas
    public List<Reserva> getReservas() {
        List<Reserva> reservas = new ArrayList<>();
        String query = "SELECT * FROM reserva";

        try ( Connection conn = new Conect().getConect();  Statement stmt = conn.createStatement();  ResultSet rs = stmt.executeQuery(query)) {

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
            System.out.println("Erro ao recuperar reservas: " + e.getMessage());
        }
        return reservas;
    }

    // Método para excluir uma reserva pelo ID
    public boolean excluirReserva(int reservaId) {
        String query = "DELETE FROM reserva WHERE id = ?";

        try ( Connection conn = new Conect().getConect();  PreparedStatement pst = conn.prepareStatement(query)) {

            pst.setInt(1, reservaId);
            int rowsAffected = pst.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            System.out.println("Erro ao excluir reserva: " + e.getMessage());
            return false;
        }
    }
}
