/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tienda.Persistencia;

import Tienda.Entidades.Fabricante;

/**
 *
 * @author MatiPC
 */
public final class fabricanteDAO extends DAO {

    //g) Ingresar un fabricante a la base de datos
    
    public void ingresarFabricante(Fabricante fabricante)throws Exception{
        try {
            if(fabricante == null){
                throw new Exception("Debe ingresar un Fabricante");
            }

            String sql = "INSERT INTO fabricante(nombre)" 
                    + "VALUES('" + fabricante.getCodigo() + "');";
            
            insertarModificarEliminar(sql);
            
        } catch (Exception e) {
            throw e;
        }
        
    }
    
    
}
