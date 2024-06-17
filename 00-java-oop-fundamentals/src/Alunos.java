public class Alunos {
    private String nome;
    private double notas;
    private int quantidadeDeNotas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void inserirNota(double nota){
        notas += nota;
        quantidadeDeNotas++;
    }
    public double calcularMedia() {
        return notas / quantidadeDeNotas;
    }
}
