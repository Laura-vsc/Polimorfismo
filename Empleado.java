package polimorfismo;
//clase abstracta

public abstract class Empleado {
    //atributos
    public String nombre;
    int edad;
    
    //constructor
    public Empleado(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    //metodo abstracto
    public abstract double calcularSalario();
    
}
