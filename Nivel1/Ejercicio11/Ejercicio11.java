package Nivel1.Ejercicio11;

public class Ejercicio11 {
    public static void main(String[] args) {

        int[] numeros = {10, 20, 30, 40, 50};

        try {
            System.out.println("Valor: " + numeros[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Índice fuera de rango.");
        }
    }
}
