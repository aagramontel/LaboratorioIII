package Nivel1.Ejercicio09;

import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Ingrese su edad: ");
            int edad = sc.nextInt();
            if (edad<0) {
                throw new IllegalArgumentException("La edad no puede ser negativa.");
            }
            System.out.println("Edad registrada: " + edad);
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }
        sc.close();
    }
}
