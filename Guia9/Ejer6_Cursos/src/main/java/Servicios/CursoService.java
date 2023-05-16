/*
 Método cargarAlumnos(): este método le permitirá al usuario ingresar
los alumnos que asisten a las clases. Nosotros nos encargaremos de
almacenar esta información en un arreglo e iterar con un bucle,
solicitando en cada repetición que se ingrese el nombre de cada
alumno.
e) Método crearCurso(): el método crear curso, le pide los valores de
los atributos al usuario y después se le asignan a sus respectivos
atributos para llenar el objeto Curso. En este método invocamos al
método cargarAlumnos() para asignarle valor al atributo alumnos
f) Método calcularGananciaSemanal(): este método se encarga de
calcular la ganancia en una semana por curso. Para ello, se deben
multiplicar la cantidad de horas por día, el precio por hora, la
cantidad de alumnos y la cantidad de días a la semana que se repite
el encuentro.

 */
package Servicios;
import Entidad.Cursos;
import java.util.Scanner;

public class CursoService {
    Scanner leer = new Scanner(System.in);
    
    public String[] cargarAlumnos(){
        String[] vector = new String[5];
        System.out.println("Ingresar nombres de Alumnos");
        for(int i=0;i<5;i++){
            System.out.print("Alumno ["+(i+1)+"]: ");
            vector[i] = leer.nextLine();
        }
        
        return vector;
    }
    
    public Cursos crearCurso(){
        Cursos curso = new Cursos();
        
        System.out.print("Nombre curso: ");
        curso.setNombreCurso(leer.nextLine());
        System.out.print("Horas por Dia: ");
        curso.setCantidadHorasPorDia(leer.nextDouble());
        System.out.print("Dias por Semana: ");
        curso.setCantidadDiaPorSemana(leer.nextInt());
        leer.nextLine();
        System.out.print("Turno (Mañana/Tarde): ");
        curso.setTurno(leer.nextLine());
        System.out.print("Precio por Hora: ");
        curso.setPrecioPorHora(leer.nextDouble());
        leer.nextLine();
        
        String[] nombres = new String[5];
        nombres = cargarAlumnos();
        
        curso.setAlumnos(nombres);
        
        return curso;
    }
    
    public double calcularGananciaSemana1(Cursos curso){
        return (curso.getCantidadHorasPorDia()*curso.getPrecioPorHora()*5*curso.getCantidadDiaPorSemana());
    }
    
    
}
