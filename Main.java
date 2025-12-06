import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== REGISTRO DE ARTÍCULO BIBLIOGRÁFICO ===");

        System.out.print("Ingresa el ID del artículo: ");
        String id = sc.nextLine();

        System.out.print("Ingresa el autor: ");
        String autor = sc.nextLine();

        System.out.print("¿Está disponible? (true/false): ");
        boolean disponible = sc.nextBoolean();

        System.out.print("Ingresa el año de publicación: ");
        int anio = sc.nextInt();

        // Crear objeto
        ArticuloBibliografico articulo = new ArticuloBibliografico(id, autor, disponible, anio);

        System.out.println("\n=== OPCIÓN: RESERVAR ARTÍCULO ===");
        System.out.print("¿Deseas reservar el artículo? (1 = sí, 2 = no): ");
        int opcion = sc.nextInt();

        if (opcion == 1) {
            articulo.reservar();
            System.out.println("El artículo ha sido reservado.");
        }

        System.out.println("\n=== RESULTADOS ===");
        System.out.println("¿Es apto para préstamo? " + articulo.esAptoParaPrestamo());
    }
}
