package Nivel2.Ejercicio19;

public class Ejercicio19 {
    private double nota1;
    private double nota2;
    private double nota3;

    public Ejercicio19(double nota1, double nota2, double nota3) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double calcularPromedio() {
        return (nota1 + nota2 + nota3) / 3;
    }

    public void mostrarResultado() {

        double promedio = calcularPromedio();

        System.out.println("Promedio: " + promedio);

        if (promedio >= 61) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }
    }

    public static void main(String[] args) {

        Ejercicio19 estudiante = new Ejercicio19(70, 80, 90);

        estudiante.mostrarResultado();
    }
}
