/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package egg.ejer_01_animal;
import Entidad.*;

public class Ejer_01_Animal {

    public static void main(String[] args) {
        
        Animal perro = new Perro("Negra","Balanceado",3,"Callejera");
        perro.seAlimenta();
        
        Animal caballo = new Caballo("Tornado","Pasto",7,"Obero");
        caballo.seAlimenta();
        
    }
}
