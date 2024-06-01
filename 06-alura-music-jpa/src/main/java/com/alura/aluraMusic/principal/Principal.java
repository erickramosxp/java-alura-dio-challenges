package com.alura.aluraMusic.principal;

import com.alura.aluraMusic.model.Artista;
import com.alura.aluraMusic.model.Musica;
import com.alura.aluraMusic.repository.ArtistaRepository;

import javax.xml.transform.Source;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Principal {
    private Scanner leitura = new Scanner(System.in);
    private ArtistaRepository repositorio;
    List<Artista> artistas;

    public Principal(ArtistaRepository repositorio) {
        this.repositorio = repositorio;
    }

    public void exibirMenu() {
        var opcao = 1;
        while (opcao != 0) {
            var menu = """
                    
                    1 - Cadastrar artista
                    2 - Cadastrar musica
                    3 - Listar músicas
                    4 - Listar artistas
                    5 - Buscar musicas por artista
                    6 - Descição do artista
                    0 - Sair
                    """;
            System.out.println(menu);
            opcao = leitura.nextInt();
            leitura.nextLine();

            switch (opcao) {
                case 1:
                    inserirArtista();
                    break;
                case 2:
                    inserirMusica();
                    break;
                case 3:
                    listarMusicas();
                    break;
                case 4:
                    listarArtistas();
                    break;
                case 5:
                    listarMusicasPorArtista();
                    break;
                case 6:
                    System.out.println("Funcionalidade indisponivel");
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }

    private void inserirArtista() {
        String nome;
        System.out.println("Insira o nome do artista: ");
        nome = leitura.nextLine();
        Artista artista = new Artista(nome);
        repositorio.save(artista);
        System.out.println("Artista cadastrado.");
    }

    private void inserirMusica() {
        listarArtistas();
        System.out.println("Digite o nome do artista: ");
        var nomeArtista = leitura.nextLine();

        Optional<Artista> artista = artistas.stream()
                .filter(a -> a.getNome().toLowerCase()
                        .contains(nomeArtista.toLowerCase()))
                        .findFirst();

        if (artista.isPresent()) {
            var artistaEncontrado = artista.get();

            System.out.println("Insira o nome da musica: ");
            String musicaNome = leitura.nextLine();
            System.out.println("Insira o nome do album: ");
            String musicaAlbum = leitura.nextLine();
            Musica musica = new Musica(musicaNome, musicaAlbum);
            artistaEncontrado.addMusica(musica);
            repositorio.save(artistaEncontrado);
            System.out.println("Musica cadastrada com sucesso");
        } else {
            System.out.println("Artista não encontrado.");
        }
    }

    private void listarMusicas() {
        artistas = repositorio.findAll();
        artistas.forEach(a -> {System.out.println(
                a.getNome()); a.listMusica();}
        );
    }

    private void listarMusicasPorArtista() {
        listarArtistas();

        System.out.println("Digite o nome do artista: ");
        var nomeArtista = leitura.nextLine();

        Optional<Artista> artista = artistas.stream()
                .filter(a -> a.getNome().toLowerCase()
                        .contains(nomeArtista.toLowerCase()))
                .findFirst();
        if (artista.isPresent()) {
            var artistaEncontrado = artista.get();
            artistaEncontrado.listMusica();
        } else {
            System.out.println("Artista não encontrado no banco de dados.");
        }

    }

    private void listarArtistas() {
        artistas = repositorio.findAll();
        System.out.println("---- LISTA DE ARTISTAS CADASTRADOS ----");
        artistas.stream()
                .sorted(Comparator.comparing(Artista::getNome))
                .forEach(a -> System.out.println(a.getNome()));
        System.out.println("---------------------------------------");
    }
}
