package Nivel1.Ejercicio04;

public class Ejercicio04 {
    public static void main(String[] args) {
        try {
            int[] numeros = {2,4,6};
            System.out.println(numeros[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error personalizado: índice fuera de rango.");
        }
    }
}
