/*
Sobre el personal de servicio, hay que conocer a qué sección están asignados
(biblioteca, decanato, secretaría, ...).

Traslado de sección de un empleado del personal de servicio.
 */
package Entidad;


public class PersonalServicio extends Empleado {
    private String seccion;

    public PersonalServicio() {
    }

    public PersonalServicio(String seccion, int anioIncorporacion, int numeroDespacho, String nombre, String apellido, int numeroId, String estadoCivil) {
        super(anioIncorporacion, numeroDespacho, nombre, apellido, numeroId, estadoCivil);
        this.seccion = seccion;
    }
    
    public void trasladoSeccion(String secNueva){
        this.seccion=secNueva;
    }

    @Override
    public void reasignarDespacho(int numero) {
        super.reasignarDespacho(numero);
    }

    @Override
    public String toString() {
        return super.toString()+ " Seccion = " + seccion + '}';
    }
    
    
    
}
