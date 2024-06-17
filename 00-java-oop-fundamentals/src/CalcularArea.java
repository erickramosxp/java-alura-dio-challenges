import java.util.Scanner;

public class CalcularArea {
    public static void main(String[] args) {
        int opcao;
        Scanner leitura = new Scanner(System.in);
        System.out.println("INSIRA UM OPÇÃO");
        System.out.println("1. Calcular área do quadrado");
        System.out.println("2. Calcular área do círculo");
        opcao = leitura.nextInt();
        double raio;
        double areaCirculo;
        double base;
        switch (opcao)
        {
            case 1:
                System.out.println("Digite o tamanho da base do quadrado.");
                base = leitura.nextDouble();
                System.out.println("A área do quadrado é " + (base * base));
                break;
            case 2:
                System.out.println("Digite o raio do circulo.");
                raio = leitura.nextDouble();
                areaCirculo = 3.14 * (raio * raio);
                System.out.println("A área do circulo é " + areaCirculo + "m²");
                break;
            default:
                System.out.println("Opção invalida!");
        }
    }
}
