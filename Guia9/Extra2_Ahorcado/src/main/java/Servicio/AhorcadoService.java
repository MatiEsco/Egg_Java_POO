/*
Definir los siguientes métodos en
AhorcadoService:
● Metodo crearJuego(): le pide la palabra al usuario y cantidad de
jugadas máxima. Con la palabra del usuario, pone la longitud de la
palabra, como la longitud del vector. Después ingresa la palabra en el
vector, letra por letra, quedando cada letra de la palabra en un índice
del vector. Y también, guarda la cantidad de jugadas máximas y el
valor que ingresó el usuario.
● Método longitud(): muestra la longitud de la palabra que se debe
encontrar. Nota: buscar como se usa el vector.length.
● Método buscar(letra): este método recibe una letra dada por el
usuario y busca si la letra ingresada es parte de la palabra o no.
También informará si la letra estaba o no.
● Método encontradas(letra): que reciba una letra ingresada por el
usuario y muestre cuantas letras han sido encontradas y cuántas le
faltan. Este método además deberá devolver true si la letra estaba y
false si la letra no estaba, ya que, cada vez que se busque una letra
que no esté, se le restará uno a sus oportunidades.
● Método intentos(): para mostrar cuántas oportunidades le queda al
jugador.
● Método juego(): el método juego se encargará de llamar todos los
métodos previamente mencionados e informará cuando el usuario
descubra toda la palabra o se quede sin intentos. Este método se
llamará en el main
 */
package Servicio;
import Entidad.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;
public class AhorcadoService {
    Scanner leer = new Scanner(System.in);
    Ahorcado ah = new Ahorcado();
   
    public Ahorcado crearJuego(){
        String palabra;
        int jugadas;
        
        System.out.println("Ingrese la palabra: ");
        palabra = leer.next();
        
        System.out.println("Ingrese cantidad de intentos maximos: ");
        jugadas = leer.nextInt();
        
        ah.setCant_Jugadas(jugadas);
        ah.setCant_Encontrada(0);
        
        String[] vector = new String[palabra.length()];
        
        for(int i=0; i<vector.length;i++){
            vector[i] = palabra.substring(i, i+1);
        }
        leer.nextLine();
        
        ah.setPalabra(vector);
        
        return ah;
        
    }
    
    public void longitud(){
        System.out.println("Longitud de la palabra: "+ah.getPalabra().length);
    }
    
    public void buscar(String letra){
        int cont=0;
        for(String elemento:ah.getPalabra()){
            if(letra.equalsIgnoreCase(elemento)){
                cont++;
            }
        }
        
        if(cont==0){
            System.out.println("La letra no pertenece a la palabra");
        }else{
            System.out.println("La letra pertenece a la palabra");
        }
        
    }
    
    public boolean encontradas(String letra1){
        int cont =0;
        for(String elemento1:ah.getPalabra()){
            if(elemento1.equalsIgnoreCase(letra1)){
                cont++;
                
            }
        }
        
        if(cont>0){
            System.out.println("La letra pertenece a la palabra");
        }else{
            System.out.println("La letra NO pertenece a la palabra");
        }
        
        
        ah.setCant_Encontrada(ah.getCant_Encontrada()+cont);
        
        return cont>0;
    }
    
    public void intentos(String letra2){
        if(encontradas(letra2)){
            
        }else{
            ah.setCant_Jugadas(ah.getCant_Jugadas()-1);
        }
        
        System.out.println("Numero de letras (encontradas/restantes): ("+ah.getCant_Encontrada()+"/"+(ah.getPalabra().length-ah.getCant_Encontrada()));
        
        System.out.println("Intentos Restantes --> "+ah.getCant_Jugadas());
        System.out.println("---------------------------------------");
    }
    
    public void juego(){
        crearJuego();
        
        String letra3;
        System.out.println("Ingrese una letra: ");
        letra3 = leer.next();
        
        do{
            leer.nextLine();
            
            longitud();
            intentos(letra3);

            if(ah.getCant_Encontrada()==ah.getPalabra().length){
                System.out.println("Ha ganado!");
                String mostrar = Arrays.toString(ah.getPalabra());
                System.out.println("La palabra es --> "+mostrar);
            }
            letra3=leer.next();
        }while(ah.getCant_Jugadas()>0 && (ah.getCant_Encontrada()!=ah.getPalabra().length));
        
        if(ah.getCant_Encontrada()!=ah.getPalabra().length){
                System.out.println("Ha Perdido!");
            }
        
    }
    
}     