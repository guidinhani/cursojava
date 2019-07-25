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
public enum UnidadeFederativa {

    SP("São Paulo"), RJ("Rio de Janeiro"), MG("Minas Gerais"), PR("Parána");

    private String descricao;

    UnidadeFederativa(String descricao) {
        this.descricao = descricao;
    }

    String getDescricao() {
        return this.descricao;
    }
}
