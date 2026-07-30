package Nivel1.Ejercicio21;

public class Ejercicio21 {
    public static void validarEmail(String email) throws Exception {

        if (!email.contains("@") || !email.contains(".")) {
            throw new Exception("Correo electrónico inválido.");
        }

        System.out.println("Correo válido.");
    }

    public static void main(String[] args) {

        try {
            validarEmail("correo.com");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
