/*
Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición
y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho
esto, desde el main recorreremos el equipo mostrando la información de cada jugador.
 */
package Entidad;

import java.util.ArrayList;


public class Equipo {
    private ArrayList<Jugador> listaJugadores;

    public Equipo() {
    }

    public Equipo(ArrayList<Jugador> listaJugadores) {
        this.listaJugadores = listaJugadores;
    }

    public ArrayList<Jugador> getListaJugadores() {
        return listaJugadores;
    }

    public void setListaJugadores(ArrayList<Jugador> listaJugadores) {
        this.listaJugadores = listaJugadores;
    }

    @Override
    public String toString() {
        return "Equipo{" + "listaJugadores=" + listaJugadores + '}';
    }
    
    
}
