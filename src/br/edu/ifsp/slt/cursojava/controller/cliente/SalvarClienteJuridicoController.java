/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.slt.cursojava.controller.cliente;

import br.edu.ifsp.slt.cursojava.model.business.ClienteBusiness;
import br.edu.ifsp.slt.cursojava.model.entidades.ClienteJuridico;
import br.edu.ifsp.slt.cursojava.model.entidades.Endereco;
import br.edu.ifsp.slt.cursojava.model.entidades.EstadoCliente;
import br.edu.ifsp.slt.cursojava.model.entidades.MensagemSucesso;
import br.edu.ifsp.slt.cursojava.model.entidades.UnidadeFederativa;

/**
 *
 * @author Guilherme
 */
public class SalvarClienteJuridicoController implements MensagemSucesso {

    private ClienteBusiness clienteBusiness = null;
    private ClienteJuridico clienteJuridico = null;

    public SalvarClienteJuridicoController(ClienteBusiness clienteBusiness) {
        this.clienteBusiness = clienteBusiness;
        this.clienteJuridico = new ClienteJuridico();
    }

    public String executar(String codigo, String nome, String sobrenome, String logradouro, String cidade, UnidadeFederativa estado,
            String telefone, String email, EstadoCliente estadoCliente, String documento) {

        this.clienteJuridico.setCodigo(Integer.parseInt(codigo));
        this.clienteJuridico.setNome(nome);
        this.clienteJuridico.setSobrenome(sobrenome);
        Endereco endereco = new Endereco();
        endereco.setLogradouro(logradouro);
        endereco.setCidade(cidade);
        endereco.setUF(estado);
        this.clienteJuridico.setEndereco(endereco);
        this.clienteJuridico.setTelefone(telefone);
        this.clienteJuridico.setEmail(email);
        this.clienteJuridico.setEstadoCliente(estadoCliente);
        this.clienteJuridico.setCnpj(documento);
        this.clienteBusiness.cadastrar(this.clienteJuridico);
        return this.getMensagemSucesso();
    }

    @Override
    public String getMensagemSucesso() {
        return "Cliente Jurídico salvo com sucesso!";
    }
}
