/*
Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario". 
Luego, crea un método "calcular_aumento" que calcule el aumento salarial
de un empleado en función de su edad y salario actual.
El aumento salarial debe ser del 10% si el empleado tiene más de 30 años 
o del 5% si tiene menos de 30 años.

 */
package Entidad;

/**
 *
 * @author MatiPC
 */
public class Empleado {
    private String nombre;
    private int edad;
    private double salario;

    public Empleado() {
    }

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }
    
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getSalario() {
        return salario;
    }
    
    public double calcular_aumento(int edad, double salario){
        double salario_aumento = salario;
        if(edad>30){
            salario_aumento = salario +(salario*0.1);
        }else if(edad <= 30){
            salario_aumento = salario +(salario*0.05);
        }
        
        return salario_aumento;
    }
    
    public void informe(){
        System.out.println("-------- INFORME --------");
        System.out.println("Empleado --> " + this.nombre + " Edad --> " + this.edad);
        System.out.printf("Salario Actual --> $%.2f\n" ,this.salario );
        if(this.edad > 30){
            System.out.print("Salario con Aumento de 10% --> ");
            System.out.printf("$%.2f\n", calcular_aumento(this.edad,this.salario)); 
        }else if(this.edad <= 30){
            System.out.print("Salario con Aumento de 5% --> ");
            System.out.printf("$%.2f\n", calcular_aumento(this.edad,this.salario));
        }
    }
    
}
