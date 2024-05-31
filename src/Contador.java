import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
    
        System.out.println("\nDigite o primeiro parametro ");
        int parametroUm = leitura.nextInt();
        System.out.println("Digite o segundo parametro ");
        int parametroDois = leitura.nextInt();


        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosExeption e) {
            System.err.println("Error: " + e.getMessage());
        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosExeption {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosExeption("O segundo parametro deve ser maior que o primeiro");
        }
        int contador = parametroDois - parametroUm;
        for (int i = 0; i < contador; i++) {
            System.out.println("Imprimindo número " + (i + 1));
        }
    }
}
