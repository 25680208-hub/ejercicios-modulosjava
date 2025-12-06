public class CuentaAhorros {

    private String numeroCuenta;
    private String nombreTitular;
    private double saldo;

    public CuentaAhorros(String numeroCuenta, String nombreTitular, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.nombreTitular = nombreTitular;
        this.saldo = saldoInicial;
    }

    // -----------------------------------------------------
    // Comportamiento 1:
    // Realizar depósito
    // -----------------------------------------------------
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        } else {
            System.out.println("❌ La cantidad a depositar debe ser positiva.");
        }
    }

    // -----------------------------------------------------
    // Comportamiento 2:
    // Simular retiro (solo si no excede el saldo)
    // -----------------------------------------------------
    public boolean retirar(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("❌ La cantidad debe ser mayor que cero.");
            return false;
        }

        if (cantidad > saldo) {
            System.out.println("❌ Fondos insuficientes. No se puede retirar esa cantidad.");
            return false;
        }

        saldo -= cantidad;
        return true;
    }

    // Getters
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public double getSaldo() {
        return saldo;
    }
}