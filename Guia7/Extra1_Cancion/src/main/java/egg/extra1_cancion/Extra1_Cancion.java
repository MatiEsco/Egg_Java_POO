/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package egg.extra1_cancion;
import Entidad.Cancion;
import java.util.Scanner;

public class Extra1_Cancion {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        Cancion cancion1 = new Cancion("Rosas Rojas", "Escobar Matias");
        
        Cancion cancion2 = new Cancion();
        
        cancion2.setTitulo("HOLA ");
        cancion2.setAutor("MUNDO");
        
        System.out.println("Cancion1: " + cancion1.getTitulo() + " "+cancion1.getAutor());
        
        System.out.println("Cancion2: " + cancion2.getTitulo() + cancion2.getAutor());
        
        
    }
}
