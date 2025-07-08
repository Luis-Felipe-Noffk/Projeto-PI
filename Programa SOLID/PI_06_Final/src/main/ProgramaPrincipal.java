package main;

import service.ReservaService;

import java.sql.Connection;
import java.util.Scanner;
import data.ConexaoBD;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        try (Connection conn = ConexaoBD.getConexao(); Scanner sc = new Scanner(System.in)) {
            if (conn == null) {
                System.out.println("Não foi possível conectar ao banco de dados.");
                return;
            }

            ReservaService reservaService = new ReservaService(conn, sc);

            int opcao;
            do {
                System.out.println("\n===== MENU =====");
                System.out.println("1. Agendar reserva");
                System.out.println("2. Listar reservas");
                System.out.println("3. Listar quartos");
                System.out.println("4. Excluir reserva");
                System.out.println("0. Sair");
                System.out.print("Escolha uma opção: ");
                opcao = sc.nextInt();
                sc.nextLine();

                switch (opcao) {
                    case 1 -> reservaService.agendarReserva();
                    case 2 -> reservaService.listarReservas();
                    case 3 -> reservaService.listarQuartos();
                    case 4 -> reservaService.excluirReserva();
                    case 0 -> System.out.println("Saindo...");
                    default -> System.out.println("Opção inválida!");
                }
            } while (opcao != 0);
        } catch (SQLException ex) {
            Logger.getLogger(ProgramaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
