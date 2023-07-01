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
import Entidad.Perro;
import Entidad.Persona;

import java.util.ArrayList;
import java.util.Scanner;
public class AdopcionService {
    private ArrayList<Persona> personas  = new ArrayList<>();;
    private ArrayList<Perro> perros = new ArrayList<>();;
    
    PersonaService svp = new PersonaService();
    PerroService svperro = new PerroService();
    Scanner leer = new Scanner(System.in);
    
    public void cargarPersonas(){
        
        int opcion;
        
        do{
            System.out.println("Cargar Personas");
            System.out.println("1_ Cargar");
            System.out.println("2_ Salir");
            opcion = leer.nextInt();
            
            switch(opcion){
                case 1: personas.add(svp.crearPersona()) ;
                break;
                case 2: System.out.println("Finalizando Carga");
                break;
                default: System.out.println("Opcion invalida.");
                break;
            }
            
            
        }while(opcion!=2);
        
        
    }
    
    public void cargarPerros(){
        
        int opcion;
        
        do{
            System.out.println("Cargar Perros");
            System.out.println("1_ Cargar");
            System.out.println("2_ Salir");
            opcion = leer.nextInt();
            
            switch(opcion){
                case 1: perros.add(svperro.crearPerro());
                break;
                case 2: System.out.println("Finalizando Carga");
                break;
                default: System.out.println("Opcion invalida.");
                break;
            }
            
            
        }while(opcion!=2);
    }
    
    public void mostrarPerrosAdopcion(){
        System.out.println("---- Lista de perros en Adopcion ----");
        for (Perro perro : perros) {
            System.out.println("Nombre: " + perro.getNombre()+ " Raza: " + perro.getRaza());
        }
        
        
    }
    
    public void adoptarPerro() {

        for (Persona persona : personas) {
            if (persona.getPerro() == null) {
                System.out.println(persona.getNombre());
                System.out.println("Selecciona el nombre del perro: ");
                String nombre = leer.nextLine();
                boolean encontrado = false;
                for (Perro perro : perros) {
                    if (perro.getNombre().equals(nombre)) {
                        encontrado = true;
                        if (perro.getDuenio() == null) {
                            System.out.println("Felicidades, ha adoptado a " + nombre);

                            persona.setPerro(perro);
                            perro.setDuenio(persona);
                        } else {
                            System.out.println("El perro seleccionado ya tiene dueño");
                        }

                    }

                }
                if (!encontrado) {
                    System.out.println("No se encontró ese nombre en la lista de perros");
                }

            }
        }

    }
    
    public void mostrarPersonas(){
        for(Persona persona : personas){
            System.out.println(persona);
        }
    }
    
    public void menu(){
        int op;
        do{
        System.out.println("----- MENU -----");
        System.out.println("1_ Añadir Personas a la lista");
        System.out.println("2_ Añadir Perros a la lista de adopción");
        System.out.println("3_ Mostrar lista de Perros en adopción");
        System.out.println("4_ Adoptar");
        System.out.println("5_ Mostrar Personas");
        System.out.println("6_ Finalizar");
        System.out.print("--> ");
        op = leer.nextInt();
        leer.nextLine();
        
        switch(op){
            case 1: 
                   cargarPersonas();
                   break;
            case 2: 
                cargarPerros();
                break;
            case 3: 
                mostrarPerrosAdopcion();
                break;
            case 4: 
                adoptarPerro();
                break;
            case 5: mostrarPersonas();
            break;
            
            case 6 : System.out.println("Finalizando..");
            break;
            
            default: System.out.println("Ingrese una opcion valida.");
            break;
            
            
        }
        }while(op!= 6);
        
    }
    
    
}
