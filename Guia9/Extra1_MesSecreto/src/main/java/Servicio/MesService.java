/*
Crea una clase en Java donde declares una variable de tipo array de
Strings que contenga los doce meses del año, en minúsculas. A
continuación, declara una variable mesSecreto de tipo String, y hazla
igual a un elemento del array (por ejemplo, mesSecreto = mes[9]. El
programa debe pedir al usuario que adivine el mes secreto. Si el usuario
acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar
adivinar el mes secreto. Un ejemplo de ejecución del programa podría
ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas:
febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!

 */
package Servicio;
import Entidad.Mes;
import java.util.Scanner;
public class MesService {
    Scanner leer = new Scanner(System.in);
    public Mes crearMes(){
        
        String[] mes = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
        int i =(int) (Math.random()*13);
        
        String mesSecreto  = mes[i];
        
        
        return new Mes(mes,mesSecreto);
    }
    
    public void adivinar(Mes objeto){
        String acierto;
        int cont=1;
        System.out.print("Adivine el mes secreto: ");
        acierto = leer.nextLine().toLowerCase();
        do{

            if(acierto.equals(objeto.getMesSecreto())){
                System.out.println("");
                System.out.println("Correcto! El mes secreto era "+objeto.getMesSecreto());
                System.out.println("Lo ha logrado en "+cont+" intentos!");
                break;
                
            }else{
               cont++;
                System.out.println("No ha acertado!");
                System.out.print("Intente nuevamente: ");
                acierto = leer.nextLine().toLowerCase();
            }
            
        }while(objeto.getMesSecreto()!=acierto);
        
    }
    
}
