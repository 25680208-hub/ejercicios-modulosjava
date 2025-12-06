import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== CREAR RECTÁNGULO ===");

        System.out.print("Ingresa la etiqueta del rectángulo: ");
        String etiqueta = sc.nextLine();

        System.out.print("Ingresa la base: ");
        double base = sc.nextDouble();

        System.out.print("Ingresa la altura: ");
        double altura = sc.nextDouble();

        // Crear objeto
        Rectangulo rect = new Rectangulo(base, altura, etiqueta);

        System.out.println("\n=== RESULTADOS ===");
        System.out.println("Área: " + rect.calcularArea());
        System.out.println("Perímetro: " + rect.calcularPerimetro());
    }
}