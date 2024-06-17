public class Carro {
    String modelo;
    int ano;
    String cor;

    void exibirFicha() {
        System.out.println("Carro do modelo : " + modelo);
        System.out.println("Ano : " + ano);
        System.out.println("Cor : " + cor);
    }

    void calcularIdadeCarro(int anoAtual) {
        int idade = anoAtual - ano;
        System.out.println("Esse carro tem " + idade + " anos.");
    }
}
