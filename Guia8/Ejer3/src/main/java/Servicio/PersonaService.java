/*
En el paquete Servicios crear PersonaServicio con los siguientes 3 métodos:
Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano.
Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al usuario 
y después se le asignan a sus respectivos atributos para llenar el objeto Persona. 
Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se deberá mostrar un mensaje


Método calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)).
Si esta fórmula da por resultado un valor menor que 20, significa que la persona está por debajo de su peso ideal 
y la función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25 (incluidos), 
significa que la persona está en su peso ideal y la función devuelve un 0. 
Finalmente, si el resultado de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso,
y la función devuelve un 1.

*/

package Servicio;
import Entidad.Persona;
import java.util.Scanner;
public class PersonaService {
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
