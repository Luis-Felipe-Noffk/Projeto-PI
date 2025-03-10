package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conect {

    public Connection getConect() {

        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost/ hotel_pi ", // linha de conexao
                    "root", // usuario do mysql
                    "Godisgay2801"// senha do mysql
            );
            return conn;

        } catch (SQLException e) {
            System.out.println("Erro ao conectar: " + e.getMessage());
            return null;
        }

    }

}
