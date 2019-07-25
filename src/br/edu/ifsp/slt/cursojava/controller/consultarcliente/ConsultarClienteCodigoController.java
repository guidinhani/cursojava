/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.slt.cursojava.controller.consultarcliente;

import br.edu.ifsp.slt.cursojava.model.business.ClienteBusiness;
import br.edu.ifsp.slt.cursojava.model.entidades.Cliente;

/**
 *
 * @author Guilherme
 */
public class ConsultarClienteCodigoController {

    private ClienteBusiness clienteBusiness = null;

    public ConsultarClienteCodigoController(ClienteBusiness clienteBusiness) {
        this.clienteBusiness = clienteBusiness;
    }

    public Cliente executar(int codigo) {
        return clienteBusiness.consultar(codigo);
    }
}
