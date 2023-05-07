/*
Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le corresponderá. 
Una vez calculado, le asigna la letra que le corresponde según

Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y 
la letra en mayúscula; por ejemplo: 00395469-F).

Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y 
la letra en mayúscula; por ejemplo: 00395469-F).


*/
package Servicio;

import java.util.Scanner;
import Entidad.NIF;

public class NIFService {
    Scanner leer = new Scanner(System.in);
    public NIF crearNIF(){
        long dni;
        String[] vector = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        do{
        System.out.println("Ingrese DNI: ");
        dni=leer.nextLong();
        
        }while(String.valueOf(dni).length() != 8);
        
        int resto = (int) (dni % 23);
        
        String letra = vector[resto];
        
        return new NIF(dni,letra);
    } 
    
    
    public void mostrar(NIF obj){
        System.out.println(obj.getDni()+"-"+obj.getLetra());
    }
}
