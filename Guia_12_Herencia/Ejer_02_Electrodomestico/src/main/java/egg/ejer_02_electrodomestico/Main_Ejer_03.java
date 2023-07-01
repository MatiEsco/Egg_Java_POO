/*
Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos
para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se
deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los
televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del
precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de
2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
electrodomésticos, 2000 para lavadora y 5000 para televisor.
 */
package egg.ejer_02_electrodomestico;

import java.util.ArrayList;
import java.util.List;
import Entidad.*;

public class Main_Ejer_03 {

    
    public static void main(String[] args) {
        List<Electrodomestico> electrodomesticos = new ArrayList<>(); 
        
        Televisor tv1 = new Televisor(43,true,1000,"negro",'A',10);
        Televisor tv2 = new Televisor(43,true,1000,"negro",'F',10);
        Televisor tv3 = new Televisor(32,true,1000,"blanco",'A',5.5);
        electrodomesticos.add(tv1);
        electrodomesticos.add(tv2);
        electrodomesticos.add(tv3);
        
        Lavadora lavadora1 = new Lavadora(8,1000,"negro",'A',55);
        Lavadora lavadora2 = new Lavadora(8,1000,"negro",'F',55);
        Lavadora lavadora3 = new Lavadora(32,1000,"negro",'A',80);
        electrodomesticos.add(lavadora1);
        electrodomesticos.add(lavadora2);
        electrodomesticos.add(lavadora3);
        
        double total = 0;
        for (Electrodomestico electrodomestico : electrodomesticos) {
            if(electrodomestico instanceof Televisor){
                System.out.println("-- Televisor --");
                
            }else{
                System.out.println("-- Lavadora --");
                
            }
            System.out.printf("Precio: $%.2f%n", electrodomestico.precioFinal());
            total += electrodomestico.precioFinal();
        }
        
        
        
        System.out.println("Total: " + total);
    }
    
}
