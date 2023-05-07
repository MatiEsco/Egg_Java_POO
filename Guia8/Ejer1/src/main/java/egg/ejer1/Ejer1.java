/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package egg.ejer1;
import Entidad.CuentaBancaria;
import Servicio.CuentaBancariaServicio;
import java.util.Scanner;
/**
 *
 * @author MatiPC
 */
public class Ejer1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CuentaBancariaServicio service = new CuentaBancariaServicio();
        
        CuentaBancaria cta1 = service.crearCuenta();
        
        int opcion;
        
        do{
            System.out.println("--------Menu--------");
            System.out.println("Ingrese la opción deseada.");
            System.out.println("1. Ingresar dinero");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Extraccion rapida");
            System.out.println("4. Consultar saldo");
            System.out.println("5. Consultar datos");
            System.out.println("6. Salir");
            opcion=leer.nextInt();
            switch (opcion) {
                case 1:
                    service.ingresar(cta1);
                    break;
                case 2:
                    service.retirar(cta1);
                    break;
                case 3:
                    service.extraccionRapida(cta1);
                    break;
                case 4:System.out.println("Saldo: " + service.consultarSaldo(cta1));
                    
                    break;
                case 5:
                    service.consultarDatos(cta1);
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("La opcion elegida no es valida. Vuelva a intentarlo");
                    break;    
            }
                    
        }while (opcion!=6);
        
        
    }
}
