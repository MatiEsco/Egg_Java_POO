/*
 En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
el número de camarotes.
 */
package Entidad;


public class Yate extends BarcoMotor{
 
    private int numeroCamarotes;

    public Yate(int numeroCamarotes, int potenciaCV, String matricula, double eslora, int anioFabricacion) {
        super(potenciaCV, matricula, eslora, anioFabricacion);
        this.numeroCamarotes = numeroCamarotes;
    }

    @Override
    public double calcularModulo() {
        return super.calcularModulo() + numeroCamarotes; 
    }
    
    
    
    
    
}
