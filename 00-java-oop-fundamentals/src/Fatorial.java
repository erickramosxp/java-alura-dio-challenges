import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int fatorialDe;
        int resultado = 1;
        System.out.println("Insira um número para ver o fatorial dele.");
        fatorialDe = leitura.nextInt();
        while (fatorialDe > 0)
        {
            resultado = resultado * fatorialDe;
            fatorialDe--;
        }
        System.out.println("O fatorial deste número é " + resultado);
    }
}
