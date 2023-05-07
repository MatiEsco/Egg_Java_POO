/*
Crea un método void que reciba un objeto tipo persona como parámetro 
y utilice el get para mostrar sus atributos. Llama ese método desde el main.

 */
package Servicio;

import Entidad.Persona;

/**
 *
 * @author MatiPC
 */
public class PersService {
    public void mostrarPersona(Persona p1){
        System.out.println("Nombre: " + p1.getNombre());
        System.out.println("Edad: " + p1.getEdad());
        System.out.println("Dni: " + p1.getDni());
    }
    
    
}
