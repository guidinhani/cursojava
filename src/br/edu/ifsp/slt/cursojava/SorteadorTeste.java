/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.slt.cursojava;

import br.edu.ifsp.slt.cursojava.model.entidades.UnidadeFederativa;
import br.edu.ifsp.slt.cursojava.model.entidades.EstadoCliente;
import br.edu.ifsp.slt.cursojava.model.entidades.ClienteFisico;
import br.edu.ifsp.slt.cursojava.model.entidades.Endereco;
import br.edu.ifsp.slt.cursojava.model.entidades.ClienteJuridico;
import br.edu.ifsp.slt.cursojava.model.entidades.Sorteador;
import br.edu.ifsp.slt.cursojava.model.entidades.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Guilherme
 */
//Testando o sorteador genérico
public class SorteadorTeste {

    public static void main(String[] args) {
        ArrayList<Cliente> participantes = new ArrayList<>();

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
            participantes.add(clienteFisico);
        }

        for (int i = 0; i < 10; i++) {
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
            participantes.add(clienteJuridico);
        }

        Sorteador sorteador = new Sorteador(participantes);
        List<Cliente> contemplados = sorteador.sortear(5);
        for (Cliente contemplado : contemplados) {
            System.out.println(contemplado.getNome());
        }
        System.out.println(sorteador.getProximoContemplado());
        System.out.println(sorteador.getProximoContemplado());

    }
}
