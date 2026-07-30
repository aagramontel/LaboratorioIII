package Nivel1.Ejercicio24;

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean valido = false;

        while (!valido) {
            try {
                System.out.print("Ingrese un número entero: ");
                int numero = Integer.parseInt(sc.nextLine());

                System.out.println("Número ingresado: " + numero);
                valido = true;

            } catch (NumberFormatException e) {
                System.out.println("Error: Intente nuevamente.");
            }
        }

        sc.close();
    }
}
