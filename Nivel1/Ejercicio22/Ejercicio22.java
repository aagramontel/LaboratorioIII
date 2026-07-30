package Nivel1.Ejercicio22;

import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingrese un texto: ");
            String texto = sc.nextLine();

            if (texto.length() < 5) {
                throw new Exception("El texto debe tener al menos 5 caracteres.");
            }

            System.out.println("Texto válido.");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
