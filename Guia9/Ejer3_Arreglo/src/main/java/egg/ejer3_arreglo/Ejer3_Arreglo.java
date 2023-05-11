/*
 En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B,
mostrar A y B.
 */

package egg.ejer3_arreglo;
import Servicios.ArregloService;

public class Ejer3_Arreglo {
    
    public static void main(String[] args) {
        ArregloService sv = new ArregloService();
        double[] A = new double[50];
        double[] B = new double[20];
        
        System.out.println("Inicializando Vector A...");
        sv.inicializarA(A);
        System.out.println("Vector A creado ... Mostrando..");
        sv.mostrar(A);
        System.out.println("Ordenando vector A..");
        System.out.println("Vector A ordenado.. Mostrando vector ordenado..");
        sv.ordenar(A);
        
        System.out.println("");
        System.out.println("Inicializando vector B..");
        sv.inicializarB(A, B);
        System.out.println("Vector B creado..");
        System.out.println("");
        System.out.println("Mostrando vectores..");
        System.out.println("Vector A"); sv.mostrar(A);
        System.out.println("Vector B"); sv.mostrar(B);
        
        
        
        
    }
}
