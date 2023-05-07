/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package egg.extra5_empleado;
import java.util.Scanner;
import Entidad.Empleado;
/**
 *
 * @author MatiPC
 */
public class Extra5_Empleado {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Empleado empleado = new Empleado();
        
        
        System.out.print("Nombre: ");
        empleado.setNombre(leer.nextLine());
        
        System.out.print("Edad: ");
        empleado.setEdad(leer.nextInt());
        
        System.out.print("Salario Actual: $");
        empleado.setSalario(leer.nextDouble());
        
        empleado.informe();
        
    }
   
   
}
