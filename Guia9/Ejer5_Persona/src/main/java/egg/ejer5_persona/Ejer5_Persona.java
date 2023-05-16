
package egg.ejer5_persona;
import Entidad.Persona;
import Servicios.PersonaService;
import java.util.Scanner;

public class Ejer5_Persona {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        PersonaService sv = new PersonaService();
        Persona persona1 = sv.crearPersona();
        
        sv.mostrarPersona(persona1);
        System.out.println("Ingrese una edad para comparar si es menor: ");
        int entrada = leer.nextInt();
        
        System.out.println("La persona es menor que " +entrada+" --> "+ sv.menorQue(persona1, 28));
    }
}
