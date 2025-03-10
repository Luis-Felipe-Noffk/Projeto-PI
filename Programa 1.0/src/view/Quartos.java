package view;

import data.Quarto;
import data.QuartoDAO;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.Component;
import javax.swing.JLabel;

public class Quartos extends javax.swing.JFrame {

    public Quartos() {
        initComponents();
        preencherTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_Titulo = new javax.swing.JLabel();
        btn_Voltar = new javax.swing.JButton();
        spg_Quartos = new javax.swing.JScrollPane();
        tbl_Quartos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        lbl_Titulo.setBackground(new java.awt.Color(255, 255, 255));
        lbl_Titulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbl_Titulo.setForeground(new java.awt.Color(97, 96, 184));
        lbl_Titulo.setText("Quartos");

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

        tbl_Quartos.setForeground(new java.awt.Color(97, 96, 184));
        tbl_Quartos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "№", "Tipo", "Diária", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_Quartos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        spg_Quartos.setViewportView(tbl_Quartos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spg_Quartos, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(lbl_Titulo)
                .addContainerGap(133, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Titulo)
                .addGap(10, 10, 10)
                .addComponent(spg_Quartos, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(btn_Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void preencherTabela() {
        try {
            // Criação de um objeto QuartoDAO para buscar os dados dos quartos
            QuartoDAO quartoDAO = new QuartoDAO();

            // Obtendo a lista de quartos do banco de dados
            List<Quarto> listaQuartos = quartoDAO.getQuartos();

            // Pegando o modelo da tabela para preencher com os dados
            DefaultTableModel tabelaQuartos = (DefaultTableModel) tbl_Quartos.getModel();

            // Limpando a tabela antes de adicionar os novos dados
            tabelaQuartos.setRowCount(0);

            // Ajustando o tamanho das colunas e alinhamento
            tbl_Quartos.getColumnModel().getColumn(0).setPreferredWidth(40);
            tbl_Quartos.getColumnModel().getColumn(1).setPreferredWidth(60);
            tbl_Quartos.getColumnModel().getColumn(2).setPreferredWidth(80);
            tbl_Quartos.getColumnModel().getColumn(3).setPreferredWidth(80);
            tbl_Quartos.getColumnModel().getColumn(4).setPreferredWidth(80);

            // Centralizando as colunas
            for (int i = 0; i < tbl_Quartos.getColumnCount(); i++) {
                tbl_Quartos.getColumnModel().getColumn(i).setCellRenderer(new DefaultTableCellRenderer() {
                    @Override
                    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                        Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                        ((DefaultTableCellRenderer) c).setHorizontalAlignment(JLabel.CENTER);
                        return c;
                    }
                });
            }

            // Usando NumberFormat para formatar o valor da diária
            java.text.NumberFormat formatoMoeda = java.text.NumberFormat.getCurrencyInstance(new java.util.Locale("pt", "BR"));

            // Iterando sobre a lista de quartos e adicionando cada um na tabela
            for (Quarto quarto : listaQuartos) {
                Object[] obj = new Object[]{
                    quarto.getId(),
                    quarto.getNumero(),
                    quarto.getTipo(),
                    formatoMoeda.format(quarto.getDiaria()),
                    quarto.isDisponivel() ? "Vago" : "Ocupado"
                };
                // Adicionando a linha na tabela
                tabelaQuartos.addRow(obj);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
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
            java.util.logging.Logger.getLogger(Quartos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Quartos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Quartos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Quartos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Quartos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Voltar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_Titulo;
    private javax.swing.JScrollPane spg_Quartos;
    private javax.swing.JTable tbl_Quartos;
    // End of variables declaration//GEN-END:variables
}
