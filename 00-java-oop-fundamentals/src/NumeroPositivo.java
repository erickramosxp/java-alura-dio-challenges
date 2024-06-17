import java.util.Scanner;

public class NumeroPositivo {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numero;

        System.out.println("Insira um número.");
        numero = leitura.nextInt();
         if (numero >= 0)
             System.out.println("Número é positivo.");
         else
             System.out.println("Número é negativo.");
    }
}
