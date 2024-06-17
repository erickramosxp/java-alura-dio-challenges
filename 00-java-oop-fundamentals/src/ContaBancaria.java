public class ContaBancaria {
    private int numeroConta;
    private int saldo;
    public String titular;

    public int getNumeroConta() {
        return numeroConta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void deposita(int saldo) {
        this.saldo += saldo;
    }
}
