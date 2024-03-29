/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.slt.cursojava.view;

import br.edu.ifsp.slt.cursojava.model.entidades.ClienteFisico;
import br.edu.ifsp.slt.cursojava.model.entidades.ClienteJuridico;
import br.edu.ifsp.slt.cursojava.model.business.ClienteBusiness;
import br.edu.ifsp.slt.cursojava.model.business.AgenciaBusiness;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Guilherme
 */
public class TelaPrincipalView extends javax.swing.JFrame {

    //Singleton
    AgenciaBusiness agenciaBusiness = AgenciaBusiness.getInstancia();
    ClienteBusiness clienteBusiness = new ClienteBusiness();

    /**
     * Creates new form TelaPrincipalView
     */
    public TelaPrincipalView() {
        this.setExtendedState(MAXIMIZED_BOTH);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuTelaPrincipal = new javax.swing.JMenuBar();
        menuAgencia = new javax.swing.JMenu();
        menuCadastrarAgencia = new javax.swing.JMenuItem();
        menuCliente = new javax.swing.JMenu();
        menuCadastrarClienteFisico = new javax.swing.JMenuItem();
        menuCadastrarClienteJuridico = new javax.swing.JMenuItem();
        menuConsultarCliente = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela principal");

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 494, Short.MAX_VALUE)
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 312, Short.MAX_VALUE)
        );

        menuAgencia.setText("Agências");

        menuCadastrarAgencia.setText("Cadastrar agência");
        menuCadastrarAgencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastrarAgenciaActionPerformed(evt);
            }
        });
        menuAgencia.add(menuCadastrarAgencia);

        menuTelaPrincipal.add(menuAgencia);

        menuCliente.setText("Clientes");

        menuCadastrarClienteFisico.setText("Cadastrar Cliente Físico");
        menuCadastrarClienteFisico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastrarClienteFisicoActionPerformed(evt);
            }
        });
        menuCliente.add(menuCadastrarClienteFisico);

        menuCadastrarClienteJuridico.setText("Cadastrar Cliente Jurídico");
        menuCadastrarClienteJuridico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastrarClienteJuridicoActionPerformed(evt);
            }
        });
        menuCliente.add(menuCadastrarClienteJuridico);

        menuConsultarCliente.setText("Consultar Cliente");
        menuConsultarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultarClienteActionPerformed(evt);
            }
        });
        menuCliente.add(menuConsultarCliente);

        menuTelaPrincipal.add(menuCliente);

        setJMenuBar(menuTelaPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void menuCadastrarAgenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrarAgenciaActionPerformed
        AgenciaView agenciaView = new AgenciaView(this.agenciaBusiness);
        desktopPane.add(agenciaView);
        agenciaView.setVisible(true);
    }//GEN-LAST:event_menuCadastrarAgenciaActionPerformed

    private void menuCadastrarClienteFisicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrarClienteFisicoActionPerformed
        ClienteView clienteView = new ClienteView(this.clienteBusiness, new ClienteFisico());
        clienteView.lblDocumento.setText("CPF:");
        clienteView.setTitle("Cadastro de Cliente Físico");
        desktopPane.add(clienteView);
        clienteView.setVisible(true);
    }//GEN-LAST:event_menuCadastrarClienteFisicoActionPerformed

    private void menuConsultarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultarClienteActionPerformed
        ConsultarClienteView consultarClienteView = null;
        try {
            consultarClienteView = new ConsultarClienteView(this.clienteBusiness, this.desktopPane);
        } catch (ParseException ex) {
            Logger.getLogger(TelaPrincipalView.class.getName()).log(Level.SEVERE, null, ex);
        }
        desktopPane.add(consultarClienteView);
        consultarClienteView.setVisible(true);
    }//GEN-LAST:event_menuConsultarClienteActionPerformed

    private void menuCadastrarClienteJuridicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrarClienteJuridicoActionPerformed
        ClienteView clienteView = new ClienteView(this.clienteBusiness, new ClienteJuridico());
        clienteView.lblDocumento.setText("CNPJ:");
        clienteView.setTitle("Cadastro de Cliente Jurídico");
        clienteView.lblNome.setText("Razão Social: ");
        clienteView.lblSobrenome.setVisible(false);
        clienteView.txtSobrenome.setVisible(false);
        desktopPane.add(clienteView);
        clienteView.setVisible(true);
    }//GEN-LAST:event_menuCadastrarClienteJuridicoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipalView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu menuAgencia;
    private javax.swing.JMenuItem menuCadastrarAgencia;
    private javax.swing.JMenuItem menuCadastrarClienteFisico;
    private javax.swing.JMenuItem menuCadastrarClienteJuridico;
    private javax.swing.JMenu menuCliente;
    private javax.swing.JMenuItem menuConsultarCliente;
    private javax.swing.JMenuBar menuTelaPrincipal;
    // End of variables declaration//GEN-END:variables
}
