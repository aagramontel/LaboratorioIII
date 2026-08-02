package Nivel3.Herencia.Ejercicio03;

public class Ejercicio03 {
    static class Animal {
        public void sonido () {
            System.out.println("Sonido de animal.");
        }
    }
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sonido();
    }
}
