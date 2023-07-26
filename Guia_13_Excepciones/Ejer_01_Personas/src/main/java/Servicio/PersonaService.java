/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author MatiPC
 */
public class PersonaService{
     Scanner leer = new Scanner(System.in);
    public boolean esMayorEdad(Persona per){
        
        if(per.getEdad()>=18){
            System.out.println("Es mayor de Edad");
        }else{
            System.out.println("Es menor de Edad");
        }
        System.out.println("");
        
       
        return per.getEdad()>=18;
    }
    
    public Persona crearPersona(){
        char sexo= 'z'; String nombre; int edad; double peso; double altura;
        
        System.out.print("Nombre: "); 
        nombre = leer.nextLine();
        System.out.print("Edad: ");
        edad = leer.nextInt();
        boolean comprobar = false;
        while(!comprobar){
            System.out.print("Sexo (H - M - O): ");  sexo = leer.next().charAt(0);
            sexo = Character.toUpperCase(sexo);
            if(Character.toString(sexo).equals("H")||Character.toString(sexo).equals("M")||Character.toString(sexo).equals("O")){
                comprobar = true;
                break;
                
            }else{
            System.out.println("Opcion incorrecta!.. Intente nuevamente");
           System.out.print("Sexo (H - M - O): ");  sexo = leer.next().charAt(0); 
           sexo = Character.toUpperCase(sexo);
           }
        }
        
        System.out.print("Peso: ");  
        peso= leer.nextDouble();
        System.out.print("Altura: ");  
        altura = leer.nextDouble();
        leer.nextLine();
     
        return new Persona(nombre,edad,sexo,peso,altura);
    }
    
    public int calcularIMC(Persona per){
       double pesoideal = per.getPeso()/(Math.pow(per.getAltura(), 2));
       int categoria, retorno=0;

       if(pesoideal < 20){
           System.out.println("Por debajo de su peso ideal.");
           categoria = 1;
       }else if(pesoideal <=25){
           System.out.println("Esta en su peso ideal.");
           categoria = 2;
       }else{
           System.out.println("Tiene Sobrepeso.");
           categoria = 3;
       }
        System.out.println("");
           
        switch (categoria) {
            case 1:
                retorno = -1;
                break;

            case 2:
                retorno = 0;
                break;

            case 3:
                retorno = 1;
                break;

        }

       return retorno;
    }
}
