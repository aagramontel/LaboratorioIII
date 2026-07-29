package Nivel1.Ejercicio08;

public class Ejercicio08 {
    public static void dividir (int a, int b){
        try {
            int resultado = a / b;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: División entre cero.");
        }
    }
    public static void main(String[] args) {
        dividir(30, 0);
    }
}
