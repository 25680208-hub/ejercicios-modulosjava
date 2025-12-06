import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Datos iniciales del usuario
        System.out.print("Ingresa la marca del vehículo: ");
        String marca = sc.nextLine();

        System.out.print("Ingresa el año de fabricación: ");
        int anio = sc.nextInt();

        System.out.print("Ingresa la velocidad máxima: ");
        int velMax = sc.nextInt();

        Automovil auto = new Automovil(marca, anio, velMax);

        int opcion = 0;

        while (opcion != 4) {

            System.out.println("\n===== MENÚ =====");
            System.out.println("1. Encender vehículo");
            System.out.println("2. Calcular antigüedad");
            System.out.println("3. Mostrar información del vehículo");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println(auto.encender());
                    break;

                case 2:
                    System.out.println("El vehículo tiene " + auto.calcularAntiguedad() + " años de antigüedad.");
                    break;

                case 3:
                    System.out.println("\n--- Datos del Automóvil ---");
                    System.out.println("Marca: " + auto.getMarca());
                    System.out.println("Año de fabricación: " + auto.getAnioFabricacion());
                    System.out.println("Velocidad máxima: " + auto.getVelocidadMaxima() + " km/h");
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