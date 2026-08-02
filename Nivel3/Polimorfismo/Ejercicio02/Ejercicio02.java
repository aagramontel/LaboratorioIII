package Nivel3.Polimorfismo.Ejercicio02;

public class Ejercicio02 {
    static class Animal {

        public void sonido() {
            System.out.println("Sonido de animal.");
        }
    }

    static class Gato extends Animal {

        @Override
        public void sonido() {
            System.out.println("Miau Miau");
        }
    }

    public static void main(String[] args) {

        Gato gato = new Gato();

        gato.sonido();
    }
}
