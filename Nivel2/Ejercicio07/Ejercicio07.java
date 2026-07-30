package Nivel2.Ejercicio07;

public class Ejercicio07 {
    private double saldo;

    public void depositar(double monto) {
        saldo += monto;
    }

    public static void main(String[] args) {
        Ejercicio07 cuenta = new Ejercicio07();

        cuenta.depositar(5000);

        System.out.println("Saldo: " + cuenta.saldo);
    }
}
