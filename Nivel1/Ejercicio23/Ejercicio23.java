package Nivel1.Ejercicio23;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingrese un número entero: ");
            int numero = sc.nextInt();

            System.out.println("Número ingresado: " + numero);

        } catch (InputMismatchException e) {
            System.out.println("Error: Debe ingresar un número entero.");
        }

        sc.close();
    }
}