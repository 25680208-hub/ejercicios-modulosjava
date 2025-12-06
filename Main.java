import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== REGISTRO DE PRODUCTO ===");

        System.out.print("Ingresa la referencia del producto: ");
        String referencia = sc.nextLine();

        System.out.print("Ingresa la cantidad actual en stock: ");
        int stock = sc.nextInt();

        System.out.print("Ingresa el precio unitario: ");
        double precio = sc.nextDouble();

        // Crear objeto
        Producto prod = new Producto(referencia, stock, precio);

        System.out.println("\n¿Deseas agregar mercancía? Ingresa la cantidad: ");
        int entrada = sc.nextInt();

        prod.agregarStock(entrada);

        System.out.println("\n=== RESULTADOS ===");
        System.out.println("Valor total del stock: $" + prod.calcularValorTotal());
    }
}
