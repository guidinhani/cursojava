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
public final class ClienteFisico extends Cliente {

    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String getNomeCompleto() {
        return getNome() + " " + getSobrenome();
    }

    @Override
    public String toString() {
        return "Código: " + this.getCodigo()
                + "\nNome: " + this.getNomeCompleto()
                + "\nLogradouro: " + this.getEndereco().getLogradouro()
                + "\nCidade: " + this.getEndereco().getCidade()
                + "\nUF: " + this.getEndereco().getUF()
                + "\nTelefone: " + this.getTelefone()
                + "\nEmail: " + this.getEmail()
                + "\nCPF: " + this.getCpf()
                + "\nEstado: " + this.getEstadoCliente();
    }

    @Override
    public String getDocumento() {
        return this.cpf;
    }

    @Override
    public int compareTo(Cliente that) {
        return this.getNome().compareToIgnoreCase(that.getNome());
    }

    @Override
    public String getTitulo() {
        return "CPF: " + this.getCpf();
    }

    @Override
    public String getRotuloIdentificador() {
        return "CPF";
    }

    @Override
    public String getFormatoMascaraIdentificador() {
        return ("###.###.###-##");
    }

}
