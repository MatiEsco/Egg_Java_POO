/*
 Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".
Luego, crea un método "retirar_dinero" que permita retirar una cantidad 
de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea 
negativo después de realizar una transacción de retiro.

 */
package Entidad;
import java.math.BigDecimal;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author MatiPC
 */
public class Cuenta {
    
    private BigDecimal saldo;
    private String titular;

    public Cuenta() {
    //Constructor Vacio
    }
    
    public void setTitular(String titular){
        this.titular=titular;
    }

    public void setSaldo() {
        Random ran = new Random();
        
        this.saldo = BigDecimal.valueOf(ran.nextDouble(50000));
    }
    
    
    public void retirar_dinero(){
        Scanner leer = new Scanner(System.in);
        //setSaldo();
        
        BigDecimal monto;
        
        System.out.print("Ingrese monto a retirar: ");
        monto = BigDecimal.valueOf(leer.nextDouble());
        
        if(monto.compareTo(BigDecimal.ZERO)<0 || monto.compareTo(saldo)>0){
           System.out.println("No se puede realizar la operacion..");
        }else{
            
            saldo = saldo.subtract(monto);
            System.out.println("Extraccion Exitosa..");
            System.out.println("Saldo --> " + saldo.setScale(2, BigDecimal.ROUND_HALF_UP));
        }
         
    
        
        System.out.println();
    }
    
   public void menu(){
       Scanner leer = new Scanner(System.in);
       System.out.println();
       System.out.println("Bienvenido " + this.titular);
       int op; 
       do{
           System.out.println("");
           System.out.println("**** MENU ****");
           System.out.println("1_ Consultar Saldo.");
           System.out.println("2_ Extraer.");
           System.out.println("3_ Salir.");
       
           op = leer.nextInt();
           
       switch(op){
           case 1: System.out.printf("Su saldo es --> %.2f\n", saldo);
           break;
           case 2: opcionRetiro();
           break;
           default: 
               if(op!=3){
               System.out.println("Ingrese una opcion valida");
                    op=0;
               }
       }
       
      }while(op != 3);
       
   }
   
   public void opcionRetiro(){
       Scanner leer = new Scanner(System.in);
       System.out.println("1_ Extraer todo");
       System.out.println("2_ Ingrear un monto");
       
       int ret = leer.nextInt();
       
       switch(ret){
           case 1: 
               saldo = saldo.subtract(saldo);
               
               System.out.println("Saldo --> " + saldo.setScale(2, BigDecimal.ROUND_HALF_UP));
               break;
               
           case 2: retirar_dinero();
           break;
           
           default: menu();
       }
       
       
   }

    
}
