package Nivel1.Ejercicio12;

public class Ejercicio12 {
    public static void main(String[] args) {

        try {
            String texto = "abc";
            int numero = Integer.parseInt(texto);

            int resultado = 10 / 0;

            System.out.println(resultado);

        } catch (NumberFormatException e) {
            System.out.println("Error: Conversión inválida.");
        } catch (ArithmeticException e) {
            System.out.println("Error: División entre cero.");
        }
    }
}
