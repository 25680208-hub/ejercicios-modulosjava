public class Empleado {

    private String claveEmpleado;
    private double salarioMensual;
    private double porcentajeRetencion; // porcentaje de impuestos (%)

    public Empleado(String claveEmpleado, double salarioMensual, double porcentajeRetencion) {
        this.claveEmpleado = claveEmpleado;
        this.salarioMensual = salarioMensual;
        this.porcentajeRetencion = porcentajeRetencion;
    }

    // ----------------------------------------------------
    // Comportamiento 1:
    // Calcular salario neto = salario mensual - impuestos
    // ----------------------------------------------------
    public double calcularSalarioNeto() {
        double montoImpuestos = salarioMensual * (porcentajeRetencion / 100);
        return salarioMensual - montoImpuestos;
    }

    // ----------------------------------------------------
    // Comportamiento 2:
    // Aumentar salario por porcentaje recibido
    // ----------------------------------------------------
    public void aplicarAumento(double porcentajeAumento) {
        double aumento = salarioMensual * (porcentajeAumento / 100);
        salarioMensual += aumento;
    }

    // Getters
    public String getClaveEmpleado() {
        return claveEmpleado;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public double getPorcentajeRetencion() {
        return porcentajeRetencion;
    }
}