/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.slt.cursojava.controller.cliente;

import br.edu.ifsp.slt.cursojava.model.business.ClienteBusiness;
import br.edu.ifsp.slt.cursojava.model.entidades.MensagemSucesso;

/**
 *
 * @author Guilherme
 */
public class CancelarClienteController implements MensagemSucesso {

    private ClienteBusiness clienteBusiness = null;

    public CancelarClienteController(ClienteBusiness clienteBusiness) {
        this.clienteBusiness = clienteBusiness;
    }

    public String executar(int codigo) {
        clienteBusiness.cancelar(codigo);
        return getMensagemSucesso();
    }

    @Override
    public String getMensagemSucesso() {
        return "Cliente cancelado!";
    }
}
