/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.Random;

/**
 *
 * @author MatiPC
 */
public class Bota {
    
    private double consumo;
   
    public Bota(double consumo){
        this.consumo = consumo;
    }


    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }
    
    
    public double usar(double tiempo){
        return tiempo * consumo;
    }
    
    
}
