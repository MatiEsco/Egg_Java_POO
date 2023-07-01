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
package Servicios;

import Entidad.Estudiante;
import java.util.Scanner;

public class EstudianteService {
    Scanner leer = new Scanner (System.in);
    
    public Estudiante crearEstudiantes(){
        Estudiante estu = new Estudiante();
        
        System.out.print("Nombre: ");
        estu.setNombre(leer.nextLine());
        System.out.print("Nota: ");
        estu.setNota(leer.nextDouble());
        leer.nextLine();
        
        return estu;
        
    }
    
    public double promedioCurso(Estudiante[] vector){
        double suma = 0;
        for(int i=0; i< vector.length;i++){
            suma += vector[i].getNota();
        }
        
        return suma/vector.length;
        
    }
    
    
    public Estudiante[] notasMayorPromedio(Estudiante[] vector){
        int mayorAlPromedio=0;
        double promedio = promedioCurso(vector);
        
        for(Estudiante objeto : vector){
            if(objeto.getNota()> promedio){
                mayorAlPromedio ++;
            }
        }
        
        Estudiante vectorRetorno[] = new Estudiante[mayorAlPromedio];
        int indice=0;
        for(int i = 0; i<vector.length;i++){
            if(vector[i].getNota() > promedio){
                vectorRetorno[indice] = vector[i];
                indice++;
            }
        }
        
        return vectorRetorno;
    }
    
}
