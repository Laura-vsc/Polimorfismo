package polimorfismo;

public class EmpleadoMedioTiempo extends Empleado{
    //atributos
    private double salarioPorHora;
    private int horasTrabajadas;

    public EmpleadoMedioTiempo(String nombre, int edad, double salarioPorHora, int horasTrabajadas) {
        super(nombre, edad);
        this.salarioPorHora = salarioPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSalario() {
    return salarioPorHora * horasTrabajadas;    
    }
}