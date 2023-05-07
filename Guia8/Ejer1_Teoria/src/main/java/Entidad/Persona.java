/*
Crea un método void que reciba un objeto tipo persona como parámetro y
utilice el get para mostrar sus atributos. Llama ese método desde el main.

 */
package Entidad;


public class Persona {
    private String nombre;
    private int edad;
    private int dni;

    public Persona() {
    }

    public Persona(String nombre, int edad, int dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getDni() {
        return dni;
    }
    
    
}
