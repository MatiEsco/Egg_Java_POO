/*
Se debe crear también una subclase llamada Televisor con los siguientes atributos:
resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos
heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la resolución, sintonizador TDT y el resto de los atributos
heredados. Recuerda que debes llamar al constructor de la clase padre.
 */
package Entidad;

import java.util.Scanner;


public class Televisor extends Electrodomestico{
    Scanner leer = new Scanner(System.in);
    private int pulgadas;
    private boolean sintonizadorTDT;

    public Televisor() {
    }

    public Televisor(int pulgadas, boolean sintonizadorTDT, double precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.pulgadas = pulgadas;
        this.sintonizadorTDT = sintonizadorTDT;
    }
    
    /*
    Los métodos que se implementara serán:
• Método get y set de los atributos resolución y sintonizador TDT.
• Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
los atributos del televisor.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
también deben afectar al precio.
    */

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }
    
    public void crearTelevisor(){
        System.out.println("--- Televisor ---");
        crearElectrodomestico();
        System.out.print("Pulgadas: ");
        int pulg = leer.nextInt();
        setPulgadas(pulg);
        leer.nextLine();
        char sintonizador;
        do {
            System.out.print("Tiene SintonizadorTDT (S/N): ");
            sintonizador = leer.next().charAt(0);
            
            if (sintonizador == 'S' || sintonizador == 's') {
                this.sintonizadorTDT = true;
            } else if (sintonizador == 'N' || sintonizador == 'n') {
                this.sintonizadorTDT = false;
            } else {
                System.out.println("Respuesta inválida. Por favor, ingrese 'S' o 'N'.");
                this.sintonizadorTDT = false;
            }
        } while (sintonizador != 'S' && sintonizador != 's' && sintonizador != 'N' && sintonizador != 'n');
        
        
        
        
        
    }

    @Override
    public double precioFinal() {
        double precioFinal = super.precioFinal();
        
        if(pulgadas > 40){
            precioFinal *=1.3;
        }
        
        if(sintonizadorTDT){
            precioFinal+=500;
        }
        
        
        return precioFinal; 
    }
    
    
    
}
