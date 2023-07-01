/*
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 */
package Servicios;
import Entidad.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

public class AlumnoService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private ArrayList <Alumno> listaAlumnos = new ArrayList<>();
    
    public void agregarAlumno(Alumno alumno){
        listaAlumnos.add(alumno);
    }
    
    public Alumno crearAlumno(){
        System.out.print("Nombre: ");
        String nombre = leer.nextLine();
        ArrayList <Integer> notas = new ArrayList<>();
        for(int i=0; i<3; i++){
            System.out.print("Nota "+(i+1)+": ");
            notas.add(leer.nextInt());
        }
        
        return new Alumno(nombre,notas);
    }
    
    public void cargaDeAlumnos(){
        String respuesta;
        do{
            
            agregarAlumno(crearAlumno());
            System.out.println("Desea Seguir Agregando Alumnos? (S/N): ");
            respuesta = leer.next();
            leer.nextLine();
            
        }while(respuesta.equalsIgnoreCase("s"));
    }
    
    
    public double notaFinal(String nombre){
        for(Alumno alumno : listaAlumnos){
            if(alumno.getNombre().equalsIgnoreCase(nombre)){
                ArrayList<Integer> notas = alumno.getNotas();
                double suma = 0;
                for(int nota : notas){
                    suma+= nota;
                }
                return suma/notas.size();
            }
        }
        
        return -1; // Si no encuentra el alumno en la lista devuelve -1
    }
    
}
