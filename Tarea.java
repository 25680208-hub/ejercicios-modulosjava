public class Tarea {

    private String descripcion;
    private String prioridad; // Baja, Media, Alta
    private boolean completada;

    public Tarea(String descripcion, String prioridad) {
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.completada = false; // siempre inicia sin completar
    }

    // ------------------------------------
    // Comportamiento 1:
    // Marcar como completada
    // ------------------------------------
    public void marcarComoCompletada() {
        completada = true;
    }

    // ------------------------------------
    // Comportamiento 2:
    // Determinar si es urgente:
    // PRIORIDAD = Alta AND NO completada
    // ------------------------------------
    public boolean esUrgente() {
        return prioridad.equalsIgnoreCase("Alta") && !completada;
    }

    // Getters
    public String getDescripcion() {
        return descripcion;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public boolean isCompletada() {
        return completada;
    }

}