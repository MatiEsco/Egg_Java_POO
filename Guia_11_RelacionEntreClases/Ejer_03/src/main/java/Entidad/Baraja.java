/*
La baraja estará
compuesta por un conjunto de cartas, 40 exactamente.
 */
package Entidad;

import java.util.ArrayList;

public class Baraja {
    private ArrayList<Carta> baraja;

    public Baraja() {
    }
    
    

    public Baraja(ArrayList<Carta> baraja) {
        this.baraja = baraja;
        
    }

    public ArrayList<Carta> getBaraja() {
        return baraja;
    }

    public void setBaraja(ArrayList<Carta> baraja) {
        this.baraja = baraja;
    }

    @Override
    public String toString() {
        return "Baraja{" + "baraja=" + baraja + '}';
    }
    
    
    
}
