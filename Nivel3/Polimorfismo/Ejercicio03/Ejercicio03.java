package Nivel3.Polimorfismo.Ejercicio03;

import java.util.ArrayList;

public class Ejercicio03 {
    static class Animal {
    }

    static class Perro extends Animal {
    }

    static class Gato extends Animal {
    }

    public static void main(String[] args) {

        ArrayList<Animal> animales = new ArrayList<>();

        animales.add(new Perro());
        animales.add(new Gato());

        System.out.println("Cantidad de animales: " + animales.size());
    }
}
