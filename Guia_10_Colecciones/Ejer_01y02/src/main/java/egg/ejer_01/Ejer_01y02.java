/*
 * Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList. 

 */

package egg.ejer_01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ejer_01y02 {

    public static void main(String[] args) {
       
       ArrayList<String> razasPerros = new ArrayList<>();
        Scanner leer = new Scanner(System.in);
        boolean siguiente = true;

       while (siguiente) {
            System.out.println("Ingrese una raza de perro: ");
            razasPerros.add(leer.nextLine().toLowerCase());
        
            String respuesta = "";
            boolean respuestaValida = false;
            while (!respuestaValida) {
                System.out.println("¿Quieres agregar otra raza? (S/N)");
                respuesta = leer.nextLine().toLowerCase();
                if (respuesta.equals("s") || respuesta.equals("n")) {
                    respuestaValida = true;
                } else {
                    System.out.println("La respuesta ingresada no es válida. Por favor, ingrese S o N.");
                }
            }
        
            if (respuesta.equals("n")) {
                siguiente = false;
            }
        }

        System.out.println("Perros guardados:");
        for (String raza : razasPerros) {
            System.out.println(raza);
        }
        
        /**
         * Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
         */
        
        Iterator iterador = razasPerros.iterator();

        System.out.println("Ingrese el perro a eliminar");
        String busqueda = leer.next().toLowerCase();

        while (iterador.hasNext()) {
            if (iterador.next().equals(busqueda)) {
                iterador.remove();
                System.out.println("Se eliminó correctamente");
            }
        }
        for (String raza : razasPerros) {

            System.out.println(raza);
        }
        
    }
        
}

