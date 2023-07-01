/*
Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener
dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y ejecutar los
métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la
superficie y el volumen de cada edificio.
Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son
techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método
cantPersonas() y mostrar los resultados de cada edificio de oficinas.
*/

package egg.extra_02_edificio;

import Entidad.*;
import Servicio.*;
import java.util.ArrayList;
import java.util.List;

public class Extra_02_Edificio {

    public static void main(String[] args) {
      List<Edificio> listaEdificios = new ArrayList<>();
      EdificioService sv = new EdificioService();
      
      Polideportivo poli1 = sv.crearPolideportivo();
      Polideportivo poli2 = sv.crearPolideportivo();
      EdificioOficinas edi1 = sv.crearEdificioOficina();
      EdificioOficinas edi2 = sv.crearEdificioOficina();
      
      listaEdificios.add(poli1);
      listaEdificios.add(poli2);
      listaEdificios.add(edi1);
      listaEdificios.add(edi2);
      
      int techados=0;
      int noTechados = 0;
      
      for(Edificio edificio : listaEdificios){
          
          
          if(edificio instanceof Polideportivo){
              System.out.println("Informe Polideportivo");
              System.out.println("Superficie: " + edificio.calcularSuperficie());
              System.out.println("Volumen: " + edificio.calcularVolumen());
              System.out.println("----------------------------------");
              
              if(((Polideportivo) edificio).getTipoInstalacion().equalsIgnoreCase("techado")){
                  techados ++;
              }else{
                  noTechados++;
              }
          }
          
          
          if(edificio instanceof EdificioOficinas){
              System.out.println("Informe Edificio de Oficinas");
              System.out.println("Superficie: " + edificio.calcularSuperficie());
              System.out.println("Volumen: " + edificio.calcularVolumen());
              ((EdificioOficinas) edificio).cantPersonas();
              System.out.println("----------------------------------");
              
          }
          
          
      }
      
        System.out.println("Cantidad de Polideportivos Techados: " + techados);
        System.out.println("Cantidad de Polideportivos Abiertos: " + noTechados);
    }
    
    
}
