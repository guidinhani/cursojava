/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.slt.cursojava.model.business;

import br.edu.ifsp.slt.cursojava.model.entidades.Agencia;
import java.util.ArrayList;

/**
 *
 * @author Guilherme
 */
//Implementação do Singleton
public class AgenciaBusiness {

    //ArrayList não-genérico
    private ArrayList agencias = new ArrayList();
    private static AgenciaBusiness instancia = null;

    private AgenciaBusiness() {
        for (int i = 0; i < 10; i++) {
            Agencia agencia = new Agencia();
            agencia.setCodigo(i);
            agencia.setNome("Agência " + i);
            agencia.setCnpj(String.valueOf(i));
            agencia.setEndereco(String.valueOf(i));
            agencia.setAtiva(false);
            agencias.add(agencia);
        }
    }

    synchronized public static AgenciaBusiness getInstancia() {
        if (AgenciaBusiness.instancia == null) {
            AgenciaBusiness.instancia = new AgenciaBusiness();
        }
        return AgenciaBusiness.instancia;
    }

    public void cadastrar(Agencia novaAgencia) {
        //Alterar    
        for (int i = 0; i < agencias.size(); i++) {
            Agencia agencia = (Agencia) agencias.get(i);
            if (agencia.getCodigo() == novaAgencia.getCodigo()) {
                agencias.set(i, novaAgencia);
                return;
            }
        }
        // Cadastrar
        agencias.add(novaAgencia);
    }

    public Agencia consultar(int codigo) {
        for (int i = 0; i < agencias.size(); i++) {
            Agencia agencia = (Agencia) agencias.get(i);
            if (agencia.getCodigo() == codigo) {
                return agencia;
            }
        }
        return null;
    }

    public boolean desativar(Agencia agencia) {
        /*
        for (Agencia agencia : (ArrayList<Agencia>) agencias) {
            if (agencia.getCodigo() == codigo) {
                if (agencia.isAtiva() == true) {
                    agencia.setAtiva(false);
                    return true;
                }
            }
        }
        return false;
        */
        if (agencia.isAtiva()) {
            agencia.setAtiva(false);
            return true;
        }
        return false;
    }

    public boolean reativar(Agencia agencia) {
        /*
        for (Iterator i = agencias.iterator(); i.hasNext();) {
            Agencia agencia = (Agencia) i.next();
            if (agencia.getCodigo() == codigo) {
                if (agencia.isAtiva() == false) {
                    agencia.setAtiva(true);
                    return true;
                }
            }
        }
        return false;
        */
         if (!agencia.isAtiva()) {
            agencia.setAtiva(true);
            return true;
        }
        return false;
    }
}
