package entidad;

public class Vuelo {

    private String codigoVuelo;
    private int capacidadMaxima;
    private int asientosReservados;
    private double tarifaBase;

    public Vuelo(String codigoVuelo, int capacidadMaxima, int asientosReservados) {
        this.codigoVuelo = codigoVuelo;
        this.capacidadMaxima = capacidadMaxima;
        this.asientosReservados = asientosReservados;
    }

    public void setTarifaBase(double tarifaBase) {
        this.tarifaBase = tarifaBase;
    }

    public boolean reservarAsiento() {
        if (asientosReservados < capacidadMaxima) {
            asientosReservados++;
            return true;
        }
        return false;
    }

    public boolean reservarAsientos(int cantidad) {
        if (cantidad <= 0) {
            return false;
        }
        if (asientosReservados + cantidad <= capacidadMaxima) {
            asientosReservados += cantidad;
            return true;
        }
        return false;
    }

    public double porcentajeOcupacion() {
        if (capacidadMaxima == 0) return 0.0;
        return (asientosReservados * 100.0) / capacidadMaxima;
    }

    public double ingresoTotal() {
        return asientosReservados * tarifaBase;
    }

    // Getters necesarios
    public String getCodigoVuelo() {
        return codigoVuelo;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public int getAsientosReservados() {
        return asientosReservados;
    }

    public double getTarifaBase() {
        return tarifaBase;
    }
}