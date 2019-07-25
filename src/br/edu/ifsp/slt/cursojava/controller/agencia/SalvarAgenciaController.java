/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.slt.cursojava.controller.agencia;

import br.edu.ifsp.slt.cursojava.model.business.AgenciaBusiness;
import br.edu.ifsp.slt.cursojava.model.entidades.Agencia;
import br.edu.ifsp.slt.cursojava.model.entidades.MensagemSucesso;

/**
 *
 * @author Guilherme
 */
public class SalvarAgenciaController implements MensagemSucesso {

    private AgenciaBusiness agenciaBusiness = null;
    private Agencia agencia = null;

    public SalvarAgenciaController(AgenciaBusiness agenciaBusiness) {
        this.agenciaBusiness = agenciaBusiness;
        this.agencia = new Agencia();
    }

    public String executar(String codigo, String nome, String cnpj, String endereco, Boolean ativa) {

        this.agencia.setCodigo(Integer.parseInt(codigo));
        this.agencia.setNome(nome);
        this.agencia.setCnpj(cnpj);
        this.agencia.setEndereco(endereco);
        this.agencia.setAtiva(ativa);
        this.agenciaBusiness.cadastrar(this.agencia);
        return this.getMensagemSucesso();
    }

    @Override
    public String getMensagemSucesso() {
        return "Agência salva com sucesso!";
    }
}
