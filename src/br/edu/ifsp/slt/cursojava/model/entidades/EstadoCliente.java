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
public enum EstadoCliente {

    ATIVO("Cliente ativo"), BLOQUEADO("Cliente bloqueado"), CANCELADO("Cliente cancelado");

    private String descricao;

    EstadoCliente(String descricao) {
        this.descricao = descricao;
    }

    String getDescricao() {
        return this.descricao;
    }
}
