/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.slt.cursojava.model.entidades;

/**
 *
 * @author Guilherme
 */
public class PreenchimentoObrigatorioException extends Exception implements MensagemException {

    public PreenchimentoObrigatorioException(String mensagem) {
        super(mensagem);
    }

    @Override
    public String getMensagem() {
        return super.getMessage();
    }

}
