/*
Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.
 */
package Servicio;

import java.util.Scanner;
import Entidad.Pais;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class PaisService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Set<Pais> paises = new HashSet<>();
    
    public Pais crearPais(){
        System.out.print("Ingrese Pais: ");
        String nombre = leer.nextLine();
        return new Pais(nombre);
    }
    
    public void cargarAlConjunto(Pais pais){
        paises.add(pais);
    }
    
    public void cargarPaises(){
        String respuesta;
        
        do{
            cargarAlConjunto(crearPais());
            System.out.println("Desea seguir ingresando? (S/N)");
            respuesta = leer.nextLine();
            
        }while(respuesta.equalsIgnoreCase("s"));
        
        System.out.println(paises);
        
    }
    // ArrayList<Pais> copiaPaises = new ArrayList<>(paises);
    // Collections.sort(copiaPaises, Comparator.comparing(Pais::getNombre));
        //System.out.println(copiaPaises);
    public void ordenarAlfabeticamente() {
       
        System.out.println("------ Conjunto Ordenado Alfabéticamente --------");

        TreeSet<Pais> copiaPaises = new TreeSet<>();
        copiaPaises.addAll(paises);
        
        System.out.println(copiaPaises);
    }
    
    public void eliminarPais() {
    System.out.print("Ingrese País a Eliminar: ");
    String eliminar = leer.nextLine();

    Iterator<Pais> iterador = paises.iterator();
    boolean encontrado = false;

    while (iterador.hasNext()) {
        Pais pais = iterador.next();
        if (pais.getNombre().equalsIgnoreCase(eliminar)) {
            iterador.remove();
            encontrado = true;
            break;
        }
    }

    if (encontrado) {
        System.out.println("País eliminado: " + eliminar);
    } else {
        System.out.println("No se encontró el País.");
    }

    ordenarAlfabeticamente();
}
    
   
}
