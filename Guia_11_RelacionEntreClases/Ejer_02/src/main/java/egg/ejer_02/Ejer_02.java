/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package egg.ejer_02;

import Entidad.*;
import java.util.ArrayList;


public class Ejer_02 {

    public static void main(String[] args) {
        ArrayList<Jugador> jugadores = new ArrayList<>();
        
        jugadores.add(new Jugador(1,"Jugador",false));
        jugadores.add(new Jugador(2,"Jugador",false));
        jugadores.add(new Jugador(3,"Jugador",false));
        jugadores.add(new Jugador(4,"Jugador",false));
        jugadores.add(new Jugador(5,"Jugador",false));
        jugadores.add(new Jugador(6,"Jugador",false));
        
        RevolverAgua revolver = new RevolverAgua();
        revolver.llenarRevolver();
        
        // Una vez que tengo creado los jugadores y el revolver lleno, creo el juego.
        
        Juego juego = new Juego();
        
        juego.llenarJuego(jugadores, revolver);
        
        juego.ronda();
      
    }
}
