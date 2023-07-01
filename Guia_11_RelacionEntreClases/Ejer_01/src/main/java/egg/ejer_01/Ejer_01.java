/*
 Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */

package egg.ejer_01;

import Entidad.Perro;
import Entidad.Persona;

public class Ejer_01 {

    public static void main(String[] args) {
 
        Perro perro1 = new Perro();
        Perro perro2 = new Perro();
        
        perro1.setNombre("Homero");
        perro1.setRaza("Boxer");
        perro1.setEdad(9);
        perro1.setTamanio(50);
        
        perro2.setNombre("Negra");
        perro2.setRaza("Callejera");
        perro2.setEdad(3);
        perro2.setTamanio(45);
        
        Persona persona1 = new Persona("Matias", "Escobar",27,39197144,perro1);
        Persona persona2 = new Persona("Gabriel","Escobar",27,39197144,perro2);
        
        
        System.out.println(persona1);
        System.out.println(persona2);
        
    }
}
