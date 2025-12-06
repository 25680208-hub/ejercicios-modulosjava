import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Crear cuenta
        System.out.print("Ingresa el número de cuenta: ");
        String numero = sc.nextLine();

        System.out.print("Ingresa el nombre del titular: ");
        String nombre = sc.nextLine();

        System.out.print("Ingresa el saldo inicial: ");
        double saldoInicial = sc.nextDouble();

        CuentaAhorros cuenta = new CuentaAhorros(numero, nombre, saldoInicial);

        int opcion = 0;

        while (opcion != 5) {

            System.out.println("\n===== MENÚ BANCO =====");
            System.out.println("1. Depositar");
            System.out.println("2. Retirar");
            System.out.println("3. Consultar saldo");
            System.out.println("4. Mostrar datos de la cuenta");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    System.out.print("Cantidad a depositar: ");
                    double dep = sc.nextDouble();
                    cuenta.depositar(dep);
                    System.out.println("Depósito realizado. Saldo actual: $" + cuenta.getSaldo());
                    break;

                case 2:
                    System.out.print("Cantidad a retirar: ");
                    double ret = sc.nextDouble();
                    cuenta.retirar(ret);
                    System.out.println("Saldo actual: $" + cuenta.getSaldo());
                    break;

                case 3:
                    System.out.println("💰 Saldo actual: $" + cuenta.getSaldo());
                    break;

                case 4:
                    System.out.println("\n--- Datos de la Cuenta ---");
                    System.out.println("Número de cuenta: " + cuenta.getNumeroCuenta());
                    System.out.println("Titular: " + cuenta.getNombreTitular());
                    System.out.println("Saldo: $" + cuenta.getSaldo());
                    break;

                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        }

        sc.close();
    }
}