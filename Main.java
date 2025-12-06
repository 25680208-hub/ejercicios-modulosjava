import java.util.Scanner;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Datos del usuario
        System.out.print("Ingresa el valor de la temperatura: ");
        double valor = sc.nextDouble();

        System.out.print("Ingresa la unidad (C/F): ");
        String unidad = sc.next().toUpperCase();

        System.out.print("Ingresa el año de registro: ");
        int anio = sc.nextInt();

        System.out.print("Ingresa el mes (1-12): ");
        int mes = sc.nextInt();

        System.out.print("Ingresa el día: ");
        int dia = sc.nextInt();

        LocalDate fecha = LocalDate.of(anio, mes, dia);

        Temperatura temp = new Temperatura(valor, unidad, fecha);

        int opcion = 0;

        while (opcion != 4) {

            System.out.println("\n===== MENÚ =====");
            System.out.println("1. Convertir temperatura");
            System.out.println("2. Evaluar si es extrema");
            System.out.println("3. Mostrar datos");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    temp.convertir();
                    System.out.println("Temperatura convertida: " + temp.getValor() + "°" + temp.getUnidad());
                    break;

                case 2:
                    if (temp.esExtrema()) {
                        System.out.println("🔥 La temperatura es EXTREMA.");
                    } else {
                        System.out.println("La temperatura NO es extrema.");
                    }
                    break;

                case 3:
                    System.out.println("\n--- Datos de la Temperatura ---");
                    System.out.println("Valor: " + temp.getValor() + "°" + temp.getUnidad());
                    System.out.println("Fecha de registro: " + temp.getFechaRegistro());
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