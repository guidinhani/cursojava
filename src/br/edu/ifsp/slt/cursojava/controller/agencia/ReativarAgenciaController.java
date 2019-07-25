/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.slt.cursojava.controller.agencia;

import br.edu.ifsp.slt.cursojava.model.business.AgenciaBusiness;
import br.edu.ifsp.slt.cursojava.model.entidades.Agencia;

/**
 *
 * @author Guilherme
 */
public class ReativarAgenciaController {

    private AgenciaBusiness agenciaBusiness = null;

    public ReativarAgenciaController(AgenciaBusiness agenciaBusiness) {
        this.agenciaBusiness = agenciaBusiness;
    }

    public boolean executar(Agencia agencia) {
        return agenciaBusiness.reativar(agencia);
    }
}
