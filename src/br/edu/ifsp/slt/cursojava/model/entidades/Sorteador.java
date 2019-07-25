package br.edu.ifsp.slt.cursojava.model.entidades;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Guilherme
 * @param <P>
 */
public class Sorteador<P> {

    private Iterator<P> iterator;
    private List<P> participantes = null;
    private List<P> contemplados;

    public Sorteador() {
    }

    public Sorteador(List<P> participantes) {
        this.participantes = participantes;
    }

    public Sorteador(P[] participantes) {
        this.participantes = Arrays.asList(participantes);
    }

    public List<P> sortear(int totalPremiados) {
        contemplados = new ArrayList<>();
        for (int i = 0; i < totalPremiados; i++) {
            int sorteado = (int) (Math.random() * participantes.size());
            P participante = this.participantes.get(sorteado);
            this.contemplados.add(participante);
            this.participantes.remove(participante);
        }
        iterator = this.contemplados.iterator();
        return contemplados;
    }

    public boolean hasContemplado() {
        return !contemplados.isEmpty();
    }

    public P getProximoContemplado() {
        while (iterator.hasNext()) {
            return iterator.next();
        }
        return null;
    }

    public void addParticipante(P participante) {
        this.participantes.add(participante);
    }

    public void addParticipantes(List<P> participantes) {
        if (this.participantes == null) {
            this.participantes = new ArrayList<>();
        }
        this.participantes.addAll(participantes);
    }

    public void addParticipantes(P[] participantes) {
        for (int i = 0; i < participantes.length; i++) {
            this.participantes.add(participantes[i]);
        }
    }

    public void setParticipantes(List<P> participantes) {
        this.participantes = participantes;
    }

    public void setParticipantes(P[] participantes) {
        this.participantes = Arrays.asList(participantes);
    }

    public List<P> getParticipantes() {
        return participantes;
    }

    public List<P> getContemplados() {
        return contemplados;
    }

    public void setContemplados(List<P> contemplados) {
        this.contemplados = contemplados;
    }
}
