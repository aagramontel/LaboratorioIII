package Nivel1.Ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingrese una contraseña: ");
            String password = sc.nextLine();

            if (password.length() < 8) {
                throw new Exception("La contraseña debe tener al menos 8 caracteres.");
            }

            System.out.println("Contraseña válida.");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
