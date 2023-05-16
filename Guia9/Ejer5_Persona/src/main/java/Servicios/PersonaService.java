/*
Crear una clase PersonaService,
en el paquete servicio, con los siguientes métodos:
a) Método crearPersona que pida al usuario Nombre y fecha de
nacimiento de la persona a crear. Retornar el objeto Persona creado.
b) Método calcularEdad que calcule la edad del usuario utilizando el
atributo de fecha de nacimiento y la fecha actual.
c) Método menorQue recibe como parámetro una Persona y una edad.
Retorna true si la persona es menor que la edad consultada o false
en caso contrario.
d) Método mostrarPersona que muestra la información de la persona
deseada.

 */
package Servicios;
import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;
public class PersonaService {
    Scanner leer = new Scanner(System.in);
   
    public Persona crearPersona(){
        System.out.print("Nombre: ");
        String nombre = leer.nextLine();
        int dia, mes, anio;
        System.out.println("Fecha de nacimiento");
        System.out.print("Dia: ");
        dia = leer.nextInt();
        System.out.print("Mes: ");
        mes = leer.nextInt();
        System.out.print("Año: ");
        anio = leer.nextInt();
        
        anio-=1900;
        mes-=1;
        
        Date fecha = new Date(anio,mes,dia);
        
        return new Persona(nombre,fecha);
        
    }
    
    public int calcularEdad(Persona per){
        Date fechaActual = new Date();
        
        Date fechaNacimiento = per.getFechaNacimiento();
        
        int anios = fechaActual.getYear() - fechaNacimiento.getYear();
        if (fechaActual.getMonth() < fechaNacimiento.getMonth() || (fechaActual.getMonth() == fechaNacimiento.getMonth()
                        && fechaActual.getDate() < fechaNacimiento.getDate())) {
            anios--;
        }
        return anios;
    }
    
    public boolean menorQue(Persona per,int edad){
        
        
        return calcularEdad(per)<edad;
    }
    
    public void mostrarPersona(Persona per){
        System.out.println(per+" Edad:"+ calcularEdad(per));
    }
}
