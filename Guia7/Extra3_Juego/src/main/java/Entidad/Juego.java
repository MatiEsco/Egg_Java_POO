/*
Crea una clase "Juego" que tenga un método "iniciar_juego" que permita
a dos jugadores jugar un juego de adivinanza de números. El primer
jugador elige un número y el segundo jugador intenta adivinarlo. El
segundo jugador tiene un número limitado de intentos y recibe una pista
de "más alto" o "más bajo" después de cada intento. El juego termina
cuando el segundo jugador adivina el número o se queda sin intentos.
Registra el número de intentos necesarios para adivinar el número y el
número de veces que cada jugador ha ganado.

 */
package Entidad;

import java.util.Scanner;


public class Juego {
    private int numero;

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }
    
   public void iniciar_juego(){
       Scanner leer = new Scanner(System.in);
       int numero, numero2, intento;
       System.out.print("Ingrese un numero: ");
       numero = leer.nextInt();
       System.out.println("Cantidad de intentos --> 3");
       System.out.print("Adivine el numero: ");
       numero2= leer.nextInt();
       
       intento =1;
       
       while(intento < 3 && numero != numero2){
           if(numero != numero2){
               if(numero2 < numero){
                   System.out.println("Mas alto!");
                  
               }else if(numero2 > numero){
                   System.out.println("Mas bajo!");
                   
               }
           }
           intento++;
           System.out.print("Adivine el numero: ");
           numero2 = leer.nextInt();
           
       }
       
       
       
       System.out.println("Intentos Realizados: " + intento);
       
       if(intento == 3 && numero == numero2){
           System.out.println("Ganaste!!");
       }else if(intento == 3){
           System.out.println("Perdiste :( ");
           System.out.println("El numero era --> "+ numero);
       }else{
           System.out.println("Ganaste!!");
       }
   }
    
    
}
