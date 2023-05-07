
package Entidad;


public class Persona {
    
    private String nombre;
    private String apellido;
    private String dni;

    public Persona() {
        
    }

    public Persona(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }
    
    
    public void setNombre(String nombre){
        if(nombre.length()>0){
            this.nombre = nombre;
        }
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    
    public String getNombre(){
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + '}';
    }
    
    
    
    
}
