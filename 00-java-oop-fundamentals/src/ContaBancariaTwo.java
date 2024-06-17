public class ContaBancariaTwo {
    protected double saldo;

    public void depositar(double deposito) {
        if (deposito > 0) {
            saldo += deposito;
            System.out.println("Deposito realizado com sucesso");
        } else {
            System.out.println("Valor de deposito invalido");
        }
    }
    public void sacar(double saque) {
        if (saldo > saque) {
            saldo -= saque;
            System.out.println("Saque realizado com sucesso");
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
    public void consultarSaldo() {
        System.out.println("Seu saldo e de R$ " + saldo);
    }
}
