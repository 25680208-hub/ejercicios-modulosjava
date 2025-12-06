import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Datos iniciales
        System.out.print("Ingresa la descripción de la tarea: ");
        String descripcion = sc.nextLine();

        System.out.print("Ingresa la prioridad (Baja, Media, Alta): ");
        String prioridad = sc.nextLine();

        Tarea tarea = new Tarea(descripcion, prioridad);

        int opcion = 0;

        while (opcion != 4) {

            System.out.println("\n===== MENÚ =====");
            System.out.println("1. Marcar tarea como completada");
            System.out.println("2. Ver si la tarea es urgente");
            System.out.println("3. Mostrar información de la tarea");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    tarea.marcarComoCompletada();
                    System.out.println("La tarea ha sido marcada como COMPLETADA.");
                    break;

                case 2:
                    if (tarea.esUrgente()) {
                        System.out.println("🔥 La tarea ES URGENTE.");
                    } else {
                        System.out.println("La tarea NO es urgente.");
                    }
                    break;

                case 3:
                    System.out.println("\n--- Información de la tarea ---");
                    System.out.println("Descripción: " + tarea.getDescripcion());
                    System.out.println("Prioridad: " + tarea.getPrioridad());
                    System.out.println("¿Completada?: " + (tarea.isCompletada() ? "Sí" : "No"));
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        }

        sc.close();
    }
}