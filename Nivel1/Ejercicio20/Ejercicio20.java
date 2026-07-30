package Nivel1.Ejercicio20;

public class Ejercicio20 {
    public static void main(String[] args) {

        try {
            throw new Exception("Error controlado generado con throw.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
