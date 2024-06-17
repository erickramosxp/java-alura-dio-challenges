public class Produto {
    private String nome;
    private int preco;

    public String getNome() {
        return nome;
    }

    public int getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public double aplicarDesconto(double percentual) {
        return this.preco - (this.preco * percentual / 100);
    }
}
