package view;

import data.Hospede;
import data.HospedeDAO;
import data.Quarto;
import data.QuartoDAO;
import data.Reserva;
import data.ReservaDAO;
import java.awt.Component;
import java.awt.HeadlessException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class Agendar_02 extends javax.swing.JFrame {

    private int idHospede;
    private HospedeDAO hospedeDAO;
    private Hospede hospede;

    public Agendar_02(int idHospede) {
        initComponents();
        preencherTabela();
        this.idHospede = idHospede;
        hospedeDAO = new HospedeDAO();
        buscarHospede();

    }

    private void buscarHospede() {
        hospede = hospedeDAO.buscarHospedePorId(idHospede);

        if (hospede != null) {
            System.out.println("Nome: " + hospede.getNome());
            System.out.println("Telefone: " + hospede.getTelefone());
        } else {
            JOptionPane.showMessageDialog(this, "Hóspede não encontrado!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_Quartos = new javax.swing.JTable();
        lbl_Titulo = new javax.swing.JLabel();
        btn_Voltar = new javax.swing.JButton();
        btn_Agendar = new javax.swing.JButton();
        lbl_In = new javax.swing.JLabel();
        lbl_Out = new javax.swing.JLabel();
        txt_In = new javax.swing.JFormattedTextField();
        txt_Out = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        tbl_Quartos.setForeground(new java.awt.Color(97, 96, 184));
        tbl_Quartos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "№", "Tipo", "Diária", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Object.class
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
        jScrollPane2.setViewportView(tbl_Quartos);

        lbl_Titulo.setBackground(new java.awt.Color(255, 255, 255));
        lbl_Titulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbl_Titulo.setForeground(new java.awt.Color(97, 96, 184));
        lbl_Titulo.setText("Cadastro Estadia");

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

        btn_Agendar.setBackground(new java.awt.Color(97, 96, 184));
        btn_Agendar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_Agendar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Agendar.setText("Agendar");
        btn_Agendar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btn_Agendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgendarActionPerformed(evt);
            }
        });

        lbl_In.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_In.setForeground(new java.awt.Color(97, 96, 184));
        lbl_In.setText("Check-In:");

        lbl_Out.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_Out.setForeground(new java.awt.Color(97, 96, 184));
        lbl_Out.setText("Check-out:");

        txt_In.setBackground(new java.awt.Color(204, 204, 204));
        txt_In.setForeground(new java.awt.Color(97, 96, 184));
        txt_In.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        txt_In.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        txt_Out.setBackground(new java.awt.Color(204, 204, 204));
        txt_Out.setForeground(new java.awt.Color(97, 96, 184));
        txt_Out.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        txt_Out.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(lbl_Titulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl_Out)
                                    .addComponent(lbl_In))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_Out, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_In, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_Agendar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(24, 24, 24))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(267, 267, 267))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lbl_Titulo)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_In)
                    .addComponent(txt_In, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Out)
                    .addComponent(txt_Out, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Agendar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VoltarActionPerformed
        Agendar_01 agendar = new Agendar_01();
        agendar.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_VoltarActionPerformed

    private void btn_AgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgendarActionPerformed

        try {
            // Verifica se um quarto foi selecionado
            int selectedRow = tbl_Quartos.getSelectedRow();
            if (selectedRow == -1) {
                JOptionPane.showMessageDialog(this, "Selecione um quarto!", "Aviso", JOptionPane.WARNING_MESSAGE);
                return;
            }

            // Recupera os dados do quarto selecionado
            DefaultTableModel modelo = (DefaultTableModel) tbl_Quartos.getModel();
            Integer quartoId = (Integer) modelo.getValueAt(selectedRow, 0);
            String quartoNumero = modelo.getValueAt(selectedRow, 1).toString();
            String quartoTipo = modelo.getValueAt(selectedRow, 2).toString();
            String diariaFormatada = modelo.getValueAt(selectedRow, 3).toString();
            String status = modelo.getValueAt(selectedRow, 4).toString();

            // Verifica se o quarto está disponível
            if (!"Vago".equalsIgnoreCase(status)) {
                JOptionPane.showMessageDialog(this, "O quarto selecionado não está disponível!", "Aviso", JOptionPane.WARNING_MESSAGE);
                return;
            }

            // Processa as datas de Check-In e Check-Out
            String checkInStr = txt_In.getText().trim();
            String checkOutStr = txt_Out.getText().trim();
            if (checkInStr.isEmpty() || checkOutStr.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Informe as datas de Check-In e Check-Out!", "Aviso", JOptionPane.WARNING_MESSAGE);
                return;
            }
            // Validação para verificar a ordem do Check-In e Check-Out
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate checkInDate = LocalDate.parse(checkInStr, formatter);
            LocalDate checkOutDate = LocalDate.parse(checkOutStr, formatter);
            long numDias = ChronoUnit.DAYS.between(checkInDate, checkOutDate);
            if (numDias <= 0) {
                JOptionPane.showMessageDialog(this, "A data de Check-Out deve ser posterior à data de Check-In!", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Converte o valor da diária
            NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
            double diaria = formatoMoeda.parse(diariaFormatada).doubleValue();

            // Calcula o valor total da reserva
            double valorTotal = diaria * numDias;

            // Recupera os dados do hóspede
            if (hospede == null) {
                JOptionPane.showMessageDialog(this, "Hóspede não encontrado!", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }
            String nomeHospede = hospede.getNome();
            String telefoneHospede = hospede.getTelefone();

            // Cria a mensagem de confirmação com todas as informações da reserva
            String mensagem = """
                              Confirme a reserva com os seguintes dados:
                              
                              Nome:  """ + nomeHospede + "\n"
                    + "Telefone: " + telefoneHospede + "\n"
                    + "Quarto: " + quartoNumero + " - " + quartoTipo + "\n"
                    + "Check-In: " + checkInDate.format(formatter) + "\n"
                    + "Check-Out: " + checkOutDate.format(formatter) + "\n"
                    + "Estadia: " + numDias + " Dia(s)\n"
                    + "Valor Total: " + formatoMoeda.format(valorTotal) + "\n";



            int opcao = JOptionPane.showConfirmDialog(
                    this,
                    mensagem,
                    "Confirmar Reserva",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE
            );

            // Se o usuário não confirmar, encerra a operação
            if (opcao != JOptionPane.YES_OPTION) {
                return;
            }

            // Cria e insere a reserva 
            Reserva reserva = new Reserva();
            reserva.setHospedeId(idHospede);
            reserva.setTelefoneHospede(telefoneHospede);
            reserva.setQuartoId(quartoId);
            reserva.setValorTotal(valorTotal);
            reserva.setCheckIn(checkInDate);
            reserva.setCheckOut(checkOutDate);

            ReservaDAO reservaDAO = new ReservaDAO();
            if (!reservaDAO.insert(reserva)) {
                JOptionPane.showMessageDialog(this, "Erro ao inserir a reserva.", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Atualiza o status do quarto para ocupado utilizando o método atualizar
            QuartoDAO quartoDAO = new QuartoDAO();
            quartoDAO.atualizar(quartoId, false);

            JOptionPane.showMessageDialog(this, "Reserva realizada com sucesso!\n", "Sucesso", JOptionPane.INFORMATION_MESSAGE);

            // Fecha a janela atual
            this.dispose();

        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(this, "Ocorreu um erro: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (ParseException ex) {
            Logger.getLogger(Agendar_02.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_AgendarActionPerformed

    private void preencherTabela() {
        try {
            // Criação de um objeto QuartoDAO
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
            java.util.logging.Logger.getLogger(Agendar_02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agendar_02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agendar_02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agendar_02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agendar_01().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Agendar;
    private javax.swing.JButton btn_Voltar;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_In;
    private javax.swing.JLabel lbl_Out;
    private javax.swing.JLabel lbl_Titulo;
    private javax.swing.JTable tbl_Quartos;
    private javax.swing.JFormattedTextField txt_In;
    private javax.swing.JFormattedTextField txt_Out;
    // End of variables declaration//GEN-END:variables
}
