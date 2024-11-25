package br.unip.sistemadestreaming.application;

public class Conteudo{
    private int id;
    private String titulo;
    private String tipo;
    private Criador criador;

    public Conteudo(Integer id, String titulo, String tipo, Criador criador) {
        this.id = id;
        this.titulo = titulo;
        this.tipo = tipo;
        this.criador = criador;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getTipo() {
        return tipo;
    }

    public Criador getCriador() {
        return criador;
    }
}
