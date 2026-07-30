package Nivel2.Ejercicio22;

public class Ejercicio22 {
    private double salario;

    public void setSalario(double salario){
        this.salario = salario;
    }

    public double getSalario(){
        return salario;
    }

    public static void main(String[] args) {
        Ejercicio22 empleado = new Ejercicio22();

        empleado.setSalario(7000);

        System.out.println("Salario: Q" + empleado.getSalario());
    }
}
