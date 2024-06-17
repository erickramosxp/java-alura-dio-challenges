import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Insira o numero para ser exibido a tabuada.");
        int numero =  leitura.nextInt();
        int i = 1;
        while (i <= 10)
        {
            System.out.println(i + " X " + numero + " = " + (i * numero));
            i++;
        }
    }
}
