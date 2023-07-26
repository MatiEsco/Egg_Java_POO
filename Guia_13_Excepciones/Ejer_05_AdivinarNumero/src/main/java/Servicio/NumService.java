/*
Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
carácter fallido como un intento.
 */
package Servicio;
import Entidad.Numero;
import java.util.Scanner;

public class NumService {
    Scanner leer = new Scanner(System.in);
    Numero num = new Numero();
    private int intentos = 0;
    private int entrada;
    
    public void ingresarNumero(){
        
        try{
           
            System.out.print("Numero: ");
            entrada = leer.nextInt();
            
        }catch(Exception e){
            System.out.println("El dato ingresado no es un numero! " + e.getClass().getSimpleName());
            contarIntento();
            
        }finally{
            leer.nextLine();
        }
        
    }
    
    public void contarIntento(){
        intentos++;
    }
    
    public boolean comprobar(){
        if(entrada < num.getNumero()){
            System.out.println("Ingrese un numero mayor");
            contarIntento();
            
        }else if(entrada > num.getNumero()){
            System.out.println("Ingrese un numero menor");
            contarIntento();
            
        }else{
            System.out.println("ADIVINÓ!");
            return true;
        }
        
        return false;
    }
    
    public void juego(){
        System.out.println("Intente adivinar el numero!");
        do{
            ingresarNumero();
            
            if(!comprobar()){
                System.out.println("Intenta de nuevo..");
            }
            
        }while(entrada!= num.getNumero());
        
        System.out.println("Numero de intentos: " + intentos);
    }
    
}
