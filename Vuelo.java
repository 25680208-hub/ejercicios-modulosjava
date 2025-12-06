public class Vuelo {

    private String codigoVuelo;
    private int capacidadMaxima;
    private int asientosReservados;

    public Vuelo(String codigoVuelo, int capacidadMaxima, int asientosReservados) {
        this.codigoVuelo = codigoVuelo;
        this.capacidadMaxima = capacidadMaxima;
        this.asientosReservados = asientosReservados;
    }

    // Comportamiento 1: Intentar reservar asiento
    public boolean reservarAsiento() {
        if (asientosReservados < capacidadMaxima) {
            asientosReservados++;
            return true;
        }
        return false;
    }

    // Comportamiento 2: Porcentaje de ocupación
    public double calcularPorcentajeOcupacion() {
        return (asientosReservados * 100.0) / capacidadMaxima;
    }
}