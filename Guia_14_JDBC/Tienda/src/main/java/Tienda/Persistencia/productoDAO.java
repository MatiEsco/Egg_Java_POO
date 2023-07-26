/*
 */
package Tienda.Persistencia;

import Tienda.Entidades.Producto;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author MatiPC
 */
public final class productoDAO extends DAO {
    //Consigna A Lista el nombre de todos los productos que hay en la tabla producto.
    public ArrayList<Producto> listarProductos() throws Exception{ 
        ArrayList<Producto> lista = new ArrayList<>();
        try{
            conectarBase();
        String consulta = "SELECT nombre FROM producto;";
        
        consultarBase(consulta);
        
        Producto prod = null;
        
        while(resultado.next()){
            prod = new Producto();
            
            //prod.setCodigo(resultado.getInt(1));
            prod.setNombre(resultado.getString("nombre"));
            //prod.setPrecio(resultado.getDouble(3));
            //prod.setCodigoFabricante(resultado.getInt(4));
            
            lista.add(prod);
        
        }
        desconectarBase();
        
        return lista;
        
        }catch(Exception e){
            throw e;
        } 
        
        
    }
    
    //b) Lista los nombres y los precios de todos los productos de la tabla producto.
    
    public ArrayList<Producto> nombrePrecioProducto()throws Exception{
        ArrayList<Producto> listaNombrePrecio = new ArrayList<>();
        
        try {
            conectarBase();
            
            String consulta = "SELECT nombre, precio FROM producto;";
            consultarBase(consulta);
            
            Producto prod = null;
            
            while(resultado.next()){
                prod = new Producto();
                
                prod.setNombre(resultado.getString("nombre"));
                prod.setPrecio(resultado.getDouble("precio"));
                
                listaNombrePrecio.add(prod);
            }
            
            desconectarBase();
            return listaNombrePrecio;
            
        } catch (Exception e) {
            throw e;
        }
        
        
        
    }
    
    //c) Listar aquellos productos que su precio esté entre 120 y 202.
    
    public ArrayList<Producto> productosPorPrecio()throws Exception{
        ArrayList<Producto> listaPorPrecio = new ArrayList<>();
        
        try {
            
            conectarBase();
            String consulta = "Select * from producto where precio between 120 and 202;";
            consultarBase(consulta);
            
            Producto prod = null;
             while(resultado.next()){
                prod = new Producto();
                prod.setCodigo(resultado.getInt("codigo"));
                prod.setNombre(resultado.getString("nombre"));
                prod.setPrecio(resultado.getDouble("precio"));
                prod.setCodigoFabricante(resultado.getInt("codigo_fabricante"));
                listaPorPrecio.add(prod);
            }
            
            desconectarBase();
            return listaPorPrecio;
        } catch (Exception e) {
            throw e;
        }
        
        
    }
    
    //d) Buscar y listar todos los Portátiles de la tabla producto.
    
    public ArrayList<Producto> buscarPortatiles()throws Exception{
        ArrayList<Producto> portatiles = new ArrayList<>();
        
        try {
            
            conectarBase();
            String consulta = "Select * from producto where nombre like '%portatil%';";
            consultarBase(consulta);
            
            Producto prod = null;
             while(resultado.next()){
                prod = new Producto();
                prod.setCodigo(resultado.getInt("codigo"));
                prod.setNombre(resultado.getString("nombre"));
                prod.setPrecio(resultado.getDouble("precio"));
                prod.setCodigoFabricante(resultado.getInt("codigo_fabricante"));
                portatiles.add(prod);
            }
            
            desconectarBase();
            return portatiles;
        } catch (Exception e) {
            throw e;
        }
        
        
    }
    
    
    //e) Listar el nombre y el precio del producto más barato.
    
    public Producto productoMasBarato()throws Exception{
        
        
        try {
            conectarBase();
            
            String consulta = "SELECT * FROM producto ORDER BY precio ASC LIMIT 1;";
            consultarBase(consulta);
            
            Producto prod = null;
            
            while(resultado.next()){
                prod = new Producto();
                
                prod.setNombre(resultado.getString("nombre"));
                prod.setPrecio(resultado.getDouble("precio"));
                
            }
            
            desconectarBase();
            return prod;
            
        } catch (Exception e) {
            throw e;
        }
        
        
        
        
    }
    
    
   //f) Ingresar un producto a la base de datos.
    public void guardarProducto(Producto producto)throws Exception{
        try {
            if(producto == null){
                throw new Exception("Debe ingresar un producto");
            }

            String sql = "INSERT INTO producto (codigo,nombre,precio,codigo_fabricante)"
                        + "VALUES( '" + producto.getCodigo() + "', '"+ producto.getNombre() 
                        + "','" + producto.getPrecio() + "' ,'"+ producto.getCodigoFabricante() + "');";
            
            insertarModificarEliminar(sql);
            System.out.println("Producto Ingresado Correctamente \n");
            
        } catch (Exception e) {
            throw e;
        }
        
    }
    
    
    //h) Editar un producto con datos a elección.
    
    public void editarProducto(Producto prod)throws Exception {
        try {
            if (prod == null) {
                throw new Exception("Error al editar el producto");
            }
            String sql = "UPDATE producto set nombre = '" + prod.getNombre()+ "', precio = " + prod.getPrecio()+ ", codigo_fabricante = " + prod.getCodigoFabricante()
                    + " where codigo = " + prod.getCodigo() + " "; 
            insertarModificarEliminar(sql);
            
        }catch (Exception e) {
            desconectarBase();
            throw e;
        } finally {
            desconectarBase();
        }
    }
    
    
    //Buscar por nombre
    
    public Producto buscarNombre(String nombre)throws Exception{
        Producto prod = new Producto();
        String consulta = "SELECT * " + "FROM producto WHERE nombre LIKE '%"+ nombre +"%';";
        try {
            consultarBase(consulta);
            resultado.next();
            
            prod.setCodigo(resultado.getInt("codigo"));
            prod.setNombre(resultado.getString("nombre"));
            prod.setPrecio(resultado.getDouble("precio"));
            prod.setCodigoFabricante(resultado.getInt("codigo_fabricante"));
            
            desconectarBase();
            return prod;
            
        } catch (Exception e) {
            throw e;
        }
        
        
    }
}
