import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Datos iniciales
        System.out.print("Ingresa la clave del empleado: ");
        String clave = sc.nextLine();

        System.out.print("Ingresa el salario mensual: ");
        double salario = sc.nextDouble();

        System.out.print("Ingresa el porcentaje de retención de impuestos: ");
        double retencion = sc.nextDouble();

        Empleado emp = new Empleado(clave, salario, retencion);

        int opcion = 0;

        while (opcion != 4) {

            System.out.println("\n===== MENÚ =====");
            System.out.println("1. Calcular salario neto");
            System.out.println("2. Aplicar aumento de salario");
            System.out.println("3. Mostrar información del empleado");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    double neto = emp.calcularSalarioNeto();
                    System.out.println("El salario neto es: $" + neto);
                    break;

                case 2:
                    System.out.print("Ingresa el porcentaje de aumento: ");
                    double aumento = sc.nextDouble();
                    emp.aplicarAumento(aumento);
                    System.out.println("Aumento aplicado. Nuevo salario mensual: $" + emp.getSalarioMensual());
                    break;

                case 3:
                    System.out.println("\n--- Información del Empleado ---");
                    System.out.println("Clave: " + emp.getClaveEmpleado());
                    System.out.println("Salario Mensual: $" + emp.getSalarioMensual());
                    System.out.println("Porcentaje de Retención: " + emp.getPorcentajeRetencion() + "%");
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