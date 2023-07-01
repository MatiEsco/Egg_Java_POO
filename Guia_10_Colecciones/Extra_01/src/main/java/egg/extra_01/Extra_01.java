/*
Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado
y los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
programa mostrará por pantalla el número de valores que se han leído, su suma y su
media (promedio).
*/

package egg.extra_01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class Extra_01 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       ArrayList<Integer> listaNumeros = new ArrayList<>(); 
        System.out.print("Ingreso de numeros (Finaliza con el valor -99):  ");
       int num = leer.nextInt();
       
       while(num!=-99){
           listaNumeros.add(num);
           System.out.print("---> ");
           num = leer.nextInt();
       }
       
        suma_y_prom(listaNumeros);
       
       
       
    }
    public static void suma_y_prom(ArrayList<Integer> lista){
        Iterator<Integer> iterador = lista.iterator();
        int suma = 0;
        double prom;
        
        while(iterador.hasNext()){
            suma += iterador.next();
        }
        
        prom = suma / lista.size();
        
        System.out.println("Cantidad de elementos ingresados: " + lista.size());
        System.out.println("La suma de los elementos es: " + suma);
        System.out.println("Promedio: " + prom);
        
    }
}
