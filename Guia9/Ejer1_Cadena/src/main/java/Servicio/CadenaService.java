/*
Crear una clase CadenaServicio en el
paquete servicios que implemente los siguientes métodos:
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales
que tiene la frase ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla
por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb
asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado
por el usuario y contabilizar cuántas veces se repite el carácter en la
frase, por ejemplo: Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4
veces.
e) Método compararLongitud(String frase), deberá comparar la longitud
de la frase que compone la clase con otra nueva frase ingresada por
el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la
clase Cadena con una nueva frase ingresada por el usuario y mostrar
la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras
“a” que se encuentren en la frase, por algún otro carácter
seleccionado por el usuario y mostrar la frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene
una letra que ingresa el usuario y devuelve verdadero si la contiene y
falso si no.
 */
package Servicio;
import Entidad.Cadena;
import java.util.Arrays;
import java.util.Scanner;

public class CadenaService {
    Scanner leer = new Scanner(System.in);
    public Cadena crearCadena(){
        System.out.print("Ingrese una frase: ");
        String frase = leer.nextLine();
        return new Cadena(frase);
    }
    
    public void mostrarVocales(Cadena frase){
        char[] vocales = {'a', 'e', 'i', 'o', 'u'};
        String fra = frase.getFrase().toLowerCase();
        char letra;
        int cont = 0;
        
        for(int i =0; i<fra.length();i++){
            letra = fra.charAt(i);
            
            for(int j=0; j<vocales.length;j++){
                if(letra == vocales[j]){
                    cont++;
                }
            }//FinPara
            
        }//FinPara
        
        
        System.out.println("Cantidad de vocales en la frase --> " + cont);
    }
    
    public void invertirFrase(String frase){
        
        char[] arreglo = new char[frase.length()];
        
        for(int i = 0; i<frase.length();i++){
            arreglo[i] = frase.charAt(i);
        }
        System.out.print("Frase invertida --> ");
       for(int j= arreglo.length -1; j>=0; j--){
           System.out.print(arreglo[j]);
       }
        System.out.println("");
       
       
    }
    
    public void vecesRepetido(String letra,Cadena frase){
        char caracter = letra.charAt(0);
        
        String fra = frase.getFrase().toLowerCase();
        
        char[] vector = fra.toCharArray();
        
        int cont = 0;
        
        for(char elemento : vector){
            if(elemento == caracter){
                cont++;
            }
        }
        
        System.out.println("Cantidad de veces que se repite '"+letra+"'" + "--> " + cont);
    }
    
    public void compararLongitud(String fraseNueva, Cadena frase){
        String fraseCreada = frase.getFrase();
        if(fraseNueva.length()> fraseCreada.length()){
            System.out.println("La frase '" + fraseNueva+ "' es mayor en longitud. Tiene "+fraseNueva.length()+" caracteres. La frase '" + fraseCreada+"' tiene "+ fraseCreada.length()+" caracteres.");
        }else if(fraseCreada.length()> fraseNueva.length()){
            System.out.println("La frase '" + fraseCreada+ "' es mayor en longitud. Tiene "+fraseCreada.length()+" caracteres. La frase '" + fraseNueva+"' tiene "+ fraseNueva.length()+" caracteres.");
        }else{
            System.out.println("Las dos frases tienen la misma cantidad de caracteres.");
        }
    }
    
    public void unirFrase(String fra, Cadena frase){
        System.out.println( frase.getFrase() + " "+fra);
    }
    
    public void reemplazar(String letra, Cadena frase){
        String fra = frase.getFrase().toLowerCase();
        char caracter = letra.charAt(0);
        char[] arreglo = fra.toCharArray();
        
        for(int i=0; i<arreglo.length;i++){
            if(arreglo[i]=='a'){
                arreglo[i]=caracter;
            }
        }//FinPara
        
        String fraseFinal = String.valueOf(arreglo);
        System.out.println("La nueva frase reemplazada --> " + fraseFinal);
        
    }
    
    public boolean contiene(String letra, Cadena frase){
        String fra = frase.getFrase().toLowerCase();
        char caracter = letra.charAt(0);
        
        char[] arreglo = fra.toCharArray();
        boolean retorno = false;
        for(int i=0; i<arreglo.length;i++){
            if(arreglo[i]==caracter){
                retorno = true;
                break;
            }
        }
        return retorno;
    }
    
    
    public  void menu(){
        
        CadenaService sv = new CadenaService();
        Cadena cad = sv.crearCadena();
        int op;
        do{
            System.out.println("");
            System.out.println("*** Menu ***");
            System.out.println("1_ Contar Vocales");
            System.out.println("2_ Invertir Frase");
            System.out.println("3_ Letra Repetida");
            System.out.println("4_ Comparar Longitud");
            System.out.println("5_ Unir Frases");
            System.out.println("6_ Reemplazar la vocal 'a' por una letra");
            System.out.println("7_ Contiene una letra");
            System.out.println("8_ Salir");
            op = leer.nextInt();
            
            switch (op) {
                case 1:
                    sv.mostrarVocales(cad);
                    break;

                case 2:
                    sv.invertirFrase(cad.getFrase());
                    break;

                case 3:
                    System.out.print("Ingrese una letra para saber si esta repetida: ");
                    String letra = leer.next().toLowerCase();
                    sv.vecesRepetido(letra, cad);
                    leer.nextLine();
                    break;
                case 4:
                    leer.nextLine();
                    System.out.print("Ingrese una nueva frase para comparar con la anterior: ");
                    String fraseNueva = leer.nextLine();
                    sv.compararLongitud(fraseNueva, cad);
                    
                    break;

                case 5:
                    leer.nextLine();
                    System.out.print("Frase para unir: ");
                    String fraseNueva2 = leer.nextLine();
                    sv.unirFrase(fraseNueva2, cad);
                    break;

                case 6:
                    System.out.print("Ingrese una letra para reemplazar en la frase '" + cad.getFrase() + "': ");
                    String letra1 = leer.next().toLowerCase();
                    sv.reemplazar(letra1, cad);
                    break;

                case 7:
                    System.out.print("Ingrese una letra: ");
                    String letra2 = leer.next().toLowerCase();
                    if (sv.contiene(letra2, cad)) {
                        System.out.println("La letra ingresada se encuentra en la frase..");
                    } else {
                        System.out.println("La letra ingresada no se encuentra en la frase..");
                    }
                    break;
                case 8:
                    System.out.println("Saliendo..");
                    break;

                default:
                    System.out.println("Opcion invalida!");
            }

        } while (op != 8);
    }
    
}
