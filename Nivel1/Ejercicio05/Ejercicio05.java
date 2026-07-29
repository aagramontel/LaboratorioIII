package Nivel1.Ejercicio05;

public class Ejercicio05 {
    public static void main(String[] args) {
        try {
            int resultado = 10 / 0;
            System.out.println(resultado); 
        } catch (ArithmeticException e) {
            System.out.println("Ocurrió un error al dividir.");
        } finally{
            System.out.println("Programa finalizado.");
        }
    }
}
