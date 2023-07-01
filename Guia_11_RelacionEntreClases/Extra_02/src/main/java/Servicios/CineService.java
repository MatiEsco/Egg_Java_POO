/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;
import Entidades.*;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class CineService {
  
    public void ubicarEspectadores(Cine cine, List<Espectador> espectadores) {
        Sala sala = cine.getSala();
        Collections.shuffle(espectadores); // Mezclar la lista de espectadores de manera aleatoria
        Random random = new Random();

        for (Espectador espectador : espectadores) {
            if (cumpleCondiciones(espectador, cine.getPelicula())) {
                Asiento asientoDisponible = buscarAsientoDisponible(sala);
                if (asientoDisponible != null) {
                    asientoDisponible.setEspectador(espectador);
                    System.out.println(espectador.getNombre() + " se ha ubicado en el asiento " + asientoDisponible.getNumero()+asientoDisponible.getLetra());
                } else {
                    System.out.println(espectador.getNombre() + " no pudo ser ubicado. No hay asientos disponibles.");
                }
            } else {
                System.out.println(espectador.getNombre() + " no cumple las condiciones para ver la película.");
            }

            // Agregar una pausa aleatoria después de ubicar cada espectador
            try {
                Thread.sleep(random.nextInt(1000) + 500); // Pausa de 500 a 1500 milisegundos
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private boolean cumpleCondiciones(Espectador espectador, Pelicula pelicula) {
        return espectador.getEdad() >= pelicula.getEdadMinima() && espectador.getDineroDisponible() >= 10.0;
    }

    private Asiento buscarAsientoDisponible(Sala sala) {
        Asiento[][] asientos = sala.getSala();
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                Asiento asiento = asientos[i][j];
                if (asiento.getEspectador() == null) {
                    return asiento;
                }
            }
        }
        return null; // No se encontraron asientos disponibles
    }
}
    

