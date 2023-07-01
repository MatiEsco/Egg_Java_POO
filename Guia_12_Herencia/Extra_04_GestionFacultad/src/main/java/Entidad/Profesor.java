/*
Por lo que se refiere a los profesores, es necesario gestionar a qué departamento
pertenecen (lenguajes, matemáticas, arquitectura, ...).

Cambio de departamento de un profesor.
 */
package Entidad;

public class Profesor extends Empleado {
    private String departamento;

    public Profesor() {
    }

    public Profesor(String departamento, int anioIncorporacion, int numeroDespacho, String nombre, String apellido, int numeroId, String estadoCivil) {
        super(anioIncorporacion, numeroDespacho, nombre, apellido, numeroId, estadoCivil);
        this.departamento = departamento;
    }
    
    public void cambioDepartamento(String dep){
        this.departamento = dep;
    }

    @Override
    public void reasignarDespacho(int numero) {
        super.reasignarDespacho(numero);
    }

    @Override
    public String toString() {
        return super.toString() + " Departamento = " + departamento + '}'; 
    }
    
    
    
}
