/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.slt.cursojava.view;

import br.edu.ifsp.slt.cursojava.controller.agencia.ConsultarAgenciaController;
import br.edu.ifsp.slt.cursojava.controller.agencia.DesativarAgenciaController;
import br.edu.ifsp.slt.cursojava.controller.agencia.ReativarAgenciaController;
import br.edu.ifsp.slt.cursojava.controller.agencia.SalvarAgenciaController;
import br.edu.ifsp.slt.cursojava.model.entidades.Agencia;
import br.edu.ifsp.slt.cursojava.model.business.AgenciaBusiness;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Guilherme
 */
public class AgenciaView extends javax.swing.JInternalFrame {

    private AgenciaBusiness agenciaBusiness;

    /**
     * Creates new form Agencia
     */
    public AgenciaView(AgenciaBusiness agenciaBusiness) {
        initComponents();
        this.agenciaBusiness = agenciaBusiness;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnDesativar = new javax.swing.JButton();
        btnReativar = new javax.swing.JButton();
        lblCnpj = new javax.swing.JLabel();
        lblEndereco = new javax.swing.JLabel();
        txtCNPJ = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        chkAgenciaAtiva = new javax.swing.JCheckBox();
        lblCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        topSeparator = new javax.swing.JSeparator();
        bottomSeparator = new javax.swing.JSeparator();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de agência");

        lblNome.setText("Nome:");

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnDesativar.setText("Desativar");
        btnDesativar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesativarActionPerformed(evt);
            }
        });

        btnReativar.setText("Reativar");
        btnReativar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReativarActionPerformed(evt);
            }
        });

        lblCnpj.setText("CNPJ:");

        lblEndereco.setText("Endereço:");

        chkAgenciaAtiva.setText("Agência Ativa");

        lblCodigo.setText("Código Agência:");

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(topSeparator)
            .addComponent(bottomSeparator, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDesativar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnReativar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCodigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnConsultar)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 29, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(lblCnpj))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(lblNome))
                                            .addComponent(lblEndereco, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtCNPJ)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(chkAgenciaAtiva))
                                            .addComponent(txtNome)
                                            .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(topSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkAgenciaAtiva)
                    .addComponent(txtCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCnpj))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEndereco)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bottomSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnDesativar)
                    .addComponent(btnReativar))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limparFormulario(JTextField... campos) {
        for (JTextField campo : campos) {
            campo.setText("");
        }
    }

    public static boolean isNumero(String string) {
        try {
            Integer.parseInt(string);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        //JOptionPane.showMessageDialog(this, "Bem-vindo, " + txtNome.getText());        
        if (txtCodigo.getText() != null && txtCodigo.getText().length() != 0) {
            if (!isNumero(txtCodigo.getText())) {
                JOptionPane.showMessageDialog(this, "Campo código precisa ser númerico!");
                return;
            }
            SalvarAgenciaController salvarAgenciaController = new SalvarAgenciaController(agenciaBusiness);
            String mensagem = salvarAgenciaController.executar(txtCodigo.getText(), txtNome.getText(), txtCNPJ.getText(), txtEndereco.getText(),
                    chkAgenciaAtiva.isSelected());
            this.limparFormulario(txtCodigo, txtNome, txtCNPJ, txtEndereco);
            JOptionPane.showMessageDialog(this, mensagem);
        } else {
            JOptionPane.showMessageDialog(this, "Campo código vazio!");
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        if (txtCodigo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, digite o código da agência!");
            return;
        }

        if (!isNumero(txtCodigo.getText())) {
            JOptionPane.showMessageDialog(this, "Por favor, digite um número no código do agência!");
            return;
        }
        ConsultarAgenciaController consultarAgenciaController = new ConsultarAgenciaController(agenciaBusiness);
        Agencia agencia = consultarAgenciaController.executar(Integer.parseInt(txtCodigo.getText()));
        if (agencia == null) {
            JOptionPane.showMessageDialog(this, "Agência não encontrada!");
        } else {
            JOptionPane.showMessageDialog(this, agencia);
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnDesativarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesativarActionPerformed
        ConsultarAgenciaController consultarAgenciaController = new ConsultarAgenciaController(agenciaBusiness);
        Agencia agencia = consultarAgenciaController.executar(Integer.parseInt(txtCodigo.getText()));
        DesativarAgenciaController desativarAgenciaController = new DesativarAgenciaController(agenciaBusiness);
        boolean ativo = desativarAgenciaController.executar(agencia);
        if (ativo) {
            //String format
            JOptionPane.showMessageDialog(this, String.format("Agência %s desativida!", agencia.getNome()));
        } else {
            JOptionPane.showMessageDialog(this, String.format("Agência %s já está desativada!", agencia.getNome()));
        }
    }//GEN-LAST:event_btnDesativarActionPerformed

    private void btnReativarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReativarActionPerformed
        ConsultarAgenciaController consultarAgenciaController = new ConsultarAgenciaController(agenciaBusiness);
        Agencia agencia = consultarAgenciaController.executar(Integer.parseInt(txtCodigo.getText()));
        ReativarAgenciaController reativarAgenciaController = new ReativarAgenciaController(agenciaBusiness);
        boolean ativo = reativarAgenciaController.executar(agencia);
        if (ativo) {
            JOptionPane.showMessageDialog(this, "Agência reativada!");
        } else {
            JOptionPane.showMessageDialog(this, "Agência já está ativada!");
        }
    }//GEN-LAST:event_btnReativarActionPerformed

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
            java.util.logging.Logger.getLogger(AgenciaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgenciaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgenciaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgenciaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new AgenciaView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator bottomSeparator;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnDesativar;
    private javax.swing.JButton btnReativar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JCheckBox chkAgenciaAtiva;
    private javax.swing.JLabel lblCnpj;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblNome;
    private javax.swing.JSeparator topSeparator;
    private javax.swing.JTextField txtCNPJ;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
