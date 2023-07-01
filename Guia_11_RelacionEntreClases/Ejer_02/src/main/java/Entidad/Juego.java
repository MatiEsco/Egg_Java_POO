/*
esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
Revolver
Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.

• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
 */
package Entidad;

import java.util.ArrayList;

public class Juego {
    ArrayList<Jugador> jugadores;
    RevolverAgua revolver;
    
    public void llenarJuego(ArrayList<Jugador> jugadores, RevolverAgua r){
        this.jugadores = jugadores;
        revolver = r;
        
    }
    
    public void ronda(){
        int cantidadJugadores = jugadores.size();
        int indice = 0;
        
        while(true){
            Jugador jugadorActual = jugadores.get(indice);
            boolean mojado = jugadorActual.disparo(revolver);
            
            if(mojado){
                System.out.println("Se ha mojado!! " + jugadorActual.getNombre() + ":(");
                break;
            }
            
            indice = (indice+1) % cantidadJugadores;
        }
        
    }
    
    
}
