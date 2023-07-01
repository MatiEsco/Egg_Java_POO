/*
 Finalmente, en el main debemos realizar lo siguiente:
Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar
el precio final de los dos electrodomésticos.
 */

package egg.ejer_02_electrodomestico;
import Entidad.*;

public class Ejer_02_Electrodomestico {

    public static void main(String[] args) {
        Lavadora lavadora = new Lavadora();
        lavadora.crearLavadora();
        System.out.printf("Precio Lavadora: $%.2f%n", lavadora.precioFinal());
        System.out.println(lavadora);
        
        
        
//        Televisor tv = new Televisor();
//        tv.crearTelevisor();
//        
//        System.out.printf("Precio TV: $%.2f%n", tv.precioFinal());
        
    }
}
