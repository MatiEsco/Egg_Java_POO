/*
Área circulo: PI * radio ^ 2 
Perímetro circulo: PI * diámetro.
 */
package Entidad;

import Interfaces.calculosFormas;



public class Circulo implements calculosFormas{
    private double radio, diametro;

    public Circulo(double radio, double diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }
    

    
    @Override
    public void calcularArea() {
        double area = calculosFormas.PI * (Math.pow(radio, 2));
        System.out.printf("Area Circulo: %.2f%n",area);
    }

    @Override
    public void calcularPerimetro() {
        double perimetro = (calculosFormas.PI * (diametro));
        System.out.printf("Perimetro Circulo: %.2f%n",perimetro);
        
    }
    
    
}
