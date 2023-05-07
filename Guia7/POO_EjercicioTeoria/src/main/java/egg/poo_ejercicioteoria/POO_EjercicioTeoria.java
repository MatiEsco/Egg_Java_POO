/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package egg.poo_ejercicioteoria;

import Entidad.Persona;
import java.util.Scanner;



public class POO_EjercicioTeoria {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        
        
        System.out.print("Nombre: ");
        String nombre = leer.next();
        
        System.out.print("Apellido: ");
        String apellido = leer.next();
        
        System.out.print("Dni: ");
        String dni = leer.next();
        
        Persona persona1 = new Persona(nombre,apellido,dni);
        
        System.out.println(persona1);
        
        persona1.setNombre(nombre=leer.next());
        
        System.out.println(persona1);
        
    }
}
