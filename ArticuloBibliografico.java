public class ArticuloBibliografico {

    private String id;
    private String autor;
    private boolean disponible;
    private int anioPublicacion;

    public ArticuloBibliografico(String id, String autor, boolean disponible, int anioPublicacion) {
        this.id = id;
        this.autor = autor;
        this.disponible = disponible;
        this.anioPublicacion = anioPublicacion;
    }

    // Comportamiento 1: Reservar libro (cambia estado interno)
    public void reservar() {
        if (disponible) {
            disponible = false;
        }
    }

    // Comportamiento 2: Determinar si es apto para préstamo
    public boolean esAptoParaPrestamo() {
        int anioActual = java.time.Year.now().getValue();
        int antiguedad = anioActual - anioPublicacion;
        return antiguedad > 5;
    }
}