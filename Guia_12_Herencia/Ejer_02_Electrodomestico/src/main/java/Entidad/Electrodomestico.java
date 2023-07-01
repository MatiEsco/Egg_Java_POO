/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public abstract class Electrodomestico {
    protected double precio;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;
    
    private Scanner leer = new Scanner(System.in);

    public Electrodomestico() {
      
    }

    public Electrodomestico(double precio, String color, char consumoEnergetico, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    
    private char comprobarConsumoEnergetico(char letra){
        char[] letrasValidas = {'A','B','C','D','E','F'};
        
        for(char c : letrasValidas){
            if(Character.toUpperCase(letra) == c ){
                return Character.toUpperCase(letra);
            }
        }
        
        
        return 'F'; // F es por defecto si no es valido
    }
    
    
    private String comprobarColor(String color){
        List<String> coloresDisponibles = Arrays.asList("blanco", "negro", "rojo", "azul", "gris");
        color = color.toLowerCase();
        if(coloresDisponibles.contains(color)){
            return color;
        }
        return "blanco"; // Por defecto
    }
    
    /*
    Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
precio se le da un valor base de $1000.
    */
    
    public void crearElectrodomestico(){
        System.out.println("--- Electrodomestico ---");
        setPrecio(1000);
        System.out.print("Color: ");
        String color = leer.next();
        setColor(comprobarColor(color));
        System.out.print("Consumo Energetico: ");
        char consumo = leer.next().charAt(0);
        setConsumoEnergetico(comprobarConsumoEnergetico(consumo));
        System.out.print("Peso: ");
        double peso = leer.nextDouble(); 
        setPeso(peso);
        leer.nextLine();
      
    }
    
    public double precioFinal(){
        double precioFinal = precio;
        
        // Incremento según consumo energético
        switch (consumoEnergetico) {
            case 'A':
                precioFinal += 1000;
                break;
            case 'B':
                precioFinal += 800;
                break;
            case 'C':
                precioFinal += 600;
                break;
            case 'D':
                precioFinal += 500;
                break;
            case 'E':
                precioFinal += 300;
                break;
            case 'F':
                precioFinal += 100;
                break;
        }
        
        // Incremento según peso
        if (peso >= 1 && peso <= 19) {
            precioFinal += 100;
        } else if (peso >= 20 && peso <= 49) {
            precioFinal += 500;
        } else if (peso >= 50 && peso <= 79) {
            precioFinal += 800;
        } else if (peso >= 80) {
            precioFinal += 1000;
        }

        return precioFinal;
        
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}';
    }
    
    
    
    
    
}
