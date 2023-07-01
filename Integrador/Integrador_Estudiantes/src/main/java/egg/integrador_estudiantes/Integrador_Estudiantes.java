/*
La escuela consta con tan solo 8 estudiantes, por lo que deberemos crear los 8 estudiantes con sus respectivas notas.
Una vez creado los estudiantes deberemos guardar los estudiantes en un arreglo de objetos tipo Estudiante, 
usando ese arreglo tenemos que realizar las dos tareas que nos ha pedido la escuela.
Calcular y mostrar el promedio de notas de todo el curso
Retornar otro arreglo con los nombre de los alumnos que recibieron una nota mayor al promedio del curso
Por último, deberemos mostrar todos los estudiantes con una nota mayor al promedio.
Nota: para crear un vector de objetos la definición es la siguiente:
Objeto nombreVector[] = new Objeto[];

*/

package egg.integrador_estudiantes;
import Entidad.Estudiante;
import Servicios.EstudianteService;
import java.util.Arrays;

public class Integrador_Estudiantes {

    public static void main(String[] args) {
        EstudianteService sv = new EstudianteService();
        Estudiante vectorEstudiantes[] = new Estudiante[8];
        
        for(int i=0; i<vectorEstudiantes.length; i++){
            System.out.println("Alumno ["+(i+1)+"]");
            vectorEstudiantes[i] = sv.crearEstudiantes();
        }
        
        System.out.println("--------------------------------------------------------------");
        System.out.printf("Promedio de notas de todo el Curso --> %.2f" , sv.promedioCurso(vectorEstudiantes));
        
        Estudiante[] notasMayorPromedio = sv.notasMayorPromedio(vectorEstudiantes);
        System.out.println();
        System.out.println("Alumnos con Notas mayor al Promedio");
        for(Estudiante objeto : notasMayorPromedio){
            System.out.print("["+objeto.getNombre()+"]");
        }
        System.out.println();
        System.out.println("--------------------------------------------------------------");
    }
}
