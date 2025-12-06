public class Rectangulo {

    private double base;
    private double altura;
    private String etiqueta;

    public Rectangulo(double base, double altura, String etiqueta) {
        this.base = base;
        this.altura = altura;
        this.etiqueta = etiqueta;
    }

    public double calcularArea() {
        return base * altura;
    }

    public double calcularPerimetro() {
        return 2 * (base + altura);
    }
}
