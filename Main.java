import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== SISTEMA DE RESERVAS AÉREAS ===");

        System.out.print("Ingresa el código del vuelo: ");
        String codigo = sc.nextLine();

        System.out.print("Ingresa la capacidad máxima del vuelo: ");
        int capacidad = sc.nextInt();

        System.out.print("Ingresa el número actual de asientos reservados: ");
        int reservados = sc.nextInt();

        // Crear objeto
        Vuelo vuelo = new Vuelo(codigo, capacidad, reservados);

        System.out.println("\n=== RESERVAR ASIENTO ===");
        System.out.print("¿Deseas reservar un asiento? (1 = sí, 2 = no): ");
        int op = sc.nextInt();

        if (op == 1) {
            boolean exito = vuelo.reservarAsiento();
            if (exito) {
                System.out.println("Reserva realizada con éxito.");
            } else {
                System.out.println("No se pudo reservar. El vuelo está lleno.");
            }
        }

        System.out.println("\n=== ESTADO DEL VUELO ===");
        System.out.println("Porcentaje de ocupación: " + vuelo.calcularPorcentajeOcupacion() + "%");
    }
}
