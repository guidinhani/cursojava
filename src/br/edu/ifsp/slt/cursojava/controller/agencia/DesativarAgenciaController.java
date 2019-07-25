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
public class DesativarAgenciaController {

    private AgenciaBusiness agenciaBusiness = null;

    public DesativarAgenciaController(AgenciaBusiness agenciaBusiness) {
        this.agenciaBusiness = agenciaBusiness;
    }

    public boolean executar(Agencia agencia) {
        return agenciaBusiness.desativar(agencia);
    }
}
