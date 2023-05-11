
package egg.ejer5_persona;
import Entidad.Persona;
import Servicios.PersonaService;

public class Ejer5_Persona {

    public static void main(String[] args) {
        PersonaService sv = new PersonaService();
        Persona persona1 = sv.crearPersona();
        
        sv.mostrarPersona(persona1);
        
        System.out.println("La persona es menor que 28? --> " + sv.menorQue(persona1, 28));
    }
}
