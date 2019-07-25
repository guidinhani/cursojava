/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.slt.cursojava.model.entidades;

import java.util.Comparator;

/**
 *
 * @author Guilherme
 */
public abstract class Cliente implements Comparable<Cliente> {

    private int codigo;
    private String nome;
    private String sobrenome;
    private Endereco endereco;
    private String telefone;
    private String email;
    private EstadoCliente estadoCliente;

    public abstract String getTitulo();

    public abstract String getRotuloIdentificador();

    public abstract String getFormatoMascaraIdentificador();

    public abstract String getNomeCompleto();

    public abstract String getDocumento();

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

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public EstadoCliente getEstadoCliente() {
        return estadoCliente;
    }

    public void setEstadoCliente(EstadoCliente estadoCliente) {
        this.estadoCliente = estadoCliente;
    }

    public static class OrdenadorTipoInstancia implements Comparator<Cliente> {

        @Override
        public int compare(Cliente cliente1, Cliente cliente2) {
            if (cliente1 instanceof ClienteFisico) {
                return -1;
            }
            if (cliente1 instanceof ClienteJuridico) {
                return 1;
            }
            return 0;
        }
    }

    public static class OrdenadorCodigo implements Comparator<Cliente> {

        @Override
        public int compare(Cliente cliente1, Cliente cliente2) {
            if (cliente1.getCodigo() < cliente2.getCodigo()) {
                return -1;
            }
            if (cliente1.getCodigo() > cliente2.getCodigo()) {
                return 1;
            }
            return 0;
        }
    }

    public static class OrdenadorSobrenome implements Comparator<Cliente> {

        @Override
        public int compare(Cliente cliente1, Cliente cliente2) {
            return cliente1.getSobrenome().compareToIgnoreCase(cliente2.getSobrenome());
        }
    }

}
