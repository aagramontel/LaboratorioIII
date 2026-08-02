package Nivel3.Polimorfismo.Ejercicio05;

public class Ejercicio05 {
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

        Animal perro = new Perro();
        Animal gato = new Gato();

        perro.sonido();
        gato.sonido();
    }
}
