/*
 Con respecto a los empleados, sean del tipo que sean, hay que saber su año de
incorporación a la facultad y qué número de despacho tienen asignado.

Reasignación de despacho a un empleado.
 */
package Entidad;


public abstract class Empleado extends Persona {
    protected int anioIncorporacion;
    protected int numeroDespacho;

    public Empleado() {
    }

    public Empleado(int anioIncorporacion, int numeroDespacho, String nombre, String apellido, int numeroId, String estadoCivil) {
        super(nombre, apellido, numeroId, estadoCivil);
        this.anioIncorporacion = anioIncorporacion;
        this.numeroDespacho = numeroDespacho;
    }
    
    public void reasignarDespacho(int numero){
        this.numeroDespacho = numero;
    }

    @Override
    public String toString() {
        return super.toString() + " Año incorporacion = " + anioIncorporacion + " ,Numero Despacho = " + numeroDespacho +", "; 
    }
    
    
    
    
    
}
