/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;
import Entidades.Asiento;
import Entidades.Espectador;
import Entidades.Sala;
import java.util.ArrayList;
import java.util.Random;

public class SalaService {
    Random random = new Random();
    Sala sala1 = new Sala();
    Asiento[][] asientos =new Asiento[8][6];
    
    ArrayList<Espectador> listaEspectadores = new ArrayList<>();
    public Sala crearSala(){
        
        
        String[] letras = {"A","B","C","D","E","F"};
        for(int i = 7; i>=0; i--){
            for(int j=0; j<6;j++){
                asientos[i][j] = new Asiento((i+1),letras[j],random.nextBoolean());
            }
        }
        
        sala1.setSala(asientos);
        
        return sala1;
    }
    
    public int espaciosLibres(){
        int cont = 0;
        for (Asiento[] asiento : asientos) {
            for (Asiento asiento1 : asiento) {
                if(!asiento1.isOcupado()){
                    cont++;
                }
            }
        }
        
        return cont;
        
    }
    
   
}
