package Nivel2.Ejercicio08;

public class Ejercicio08 {
    private double saldo = 5000;

    public void retirar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
            System.out.println("Retiro realizado.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public static void main(String[] args) {
        Ejercicio08 cuenta = new Ejercicio08();

        cuenta.retirar(1200);

        System.out.println("Saldo actual: " + cuenta.saldo);
    }
}
