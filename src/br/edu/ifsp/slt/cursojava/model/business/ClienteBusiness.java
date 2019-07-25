/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.slt.cursojava.model.business;

import br.edu.ifsp.slt.cursojava.model.entidades.Cliente;
import br.edu.ifsp.slt.cursojava.model.entidades.ClienteFisico;
import br.edu.ifsp.slt.cursojava.model.entidades.ClienteJuridico;
import br.edu.ifsp.slt.cursojava.model.entidades.Endereco;
import br.edu.ifsp.slt.cursojava.model.entidades.EstadoCliente;
import br.edu.ifsp.slt.cursojava.model.entidades.UnidadeFederativa;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author Guilherme
 */
public class ClienteBusiness {

    //Map genérico
    private Map<Integer, Cliente> clientes = new HashMap();

    public ClienteBusiness() {
        for (int i = 0; i < 10; i++) {
            ClienteFisico clienteFisico = new ClienteFisico();
            clienteFisico.setCodigo(i);
            clienteFisico.setCpf(String.valueOf(i));
            clienteFisico.setEmail(String.valueOf(i));
            Endereco endereco = new Endereco();
            endereco.setCidade(String.valueOf(i));
            endereco.setLogradouro(String.valueOf(i));
            endereco.setUF(UnidadeFederativa.SP);
            clienteFisico.setEndereco(endereco);
            clienteFisico.setEstadoCliente(EstadoCliente.ATIVO);
            clienteFisico.setNome("Cliente Físico: " + String.valueOf(i));
            clienteFisico.setSobrenome(String.valueOf(i));
            clienteFisico.setTelefone(String.valueOf(i));
            clientes.put(i, clienteFisico);
        }

        for (int i = 10; i < 20; i++) {
            ClienteJuridico clienteJuridico = new ClienteJuridico();
            clienteJuridico.setCodigo(i);
            clienteJuridico.setCnpj(String.valueOf(i));
            clienteJuridico.setEmail(String.valueOf(i));
            Endereco endereco = new Endereco();
            endereco.setCidade(String.valueOf(i));
            endereco.setLogradouro(String.valueOf(i));
            endereco.setUF(UnidadeFederativa.SP);
            clienteJuridico.setEndereco(endereco);
            clienteJuridico.setEstadoCliente(EstadoCliente.ATIVO);
            clienteJuridico.setNome("Cliente Jurídico: " + String.valueOf(i));
            clienteJuridico.setSobrenome(String.valueOf(i));
            clienteJuridico.setTelefone(String.valueOf(i));
            clientes.put(i, clienteJuridico);
        }
    }

    public void cadastrar(Cliente cliente) {
        clientes.put(cliente.getCodigo(), cliente);
    }

    public Cliente consultar(Integer codigo) {
        return clientes.get(codigo);
    }

    public void bloquear(Integer codigo) {
        clientes.get(codigo).setEstadoCliente(EstadoCliente.BLOQUEADO);
    }

    public void cancelar(Integer codigo) {
        clientes.get(codigo).setEstadoCliente(EstadoCliente.CANCELADO);
    }

    public void reativar(Integer codigo) {
        clientes.get(codigo).setEstadoCliente(EstadoCliente.ATIVO);
    }

    public Collection<Cliente> consultarTodos() {
        return clientes.values();
    }

    public Collection<Cliente> consultarNome(String nome) {
        Map<Integer, Cliente> resultado = clientes.entrySet()
                .stream()
                .filter(s -> s.getValue().getNome().equalsIgnoreCase(nome))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        ArrayList<Cliente> listaClientes = new ArrayList<>(resultado.values());
        return listaClientes;
    }

    public Collection<Cliente> consultarCpf(String cpf) {
        Map<Integer, Cliente> resultado = clientes.entrySet()
                .stream()
                .filter(s -> s.getValue().getDocumento().equalsIgnoreCase(cpf))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        ArrayList<Cliente> listaClientes = new ArrayList<>(resultado.values());
        return listaClientes;
    }

    public Collection<Cliente> consultarCnpj(String cnpj) {
        Map<Integer, Cliente> resultado = clientes.entrySet()
                .stream()
                .filter(s -> s.getValue().getDocumento().equalsIgnoreCase(cnpj))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        ArrayList<Cliente> listaClientes = new ArrayList<>(resultado.values());
        return listaClientes;
    }

    public List<Cliente> listarClientesFisicos() {
        List<Cliente> clientesFisicos = new ArrayList<>();
        for (Cliente cliente : clientes.values()) {
            if (cliente instanceof ClienteFisico) {
                clientesFisicos.add((ClienteFisico) cliente);
            }
        }
        return clientesFisicos;
    }

    public List<Cliente> listarClientesJuridicos() {
        List<Cliente> clientesJuridicos = new ArrayList<>();
        for (Cliente cliente : clientes.values()) {
            if (cliente instanceof ClienteJuridico) {
                clientesJuridicos.add((ClienteJuridico) cliente);
            }
        }
        return clientesJuridicos;
    }
}
