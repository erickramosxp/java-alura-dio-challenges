package com.alura.aluraMusic.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "artistas")
public class Artista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nomeArtistas", unique = true)
    private String nome;
    private String descricao;

    @OneToMany(mappedBy = "artista", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Musica> musicas = new ArrayList<>();

    public Artista() {}

    public Artista(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Musica> getMusicas() {
        return musicas;
    }

    public void setMusicas(List<Musica> musicas) {
        this.musicas = musicas;
    }

    public void addMusica(Musica musica) {
        musica.setArtista(this);
        this.musicas.add(musica);
    }

    public void listMusica() {
        this.musicas.forEach(m -> System.out.println(" Nome: " + m.getNome()
                + ", Album: " + m.getAlbum()));
    }

    @Override
    public String toString() {
        return ("Nome: " + nome + " Descrição: " + descricao +
                "\n" + musicas);
    }
}
