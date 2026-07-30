package Nivel2.Ejercicio20;

public class Ejercicio20 {
    private double nota;

    public void setNota(double nota) {

        if (nota >= 0 && nota <= 100) {
            this.nota = nota;
        } else {
            System.out.println("Nota inválida.");
        }
    }

    public double getNota() {
        return nota;
    }

    public static void main(String[] args) {

        Ejercicio20 estudiante = new Ejercicio20();

        estudiante.setNota(95);

        System.out.println("Nota: " + estudiante.getNota());
    }
}
