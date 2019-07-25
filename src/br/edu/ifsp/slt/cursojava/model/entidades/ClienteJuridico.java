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
public final class ClienteJuridico extends Cliente {

    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String getNomeCompleto() {
        return getNome();
    }

    @Override
    public String toString() {
        return "Código: " + this.getCodigo()
                + "\nRazão Social: " + this.getNomeCompleto()
                + "\nLogradouro: " + this.getEndereco().getLogradouro()
                + "\nCidade: " + this.getEndereco().getCidade()
                + "\nUF: " + this.getEndereco().getUF()
                + "\nTelefone: " + this.getTelefone()
                + "\nEmail: " + this.getEmail()
                + "\nCNPJ: " + this.getCnpj()
                + "\nEstado: " + this.getEstadoCliente();
    }

    @Override
    public String getDocumento() {
        return this.cnpj;
    }

    @Override
    public int compareTo(Cliente that) {
        return this.getNome().compareToIgnoreCase(that.getNome());
    }

    @Override
    public String getTitulo() {
        return "CNPJ: " + this.getCnpj();
    }

    @Override
    public String getRotuloIdentificador() {
        return "CNPJ";
    }

    @Override
    public String getFormatoMascaraIdentificador() {
        return ("##.###.###/####-##");
    }
}
