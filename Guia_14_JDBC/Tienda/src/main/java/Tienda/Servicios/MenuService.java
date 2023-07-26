/*
Realizar un menú en Java a través del cual se permita elegir qué consulta se desea realizar.
Las consultas a realizar sobre la BD son las siguientes:
a) Lista el nombre de todos los productos que hay en la tabla producto.
b) Lista los nombres y los precios de todos los productos de la tabla producto.
c) Listar aquellos productos que su precio esté entre 120 y 202.
d) Buscar y listar todos los Portátiles de la tabla producto.
e) Listar el nombre y el precio del producto más barato.
f) Ingresar un producto a la base de datos.
g) Ingresar un fabricante a la base de datos
h) Editar un producto con datos a elección.
*/
package Tienda.Servicios;

import Tienda.Entidades.Producto;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuService {
    Scanner leer = new Scanner(System.in);
    private ProductoService ps;
    private FabricanteService fs;
    
    public MenuService(){
        this.ps = new ProductoService();
        this.fs = new FabricanteService();
    }
    
    
   public void menu() throws Exception{  
       int op = 0;
       do {

           System.out.println("***** Menu *****");
           System.out.println("1_ Listar el Nombre de todos los Productos");
           System.out.println("2_ Listar Nombres y Precios de Productos");
           System.out.println("3_ Productos con su precio entre 120 y 202");
           System.out.println("4_ Listar todos los Portatiles");
           System.out.println("5_ Producto mas Barato");
           System.out.println("6_ Ingresar un Producto a la Base de Datos");
           System.out.println("7_ Ingresar un Fabricante a la Base de Datos");
           System.out.println("8_ Editar un Producto con datos a eleccion");
           System.out.println("9_ Salir");
           op = leer.nextInt();
           leer.nextLine();

           switch(op){
               case 1:  ArrayList<Producto> listaNombres = new ArrayList<>();
                        listaNombres = ps.listarProductos();
                        int cont = 0;
                        System.out.println("------ Lista de Productos -----");
                        for (Producto prod : listaNombres) {
                            System.out.println(" Nombre: " + prod.getNombre());
                            cont++;
                        }
                        System.out.println("");
                        System.out.println("Cantidad de Productos: " + cont + "\n");
                        break;
                        
                
               case 2:  ArrayList<Producto> listaNombresyPrecios = new ArrayList<>();
                        listaNombresyPrecios = ps.nombrePrecioProd();
                        int cont2 = 0;
                        System.out.println("------ Lista de Productos por Nombre y Precio -----");
                        for (Producto prod : listaNombresyPrecios) {
                            System.out.println(" Nombre: " + prod.getNombre() + "  Precio: $" + prod.getPrecio());
                            cont2++;
                        }
                        System.out.println("");
                        System.out.println("Cantidad de Productos: " + cont2+ "\n");
                        break;
                        
               case 3: 
                        ArrayList<Producto> rangoPrecio = new ArrayList<>();
                        rangoPrecio = ps.productosPorPrecio();
                        int cont3 = 0;
                        System.out.println("------ Lista de Productos con Precio entre 120 y 202 -----");
                        for (Producto prod : rangoPrecio) {
                            System.out.println(" Nombre: " + prod.getNombre() + "  Precio: $" + prod.getPrecio());
                            cont3++;
                        }
                        System.out.println("");
                        System.out.println("Cantidad de Productos: " + cont3+ "\n");
                        break;
                        
                        
               case 4:
                        ArrayList<Producto> listaPortatiles = new ArrayList<>();
                        listaPortatiles = ps.buscarPortatil();
                        int cont4 = 0;
                        System.out.println("------ Portatiles -----");
                        for (Producto prod : listaPortatiles) {
                            System.out.println("Codigo: " + prod.getCodigo() + "  Nombre: " + prod.getNombre() + "  Precio: " + prod.getPrecio()+
                                    "  Codigo Fabricante: " + prod.getCodigoFabricante());
                            cont4++;
                        }
                        System.out.println("");
                        System.out.println("Cantidad de Productos: " + cont4+ "\n");
                        break;
                        
               case 5: 
                        Producto prod_barato = new Producto();
                        prod_barato = ps.productoMasBarato();
                        
                        System.out.println("Nombre: " + prod_barato.getNombre() + "  Precio: " + prod_barato.getPrecio());
                        break;
                        
               case 6: 
                        ps.guardarProducto();
                        break;
                        
               case 7: 
                        fs.ingresarFabricante();
                        break;
                        
               case 8: 
                        ps.editarProducto();
                        break;
                        
               case 9: System.out.println("Saliendo..");
               break;
               
               default: System.out.println("Ingrese una opcion valida");
                        
            }
           
           
       } while (op != 9);
    
    

   }   
    
}
