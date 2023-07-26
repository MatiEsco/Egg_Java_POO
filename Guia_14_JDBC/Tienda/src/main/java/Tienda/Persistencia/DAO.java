/*

 */
package Tienda.Persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author MatiPC
 */
public abstract class DAO {
    
    protected Connection conexion = null;
    protected ResultSet resultado = null;
    protected Statement sentencia = null;
    
    private final String USER = "root";
    private final String PASSWORD = "root";
    private final String DATABASE = "tienda";
    private final String DRIVER = "com.mysql.cj.jdbc.Driver";
    
    protected void conectarBase() throws ClassNotFoundException, SQLException{
        
        try {
            Class.forName(DRIVER);
            String urlBaseDatos = "jdbc:mysql://localhost:3306/" + DATABASE + "?useSSL=false";
            
            conexion = DriverManager.getConnection(urlBaseDatos, USER, PASSWORD);
            
            
            
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        }
        
    }
    
    protected void desconectarBase()throws Exception{
        
        try {
            if (resultado != null) {
                resultado.close();
            }
            
            if (sentencia != null) {
                sentencia.close();
            }
            
            if (conexion != null) {
                conexion.close();
            }
            
        } catch (Exception e) {
            throw e;
        }
        
    }
    
    protected void insertarModificarEliminar(String sql)throws Exception{
        
        try {
            conectarBase();
            sentencia = conexion.createStatement();
            sentencia.executeUpdate(sql);
            
            
        } catch (SQLException | ClassNotFoundException e) {
            // conexion.rollback();
            /*
                Descomentar la linea anterior si desean tener en cuenta
                Correr el siguiente Script en WorkBench
            
            
                SET autocommit = 1;
                COMMIT;
            
                **Sin rollback igual anda
            */
            
            
            
            throw e;
        }finally{
            desconectarBase();
        }
        
    }
    
    protected void consultarBase(String consulta)throws Exception {
        
        try {
            conectarBase();
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(consulta);
            
        } catch (Exception e) {
            throw e;
        }
        
    }
}
