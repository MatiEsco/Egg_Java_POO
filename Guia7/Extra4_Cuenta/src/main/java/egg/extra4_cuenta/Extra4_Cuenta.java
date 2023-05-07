/*
 * Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".
Luego, crea un método "retirar_dinero" que permita retirar una cantidad 
de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea 
negativo después de realizar una transacción de retiro.
 */

package egg.extra4_cuenta;
import Entidad.Cuenta;
import java.util.Scanner;
/**
 *
 * @author MatiPC
 */
public class Extra4_Cuenta {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Cuenta cuenta = new Cuenta();
       
        System.out.print("Ingrese su nombre: ");
        cuenta.setTitular(leer.nextLine());
        
        cuenta.setSaldo();

        cuenta.menu();
    }
}
