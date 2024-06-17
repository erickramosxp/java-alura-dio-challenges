import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Insira um número.");
        int numero = leitura.nextInt();
        if (numero % 2 == 0)
            System.out.println("O número é par.");
        else
            System.out.println("O número é impar.");
    }
}
