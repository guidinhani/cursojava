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
public class Endereco {

    private String logradouro;
    private String cidade;
    private UnidadeFederativa Uf;

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public UnidadeFederativa getUF() {
        return Uf;
    }

    public void setUF(UnidadeFederativa Uf) {
        this.Uf = Uf;
    }

}
