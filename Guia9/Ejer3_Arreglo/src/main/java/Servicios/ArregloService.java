/*
Crear en el Main dos arreglos. El arreglo A de 50 números reales y el
arreglo B de 20 números reales. Crear la clase ArregloService, en el
paquete servicio, con los siguientes métodos:
1) Método inicializarA recibe un arreglo por parámetro y lo inicializa con
números aleatorios.
2) Método mostrar recibe un arreglo por parámetro y lo muestra por
pantalla.
3) Método ordenar recibe un arreglo por parámetro y lo ordena de
mayor a menor.
4) Método inicializarB copia los primeros 10 números del arreglo A en el
arreglo B. Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B,
mostrar A y B.

 */
package Servicios;

import java.util.Arrays;

public class ArregloService {
    public void inicializarA(double[] vector){
        double aleatorio;
        for(int i =0; i<50; i++){
            aleatorio = Math.random()*100;
            aleatorio = Math.round(aleatorio*100)/100;// Para obtener un numero con dos decimales
            vector[i] = aleatorio;
        }
    }
    
    public void mostrar(double[] vector){
        
        System.out.println(Arrays.toString(vector));
    }
    
    
    public void ordenar(double[] vector){
        double[] aux = new double[vector.length];
        System.arraycopy(vector,0,aux,0,vector.length);
        Arrays.sort(aux);
        
        for(int i=49; i>=0; i--){
            System.out.print("[" + aux[i]+ "]");
        }
        System.out.println("");
        
        
    }
    
    public void inicializarB(double[] vectorA, double[] vectorB){
        System.arraycopy(vectorA, 0, vectorB, 0, 10);
        
        Arrays.fill(vectorB,10,20,0.5);
       
    }
    
}
