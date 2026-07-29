package Nivel1.Ejercicio02;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Ingrese un número: ");
            int numero = sc.nextInt();
            
            System.out.println("Número ingresado: " + numero);
        } catch (Exception e) {
            System.out.println("Error: Debe ingresar un valor numérico.");
        }
        sc.close();
    }
}
