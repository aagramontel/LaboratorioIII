package Nivel1.Ejercicio17;

public class Ejercicio17 {
    public static void main(String[] args) {

        String texto = "Hola";

        try {
            System.out.println(texto.charAt(10));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: Posición fuera del rango del texto.");
        }
    }
}
