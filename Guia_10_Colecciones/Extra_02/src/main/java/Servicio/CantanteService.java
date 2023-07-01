/*
Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos y
tendrá como atributos el nombre y discoConMasVentas.
Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5
objetos de tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de
cada cantante y su disco con más ventas por pantalla.
Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de
agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el
usuario elija o de salir del programa. Al final se deberá mostrar la lista con todos los
cambios.
 */
package Servicio;

import Entidad.CantanteFamoso;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class CantanteService {
    List<CantanteFamoso> listaCantantes = new ArrayList<>();
    Scanner leer = new Scanner(System.in);
    
    public CantanteFamoso crearCantante(){
        System.out.print("Nombre: ");
        String nombre = leer.nextLine();
        System.out.print("Disco con mas Ventas: ");
        String disco = leer.nextLine();
        
        return new CantanteFamoso(nombre,disco);
    }
    
    public void cargarLista(){
        for (int i = 0; i < 5; i++) {
            listaCantantes.add(crearCantante());
        }
    }
    
    public void mostrarLista(){
        if(listaCantantes.isEmpty()){
            System.out.println("La lista se encuentra Vacia..");
        }else{
            for (CantanteFamoso listaCantante : listaCantantes) {
            System.out.println(listaCantante);
            }
        }
        
    }
    
    public void agregarCantante(){
        String respuesta;
        do{
            System.out.print("Nombre: ");
            String nombr = leer.nextLine();
            System.out.print("Disco con mas Ventas: ");
            String disc = leer.nextLine();
            
            listaCantantes.add(new CantanteFamoso(nombr, disc));
            System.out.print("Seguir agregando? (S/N): ");
            respuesta = leer.nextLine();
        }while(respuesta.equalsIgnoreCase("s"));
    }
    
    public void eliminarCantante(){
        Iterator<CantanteFamoso> iterador = listaCantantes.iterator();
        System.out.print("Nombre del cantante a eliminar: ");
        String eliminar = leer.nextLine();
        boolean encontrado=false;
        while(iterador.hasNext()){
            CantanteFamoso cantante = iterador.next();
            
            if(cantante.getNombre().equalsIgnoreCase(eliminar)){
                iterador.remove();
                encontrado = true;
                break;
            }
        }
        
        if(encontrado){
            System.out.println("Cantante "+eliminar+" se ha quitado de la lista..");
        }else{
            System.out.println("No se encontró el cantante..");
        }
        
    }
    
    public void menu(){
        int op;
        do{
            System.out.println("");
            System.out.println("**** Menu ****");
            System.out.println("1_ Cargar los 5 primeros Cantantes");
            System.out.println("2_ Mostrar Lista");
            System.out.println("3_ Eliminar Cantante");
            System.out.println("4_ Agregar un nuevo cantante");
            System.out.println("5_ Salir");
            System.out.print("Seleccione una opcion: ");
            op = leer.nextInt();
            leer.nextLine();
        
            switch (op) {
                case 1:
                    cargarLista();
                    break;
                case 2:
                    mostrarLista();
                    break;
                case 3:
                    eliminarCantante();
                    break;
                case 4:
                    agregarCantante();
                    break;
                case 5:
                    System.out.println("Saliendo..");
                    break;
                default: 
                      System.out.println("Ingrese una opcion valida!");
                      break;
        }
        }while(op!=5);
        
    }
    
    
}
