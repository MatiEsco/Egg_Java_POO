/*

 */

package egg.ejer1_teoria;

import Entidad.Persona;
import Servicio.PersService;


public class Ejer1_Teoria {

    public static void main(String[] args) {
        Persona per = new Persona("Matias", 27, 39197144);
        PersService serv = new PersService();
        
        serv.mostrarPersona(per);
        
        
    }
}
