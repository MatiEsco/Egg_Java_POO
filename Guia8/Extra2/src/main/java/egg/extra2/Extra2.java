

package egg.extra2;
import Entidad.NIF;
import Servicio.NIFService;

public class Extra2 {

    public static void main(String[] args) {
        NIFService sv = new NIFService();
        NIF objeto = sv.crearNIF();
        
        sv.mostrar(objeto);
        
    }
}
