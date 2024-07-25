package polimorfismo;
//clase hija extiende de empleado
public class EmpleadoTiempoCompleto extends Empleado {
    //atributo
    private double salarioMensual;
    //constructor
    public EmpleadoTiempoCompleto(String nombre, int edad, double salarioMensual){
            super(nombre, edad);
            this.salarioMensual = salarioMensual;     
    }
//sobreescribir metodo de la clase Empleado

    @Override
    public double calcularSalario() {
    return salarioMensual;
    }
   
}
