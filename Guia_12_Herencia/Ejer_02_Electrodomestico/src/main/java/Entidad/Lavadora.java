/*
 A continuación, se debe crear una subclase llamada Lavadora, con el atributo carga,
además de los atributos heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la carga y el resto de los atributos heredados. Recuerda que debes
llamar al constructor de la clase padre.
 */
package Entidad;

import java.util.Scanner;


public class Lavadora extends Electrodomestico{
    Scanner leer = new Scanner(System.in);
    private double carga;

    public Lavadora() {
    }

    public Lavadora(double carga, double precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

  
    /*
    Los métodos que se implementara serán:
• Método get y set del atributo carga.
• Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
el atributo propio de la lavadora.

    • Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
carga es menor o igual, no se incrementará el precio. Este método debe llamar al
método padre y añadir el código necesario. Recuerda que las condiciones que hemos
visto en la clase Electrodoméstico también deben afectar al precio.
    */

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }
    
    public void crearLavadora(){
        System.out.println("--- Lavadora ---");
        crearElectrodomestico();
        System.out.print("Carga: ");
        double carga = leer.nextDouble();
        setCarga(carga);
        leer.nextLine();
    }

    @Override
    public double precioFinal() {
        double precioFinal = super.precioFinal();
        if(carga>30){
            precioFinal+=500;
        }
        
        
        return precioFinal;
    }

    @Override
    public String toString() {
        return super.toString() + "carga= " + carga; 
    }
    
    
    
}
