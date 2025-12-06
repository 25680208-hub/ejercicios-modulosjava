import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Datos iniciales del usuario
        System.out.print("Ingresa la cadena inicial: ");
        String cadena = sc.nextLine();

        System.out.print("Ingresa el identificador del módulo: ");
        String id = sc.nextLine();

        System.out.print("Ingresa la longitud máxima permitida: ");
        int max = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        CadenaTexto ct = new CadenaTexto(cadena, id, max);

        int opcion = 0;

        while (opcion != 4) {

            System.out.println("\n===== MENÚ =====");
            System.out.println("1. Agregar prefijo");
            System.out.println("2. Contar espacios en la cadena");
            System.out.println("3. Mostrar información");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {

                case 1:
                    System.out.print("Ingresa el prefijo a añadir: ");
                    String prefijo = sc.nextLine();
                    ct.agregarPrefijo(prefijo);
                    System.out.println("Cadena actual: " + ct.getCadenaActual());
                    break;

                case 2:
                    int espacios = ct.contarEspacios();
                    System.out.println("La cadena actual contiene " + espacios + " espacios en blanco.");
                    break;

                case 3:
                    System.out.println("\n--- Información actual ---");
                    System.out.println("Cadena: " + ct.getCadenaActual());
                    System.out.println("ID del módulo: " + ct.getIdModulo());
                    System.out.println("Longitud máxima: " + ct.getLongitudMaxima());
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