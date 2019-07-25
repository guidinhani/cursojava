/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.slt.cursojava.controller.cliente;

import br.edu.ifsp.slt.cursojava.model.business.ClienteBusiness;
import br.edu.ifsp.slt.cursojava.model.entidades.ClienteFisico;
import br.edu.ifsp.slt.cursojava.model.entidades.Endereco;
import br.edu.ifsp.slt.cursojava.model.entidades.EstadoCliente;
import br.edu.ifsp.slt.cursojava.model.entidades.MensagemSucesso;
import br.edu.ifsp.slt.cursojava.model.entidades.UnidadeFederativa;

/**
 *
 * @author Guilherme
 */
public class SalvarClienteFisicoController implements MensagemSucesso {

    private ClienteBusiness clienteBusiness = null;
    private ClienteFisico clienteFisico = null;

    public SalvarClienteFisicoController(ClienteBusiness clienteBusiness) {
        this.clienteBusiness = clienteBusiness;
        this.clienteFisico = new ClienteFisico();
    }

    public String executar(String codigo, String nome, String sobrenome, String logradouro, String cidade, UnidadeFederativa estado,
            String telefone, String email, EstadoCliente estadoCliente, String documento) {

        this.clienteFisico.setCodigo(Integer.parseInt(codigo));
        this.clienteFisico.setNome(nome);
        this.clienteFisico.setSobrenome(sobrenome);
        Endereco endereco = new Endereco();
        endereco.setLogradouro(logradouro);
        endereco.setCidade(cidade);
        endereco.setUF(estado);
        this.clienteFisico.setEndereco(endereco);
        this.clienteFisico.setTelefone(telefone);
        this.clienteFisico.setEmail(email);
        this.clienteFisico.setEstadoCliente(estadoCliente);
        this.clienteFisico.setCpf(documento);
        this.clienteBusiness.cadastrar(this.clienteFisico);
        return this.getMensagemSucesso();
    }

    @Override
    public String getMensagemSucesso() {
        return "Cliente Físico salvo com sucesso!";
    }
}
