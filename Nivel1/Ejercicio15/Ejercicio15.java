package Nivel1.Ejercicio15;

class MiExcepcion extends Exception {

    public MiExcepcion(String mensaje) {
        super(mensaje);
    }
}

public class Ejercicio15 {
    public static void validarEdad(int edad)
            throws MiExcepcion {

        if (edad < 18) {
            throw new MiExcepcion(
                    "Debe ser mayor de edad.");
        }

        System.out.println("Edad válida.");
    }

    public static void main(String[] args) {

        try {
            validarEdad(16);
        } catch (MiExcepcion e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
