package Nivel1.Ejercicio13;

public class Ejercicio13 {
    public static void main(String[] args) {

        try {
            throw new Exception("Excepción generada manualmente.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
