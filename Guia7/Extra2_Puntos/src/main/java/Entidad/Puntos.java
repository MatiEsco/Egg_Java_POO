/*
Definir una clase llamada Puntos que contendrá las coordenadas de dos
puntos, sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto.
Generar un objeto puntos usando un método crearPuntos() que le pide al
usuario los dos números y los ingresa en los atributos del objeto.
Después, a través de otro método calcular y devolver la distancia que
existe entre los dos puntos que existen en la clase Puntos. 
 */
package Entidad;

import java.util.Scanner;


public class Puntos {
    
   private double x1;
   private double y1;
   private double x2;
   private double y2;

    public Puntos() {
    }

    public double getX1() {
        return x1;
    }

    public double getY1() {
        return y1;
    }

    public double getX2() {
        return x2;
    }

    public double getY2() {
        return y2;
    }

    

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

   
   
    
   public void crearPuntos(){
       Scanner leer = new Scanner(System.in);
       
       System.out.println("Creando puntos...");
       System.out.println("** Primer Punto **");
       System.out.print("Valor en X: ");
       x1 = leer.nextDouble();
       System.out.print("Valor en Y: ");
       y1 = leer.nextDouble();
       System.out.println();
       System.out.println("** Segundo Punto **");
       System.out.print("Valor en X: ");
       x2 = leer.nextDouble();
       System.out.print("Valor en Y: ");
       y2 = leer.nextDouble();
       
       leer.close();
       
   }
    
   
   public double distancia(){
       return Math.sqrt((Math.pow((x2-x1), 2 ))+ Math.pow((y2-y1),2));
   }
    
    
    
}
