/*
En el main tendremos un bucle que crea un objeto Libro pidiéndole al usuario todos
sus datos y los seteandolos en el Libro. Despues, ese Libro se guarda en el conjunto y
se le pregunta al usuario si quiere crear otro Libro o no.
La clase Librería contendrá además los siguientes métodos:

• Método prestamo(): El usuario ingresa el titulo del libro que quiere prestar y se lo
busca en el conjunto. Si está en el conjunto, se llama con ese objeto Libro al
método. El método se incrementa de a uno, como un carrito de compras, el
atributo ejemplares prestados, del libro que ingresó el usuario. Esto sucederá
cada vez que se realice un préstamo del libro. No se podrán prestar libros de los
que no queden ejemplares disponibles para prestar. Devuelve true si se ha
podido realizar la operación y false en caso contrario.

• Método devolucion(): El usuario ingresa el titulo del libro que quiere devolver y se
lo busca en el conjunto. Si está en el conjunto, se llama con ese objeto al método.
El método decrementa de a uno, como un carrito de compras, el atributo
ejemplares prestados, del libro seleccionado por el usuario. Esto sucederá cada
vez que se produzca la devolución de un libro. No se podrán devolver libros
donde que no tengan ejemplares prestados. Devuelve true si se ha podido
realizar la operación y false en caso contrario.
• Método toString para mostrar los datos de los libros.
 */
package Servicio;

import Entidad.Libro;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class LibroService {
    Set<Libro> conjutoLibros = new HashSet<>();
    Scanner leer = new Scanner(System.in);
    public Libro crearLibro(){
        Libro libro = new Libro();
        System.out.print("Titulo Libro: ");
        libro.setTitulo(leer.nextLine());
        System.out.print("Autor: ");
        libro.setAutor(leer.nextLine());
        System.out.print("Numeros de Ejemplares: ");
        libro.setNumeroEjemplares(leer.nextInt());
        System.out.print("Ejemplares Prestados: ");
        libro.setEjemplaresPrestados(leer.nextInt());
        leer.nextLine();
        
        return libro;
    }
    
    public void cargarLibros(){
        String respuesta="";
        boolean respuestaValida=false;
        
        do{
            conjutoLibros.add(crearLibro());
            System.out.println("Desea cargar otro libro? (S/N)");
            respuesta = leer.nextLine();
            
            if(respuesta.equalsIgnoreCase("s")){
            continue;
            }else if(!respuesta.equalsIgnoreCase("n")){
                do{
                System.out.println("Ingrese un opcion Valida.");
                respuesta = leer.nextLine();
                }while(!respuesta.equalsIgnoreCase("s") && !respuesta.equalsIgnoreCase("n"));
                
            }
                
            

        }while(respuesta.equalsIgnoreCase("s"));
        
        System.out.println("--------------------------------");
        System.out.println("");
    }
    
    public void prestamo(){
        System.out.print("Nombre del Libro:  ");
        String libro = leer.nextLine();
        boolean encontrado = false;
        
        for (Libro busqueda : conjutoLibros) {
            if (busqueda.getTitulo().equalsIgnoreCase(libro)) {
                int disponibles = busqueda.getNumeroEjemplares();
                int prestados = busqueda.getEjemplaresPrestados();
                int diferencia = disponibles - prestados;

                if (diferencia > 0) {
                    System.out.println("Prestamo Exitoso. Retire su libro.");
                    busqueda.setNumeroEjemplares(busqueda.getNumeroEjemplares() - 1);
                    busqueda.setEjemplaresPrestados(busqueda.getEjemplaresPrestados() + 1);
                } else {
                    System.out.println("No se encuentran ejemplares Disponibles.");

                }
                encontrado = true;
                break;
            } 
        }
        
        if(!encontrado){
            System.out.println("No se encontró el libro.");
        }
        
        System.out.println("----------------------------------");
        System.out.println("");
    }
    
    public void devolucion(){
        System.out.print("Titulo Libro: ");
        String devolucion = leer.nextLine();
        boolean encontrado = false;
        
        for(Libro libro: conjutoLibros){
            if(libro.getTitulo().equalsIgnoreCase(devolucion)){
                int prestados = libro.getEjemplaresPrestados();
                
                if(prestados > 0 ){
                    libro.setEjemplaresPrestados(libro.getEjemplaresPrestados()-1);
                    libro.setNumeroEjemplares(libro.getNumeroEjemplares()+1);
                    System.out.println("Devolucion Exitosa. Deposite el libro.");
                }else{
                    System.out.println("No hay ejemplares de ese libro en Prestamo.");
                }
            }
            encontrado = true;
            break;
        }
        
        if(!encontrado){
            System.out.println("No se encontro el Libro.");
        }
        
        System.out.println("----------------------------------");
        System.out.println("");
    }
    
    public void menu(){
        int opcion;
        
        do{
            System.out.println("**** Menu ****");
            System.out.println("1_ Cargar Libros");
            System.out.println("2_ Prestamo Libros");
            System.out.println("3_ Devoluciones");
            System.out.println("4_ Salir");
            System.out.print("Ingrese una opcion: ");
            opcion = leer.nextInt();
            leer.nextLine();
            
            switch(opcion){
                case 1:
                    cargarLibros();
                    break;
                case 2: 
                    prestamo();
                    break;
                case 3: 
                    devolucion();
                    break;
                case 4: 
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Ingrese una opcion Valida!");
                    break;
            }
            
            
        }while(opcion != 4);
    }
    
}
