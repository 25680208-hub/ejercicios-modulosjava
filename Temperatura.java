import java.time.LocalDate;

public class Temperatura {

    private double valor;
    private String unidad; // C o F
    private LocalDate fechaRegistro;

    public Temperatura(double valor, String unidad, LocalDate fechaRegistro) {
        this.valor = valor;
        this.unidad = unidad.toUpperCase();
        this.fechaRegistro = fechaRegistro;
    }

    // Convertir C ↔ F
    public void convertir() {
        if (unidad.equals("C")) {
            valor = (valor * 9/5) + 32;
            unidad = "F";
        } else if (unidad.equals("F")) {
            valor = (valor - 32) * 5/9;
            unidad = "C";
        } else {
            System.out.println("Unidad no válida.");
        }
    }

    // Evaluar si es extrema (>40°C)
    public boolean esExtrema() {
        double valorEnC = valor;

        if (unidad.equals("F")) {
            valorEnC = (valor - 32) * 5/9;
        }

        return valorEnC > 40;
    }

    // Getters
    public double getValor() {
        return valor;
    }

    public String getUnidad() {
        return unidad;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }
}