/*
Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
 */
package Entidad;


public abstract class Barco {
    protected String matricula;
    protected double eslora;
    protected int anioFabricacion;

    public Barco(String matricula, double eslora, int anioFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
    }
    
    public double calcularModulo(){
        return eslora*10;
    }
    
    
}
