/*

 */

package egg.ejer4_rectangulo;

import Entidad.Rectangulo;
import java.util.Scanner;
/**
 *
 * @author MatiPC
 */
public class Ejer4_Rectangulo {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Rectangulo rec = new Rectangulo();
        
        
        
        System.out.print("Ingrese Base: ");
        rec.setBase(leer.nextInt());
        System.out.print("Ingrese Altura: ");
        rec.setAltura(leer.nextInt());
        
        System.out.println("Perimetro del Rectangulo: " + rec.perimetro());
        System.out.println("Superficie del Rectangulo: "+ rec.superficie());
        rec.dibujarRec();
        
      
        
    }
}
