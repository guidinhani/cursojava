/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.slt.cursojava.controller.cliente;

import br.edu.ifsp.slt.cursojava.model.entidades.Cliente;
import br.edu.ifsp.slt.cursojava.model.business.ClienteBusiness;

/**
 *
 * @author Guilherme
 */
public class VisualizarClienteController {

    private ClienteBusiness clienteBusiness = null;

    public VisualizarClienteController(ClienteBusiness clienteBusiness) {
        this.clienteBusiness = clienteBusiness;
    }

    public Cliente executar(int codigo) {
        return clienteBusiness.consultar(codigo);
    }
}
