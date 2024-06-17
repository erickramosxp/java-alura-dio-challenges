public class CalculadoraSalaRetangular implements CalculoGeometrico{


    @Override
    public void calcularArea(double base, double altura) {
        double area = base * altura;
        System.out.println("A area total e de " + area);
    }

    @Override
    public void calcularPerimetro(double base, double altura) {
        double perimetro = (base + altura) * 2;
        System.out.println("O perimetro é de " + altura);
    }
}
