/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Espectador;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class EspectadorService {
    
    public List<Espectador> generarListaEspectadores(int cantidad) {
        List<Espectador> listaEspectadores = new ArrayList<>();
        Random random = new Random();
        
        for (int i = 0; i < cantidad; i++) {
            String nombre = "Espectador " + (i+1);
            int edad = random.nextInt(101); // Genera un número aleatorio entre 0 y 100 para la edad
            double dineroDisponible = 10 + random.nextDouble() * 90; // Genera un número aleatorio entre 10 y 100 para el dinero disponible
            
            Espectador espectador = new Espectador(nombre, edad, dineroDisponible);
            listaEspectadores.add(espectador);
        }
        
        return listaEspectadores;
    }
    
    
}
