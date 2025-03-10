package Projeto_View;

import Projeto_Data.Hospede;
import java.util.ArrayList;
import java.util.List;



public class Agendar_01 extends javax.swing.JFrame {
    
    private List<Hospede> listaHospedes = new ArrayList<>();     
     
    public Agendar_01() {
        initComponents();
        
    }    
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Agendar_01 = new javax.swing.JPanel();
        lbl_Titulo = new javax.swing.JLabel();
        lbl_Nome = new javax.swing.JLabel();
        lbl_Cpf = new javax.swing.JLabel();
        lbl_Telefone = new javax.swing.JLabel();
        txt_Nome = new javax.swing.JTextField();
        txt_Cpf = new javax.swing.JTextField();
        txt_Telefone = new javax.swing.JTextField();
        btn_Voltar = new javax.swing.JButton();
        btn_Salvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        lbl_Titulo.setBackground(new java.awt.Color(255, 255, 255));
        lbl_Titulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbl_Titulo.setForeground(new java.awt.Color(97, 96, 184));
        lbl_Titulo.setText("Cadastro Hóspede");

        lbl_Nome.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_Nome.setForeground(new java.awt.Color(97, 96, 184));
        lbl_Nome.setText("Nome:");

        lbl_Cpf.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_Cpf.setForeground(new java.awt.Color(97, 96, 184));
        lbl_Cpf.setText("Cpf:");

        lbl_Telefone.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_Telefone.setForeground(new java.awt.Color(97, 96, 184));
        lbl_Telefone.setText("Telefone:");

        txt_Nome.setBackground(new java.awt.Color(204, 204, 204));
        txt_Nome.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txt_Nome.setForeground(new java.awt.Color(97, 96, 184));

        txt_Cpf.setBackground(new java.awt.Color(204, 204, 204));
        txt_Cpf.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txt_Cpf.setForeground(new java.awt.Color(97, 96, 184));

        txt_Telefone.setBackground(new java.awt.Color(204, 204, 204));
        txt_Telefone.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txt_Telefone.setForeground(new java.awt.Color(97, 96, 184));

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

        btn_Salvar.setBackground(new java.awt.Color(97, 96, 184));
        btn_Salvar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_Salvar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Salvar.setText("Salvar");
        btn_Salvar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btn_Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Agendar_01Layout = new javax.swing.GroupLayout(Agendar_01);
        Agendar_01.setLayout(Agendar_01Layout);
        Agendar_01Layout.setHorizontalGroup(
            Agendar_01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Agendar_01Layout.createSequentialGroup()
                .addGroup(Agendar_01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Agendar_01Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(lbl_Titulo))
                    .addGroup(Agendar_01Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(Agendar_01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(Agendar_01Layout.createSequentialGroup()
                                .addComponent(btn_Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addComponent(btn_Salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Agendar_01Layout.createSequentialGroup()
                                .addGroup(Agendar_01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl_Cpf)
                                    .addComponent(lbl_Telefone)
                                    .addComponent(lbl_Nome))
                                .addGap(18, 18, 18)
                                .addGroup(Agendar_01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_Cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        Agendar_01Layout.setVerticalGroup(
            Agendar_01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Agendar_01Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lbl_Titulo)
                .addGap(55, 55, 55)
                .addGroup(Agendar_01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Nome)
                    .addComponent(txt_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Agendar_01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Cpf)
                    .addComponent(txt_Cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Agendar_01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Telefone)
                    .addComponent(txt_Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(Agendar_01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Agendar_01, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Agendar_01, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_VoltarActionPerformed

    private void btn_SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalvarActionPerformed
        String nome = txt_Nome.getText().trim();
        String cpf = txt_Cpf.getText().trim();
        String telefone = txt_Telefone.getText().trim();
        
        // Verifica se os campos estão preenchidos
        if (nome.isEmpty() || cpf.isEmpty() || telefone.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Todos os campos devem ser preenchidos!", "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validação do CPF
        if (!cpf.matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}")) {
            javax.swing.JOptionPane.showMessageDialog(this, "CPF inválido! O formato deve ser exatamente xxx.xxx.xxx-xx.", "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validação do telefone
        if (!telefone.matches("\\d{4}-\\d{4}")) {
            javax.swing.JOptionPane.showMessageDialog(this, "Telefone inválido! O formato deve ser exatamente xxxx-xxxx.", "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Cria um novo objeto Hospede
        Hospede hospede = new Hospede(nome, cpf, telefone);
        // Define o hóspede atual
        Hospede.setHospedeAtual(hospede);

        javax.swing.JOptionPane.showMessageDialog(this, "Dados salvos com sucesso!", "Sucesso", javax.swing.JOptionPane.INFORMATION_MESSAGE);

        // Cria a tela Agendar_02
        Agendar_02 agendar = new Agendar_02();
        agendar.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_btn_SalvarActionPerformed
   
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
            java.util.logging.Logger.getLogger(Agendar_01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agendar_01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agendar_01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agendar_01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JPanel Agendar_01;
    private javax.swing.JButton btn_Salvar;
    private javax.swing.JButton btn_Voltar;
    private javax.swing.JLabel lbl_Cpf;
    private javax.swing.JLabel lbl_Nome;
    private javax.swing.JLabel lbl_Telefone;
    private javax.swing.JLabel lbl_Titulo;
    private javax.swing.JTextField txt_Cpf;
    private javax.swing.JTextField txt_Nome;
    private javax.swing.JTextField txt_Telefone;
    // End of variables declaration//GEN-END:variables
}
