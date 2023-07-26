/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tienda.Servicios;

import Tienda.Entidades.Fabricante;
import Tienda.Persistencia.fabricanteDAO;
import java.util.Scanner;

/**
 *
 * @author MatiPC
 */
public class FabricanteService {
    Scanner leer = new Scanner(System.in);
    private fabricanteDAO dao;

    public FabricanteService(){
        this.dao = new fabricanteDAO();
    }
    
    
    public void ingresarFabricante() throws Exception{
        Fabricante fab = new Fabricante();
        
        System.out.print("Nombre Fabricante: ");
        fab.setNombre(leer.nextLine());
        
        try {
            dao.ingresarFabricante(fab);
            System.out.println("Fabricante Agregado Correctamente \n");
        } catch (Exception e) {
            throw e;
        }
        
        
    }
    
    
}
