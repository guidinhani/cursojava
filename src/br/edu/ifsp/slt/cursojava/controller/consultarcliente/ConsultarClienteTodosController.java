/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.slt.cursojava.controller.consultarcliente;

import br.edu.ifsp.slt.cursojava.model.business.ClienteBusiness;
import br.edu.ifsp.slt.cursojava.model.entidades.Cliente;
import java.util.Collection;

/**
 *
 * @author Guilherme
 */
public class ConsultarClienteTodosController {

    private ClienteBusiness clienteBusiness = null;

    public ConsultarClienteTodosController(ClienteBusiness clienteBusiness) {
        this.clienteBusiness = clienteBusiness;
    }

    public Collection<Cliente> executar() {
        return clienteBusiness.consultarTodos();
    }
}
