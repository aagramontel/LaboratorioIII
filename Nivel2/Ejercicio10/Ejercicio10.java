package Nivel2.Ejercicio10;

public class Ejercicio10 {
    private double saldo = 1800;

    public void mostrarSaldo() {
        System.out.println("Saldo actual: Q" + saldo);
    }

    public static void main(String[] args) {
        Ejercicio10 cuenta = new Ejercicio10();

        cuenta.mostrarSaldo();
    }
}
