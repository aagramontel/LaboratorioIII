package Nivel1.Ejercicio19;

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingrese un número: ");
            int numero = sc.nextInt();

            if (numero <= 100) {
                throw new Exception("El número debe ser mayor a 100.");
            }

            System.out.println("Número válido.");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
