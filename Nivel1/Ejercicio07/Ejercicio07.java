package Nivel1.Ejercicio07;

public class Ejercicio07 {
    public static void validarNumero(int numero) throws Exception{
        if (numero<0) {
            throw new Exception("El número no puede ser negativo.");
        }
        System.out.println("Número válido: "+ numero);
    }

    public static void main(String[] args) {
        try {
            validarNumero(-5);
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
