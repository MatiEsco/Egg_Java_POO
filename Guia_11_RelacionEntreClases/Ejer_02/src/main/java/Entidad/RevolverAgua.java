/*
 Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición
del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del
tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.
Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)
 */
package Entidad;

import java.util.Random;

public class RevolverAgua {
    Random random = new Random();
    
    private int posicionActual;
    private int posicionAgua;
    
    public void llenarRevolver(){
        posicionActual = random.nextInt(6)+1; // Para generar un numero aleatorio entre 0 y 5//
        posicionAgua = random.nextInt(6)+1;
    }
    
    public boolean mojar(){
        return posicionActual == posicionAgua;
    }
    
    public void siguienteChorro(){
        posicionActual = (posicionActual+1)%6; // Al ser 6 posiciones, del 0 al 5, con el mod me aseguro que cuando llegue
                                               // a la posicion 6 se reinicie a 0.
    }

    @Override
    public String toString() {
        return "Posicion Actual = " + posicionActual+ "\n" + 
                "Posicion Agua = " + posicionAgua;
    }
    
   
}
