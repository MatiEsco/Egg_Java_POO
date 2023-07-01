/*
Por cada persona, se debe conocer, al menos, su nombre y apellidos, su número de
identificación y su estado civil.

Cambio del estado civil de una persona.
 */
package Entidad;




public abstract class Persona {
    protected String nombre, apellido;
    protected int numeroId;
    protected String estadoCivil;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int numeroId, String estadoCivil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroId = numeroId;
        this.estadoCivil = estadoCivil;
    }

    
    public void cambioEstadoCivil(String estado){
        this.estadoCivil=estado;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
     //   sb.append("Persona{");
        sb.append("nombre=").append(nombre);
        sb.append(", apellido=").append(apellido);
        sb.append(", numeroId=").append(numeroId);
        sb.append(", estadoCivil=").append(estadoCivil);
        sb.append(',');
        return sb.toString();
    }
    
    
    
}
