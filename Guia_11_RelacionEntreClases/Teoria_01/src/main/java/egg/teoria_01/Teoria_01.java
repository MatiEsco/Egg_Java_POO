
package egg.teoria_01;
import Entidad.Dni;
import Entidad.Persona;

public class Teoria_01 {

    public static void main(String[] args) {
        
        Persona per = new Persona();
        Dni dni = new Dni();
        per.setNombre("Gaston");
        per.setApellido("Martin");
        
        dni.setNumero(39197144);
        dni.setSerie('a');
        
        per.setDni(dni);
        
        
        System.out.println(per);
        
        
    }
}
