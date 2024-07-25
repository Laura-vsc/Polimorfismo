package polimorfismo;

public class Polimorfismo {


    public static void main(String[] args) {
        //Instanciar = objetos
        Empleado empleado1 = new EmpleadoTiempoCompleto("Juan", 32, 350000);
        Empleado empleado2 = new EmpleadoMedioTiempo("Pedro", 38, 50000, 40);
        Empleado empleado3 = new EmpleadoContrato("Laura", 28, 9000000);
        
        System.out.println("Salario de "+ empleado1.nombre + ":$" + empleado1.calcularSalario());
        System.out.println("Salario de "+ empleado2.nombre + ":$" + empleado2.calcularSalario());
        System.out.println("Salario de "+empleado3.nombre + ":$"+ empleado3.calcularSalario());
    }
    
}
