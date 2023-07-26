/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.Random;


public class Numero {
    private int numero;
    Random rand = new Random();

    public Numero() {
        this.numero = rand.nextInt(500)+1;
    }

    public int getNumero() {
        return numero;
    }

   
    
    
}
