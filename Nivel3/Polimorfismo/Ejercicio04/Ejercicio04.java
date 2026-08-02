package Nivel3.Polimorfismo.Ejercicio04;

import java.util.ArrayList;

public class Ejercicio04 {
    static class Animal {

        public void sonido() {
            System.out.println("Sonido de animal.");
        }
    }

    static class Perro extends Animal {

        @Override
        public void sonido() {
            System.out.println("Guau Guau");
        }
    }

    static class Gato extends Animal {

        @Override
        public void sonido() {
            System.out.println("Miau Miau");
        }
    }

    public static void main(String[] args) {

        ArrayList<Animal> animales = new ArrayList<>();

        animales.add(new Perro());
        animales.add(new Gato());

        for (Animal animal : animales) {
            animal.sonido();
        }
    }
}
