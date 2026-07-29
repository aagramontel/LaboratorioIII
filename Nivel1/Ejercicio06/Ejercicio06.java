package Nivel1.Ejercicio06;

import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Ingrese un número positivo: ");
            int numero = sc.nextInt();

            if (numero<0) {
                throw new Exception("El número ingresado no es positivo.");
            }
            System.out.println("Número válido: " + numero);
        } catch (Exception e) {
            System.out.println("Error: "+ e.getMessage());
        }
        sc.close();
    }
}
