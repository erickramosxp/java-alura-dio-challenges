public class Musica {
    String titulo;
    String artista;
    int anoDeLancamento;
    double avaliacao;
    int numAvaliacoes;

    void exibirFicha() {
        System.out.println("Titulo : " + titulo);
        System.out.println("Artista : " + artista);
        System.out.println("Ano de lançamento : " + anoDeLancamento);
    }
    void avaliarMusica(double nota){
        avaliacao += nota;
        numAvaliacoes++;
    }

    double mediaAvaliacao() {
        return (avaliacao / numAvaliacoes);
    }
}
