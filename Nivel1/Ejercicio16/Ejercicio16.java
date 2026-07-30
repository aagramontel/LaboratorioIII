package Nivel1.Ejercicio16;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingrese un texto: ");
            String texto = sc.nextLine();

            if (texto.trim().isEmpty()) {
                throw new Exception("El texto no puede estar vacío.");
            }

            System.out.println("Texto válido: " + texto);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
