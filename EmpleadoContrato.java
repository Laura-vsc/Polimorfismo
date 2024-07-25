package polimorfismo;


public class EmpleadoContrato extends Empleado {
    private double salarioPorProyecto;

    public EmpleadoContrato( String nombre, int edad, double salarioPorProyecto) {
        super(nombre, edad);
        this.salarioPorProyecto = salarioPorProyecto;
    }
    //sobreescribir metodo clase empleado
    
    @Override
    public double calcularSalario() {
    return salarioPorProyecto;
    }
    
}
