/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.slt.cursojava.view;

import br.edu.ifsp.slt.cursojava.controller.consultarcliente.ConsultarClienteCnpjController;
import br.edu.ifsp.slt.cursojava.controller.consultarcliente.ConsultarClienteCodigoController;
import br.edu.ifsp.slt.cursojava.controller.consultarcliente.ConsultarClienteCpfController;
import br.edu.ifsp.slt.cursojava.controller.consultarcliente.ConsultarClienteNomeController;
import br.edu.ifsp.slt.cursojava.controller.consultarcliente.ConsultarClienteTodosController;
import br.edu.ifsp.slt.cursojava.controller.consultarcliente.SortearClientesController;
import br.edu.ifsp.slt.cursojava.model.entidades.Sorteador;
import br.edu.ifsp.slt.cursojava.model.business.ClienteBusiness;
import br.edu.ifsp.slt.cursojava.model.entidades.Cliente;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Guilherme
 */
public final class ConsultarClienteView extends javax.swing.JInternalFrame {

    private final ClienteBusiness clienteBusiness;
    private final JDesktopPane desktopPane;

    /**
     * Creates new form ConsultarClienteView
     *
     * @param clienteBusiness
     * @param desktopPane
     * @throws java.text.ParseException
     */
    public ConsultarClienteView(ClienteBusiness clienteBusiness, JDesktopPane desktopPane) throws ParseException {
        this.clienteBusiness = clienteBusiness;
        this.desktopPane = desktopPane;
        initComponents();
        Collection<Cliente> clientes = clienteBusiness.consultarTodos();
        preencherJTable(clientes);
        MaskFormatter mascaraCpf = new MaskFormatter("###.###.###-##");
        mascaraCpf.install(this.txtCpf);
        MaskFormatter mascaraCnpj = new MaskFormatter("##.###.###/####-##");
        mascaraCnpj.install(this.txtCnpj);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoRadio = new javax.swing.ButtonGroup();
        grupoRadio2 = new javax.swing.ButtonGroup();
        Ordenar = new javax.swing.JTabbedPane();
        tabCodigo = new javax.swing.JPanel();
        txtCodigo = new javax.swing.JTextField();
        btnConsultarCodigo = new javax.swing.JButton();
        lblCodigo = new javax.swing.JLabel();
        tabNome = new javax.swing.JPanel();
        txtNome = new javax.swing.JTextField();
        btnConsultarNome = new javax.swing.JButton();
        lblNome = new javax.swing.JLabel();
        tabCpf = new javax.swing.JPanel();
        btnConsultarCpf = new javax.swing.JButton();
        lblCpf = new javax.swing.JLabel();
        txtCpf = new javax.swing.JFormattedTextField();
        tabCnpj = new javax.swing.JPanel();
        btnConsultarCnpj = new javax.swing.JButton();
        lblCnpj = new javax.swing.JLabel();
        txtCnpj = new javax.swing.JFormattedTextField();
        tabSorteio = new javax.swing.JPanel();
        txtTotalPremiados = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        radioFisico = new javax.swing.JRadioButton();
        radioJuridico = new javax.swing.JRadioButton();
        radioTodos = new javax.swing.JRadioButton();
        btnSortear = new javax.swing.JButton();
        tabOrdenar = new javax.swing.JPanel();
        radioCodigo = new javax.swing.JRadioButton();
        radioNome = new javax.swing.JRadioButton();
        radioSobrenome = new javax.swing.JRadioButton();
        lblFiltros = new javax.swing.JLabel();
        scrollPane = new javax.swing.JScrollPane();
        JTableClientes = new javax.swing.JTable();
        btnAlterar = new javax.swing.JButton();
        btnVisualizar = new javax.swing.JButton();
        btnBloquear = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnReativar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Consultar cliente por:");

        btnConsultarCodigo.setText("Consultar");
        btnConsultarCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarCodigoActionPerformed(evt);
            }
        });

        lblCodigo.setText("Código:");

        javax.swing.GroupLayout tabCodigoLayout = new javax.swing.GroupLayout(tabCodigo);
        tabCodigo.setLayout(tabCodigoLayout);
        tabCodigoLayout.setHorizontalGroup(
            tabCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabCodigoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCodigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConsultarCodigo)
                .addContainerGap(385, Short.MAX_VALUE))
        );
        tabCodigoLayout.setVerticalGroup(
            tabCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabCodigoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultarCodigo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Ordenar.addTab("Código", tabCodigo);

        btnConsultarNome.setText("Consultar");
        btnConsultarNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarNomeActionPerformed(evt);
            }
        });

        lblNome.setText("Nome:");

        javax.swing.GroupLayout tabNomeLayout = new javax.swing.GroupLayout(tabNome);
        tabNome.setLayout(tabNomeLayout);
        tabNomeLayout.setHorizontalGroup(
            tabNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabNomeLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(lblNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConsultarNome)
                .addContainerGap())
        );
        tabNomeLayout.setVerticalGroup(
            tabNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabNomeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultarNome)
                    .addComponent(lblNome))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Ordenar.addTab("Nome", tabNome);

        btnConsultarCpf.setText("Consultar");
        btnConsultarCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarCpfActionPerformed(evt);
            }
        });

        lblCpf.setText("CPF:");

        javax.swing.GroupLayout tabCpfLayout = new javax.swing.GroupLayout(tabCpf);
        tabCpf.setLayout(tabCpfLayout);
        tabCpfLayout.setHorizontalGroup(
            tabCpfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabCpfLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCpf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConsultarCpf)
                .addContainerGap())
        );
        tabCpfLayout.setVerticalGroup(
            tabCpfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabCpfLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabCpfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultarCpf)
                    .addComponent(lblCpf)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Ordenar.addTab("CPF", tabCpf);

        btnConsultarCnpj.setText("Consultar");
        btnConsultarCnpj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarCnpjActionPerformed(evt);
            }
        });

        lblCnpj.setText("CNPJ:");

        javax.swing.GroupLayout tabCnpjLayout = new javax.swing.GroupLayout(tabCnpj);
        tabCnpj.setLayout(tabCnpjLayout);
        tabCnpjLayout.setHorizontalGroup(
            tabCnpjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabCnpjLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCnpj)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConsultarCnpj)
                .addGap(0, 26, Short.MAX_VALUE))
        );
        tabCnpjLayout.setVerticalGroup(
            tabCnpjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabCnpjLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabCnpjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultarCnpj)
                    .addComponent(lblCnpj)
                    .addComponent(txtCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Ordenar.addTab("CNPJ", tabCnpj);

        jLabel1.setText("Máximo contemplados:");

        grupoRadio.add(radioFisico);
        radioFisico.setText("Cliente Físico");

        grupoRadio.add(radioJuridico);
        radioJuridico.setText("Cliente Jurídico");

        grupoRadio.add(radioTodos);
        radioTodos.setText("Todos");

        btnSortear.setText("Sortear");
        btnSortear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tabSorteioLayout = new javax.swing.GroupLayout(tabSorteio);
        tabSorteio.setLayout(tabSorteioLayout);
        tabSorteioLayout.setHorizontalGroup(
            tabSorteioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabSorteioLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTotalPremiados, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioFisico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioJuridico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioTodos)
                .addGap(18, 18, 18)
                .addComponent(btnSortear)
                .addContainerGap(93, Short.MAX_VALUE))
        );
        tabSorteioLayout.setVerticalGroup(
            tabSorteioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabSorteioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabSorteioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotalPremiados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(radioFisico)
                    .addComponent(radioJuridico)
                    .addComponent(radioTodos)
                    .addComponent(btnSortear))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Ordenar.addTab("Sorteio", tabSorteio);

        grupoRadio2.add(radioCodigo);
        radioCodigo.setText("Código");
        radioCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioCodigoActionPerformed(evt);
            }
        });

        grupoRadio2.add(radioNome);
        radioNome.setText("Nome");
        radioNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioNomeActionPerformed(evt);
            }
        });

        grupoRadio2.add(radioSobrenome);
        radioSobrenome.setText("Sobrenome");
        radioSobrenome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioSobrenomeActionPerformed(evt);
            }
        });

        lblFiltros.setText("Filtros:");

        javax.swing.GroupLayout tabOrdenarLayout = new javax.swing.GroupLayout(tabOrdenar);
        tabOrdenar.setLayout(tabOrdenarLayout);
        tabOrdenarLayout.setHorizontalGroup(
            tabOrdenarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabOrdenarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFiltros)
                .addGap(16, 16, 16)
                .addComponent(radioCodigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioSobrenome)
                .addContainerGap(339, Short.MAX_VALUE))
        );
        tabOrdenarLayout.setVerticalGroup(
            tabOrdenarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabOrdenarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabOrdenarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioCodigo)
                    .addComponent(radioNome)
                    .addComponent(radioSobrenome)
                    .addComponent(lblFiltros))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Ordenar.addTab("Ordenar", tabOrdenar);

        JTableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Sobrenome", "Cidade", "Estado Cliente"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollPane.setViewportView(JTableClientes);

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnVisualizar.setText("Visualizar");
        btnVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarActionPerformed(evt);
            }
        });

        btnBloquear.setText("Bloquear");
        btnBloquear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBloquearActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnReativar.setText("Reativar");
        btnReativar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReativarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Ordenar)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPane)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnVisualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBloquear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnReativar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Ordenar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlterar)
                    .addComponent(btnVisualizar)
                    .addComponent(btnBloquear)
                    .addComponent(btnCancelar)
                    .addComponent(btnReativar))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static boolean isNumero(String string) {
        try {
            Integer.parseInt(string);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public void preencherJTable(Collection<Cliente> clientes) {
        DefaultTableModel tabela = (DefaultTableModel) JTableClientes.getModel();
        tabela.setRowCount(0);
        Iterator<Cliente> iterator = clientes.iterator();
        Object linha[] = new Object[5];
        while (iterator.hasNext()) {
            Cliente cliente = iterator.next();
            linha[0] = cliente.getCodigo();
            linha[1] = cliente.getNome();
            linha[2] = cliente.getSobrenome();
            linha[3] = cliente.getEndereco().getCidade();
            linha[4] = cliente.getEstadoCliente();
            tabela.addRow(linha);
        }
    }

    public void preencherJTable(Cliente cliente) {
        DefaultTableModel tabela = (DefaultTableModel) JTableClientes.getModel();
        tabela.setRowCount(0);
        Object linha[] = new Object[5];
        linha[0] = cliente.getCodigo();
        linha[1] = cliente.getNome();
        linha[2] = cliente.getSobrenome();
        linha[3] = cliente.getEndereco().getCidade();
        linha[4] = cliente.getEstadoCliente();
        tabela.addRow(linha);
    }

    private void btnConsultarCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarCodigoActionPerformed
        if (txtCodigo.getText().isEmpty() || !isNumero(txtCodigo.getText())) {
            ConsultarClienteTodosController consultarClienteTodosController = new ConsultarClienteTodosController(clienteBusiness);
            Collection<Cliente> clientes = consultarClienteTodosController.executar();
            preencherJTable(clientes);
        } else {
            ConsultarClienteCodigoController consultarClienteCodigoController = new ConsultarClienteCodigoController(clienteBusiness);
            Cliente cliente = consultarClienteCodigoController.executar(Integer.parseInt(txtCodigo.getText()));
            if (cliente == null) {
                JOptionPane.showMessageDialog(null, "Cliente não encontrado!");
                return;
            }
            preencherJTable(cliente);
        }
    }//GEN-LAST:event_btnConsultarCodigoActionPerformed

    private void btnConsultarNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarNomeActionPerformed
        if (txtNome.getText().isEmpty()) {
            ConsultarClienteTodosController consultarClienteTodosController = new ConsultarClienteTodosController(clienteBusiness);
            Collection<Cliente> clientes = consultarClienteTodosController.executar();
            preencherJTable(clientes);
        } else {
            ConsultarClienteNomeController consultarClienteNomeController = new ConsultarClienteNomeController(clienteBusiness);
            Collection<Cliente> clientes = consultarClienteNomeController.executar(txtNome.getText());
            preencherJTable(clientes);
        }
    }//GEN-LAST:event_btnConsultarNomeActionPerformed

    private void btnConsultarCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarCpfActionPerformed
        if (txtCpf.getText().isEmpty()) {
            ConsultarClienteTodosController consultarClienteTodosController = new ConsultarClienteTodosController(clienteBusiness);
            Collection<Cliente> clientes = consultarClienteTodosController.executar();
            preencherJTable(clientes);
        } else {
            ConsultarClienteCpfController consultarClienteCpfController = new ConsultarClienteCpfController(clienteBusiness);
            Collection<Cliente> clientes = consultarClienteCpfController.executar(txtCpf.getText());
            preencherJTable(clientes);
        }
    }//GEN-LAST:event_btnConsultarCpfActionPerformed

    private void btnConsultarCnpjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarCnpjActionPerformed
        if (txtCnpj.getText().isEmpty()) {
            ConsultarClienteTodosController consultarClienteTodosController = new ConsultarClienteTodosController(clienteBusiness);
            Collection<Cliente> clientes = consultarClienteTodosController.executar();
            preencherJTable(clientes);
        } else {
            ConsultarClienteCnpjController consultarClienteCnpjController = new ConsultarClienteCnpjController(clienteBusiness);
            Collection<Cliente> clientes = consultarClienteCnpjController.executar(txtCnpj.getText());
            preencherJTable(clientes);
        }
    }//GEN-LAST:event_btnConsultarCnpjActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        int linha = JTableClientes.getSelectedRow();
        int codigo = (int) JTableClientes.getValueAt(linha, 0);
        ConsultarClienteCodigoController consultarClienteCodigoController = new ConsultarClienteCodigoController(clienteBusiness);
        Cliente cliente = consultarClienteCodigoController.executar(codigo);
        ClienteView clienteView = new ClienteView(clienteBusiness, cliente);
        this.desktopPane.add(clienteView);
        clienteView.setVisible(true);
        clienteView.preencherCampos();
        clienteView.btnBloquear.setEnabled(false);
        clienteView.btnCancelar.setEnabled(false);
        clienteView.btnReativar.setEnabled(false);
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarActionPerformed
        int linha = JTableClientes.getSelectedRow();
        int codigo = (int) JTableClientes.getValueAt(linha, 0);
        ConsultarClienteCodigoController consultarClienteCodigoController = new ConsultarClienteCodigoController(clienteBusiness);
        Cliente cliente = consultarClienteCodigoController.executar(codigo);
        ClienteView clienteView = new ClienteView(clienteBusiness, cliente);
        this.desktopPane.add(clienteView);
        clienteView.setVisible(true);
        clienteView.preencherCampos();
        clienteView.btnSalvar.setEnabled(false);
        clienteView.btnBloquear.setEnabled(false);
        clienteView.btnCancelar.setEnabled(false);
        clienteView.btnReativar.setEnabled(false);
    }//GEN-LAST:event_btnVisualizarActionPerformed

    private void btnBloquearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBloquearActionPerformed
        int linha = JTableClientes.getSelectedRow();
        int codigo = (int) JTableClientes.getValueAt(linha, 0);
        ConsultarClienteCodigoController consultarClienteCodigoController = new ConsultarClienteCodigoController(clienteBusiness);
        Cliente cliente = consultarClienteCodigoController.executar(codigo);
        ClienteView clienteView = new ClienteView(clienteBusiness, cliente);
        this.desktopPane.add(clienteView);
        clienteView.setVisible(true);
        clienteView.preencherCampos();
        clienteView.btnSalvar.setEnabled(false);
        clienteView.btnCancelar.setEnabled(false);
        clienteView.btnReativar.setEnabled(false);
    }//GEN-LAST:event_btnBloquearActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        int linha = JTableClientes.getSelectedRow();
        int codigo = (int) JTableClientes.getValueAt(linha, 0);
        ConsultarClienteCodigoController consultarClienteCodigoController = new ConsultarClienteCodigoController(clienteBusiness);
        Cliente cliente = consultarClienteCodigoController.executar(codigo);
        ClienteView clienteView = new ClienteView(clienteBusiness, cliente);
        this.desktopPane.add(clienteView);
        clienteView.setVisible(true);
        clienteView.preencherCampos();
        clienteView.btnSalvar.setEnabled(false);
        clienteView.btnBloquear.setEnabled(false);
        clienteView.btnReativar.setEnabled(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnReativarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReativarActionPerformed
        int linha = JTableClientes.getSelectedRow();
        int codigo = (int) JTableClientes.getValueAt(linha, 0);
        ConsultarClienteCodigoController consultarClienteCodigoController = new ConsultarClienteCodigoController(clienteBusiness);
        Cliente cliente = consultarClienteCodigoController.executar(codigo);
        ClienteView clienteView = new ClienteView(clienteBusiness, cliente);
        this.desktopPane.add(clienteView);
        clienteView.setVisible(true);
        clienteView.preencherCampos();
        clienteView.btnSalvar.setEnabled(false);
        clienteView.btnBloquear.setEnabled(false);
        clienteView.btnCancelar.setEnabled(false);
    }//GEN-LAST:event_btnReativarActionPerformed

    private void btnSortearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortearActionPerformed
        if (!isNumero(txtTotalPremiados.getText())) {
            JOptionPane.showMessageDialog(null, "O campo com o número de contemplados precisa ser númerico!");
            return;
        }
        Sorteador<Cliente> sorteador = new Sorteador();
        ArrayList<Cliente> contemplados = null;
        ConsultarClienteTodosController consultarClienteTodosController = new ConsultarClienteTodosController(clienteBusiness);
        ArrayList<Cliente> clientes = new ArrayList<>(consultarClienteTodosController.executar());

        if (txtTotalPremiados.getText().isEmpty() || (Integer.parseInt(txtTotalPremiados.getText()) > clientes.size())) {
            txtTotalPremiados.setText(String.valueOf(clientes.size()));
        }
        if (!radioTodos.isSelected() && !radioFisico.isSelected() && !radioJuridico.isSelected()) {
            radioTodos.setSelected(true);
        }
        if (radioTodos.isSelected()) {
            sorteador.setParticipantes(clientes);
        }
        if (radioFisico.isSelected()) {
            SortearClientesController sortearClientesController = new SortearClientesController(clienteBusiness);
            sorteador.setParticipantes(sortearClientesController.listarClientesFisicos());
        }
        if (radioJuridico.isSelected()) {
            SortearClientesController sortearClientesController = new SortearClientesController(clienteBusiness);
            sorteador.setParticipantes(sortearClientesController.listarClientesJuridicos());
        }
        if (Integer.parseInt(txtTotalPremiados.getText()) > sorteador.getParticipantes().size()) {
            txtTotalPremiados.setText(String.valueOf(sorteador.getParticipantes().size()));
        }
        contemplados = (ArrayList<Cliente>) sorteador.sortear(Integer.parseInt(txtTotalPremiados.getText()));
        preencherJTable(contemplados);
    }//GEN-LAST:event_btnSortearActionPerformed

    private void radioCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioCodigoActionPerformed
        ConsultarClienteTodosController consultarClienteTodosController = new ConsultarClienteTodosController(clienteBusiness);
        ArrayList<Cliente> clientes = new ArrayList<>(consultarClienteTodosController.executar());
        Collections.sort(clientes, new Cliente.OrdenadorCodigo());
        preencherJTable(clientes);
    }//GEN-LAST:event_radioCodigoActionPerformed

    private void radioNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioNomeActionPerformed
        ConsultarClienteTodosController consultarClienteTodosController = new ConsultarClienteTodosController(clienteBusiness);
        ArrayList<Cliente> clientes = new ArrayList<>(consultarClienteTodosController.executar());
        Collections.sort(clientes);
        preencherJTable(clientes);
    }//GEN-LAST:event_radioNomeActionPerformed

    private void radioSobrenomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioSobrenomeActionPerformed
        ConsultarClienteTodosController consultarClienteTodosController = new ConsultarClienteTodosController(clienteBusiness);
        ArrayList<Cliente> clientes = new ArrayList<>(consultarClienteTodosController.executar());
        Collections.sort(clientes, new Cliente.OrdenadorSobrenome());
        preencherJTable(clientes);
    }//GEN-LAST:event_radioSobrenomeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTableClientes;
    private javax.swing.JTabbedPane Ordenar;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnBloquear;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConsultarCnpj;
    private javax.swing.JButton btnConsultarCodigo;
    private javax.swing.JButton btnConsultarCpf;
    private javax.swing.JButton btnConsultarNome;
    private javax.swing.JButton btnReativar;
    private javax.swing.JButton btnSortear;
    private javax.swing.JButton btnVisualizar;
    private javax.swing.ButtonGroup grupoRadio;
    private javax.swing.ButtonGroup grupoRadio2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCnpj;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblFiltros;
    private javax.swing.JLabel lblNome;
    private javax.swing.JRadioButton radioCodigo;
    private javax.swing.JRadioButton radioFisico;
    private javax.swing.JRadioButton radioJuridico;
    private javax.swing.JRadioButton radioNome;
    private javax.swing.JRadioButton radioSobrenome;
    private javax.swing.JRadioButton radioTodos;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JPanel tabCnpj;
    private javax.swing.JPanel tabCodigo;
    private javax.swing.JPanel tabCpf;
    private javax.swing.JPanel tabNome;
    private javax.swing.JPanel tabOrdenar;
    private javax.swing.JPanel tabSorteio;
    public javax.swing.JFormattedTextField txtCnpj;
    private javax.swing.JTextField txtCodigo;
    public javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTotalPremiados;
    // End of variables declaration//GEN-END:variables
}
