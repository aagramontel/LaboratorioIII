package Nivel1.Ejercicio18;

public class Ejercicio18 {
    public static double dividir(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir entre cero.");
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        try {
            System.out.println("Resultado: " + dividir(50, 0));
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
