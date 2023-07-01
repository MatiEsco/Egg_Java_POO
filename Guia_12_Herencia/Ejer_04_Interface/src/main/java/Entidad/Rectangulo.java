/*
Área rectángulo: base * altura 
/ Perímetro rectángulo: (base + altura) * 2.
 */
package Entidad;

import Interfaces.calculosFormas;
import java.util.Scanner;


public class Rectangulo implements calculosFormas{
    
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    

    @Override
    public void calcularArea() {
        double area = base * altura;
        System.out.printf("Area Rectangulo: %.2f%n", area);
    }

    @Override
    public void calcularPerimetro() {
       double perimetro = ((base + altura) *2);
       System.out.printf("Area Rectangulo: %.2f%n", perimetro);
    }

    
}
