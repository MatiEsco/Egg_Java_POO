/*

 */

package egg.ejer4_date;
import Servicios.FechaService;
import java.util.Date;

public class Ejer4_Date {

    public static void main(String[] args) {
        FechaService sv = new FechaService();
        Date nacimiento = sv.fechaNacimiento();
        Date actual = sv.fechaActual();
        
        
        System.out.println("Diferencia: "+sv.diferencia(nacimiento, actual));
    }
}
