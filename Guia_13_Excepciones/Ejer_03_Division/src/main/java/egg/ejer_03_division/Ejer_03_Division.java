/*
Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
una división con los dos numeros y mostrar el resultado.
 */

package egg.ejer_03_division;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author MatiPC
 */
public class Ejer_03_Division {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       
        int num3;
        
        String var1, var2;
         try{
        System.out.println("Ingrese dos numeros");
        System.out.print("Num1: "); var1 = leer.next();
        System.out.print("Num2: "); var2 = leer.next();
        System.out.print("Num3: "); num3 = leer.nextInt();
        
       
           int num1= Integer.parseInt(var1);
           int num2= Integer.parseInt(var2);
            
             System.out.println("Resultado: "+dividir(num1,num2));
            
        }catch (InputMismatchException e) {
            System.out.println("Asegúrese de ingresar un valor numérico."+ e.getClass().getSimpleName());
        }catch(NumberFormatException e){
            System.out.println("Unos de los dos numeros no corresponde a un numero");
        }catch(ArithmeticException e){
             System.out.println("Division por cero!");
        }
        
        
        
    }
    
    public static double dividir(int num1, int num2){
        return num1/num2;
    }
}
