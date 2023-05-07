

package egg.extra1;
import Entidad.Raices;
import Servicio.RaicesService;
import java.util.Scanner;
public class Extra1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        RaicesService sv = new RaicesService();
        
        Raices r1 = sv.crearRaiz();
        
        sv.calcular(r1);
        
    }
}
