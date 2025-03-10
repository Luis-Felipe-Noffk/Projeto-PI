package view;

import data.Hospede;
import data.HospedeDAO;
import data.QuartoDAO;
import data.Reserva;
import data.ReservaDAO;
import java.awt.HeadlessException;
import java.text.NumberFormat;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public final class Reservas extends javax.swing.JFrame {

    public Reservas() {
        initComponents();
        preencherTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_Titulo = new javax.swing.JLabel();
        btn_Voltar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_Reserva = new javax.swing.JTable();
        btn_Excluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        lbl_Titulo.setBackground(new java.awt.Color(255, 255, 255));
        lbl_Titulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbl_Titulo.setForeground(new java.awt.Color(97, 96, 184));
        lbl_Titulo.setText("Reservas");

        btn_Voltar.setBackground(new java.awt.Color(97, 96, 184));
        btn_Voltar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_Voltar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Voltar.setText("Voltar");
        btn_Voltar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btn_Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VoltarActionPerformed(evt);
            }
        });

        tbl_Reserva.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbl_Reserva.setForeground(new java.awt.Color(97, 96, 184));
        tbl_Reserva.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Hospede ID", "Nome do Hóspede", "Telefone", "Quarto ID", "Check-In", "Check-Out", "Valor Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbl_Reserva);
        // Ajuste de largura das colunas
        tbl_Reserva.getColumnModel().getColumn(0).setPreferredWidth(50);  // ID
        tbl_Reserva.getColumnModel().getColumn(1).setPreferredWidth(80);  // Hospede ID
        tbl_Reserva.getColumnModel().getColumn(2).setPreferredWidth(150); // Nome do Hóspede
        tbl_Reserva.getColumnModel().getColumn(3).setPreferredWidth(100); // Telefone
        tbl_Reserva.getColumnModel().getColumn(4).setPreferredWidth(100); // Check-In
        tbl_Reserva.getColumnModel().getColumn(5).setPreferredWidth(100); // Check-Out
        tbl_Reserva.getColumnModel().getColumn(6).setPreferredWidth(120); // Valor Total

        // Centralizar texto das colunas
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for (int i = 0; i < tbl_Reserva.getColumnCount(); i++) {
            tbl_Reserva.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }

        btn_Excluir.setBackground(new java.awt.Color(255, 51, 51));
        btn_Excluir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_Excluir.setForeground(new java.awt.Color(255, 255, 255));
        btn_Excluir.setText("Excluir");
        btn_Excluir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btn_Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(373, 373, 373)
                        .addComponent(lbl_Titulo)
                        .addGap(0, 374, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lbl_Titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_VoltarActionPerformed

    private void btn_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ExcluirActionPerformed
        try {
            // Verifica se uma reserva foi selecionada na tabela
            int selectedRow = tbl_Reserva.getSelectedRow();
            if (selectedRow == -1) {
                JOptionPane.showMessageDialog(this, "Selecione uma reserva para excluir!",
                        "Aviso", JOptionPane.WARNING_MESSAGE);
                return;
            }

            // Recupera o valor da célula da coluna 0 (ID da reserva)
            int reservaId = Integer.parseInt(tbl_Reserva.getValueAt(selectedRow, 0).toString().trim());

            // Recupera o valor da célula da coluna 4 (ID do quarto)
            int quartoId = Integer.parseInt(tbl_Reserva.getValueAt(selectedRow, 4).toString().trim());

            // Debug: mostrar IDs recuperados
            System.out.println("Reserva ID: " + reservaId);
            System.out.println("Quarto ID: " + quartoId);

            // Solicita a confirmação do usuário
            int opcao = JOptionPane.showConfirmDialog(
                    this,
                    "Deseja realmente excluir a reserva selecionada?",
                    "Confirmar Exclusão",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE);

            if (opcao != JOptionPane.YES_OPTION) {
                return;
            }

            // Exclui a reserva utilizando o método excluirReserva do ReservaDAO
            ReservaDAO reservaDAO = new ReservaDAO();
            boolean excluiu = reservaDAO.excluirReserva(reservaId);

            if (excluiu) {
                // Atualiza o status do quarto para "Vago"
                QuartoDAO quartoDAO = new QuartoDAO();
                quartoDAO.atualizar(quartoId, true);

                JOptionPane.showMessageDialog(this, "Reserva excluída com sucesso!",
                        "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                preencherTabela();
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao excluir a reserva!",
                        "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Erro na conversão de número: " + e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(this, "Erro: " + e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btn_ExcluirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Reservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reservas().setVisible(true);
            }
        });
    }

    public void preencherTabela() {
        ReservaDAO reservaDAO = new ReservaDAO();
        List<Reserva> reservas = reservaDAO.getReservas();
        HospedeDAO hospedeDAO = new HospedeDAO();

        // Obtém o modelo existente da tabela
        DefaultTableModel modelo = (DefaultTableModel) tbl_Reserva.getModel();

        // Remove os dados antigos
        modelo.setRowCount(0);

        // Formatadores
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

        // Adiciona os dados das reservas
        for (Reserva reserva : reservas) {
            Hospede hospede = hospedeDAO.buscarHospedePorId(reserva.getHospedeId());
            String nomeHospede = (hospede != null) ? hospede.getNome() : "Desconhecido";

            modelo.addRow(new Object[]{
                reserva.getId(),
                reserva.getHospedeId(),
                nomeHospede,
                reserva.getTelefoneHospede(),
                reserva.getQuartoId(), // <-- este é o valor do Quarto ID
                reserva.getCheckIn().format(dateFormatter),
                reserva.getCheckOut().format(dateFormatter),
                formatoMoeda.format(reserva.getValorTotal())
            });

        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Excluir;
    private javax.swing.JButton btn_Voltar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_Titulo;
    private javax.swing.JTable tbl_Reserva;
    // End of variables declaration//GEN-END:variables
}
