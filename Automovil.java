import java.time.Year;

public class Automovil {

    private String marca;
    private int anioFabricacion;
    private int velocidadMaxima;

    public Automovil(String marca, int anioFabricacion, int velocidadMaxima) {
        this.marca = marca;
        this.anioFabricacion = anioFabricacion;
        this.velocidadMaxima = velocidadMaxima;
    }

    // -------------------------------------------------------
    // Comportamiento 1:
    // Simular encendido del vehículo
    // Encendido exitoso si el auto no es MUY antiguo (>30 años)
    // -------------------------------------------------------
    public String encender() {
        int antiguedad = calcularAntiguedad();

        if (antiguedad > 30) {
            return "❌ El vehículo NO pudo encender (es demasiado antiguo).";
        } else {
            return "✅ El vehículo encendió correctamente.";
        }
    }

    // -------------------------------------------------------
    // Comportamiento 2:
    // Calcular antigüedad con el año actual dinámico
    // -------------------------------------------------------
    public int calcularAntiguedad() {
        int anioActual = Year.now().getValue();
        return anioActual - anioFabricacion;
    }

    // Getters
    public String getMarca() {
        return marca;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }
}