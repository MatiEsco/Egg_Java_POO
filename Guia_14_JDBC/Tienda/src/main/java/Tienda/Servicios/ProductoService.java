
package Tienda.Servicios;

import Tienda.Entidades.Producto;
import Tienda.Persistencia.productoDAO;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

/**
 *
 * @author MatiPC
 */
public class ProductoService {
    Scanner leer = new Scanner(System.in);
    private productoDAO dao;

    public ProductoService(){
        this.dao = new productoDAO();
    }
    
    public ArrayList<Producto> listarProductos()throws Exception{
        
        try {
            
            return dao.listarProductos();
            
            
        } catch (Exception e) {
            throw e;
        }
        
    }
    
    
    public ArrayList<Producto> nombrePrecioProd()throws Exception{
        try {
            return dao.nombrePrecioProducto();
        } catch (Exception e) {
            throw e;
        }
        
    }
     
    
    public ArrayList<Producto> productosPorPrecio()throws Exception{
        try {
            return dao.productosPorPrecio();
        } catch (Exception e) {
            throw e;
        }
        
    }
    
    public ArrayList<Producto> buscarPortatil()throws Exception{
        
        try {
            return dao.buscarPortatiles();
        } catch (Exception e) {
            throw e;
        }
        
    }
    
    
    public Producto productoMasBarato()throws Exception{
        
        try {
            return dao.productoMasBarato();
        } catch (Exception e) {
            throw e;
        }
    }
    
    
    public void guardarProducto()throws Exception{
        Producto prod = new Producto();
        
        System.out.println("Ingrese datos del producto");
        System.out.print("Nombre: ");
        prod.setNombre(leer.nextLine());
        System.out.print("Precio: ");
        prod.setPrecio(leer.nextDouble()); leer.nextLine();
        System.out.print("Codigo Fabricante: ");
        prod.setCodigoFabricante(leer.nextInt());
        leer.nextLine();
        
        
        try {
            dao.guardarProducto(prod);
        } catch (Exception e) {
            throw e;
        }
        
        
    }
    
    
    public void editarProducto()throws Exception{
        Producto productoEditar = new Producto();
        Producto prod_Editado = new Producto();
        
        System.out.print("Nombre del Producto: ");
        String nombre = leer.nextLine();
        
        try {
            productoEditar = dao.buscarNombre(nombre);
            System.out.println("Editando datos de " + productoEditar);
            int op;
            
            do {
                System.out.println("Que opcion quiere Editar?: ");
                System.out.println("1_ Nombre");
                System.out.println("2_ Precio");
                System.out.println("3_ Codigo Fabricante");
                System.out.println("4 _ Cancelar");
                op = leer.nextInt();

                switch (op) {
                    case 1:
                        guardarProducto();
                        break;

                    case 2:
                        double precioNuevo;
                        System.out.println("Precio Nuevo: ");
                        precioNuevo = leer.nextDouble();
                        leer.nextLine();

                        prod_Editado.setCodigo(productoEditar.getCodigo());
                        prod_Editado.setNombre(productoEditar.getNombre());
                        prod_Editado.setPrecio(precioNuevo);
                        prod_Editado.setCodigoFabricante(productoEditar.getCodigoFabricante());

                        dao.editarProducto(prod_Editado);
                        System.out.println("Nuevo Precio Guardado");
                        break;

                    case 3:
                        int codigoNuevo;
                        System.out.println("Codigo Fabricante: ");
                        codigoNuevo = leer.nextInt();
                        leer.nextLine();

                        prod_Editado.setCodigo(productoEditar.getCodigo());
                        prod_Editado.setNombre(productoEditar.getNombre());
                        prod_Editado.setPrecio(productoEditar.getPrecio());
                        prod_Editado.setCodigoFabricante(codigoNuevo);

                        dao.editarProducto(prod_Editado);
                        System.out.println("Nuevo Codigo Fabricante Guardado");
                        break;

                    case 4:
                        System.out.println("Cancelado \n");
                        leer.nextLine();
                        break;

                    default:
                        System.out.println("Opcion invalida");

                }

            } while (op != 4);
            
        } catch (Exception e) {
            throw e;
        }
        
        
        
    }
    
    
    
}
