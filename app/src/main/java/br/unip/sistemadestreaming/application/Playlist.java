package br.unip.sistemadestreaming.application;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private int id;
    private String nome;
    private Usuario usuario;
    private List<Conteudo> conteudos;

    public Playlist(Integer id, String nome, Usuario usuario) {
        this.id = id;
        this.nome = nome;
        this.usuario = usuario;
        this.conteudos = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public List<Conteudo> getConteudos() {
        return conteudos;
    }

    public void addConteudo(Conteudo conteudo){
        conteudos.add(conteudo);
    }
}


