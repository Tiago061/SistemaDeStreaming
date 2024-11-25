package br.unip.sistemadestreaming.application;

public class Conteudo{
    private int id;
    private String titulo;
    private String tipo;

    public Conteudo(Integer id, String titulo, String tipo) {
        this.id = id;
        this.titulo = titulo;
        this.tipo = tipo;
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
}
