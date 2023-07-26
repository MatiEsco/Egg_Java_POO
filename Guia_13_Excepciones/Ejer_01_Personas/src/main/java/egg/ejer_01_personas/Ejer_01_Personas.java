/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package egg.ejer_01_personas;

import Entidad.Persona;
import Servicio.PersonaService;
import java.util.Scanner;


public class Ejer_01_Personas {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean[] edades = new boolean[4];
        int[] pesos = new int[4];
        
        PersonaService sv = new PersonaService();
        
        Persona persona = new Persona();
        
        try{
        sv.esMayorEdad(persona);
        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("Los valores de Personas estan en Null");
        }
        
        System.out.println("---------------------------");
        System.out.println("Aca continuaria el codigo...");
        
        /*System.out.println("Ingresando Personas...");
        int op;
        do{
            
            System.out.println("1_ Crear Persona 1");
            System.out.println("2_ Crear Persona 2");
            System.out.println("3_ Crear Persona 3");
            System.out.println("4_ Crear Persona 4");
            System.out.println("5_ Salir");
            op = leer.nextInt();
            
            switch (op) {
                case 1:
                    System.out.println("Persona 1");
                    Persona p1 = sv.crearPersona();
                    System.out.print("Persona 1 --> ");pesos[0] = sv.calcularIMC(p1);
                    edades[0] = sv.esMayorEdad(p1);
                    
                    break;

                case 2:
                    System.out.println("Persona 2");
                    Persona p2 = sv.crearPersona();
                    System.out.print("Persona 2 --> ");pesos[1] = sv.calcularIMC(p2);
                    edades[1] = sv.esMayorEdad(p2);
                    break;
                case 3:
                    System.out.println("Persona 3");
                    Persona p3 = sv.crearPersona();
                    System.out.print("Persona 3 --> ");pesos[2] = sv.calcularIMC(p3);
                    edades[2] = sv.esMayorEdad(p3);
                    break;

                case 4:
                    System.out.println("Persona 4");
                    Persona p4 = sv.crearPersona();
                    System.out.print("Persona 4 --> ");pesos[3] = sv.calcularIMC(p4);
                    edades[3] = sv.esMayorEdad(p4);
                    break;
                case 5:
                    System.out.println("Saliendo..");
                    System.out.println("");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida!");
            }
            
        }while(op!=5);
        
        
        System.out.println("Vector pesos"); //Solo para control
        for(int i=0; i<4;i++){
            System.out.print("[" + pesos[i] + "] ");
        }
        System.out.println("");
        System.out.println("Vector edades");
         for(int i=0; i<4;i++){
            System.out.print("[" + edades[i] + "] ");
        }
        System.out.println(""); // Solo para control
        
       
       porcentajePeso(pesos);
       porcentajeEdad(edades);
       
      */  
        
    }
    
    public static void porcentajePeso(int[] vector){
        int pesoIdeal=0, pesoDebajo=0, sobrePeso=0;
        
        for(int i=0; i<4;i++){
            if(vector[i] == 0){
                pesoIdeal++;
            }else if(vector[i] == -1){
                pesoDebajo++;
            }else{
                sobrePeso++;
            }
        }//FinPara
        System.out.println("");
        System.out.println("**** Porcentaje de Pesos ****");
        System.out.println("Peso Ideal --> " + (pesoIdeal/4.0)*100+"%");
        System.out.println("Peso por debajo de lo Ideal --> " + (pesoDebajo/4.0)*100+"%");
        System.out.println("Personas con Sobrepeso --> " + (sobrePeso/4.0)*100+"%");
        System.out.println("");
    }
    
    public static void porcentajeEdad(boolean[] vector){
        int mayor=0, menor=0;
        
        for(int i=0; i<4;i++){
            if(vector[i]==true){
                mayor++;
            }else{
                menor++;
            }
        }//FinPara
        
        System.out.println("**** Porcentaje de Edades ****");
        System.out.println("Mayores de Edad --> "+(mayor/4.0)*100+"%");
        System.out.println("Menores de Edad --> "+(menor/4.0)*100+"%");
        System.out.println("");
    }
}

