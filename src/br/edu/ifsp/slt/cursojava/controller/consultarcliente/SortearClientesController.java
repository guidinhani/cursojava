/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.slt.cursojava.controller.consultarcliente;

import br.edu.ifsp.slt.cursojava.model.business.ClienteBusiness;
import br.edu.ifsp.slt.cursojava.model.entidades.Cliente;
import java.util.List;

/**
 *
 * @author Guilherme
 */
public class SortearClientesController {

    private ClienteBusiness clienteBusiness = null;

    public SortearClientesController(ClienteBusiness clienteBusiness) {
        this.clienteBusiness = clienteBusiness;
    }

    public List<Cliente> listarClientesFisicos() {
        return clienteBusiness.listarClientesFisicos();
    }

    public List<Cliente> listarClientesJuridicos() {
        return clienteBusiness.listarClientesJuridicos();
    }
}
