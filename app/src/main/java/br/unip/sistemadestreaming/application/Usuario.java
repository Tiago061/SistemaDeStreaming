package br.unip.sistemadestreaming.application;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private int id;
    private String nome;
    private String email;
    private List<Playlist> playlists;

    public Usuario(int id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.playlists = new ArrayList<>();
    }

    public int getId() {
        return id;
    }


    public String getNome() {
        return nome;
    }


    public String getEmail() {
        return email;
    }

    public List<Playlist> getPlaylists() {
        return playlists;
    }

    public void addPlaylist(Playlist playlist){
        playlists.add(playlist);
    }


}
