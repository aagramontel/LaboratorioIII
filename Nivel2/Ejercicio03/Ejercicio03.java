package Nivel2.Ejercicio03;

public class Ejercicio03 {
    private int edad;

    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        } else {
            System.out.println("Edad inválida.");
        }
    }

    public int getEdad() {
        return edad;
    }

    public static void main(String[] args) {
        Ejercicio03 persona = new Ejercicio03();

        persona.setEdad(12);
        System.out.println("Edad: " + persona.getEdad());
    }
}
