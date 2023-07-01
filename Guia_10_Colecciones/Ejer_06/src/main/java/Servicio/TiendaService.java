/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos 
productos que venderemos y el precio que tendrán. Además, se necesita que la 
aplicación cuente con las funciones básicas. 
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio, 
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar 
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio. 
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package Servicio;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class TiendaService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Map<String, Double> productos = new HashMap();
    
    public void introducirElemento(String nombre, Double precio){
        productos.put(nombre,precio);
        System.out.println("Producto Agregado correctamente!");
        System.out.println("--------------------------------");
    }
    
    
    public void modificarPrecio(String nombre, Double nuevoPrecio){
        if(productos.containsKey(nombre)){
            productos.put(nombre, nuevoPrecio);
            System.out.println("Precio modificado! ");
            System.out.println("-------------------");
        }else{
            System.out.println("Producto no encontrado. No existe.");
        }
        
    }
    
    public void eliminarProducto(String nombre){
        if(productos.containsKey(nombre)){
            productos.remove(nombre);
            System.out.println("Producto Eliminado Correctamente");
            System.out.println("------------------------------");
        }else{
            System.out.println("No se encontró el producto.");
        }
    }
    
    public void mostrarProductos(){
        //Primero verificamos que el hashmap no este vacio
        
        if(productos.isEmpty()){
            System.out.println("No hay productos!");
            System.out.println("------------------");
        }else{
            System.out.println("Mostrando Productos Disponibles...");
            for (Map.Entry<String, Double> produc : productos.entrySet()) {
                System.out.println(produc.getKey()+ " Precio: " + produc.getValue());
            }
            System.out.println("-------------------------------------");
        }
    }
    
    
    public void menu() {
        int opcion;
        do {
            System.out.println("***** MENÚ *****");
            System.out.println("1. Agregar producto");
            System.out.println("2. Modificar precio de un producto");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Mostrar productos");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = leer.nextInt();
            leer.nextLine();
           
            switch (opcion) {
                case 1:
                    System.out.print("Nombre Producto: ");
                    String nombre = leer.nextLine();
                    System.out.print("Precio: ");
                    Double precio = leer.nextDouble();
                    introducirElemento(nombre, precio);
                    break;

                case 2:
                    System.out.print("Nombre producto: ");
                    String modificar = leer.nextLine();
                    System.out.print("Nuevo precio: ");
                    Double nuevoPrecio = leer.nextDouble();
                    modificarPrecio(modificar, nuevoPrecio);
                    break;

                case 3:
                    System.out.print("Producto a Eliminar: ");
                    String eliminar = leer.nextLine();
                    eliminarProducto(eliminar);
                    break;

                case 4:
                    mostrarProductos();
                    break;

                case 5:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opcion invalida!. Intente nuevamente");
                    break;
            }

        } while (opcion != 5);

    }
}