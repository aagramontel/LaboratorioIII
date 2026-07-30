package Nivel1.Ejercicio25;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("--- MENÚ ---");
            System.out.println("1. Saludar");
            System.out.println("2. Despedirse");
            System.out.print("Seleccione una opción: ");

            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Hola, bienvenido.");
                    break;
                case 2:
                    System.out.println("Hasta luego.");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Error: Debe ingresar un número.");
        }

        sc.close();
    }
}
