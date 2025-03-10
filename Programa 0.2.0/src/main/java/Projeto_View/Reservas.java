package Projeto_View;

import Projeto_Data.Quarto;
import Projeto_Data.Reserva;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class Reservas extends javax.swing.JFrame {


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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbl_Reserva);

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
                        .addGap(183, 183, 183)
                        .addComponent(lbl_Titulo)
                        .addGap(0, 204, Short.MAX_VALUE))
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
                .addGap(20, 20, 20)
                .addComponent(lbl_Titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
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
         int linhaSelecionada = tbl_Reserva.getSelectedRow();

        if (linhaSelecionada == -1) {
            javax.swing.JOptionPane.showMessageDialog(this, "Selecione uma reserva para excluir!", "Aviso", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        int confirmacao = javax.swing.JOptionPane.showConfirmDialog(this, "Tem certeza que deseja excluir esta reserva?", "Confirmação",
                javax.swing.JOptionPane.YES_NO_OPTION, javax.swing.JOptionPane.QUESTION_MESSAGE);

        if (confirmacao == javax.swing.JOptionPane.YES_OPTION) {
            // Obtém a lista de reservas
            List<Reserva> reservas = Reserva.getReservas();

            // Obtém a reserva selecionada
            Reserva reserva = reservas.get(linhaSelecionada);

            // Obtém o número do quarto da reserva
            String numeroQuarto = reserva.getNumeroQuarto();

            // Encontra o quarto na lista e muda o status para vago (true)
            for (Quarto quarto : Quarto.getQuartos()) {
                if (quarto.getNumero().equals(numeroQuarto)) {
                    quarto.setStatus(true);
                    break;
                }
            }

            // Remove a reserva da lista
            reservas.remove(linhaSelecionada);

            // Atualiza a tabela
            preencherTabela();

            javax.swing.JOptionPane.showMessageDialog(this, "Reserva excluída com sucesso! O quarto " + numeroQuarto + " agora está vago.", "Sucesso", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btn_ExcluirActionPerformed

    private void preencherTabela() {
        // Acessa a lista estática de todas as reservas
        List<Reserva> reservas = Reserva.getReservas();

        // Criação do modelo da tabela
        String[] colunas = {"Hóspede", "Telefone", "Quarto", "Check-In", "Check-Out", "Valor Total"};
        DefaultTableModel modelo = new DefaultTableModel(colunas, 0);

        // Preenche a tabela com os dados de todas as reservas
        for (Reserva reserva : reservas) {
            Object[] linha = {
                reserva.getNomeHospede(),
                reserva.getTelefoneHospede(),
                reserva.getNumeroQuarto(),
                reserva.getCheckIn(),
                reserva.getCheckOut(),
                reserva.getValorTotal()
            };
            modelo.addRow(linha);
        }

        tbl_Reserva.setModel(modelo);

        // Ajusta a largura das colunas
        tbl_Reserva.getColumnModel().getColumn(0).setPreferredWidth(100);
        tbl_Reserva.getColumnModel().getColumn(1).setPreferredWidth(100);
        tbl_Reserva.getColumnModel().getColumn(2).setPreferredWidth(50);
        tbl_Reserva.getColumnModel().getColumn(3).setPreferredWidth(100);
        tbl_Reserva.getColumnModel().getColumn(4).setPreferredWidth(100);
        tbl_Reserva.getColumnModel().getColumn(5).setPreferredWidth(100);
    }

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Excluir;
    private javax.swing.JButton btn_Voltar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_Titulo;
    private javax.swing.JTable tbl_Reserva;
    // End of variables declaration//GEN-END:variables
}
