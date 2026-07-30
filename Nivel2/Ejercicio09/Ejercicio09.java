package Nivel2.Ejercicio09;

public class Ejercicio09 {
    private double saldo = 500;

    public void retirar(double monto) {
        if (saldo - monto >= 0) {
            saldo -= monto;
            System.out.println("Retiro realizado.");
        } else {
            System.out.println("No se permite saldo negativo.");
        }
    }

    public static void main(String[] args) {
        Ejercicio09 cuenta = new Ejercicio09();

        cuenta.retirar(700);

        System.out.println("Saldo: " + cuenta.saldo);
    }
}
