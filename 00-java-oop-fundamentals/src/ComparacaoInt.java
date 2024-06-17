import java.util.Scanner;

public class ComparacaoInt {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int primeiroNumero, segundoNumero;

        System.out.println("Insira o primeiro número para comparação");
        primeiroNumero = leitura.nextInt();
        System.out.println("Insira o segundo número para comparação");
        segundoNumero = leitura.nextInt();
        if (primeiroNumero == segundoNumero)
            System.out.println("Os número são iguais.");
        else {
            System.out.println("Os número são diferentes");
            if (primeiroNumero > segundoNumero)
                System.out.println("O primeiro número é maior que o segundo.");
            else
                System.out.println("O segundo número é maior que o primeiro.");
        }
    }
}
