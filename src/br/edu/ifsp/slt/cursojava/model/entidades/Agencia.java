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
public class Agencia {

    private int codigo;
    private String nome;
    private String endereco;
    private String cnpj;
    private boolean ativa;

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "Código: " + this.getCodigo() + "\nNome: " + this.getNome() + "\nCNPJ: " + this.getCnpj() + "\nEndereço: " + this.getEndereco() + "\nAtiva: " + this.isAtiva();
    }
}
