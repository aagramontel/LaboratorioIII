package Nivel1.Ejercicio03;

public class Ejercicio03 {
    public static void main(String[] args) {
        String texto = "adri";

        try {
            int numero = Integer.parseInt(texto);
            System.out.println(numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: No se puede convertir el texto a número.");
        }
    }
}
