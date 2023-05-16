

package egg.extra1_messecreto;
import Entidad.Mes;
import Servicio.MesService;

public class Extra1_MesSecreto {

    public static void main(String[] args) {
        MesService sv = new MesService();
        Mes mes1 = sv.crearMes();
        
        sv.adivinar(mes1);
    }
}
