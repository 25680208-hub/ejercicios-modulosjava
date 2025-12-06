package app;

import entidad.Vuelo;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear el vuelo con los valores indicados
        Vuelo vuelo = new Vuelo("IBZ-402", 50, 49);
        vuelo.setTarifaBase(200.00);

        // ============================
        //     REPORTE 1 (EVALUACIÓN)
        // ============================
        System.out.println("(Evaluacion)");
        System.out.println("Evaluacion:");
        System.out.println("Atributo                          Dato a usar");
        System.out.println("Codigo de vuelo(Constructor)      IBZ-402");
        System.out.println("Capacidad maxima(Constructor)     50");
        System.out.println("Asientos reservados(Constructor)  49");
        System.out.println("Tarifa base(Setter)               200.00");
        System.out.println();

        System.out.print("¿Cuántos asientos desea reservar? ");
        int asientosUsuario;
        try {
            asientosUsuario = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Entrada inválida. Se asumirá 0 asientos.");
            scanner.nextLine(); // limpiar
            asientosUsuario = 0;
        }

        boolean resultadoReservaUsuario = vuelo.reservarAsientos(asientosUsuario);

        // ============================
        //       REPORTE 2 (RESERVA)
        // ============================
        System.out.println();
        System.out.println("(Reserva)");
        System.out.println("Reporte de vuelo " + vuelo.getCodigoVuelo());

        if (resultadoReservaUsuario) {
            System.out.println("Reserva: Exitosa");
        } else {
            System.out.println("Reserva: Fallida");
        }

        System.out.println("Asientos totales reservados: " + vuelo.getAsientosReservados());
        System.out.printf("Porcentaje de ocupacion: %.1f%%\n", vuelo.porcentajeOcupacion());
        System.out.printf("Ingreso bruto total: %.1f\n", vuelo.ingresoTotal());
        System.out.println();

        // ============================
        //     REPORTE 3 (FINAL)
        // ============================
        System.out.println("(Final)");
        System.out.println("Resultado de la solicitud en vuelo " + vuelo.getCodigoVuelo());

        boolean reservaFinal = vuelo.reservarAsientos(2);

        if (reservaFinal) {
            System.out.println("Intento de reserva de 2 asientos: Exitosa");
        } else {
            System.out.println("Intento de reserva de 2 asientos: Fallido");
            int disponibles = vuelo.getCapacidadMaxima() - vuelo.getAsientosReservados();
            System.out.println("Motivo: Capacidad excedida (Solo " + disponibles + " asiento(s) disponible(s))");
        }

        System.out.println("Reporte final del modulo");
        System.out.println("Codigo del vuelo: " + vuelo.getCodigoVuelo());
        System.out.println("Asientos totales reservados: " + vuelo.getAsientosReservados());
        System.out.printf("Porcentaje de ocupacion: %.1f%%\n", vuelo.porcentajeOcupacion());
        System.out.printf("Ingreso bruto total: %.1f\n", vuelo.ingresoTotal());

        scanner.close();
    }
}