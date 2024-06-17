import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        double saldoAtual = 1500.00;
        double deposito = 0;
        double valorTransferir = 0;
        String nome = "Mariana";
        Scanner leitura = new Scanner(System.in);

        int opcao = 0;
        String mensagem = """
                    ***********************************
                    Bem vindo ao sistema bancario
                    Nome :         %s
                    Tipo de conta: Corrente
                    Seu saldo atual é de R$ %.2f
                    ***********************************
                    """.formatted(nome, saldoAtual);
        System.out.println(mensagem);
        String opcoes = """
                
                1- Consultar saldos
                2- Receber valor
                3- Transferir valor
                4- Sair
                """;
        while (opcao != 4)
        {
            System.out.println(opcoes);
            opcao = leitura.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Seu saldo atual é de R$" + saldoAtual);
                    break;
                case 2:
                    System.out.println("Quanto você deseja depositar ?");
                    deposito = leitura.nextDouble();
                    if (deposito <= 0)
                        System.out.println("Operação não realizada, valor invalido!");
                    else {
                        saldoAtual += deposito;
                        System.out.println("Operação realizada! Seu saldo atual é de R$ " + saldoAtual);
                    }
                    break;
                case 3:
                    System.out.println("Quanto você deseja tranferir ?");
                    valorTransferir = leitura.nextDouble();
                    if (valorTransferir > saldoAtual)
                        System.out.println("Operação não realizada! Saldo insuficiente.");
                    else {
                        saldoAtual -= valorTransferir;
                        System.out.println("Valor de R$" + valorTransferir + " transferido com sucesso!");
                        System.out.println("Seu saldo atual e de R$" + saldoAtual);
                    }
                    break;
                case 4:
                    System.out.println("Muito obrigado, volte sempre!");
                    break;
                default:
                    System.out.println("Opção invalida!");
                    break;
            }
        }

    }
}
