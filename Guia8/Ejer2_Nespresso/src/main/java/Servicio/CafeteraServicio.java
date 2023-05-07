/*
Crear clase CafeteraServicio en el paquete Servicios con los siguiente:
Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño de la taza 
y simula la acción de servir la taza con la capacidad indicada. Si la cantidad actual de café “no alcanza” 
para llenar la taza, se sirve lo que quede. El método le informará al usuario si se llenó o no la taza, 
y de no haberse llenado en cuanto quedó la taza.
Método vaciarCafetera(): pone la cantidad de café actual en cero. 
Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo recibe 
y se añade a la cafetera la cantidad de café indicada.

 */
package Servicio;
import Entidad.Cafetera;
import java.util.Scanner;

public class CafeteraServicio {
    Scanner leer = new Scanner(System.in);
    public void llenarCafetera(Cafetera cafe){
        
        System.out.println("Llenando Cafetera....");
        cafe.setCantidadActual(cafe.getCapacidadMaxima());
        System.out.println("Cafetera llena , nivel actual:  " + cafe.getCantidadActual());
    }
    
    public void servirTaza(Cafetera cafe){
        int disponible = cafe.getCantidadActual();
        
        System.out.print("Ingrese tamaño de la taza: ");
        int cantidadTaza = leer.nextInt();
        
        if(disponible == 0){
            System.out.println("Cafetera Vacia!");
        }else if(cantidadTaza > disponible){
            System.out.println("Sirviendo café...");
            System.out.println("NO se llenó la taza");
            System.out.println("La taza quedo en " + (disponible)+" ml");
            //vacia cafetera
            vaciarCafetera(cafe);
        }else{
            System.out.println("Sirviendo café...");
            disponible -= cantidadTaza;
            cafe.setCantidadActual(disponible);
            System.out.println("Se llenó la taza...");
           
        }
        
        
        
    }
    
    public void vaciarCafetera(Cafetera cafe){
        cafe.setCantidadActual(0);
        System.out.println("Cafetera vacia");
    }
    
    public void agregarCafe(Cafetera cafe){
        System.out.println("Capacidad Maxima --> " + cafe.getCapacidadMaxima());
        System.out.print("Cantidad de café para agregar: ");
        int cantidad = leer.nextInt();
        
        if((cafe.getCantidadActual()+cantidad)> cafe.getCapacidadMaxima()){
            System.out.println("Sobrepasa el limite de la Cafetera!!");
        }else{
            cafe.setCantidadActual(cafe.getCantidadActual()+cantidad);
            System.out.println("Agregando café...");
        }
    }
    
}
