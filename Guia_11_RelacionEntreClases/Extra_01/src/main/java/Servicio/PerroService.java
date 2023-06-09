/*
Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
persona.
Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
personas con sus respectivos perros.
 */
package Servicio;
import Entidad.*;
import java.util.Scanner;
public class PerroService {
    Scanner leer = new Scanner(System.in);
    
    public Perro crearPerro(){
        Perro perro = new Perro();
        System.out.print("Nombre: ");
        perro.setNombre(leer.nextLine());
        System.out.print("Raza: ");
        perro.setRaza(leer.nextLine());
        System.out.print("Edad: ");
        perro.setEdad(leer.nextInt());
        leer.nextLine();
        System.out.print("Tamaño: ");
        perro.setTamanio(leer.nextDouble());
        leer.nextLine();
        
        return perro;
        
    }
    
    
    
}
