public class TesteCarro {
    public static void main(String[] args) {
        ModeloCarro meuCarro = new ModeloCarro();
        meuCarro.definirModelo("Celta");
        meuCarro.definirPrecos(22000,18000,14000);
        meuCarro.exibirInfo();
    }
}
