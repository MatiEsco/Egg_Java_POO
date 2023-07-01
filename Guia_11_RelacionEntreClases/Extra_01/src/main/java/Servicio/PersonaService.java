/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Persona;
import java.util.Scanner;


public class PersonaService {
    Scanner leer = new Scanner(System.in);
    
    public Persona crearPersona(){
        Persona persona = new Persona();
        
        System.out.print("Nombre: ");
        persona.setNombre(leer.nextLine());
        System.out.print("Apellido: ");
        persona.setApellido(leer.nextLine());
        System.out.print("Edad: ");
        persona.setEdad(leer.nextInt());
        leer.nextLine();
        System.out.print("Dni: ");
        persona.setDni(leer.nextInt());
        leer.nextLine();
        
        return persona;
        
        
    }
    
    
}
