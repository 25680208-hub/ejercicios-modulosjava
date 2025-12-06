public class CadenaTexto {

    private String cadenaActual;
    private String idModulo;
    private int longitudMaxima;

    public CadenaTexto(String cadenaActual, String idModulo, int longitudMaxima) {
        this.cadenaActual = cadenaActual;
        this.idModulo = idModulo;
        this.longitudMaxima = longitudMaxima;
    }

    // -------------------------------
    // Comportamiento 1:
    // Agregar un prefijo al inicio
    // -------------------------------
    public String agregarPrefijo(String prefijo) {
        String resultado = prefijo + cadenaActual;

        if (resultado.length() <= longitudMaxima) {
            cadenaActual = resultado;    // Actualiza solo si no excede el límite
        } else {
            System.out.println("❌ ERROR: No se puede agregar el prefijo. Se supera la longitud máxima.");
        }

        return cadenaActual;
    }

    // -------------------------------
    // Comportamiento 2:
    // Contar espacios en blanco
    // -------------------------------
    public int contarEspacios() {
        int contador = 0;

        for (int i = 0; i < cadenaActual.length(); i++) {
            if (cadenaActual.charAt(i) == ' ') {
                contador++;
            }
        }

        return contador;
    }

    // Getters opcionales
    public String getCadenaActual() {
        return cadenaActual;
    }

    public String getIdModulo() {
        return idModulo;
    }

    public int getLongitudMaxima() {
        return longitudMaxima;
    }
}