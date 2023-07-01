/*
Almacena en un HashMap los códigos postales de 10 ciudades a elección de esta
página: https://mapanet.eu/index.htm. Nota: Poner el código postal sin la letra, solo el
numero.
• Pedirle al usuario que ingrese 10 códigos postales y sus ciudades.
• Muestra por pantalla los datos introducidos
• Pide un código postal y muestra la ciudad asociada si existe sino avisa al
usuario.
• Muestra por pantalla los datos
• Agregar una ciudad con su código postal correspondiente más al HashMap.
• Elimina 3 ciudades existentes dentro del HashMap.
 */
package Servicio;

import Entidad.Ciudad;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;


public class CiudadService {
    Map<Integer,String> listaCiudades = new HashMap<>();
    Scanner leer = new Scanner(System.in);
    
    public void cargarCiudad(){
        System.out.print("Nombre: ");
        String nombre = leer.nextLine();
        System.out.print("Codigo Postal: ");
        int codigo = leer.nextInt();
        leer.nextLine();
        
        listaCiudades.put(codigo, nombre);
        
    }
    
    public void repetirCarga(){
        for (int i = 0; i < 10; i++) {
            cargarCiudad();
        }
    }
    
    public void mostrarDatos(){
        System.out.println("Lista ciudades");
        System.out.println("----------------");
        
        for (Map.Entry<Integer, String> entry : listaCiudades.entrySet()) {
            System.out.println(entry);
            
        }
        
    }
    
    public void buscarCP(){
        System.out.print("Ingrese Codigo Postal: ");
        int codigo = leer.nextInt();
        
        if(listaCiudades.containsKey(codigo)){
            String ciudad = listaCiudades.get(codigo);
            System.out.println("El codigo postal ingresado pertenece a "+ciudad);
        }else{
            System.out.println("No se encuentra el codigo postal ingresado en nuestra lista.");
        }
        System.out.println("---------------------");
        System.out.println("");
    }
    
    public void eliminarCiudad(){
        System.out.print("Ingrese una ciudad para Eliminar: ");
        String nombre = leer.nextLine();
        
        Iterator<Map.Entry<Integer,String>> it = listaCiudades.entrySet().iterator();
        boolean encontrado = false;
        while(it.hasNext()){
            Map.Entry<Integer,String> ciudad = it.next();
            if(ciudad.getValue().equalsIgnoreCase(nombre)){
                it.remove();
                encontrado = true;
                break;
            }
        }
        
        if(encontrado){
            System.out.println("Ciudad eliminada");
        }else{
            System.out.println("No se encontró una ciudad asociada a ese codigo postal");
        }
        System.out.println("---------------------------");
        System.out.println("");
    }
    
    public void menu(){
        int opcion;
        
        do{
            System.out.println("**** Menu ****");
            System.out.println("1_ Cargar 10 ciudades");
            System.out.println("2_ Mostrar Datos");
            System.out.println("3_ Buscar ciudad por Codigo Postal");
            System.out.println("4_ Eliminar 3 ciudades");
            System.out.println("5_ Agregar una ciudad mas");
            System.out.println("6_ Salir");
            
            opcion = leer.nextInt();
            leer.nextLine();
            
            switch(opcion){
                case 1: repetirCarga();
                break;
                case 2: mostrarDatos();
                break;
                case 3: buscarCP();
                break;
                case 4: for (int i = 0; i < 3; i++) {
                        eliminarCiudad();
                    }
                break;
                case 5: cargarCiudad();
                break;
                case 6: System.out.println("Saliendo...");
                break;
                default: System.out.println("Ingrese una opcion valida");
                break;
            }
            
        }while(opcion!=6);
        
    }
    
}
