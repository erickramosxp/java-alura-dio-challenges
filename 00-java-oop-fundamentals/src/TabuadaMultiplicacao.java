
public class TabuadaMultiplicacao implements IntTabuada{

    @Override
    public void mostrarTabuada(int numero) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " X " + numero + " = " + (i * numero));
        }
    }
}
