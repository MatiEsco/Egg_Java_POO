/*
Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición
y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho
esto, desde el main recorreremos el equipo mostrando la información de cada jugador.
 */

package egg.teoria_02;
import Entidad.Equipo;
import Entidad.Jugador;
import java.util.ArrayList;

public class Teoria_02 {

    public static void main(String[] args) {
        Jugador jugador = new  Jugador();
        Jugador jugador1 = new  Jugador();
        
        jugador.setNombre("Gaston");
        jugador.setApellido("Martin");
        jugador.setPosicion("Lateral");
        jugador.setNumero(4);
        
        jugador1.setNombre("Matias");
        jugador1.setApellido("Escobar");
        jugador1.setPosicion("Lateral");
        jugador1.setNumero(3);
        
        
        ArrayList<Jugador> lista = new ArrayList<>();
        
        lista.add(jugador);
        lista.add(jugador1);
        
        Equipo equipo = new Equipo();
        
        equipo.setListaJugadores(lista);
        
        System.out.println(lista);
        
    }
}
