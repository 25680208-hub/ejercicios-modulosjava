public class Producto {

    private String referencia;
    private int cantidadStock;
    private double precioUnitario;

    public Producto(String referencia, int cantidadStock, double precioUnitario) {
        this.referencia = referencia;
        this.cantidadStock = cantidadStock;
        this.precioUnitario = precioUnitario;
    }

    public void agregarStock(int cantidadEntrada) {
        cantidadStock += cantidadEntrada;
    }

    public double calcularValorTotal() {
        return cantidadStock * precioUnitario;
    }
}