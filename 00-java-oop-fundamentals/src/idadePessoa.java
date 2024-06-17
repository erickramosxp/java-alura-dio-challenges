public class idadePessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void verificarIdade() {
        if (this.idade >= 18)
            System.out.println(this.nome + " é maior de idade");
        else
            System.out.println(this.nome + " não é maior de idade");
    }
}
