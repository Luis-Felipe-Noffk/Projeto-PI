package Projeto_View;

import Projeto_Data.Hospede;
import Projeto_Data.Quarto;
import Projeto_Data.Reserva;
import java.awt.HeadlessException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Agendar_02 extends javax.swing.JFrame {
    

    public Agendar_02() {
        initComponents();
        preencherTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_Titulo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_Quartos = new javax.swing.JTable();
        btn_Voltar = new javax.swing.JButton();
        btn_Agendar = new javax.swing.JButton();
        lbl_In = new javax.swing.JLabel();
        lbl_Out = new javax.swing.JLabel();
        txt_In = new javax.swing.JFormattedTextField();
        txt_Out = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        lbl_Titulo.setBackground(new java.awt.Color(255, 255, 255));
        lbl_Titulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbl_Titulo.setForeground(new java.awt.Color(97, 96, 184));
        lbl_Titulo.setText("Cadastro Estadia");

        tbl_Quartos.setForeground(new java.awt.Color(97, 96, 184));
        tbl_Quartos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Tible 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbl_Quartos);

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
        this.dispose();
    }//GEN-LAST:event_btn_VoltarActionPerformed

    private void btn_AgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgendarActionPerformed
        // Obtém o nome do hóspede atual
        String nome = Hospede.getHospedeAtual().getNome();
        String telefone = Hospede.getHospedeAtual().getTelefone();

        // Verifica se um quarto foi selecionado na tabela
        int linhaSelecionada = tbl_Quartos.getSelectedRow();
        if (linhaSelecionada == -1) {
            JOptionPane.showMessageDialog(null, "Selecione um quarto para agendar.");
            return;
        }

        // Obtém o número do quarto e o preço da diária da tabela
        String numeroQuarto = (String) tbl_Quartos.getValueAt(linhaSelecionada, 0);
        double precoDiaria = (double) tbl_Quartos.getValueAt(linhaSelecionada, 2);

        try {
            // Verifica se as datas de check-in e check-out foram informadas
            String checkInStr = txt_In.getText();
            String checkOutStr = txt_Out.getText();

            if (checkInStr.isEmpty() || checkOutStr.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor, informe as datas de check-in e check-out.");
                return;
            }

            // Define o formato das datas
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate checkInDate = LocalDate.parse(checkInStr, formatter);
            LocalDate checkOutDate = LocalDate.parse(checkOutStr, formatter);

            // Valida se o check-out é posterior ao check-in
            if (checkOutDate.isBefore(checkInDate)) {
                JOptionPane.showMessageDialog(null, "A data de check-out não pode ser anterior à data de check-in.");
                return;
            }

            // Calcula a duração da estadia em dias
            long dias = java.time.temporal.ChronoUnit.DAYS.between(checkInDate, checkOutDate);

            // Calcula o valor total da reserva
            double valorTotal = dias * precoDiaria;

            // Exibe as informações da reserva para confirmação
            String reservaInfo = String.format(
                    "Hóspede: %s\nTelefone: %s\nQuarto: %s\nCheck-in: %s\nCheck-out: %s\nValor Total: R$ %.2f\n\nDeseja confirmar a reserva?",
                    nome, telefone, numeroQuarto, checkInStr, checkOutStr, valorTotal
            );

            int confirmacao = JOptionPane.showConfirmDialog(null, reservaInfo, "Confirmação", JOptionPane.YES_NO_OPTION);

            if (confirmacao == JOptionPane.YES_OPTION) {
                // Cria uma nova reserva e adiciona à lista de reservas
                Reserva novaReserva = new Reserva(nome, telefone, numeroQuarto, valorTotal, java.sql.Date.valueOf(checkInDate), java.sql.Date.valueOf(checkOutDate));
                List<Reserva> reservas = Reserva.getReservas();
                reservas.add(novaReserva);

                // Atualiza o status do quarto para "ocupado"
                List<Quarto> quartos = Quarto.getQuartos();
                for (Quarto quarto : quartos) {
                    if (quarto.getNumero().equals(numeroQuarto)) {
                        quarto.setStatus(false);
                        break;
                    }
                }

                // Atualiza a tabela
                preencherTabela();

                JOptionPane.showMessageDialog(null, "Reserva realizada com sucesso!");
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Reserva não confirmada. Faça as alterações necessárias.");
            }

        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Erro ao registrar a reserva: " + e.getMessage());
        }
    }//GEN-LAST:event_btn_AgendarActionPerformed
    
    private void preencherTabela() {
        // Acessa a lista estática de todos os quartos
        List<Quarto> quartos = Quarto.getQuartos();

        // Criação do modelo da tabela
        String[] colunas = {"Número", "Categoria", "Preço Diário", "Status"};
        DefaultTableModel modelo = new DefaultTableModel(colunas, 0);

        // Preenche a tabela com os dados dos quartos disponíveis
        for (Quarto quarto : quartos) {
            if (quarto.isStatus()) { // Filtra para mostrar apenas os quartos vagos
                String status = "Disponível";
                Object[] linha = {
                    quarto.getNumero(),
                    quarto.getTipo(),
                    quarto.getPrecoDiaria(),
                    status 
                };
                modelo.addRow(linha);
            }
        }

        tbl_Quartos.setModel(modelo);

        // Ajusta a largura das colunas
        tbl_Quartos.getColumnModel().getColumn(0).setPreferredWidth(50);
        tbl_Quartos.getColumnModel().getColumn(1).setPreferredWidth(100);
        tbl_Quartos.getColumnModel().getColumn(2).setPreferredWidth(100);
        tbl_Quartos.getColumnModel().getColumn(3).setPreferredWidth(100);

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agendar_02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agendar_02().setVisible(true);
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
