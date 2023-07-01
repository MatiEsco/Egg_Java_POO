
package Servicio;

import Entidad.Cliente;
import Entidad.Cuota;
import Entidad.Poliza;
import Entidad.Vehiculo;
import Servicio.GestionCliente;
import Servicio.GestionPolizas;
import Servicio.GestionVehiculo;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;


public class Gestion {
     Scanner leer = new Scanner(System.in);
    
      // Crear gestores
        GestionCliente gestorClientes = new GestionCliente();
        GestionVehiculo gestorVehiculos = new GestionVehiculo();
        GestionPolizas gestorPolizas = new GestionPolizas();
        
        public void menu(){
            int op ;
            do{
            System.out.println("*** La Tercera Seguros ***");
            System.out.println("1_ Agregar Cliente");
            System.out.println("2_ Agregar Poliza");
            System.out.println("3_ Agregar Vehiculo");
            System.out.println("4_ Pagar Cuotas");
            System.out.println("5_ Buscar Cliente");
            System.out.println("6_ Buscar Poliza");
            op = leer.nextInt();
            leer.nextLine();
            
            switch(op){
                case 1:
                    gestorClientes.agregarCliente();
                    break;
                    
                case 2:
                    System.out.println("Dni a buscar: ");
                    String dni = leer.nextLine();
                    System.out.println(gestorClientes.buscarCliente(dni));
                    break;
            }
            
            
            }while(op!=7);
               
            
            
        }
   
    
    
   
   
    
   
    
    
    
    
  
    
    
    
}
