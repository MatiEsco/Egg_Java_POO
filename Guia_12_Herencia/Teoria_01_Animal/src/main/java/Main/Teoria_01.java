/*
Luego, en el main vamos a crear
un ArrayList de animales y los siguientes animales
Animal a = new Animal();
Animal b = new Perro();
Animal c = new Gato();
Agregaremos a la lista a cada uno y luego, con un for each, recorreremos la lista llamando al
método hacerRuido() de cada ítem.
*/
package Main;

import Entidad.*;
import java.util.ArrayList;
import java.util.List;


public class Teoria_01 {

   
    public static void main(String[] args) {
       
        List<Animal> animales = new ArrayList<>();
        
        Animal a = new Animal();
        animales.add(a);
        Animal b = new Perro();
        animales.add(b);
        Animal c = new Gato();
        animales.add(c);
        
        for(Animal animal : animales){
            animal.hacerRuido();
        }
        
        
        
        
    }
    
}
