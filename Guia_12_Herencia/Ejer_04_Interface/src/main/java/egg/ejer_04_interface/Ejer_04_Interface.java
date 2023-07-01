/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package egg.ejer_04_interface;
import Entidad.*;
import Interfaces.calculosFormas;

public class Ejer_04_Interface {

    public static void main(String[] args) {
       Circulo circulo = new Circulo(3,6);
       Rectangulo rectangulo = new Rectangulo(2,4);
       
       circulo.calcularArea();
       circulo.calcularPerimetro();
       
       rectangulo.calcularArea();
       rectangulo.calcularPerimetro();
        
        
    }
}
