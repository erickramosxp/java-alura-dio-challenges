import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        int numeroConta;
        String agencia;
        String nome;
        double saldo;
        Scanner leitura = new Scanner(System.in);

        System.out.println("Insira o nome do cliente");
        nome = leitura.nextLine();
        System.out.println("Insira o numero da Agencia.");
        agencia = leitura.nextLine();
        System.out.println("Insira o numero da conta.");
        numeroConta = leitura.nextInt();
        System.out.println("Insira o saldo inicial depositado.");
        saldo = leitura.nextDouble();

        System.out.println("Olá " + nome +
                ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numeroConta +
                " e seu saldo R$ " + saldo +
                " já está disponível para saque");

    }

}
