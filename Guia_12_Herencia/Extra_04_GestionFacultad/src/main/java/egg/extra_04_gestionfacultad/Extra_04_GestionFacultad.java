/*
Imprimir toda la información de cada tipo de individuo. Incluya un programa de prueba
que instancie objetos de los distintos tipos y pruebe los métodos desarrollados.
 */

package egg.extra_04_gestionfacultad;
import Entidad.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Extra_04_GestionFacultad {

    public static void main(String[] args) {
        Estudiante estudiante1=new Estudiante("Programacion", "Matias", "Escobar", 101, "Soltero");
        Profesor profe1 = new Profesor("Matematicas", 2010, 2, "Juan", "Ramirez", 001, "Casado");
        PersonalServicio personalSv1 = new PersonalServicio("Biblioteca", 2018, 45, "Pepe", "Jaimito", 458, "Viudo");
        
        List<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(estudiante1);
        listaPersonas.add(profe1);
        listaPersonas.add(personalSv1);
        
        for(Persona persona : listaPersonas){
            System.out.println(persona.getClass().getSimpleName());
            System.out.println(persona);
            System.out.println("---------------------------");
        }
        
        
    }
}
