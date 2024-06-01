package com.alura.aluraMusic.model;

import jakarta.persistence.*;

@Entity
@Table(name = "musicas")
public class Musica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String album;

    @ManyToOne
    private Artista artista;

    public Musica() {}

    public Musica(String musicaNome, String musicaAlbum) {
        this.nome = musicaNome;
        this.album = musicaAlbum;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Musica - " + "nome = " + nome +
                " album = " + album;
    }
}
