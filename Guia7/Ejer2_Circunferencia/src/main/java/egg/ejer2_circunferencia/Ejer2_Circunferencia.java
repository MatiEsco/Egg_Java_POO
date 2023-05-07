

package egg.ejer2_circunferencia;

import Entidad.Circunferencia;


public class Ejer2_Circunferencia {

    public static void main(String[] args) {
        Circunferencia circunferencia = new Circunferencia();
        
        circunferencia.crearCircunferencia();
        
        System.out.printf("Area --> %.2f\n" , circunferencia.area());
        System.out.printf("Perimetro --> %.2f\n" , circunferencia.perimetro());
    }
}
