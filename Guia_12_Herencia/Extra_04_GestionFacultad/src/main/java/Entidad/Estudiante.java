/*
En cuanto a los estudiantes, se requiere almacenar el curso en el que están
matriculados.

Matriculación de un estudiante en un nuevo curso.
 */
package Entidad;


public class Estudiante extends Persona{
    private String curso;

    public Estudiante() {
    }

    public Estudiante(String curso, String nombre, String apellido, int numeroId, String estadoCivil) {
        super(nombre, apellido, numeroId, estadoCivil);
        this.curso = curso;
    }
    
    public void matricularNuevoCurso(String curso){
        this.curso = curso;
    }

    @Override
    public String toString() {
        return super.toString() + " curso=" + curso +'}';
    }

   
    
    
    
}
