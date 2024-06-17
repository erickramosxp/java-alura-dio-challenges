public class CarroInfo {
    private String modelo;
    private double preco1;
    private double preco2;
    private double preco3;

    public void definirModelo(String modelo) {
        this.modelo = modelo;
    }
     public void definirPrecos(double preco1, double preco2, double preco3) {
        this.preco1 = preco1;
        this.preco2 = preco2;
        this.preco3 = preco3;
     }

     public void exibirInfo() {
         System.out.println("Medelo: " + modelo);
         System.out.println("Preço ano 1: " + preco1);
         System.out.println("Preço ano 2: " + preco2);
         System.out.println("Preço ano 3: " + preco3);
         System.out.println("Maior preço: " + calcularMaiorPreco());
         System.out.println("Menor preço: " + calcularMenorPreco());
     }

     public double calcularMenorPreco() {
        double menorPreco = preco1;

        if (menorPreco > preco2)
            menorPreco = preco2;
        if (menorPreco > preco3)
            menorPreco = preco3;
        return menorPreco;
    }

    public double calcularMaiorPreco() {
        double maiorPreco = preco1;

        if (maiorPreco < preco2)
            maiorPreco = preco2;
        if (maiorPreco < preco3)
            maiorPreco = preco3;
        return maiorPreco;
    }
}
