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
public class ConsultarAgenciaController {

    private AgenciaBusiness agenciaBusiness = null;

    public ConsultarAgenciaController(AgenciaBusiness agenciaBusiness) {
        this.agenciaBusiness = agenciaBusiness;
    }

    public Agencia executar(int codigo) {
        return agenciaBusiness.consultar(codigo);
    }
}
