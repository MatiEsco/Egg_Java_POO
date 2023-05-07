/*

 */

package egg.ejer2_nespresso;
import Entidad.Cafetera;
import Servicio.CafeteraServicio;
import java.util.Scanner;

public class Ejer2_Nespresso {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       Cafetera cafe = new Cafetera();
       CafeteraServicio cafeService = new CafeteraServicio();
       int op;
       do{
           System.out.println("*** Menu ***");
           System.out.println("Nivel de la cafetera --> " + cafe.getCantidadActual());
           System.out.println("1_ Servir Taza.");
           System.out.println("2_ Llenar Cafetera.");
           System.out.println("3_ Agregar Café.");
           System.out.println("4_ Vaciar Cafetera.");
           System.out.println("5_ Salir.");
           op = leer.nextInt();
           
           switch(op){
               case 1:
                   cafeService.servirTaza(cafe);
                   break;

               case 2:
                   cafeService.llenarCafetera(cafe);
                   break;

               case 3:
                   cafeService.agregarCafe(cafe);
                   break;

               case 4:
                   cafeService.vaciarCafetera(cafe);
                   break;

               case 5:
                   System.out.println("Saliendo...");
                   break;

               default:
                   System.out.println("Opcion incorrecta!");
           }
           System.out.println("");
       }while(op!=5);
       
    }
}
