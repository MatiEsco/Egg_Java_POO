/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;
import Entidad.EdificioOficinas;
import Entidad.Polideportivo;
import java.util.Scanner;

public class EdificioService {
    Scanner leer = new Scanner(System.in);
    public EdificioOficinas crearEdificioOficina(){
        System.out.println("---- Edificio de Oficinas ----");
        System.out.print("Numero de oficinas: ");
        int numOfi = leer.nextInt();
        System.out.print("Personas por Oficina: ");
        int personas = leer.nextInt();
        System.out.print("Pisos: ");
        int pisos = leer.nextInt();
        System.out.print("Ancho: ");
        double ancho = leer.nextDouble();
        System.out.print("Alto: ");
        double alto = leer.nextDouble();
        System.out.print("Largo: ");
        double largo = leer.nextDouble();
        leer.nextLine();
        
        return new EdificioOficinas(numOfi, personas, pisos, ancho, alto, largo);
        
    }
    
    public Polideportivo crearPolideportivo(){
        System.out.println("---- Polideportivo ----");
        System.out.print("Nombre: ");
        String nombre = leer.nextLine();
        System.out.print("Tipo Instalacion: ");
        String tipo = leer.nextLine();
        System.out.print("Ancho: ");
        double ancho = leer.nextDouble();
        System.out.print("Alto: ");
        double alto = leer.nextDouble();
        System.out.print("Largo: ");
        double largo = leer.nextDouble();
        leer.nextLine();
        return new Polideportivo(nombre,tipo,ancho,alto,largo);
        
        
    }
    
    
}
