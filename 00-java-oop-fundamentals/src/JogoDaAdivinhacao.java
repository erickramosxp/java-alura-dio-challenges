import java.util.Random;
import java.util.Scanner;

public class JogoDaAdivinhacao {
    public static void main(String[] args) {
        int numeroSecreto = new Random().nextInt(100);
        int contador = 1;
        Scanner leitura = new Scanner(System.in);
        int chute;
        System.out.println("Bem vindo ao jogo do número secreto.");
        while (contador <= 5)
        {
            System.out.println("Digite um chute!");
            chute = leitura.nextInt();
            if (chute == numeroSecreto) {
                System.out.println("Você acertou o número secreto com " + contador + " tentativas");
                break;
            } else {
                if (chute > numeroSecreto) {
                    System.out.println("O número é menor.");
                }
                else {
                    System.out.println("O número é maior.");
                }
            }
            contador++;
        }
        if (contador >= 6) {
            System.out.println("Que pena, você perdeu, o número era " + numeroSecreto);
        }
    }
}
