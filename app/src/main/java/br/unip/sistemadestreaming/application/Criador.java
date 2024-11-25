package br.unip.sistemadestreaming.application;

import java.util.ArrayList;
import java.util.List;

public class Criador {

    private int id;
    private String nome;
    private List<Conteudo> conteudos;

    public Criador(int id, String nome, List<Conteudo> conteudo) {
        this.id = id;
        this.nome = nome;
        this.conteudos = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public List<Conteudo> getConteudos() {
        return conteudos;
    }

    public void addConteudo(Conteudo conteudo){
        conteudos.add(conteudo);
    }
}
