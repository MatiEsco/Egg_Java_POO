/*
 Para las residencias se indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y si posee o no
campo deportivo.
 */
package Entidad;

import ClasesAbstractas.ExtraHoteleros;
import java.util.Scanner;


public class Residencia extends ExtraHoteleros {
    Scanner leer = new Scanner(System.in);
    private int cantidadHabitaciones;
    private boolean descuento;
    private boolean campoDeportivo;

    public Residencia() {
    }

    public Residencia(int cantidadHabitaciones, boolean descuento, boolean campoDeportivo, boolean privacidad, double metrosCuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(privacidad, metrosCuadrados, nombre, direccion, localidad, gerente);
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.descuento = descuento;
        this.campoDeportivo = campoDeportivo;
    }

    
    public Residencia crearResidencia(){
       Residencia resi = new Residencia();
        System.out.println("--- Datos Residencia ---");
        System.out.print("Nombre: "); resi.setNombre(leer.nextLine());
        System.out.print("Direccion: "); resi.setDireccion(leer.nextLine());
        System.out.print("Localidad: "); resi.setLocalidad(leer.nextLine());
        System.out.print("Gerente: "); resi.setGerente(leer.nextLine());
        System.out.print("Metros Cuadrados: "); resi.setMetrosCuadrados(leer.nextDouble());
        System.out.print("Es Privado? (S/N): "); String priv = leer.next();
        
        if(priv.equalsIgnoreCase("s")){
            resi.setPrivacidad(true);
        }else{
            resi.setPrivacidad(false);
        }
        
        System.out.print("Descuento Gremio? (S/N): "); String desc = leer.next();
        if(desc.equalsIgnoreCase("s")){
            resi.setDescuento(true);
        }else{
            resi.setDescuento(false);
        }
       
        System.out.print("Tiene Campo Deportivo? (S/N): "); String dep = leer.next();
        
        if(dep.equalsIgnoreCase("s")){
            resi.setCampoDeportivo(true);
        }else{
            resi.setCampoDeportivo(false);
        }
        
        leer.nextLine();
        
        return resi;
 
    }
    

    
    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(int cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public boolean isDescuento() {
        return descuento;
    }

    public void setDescuento(boolean descuento) {
        this.descuento = descuento;
    }

    public boolean isCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
    }

    public boolean isPrivacidad() {
        return privacidad;
    }

    public void setPrivacidad(boolean privacidad) {
        this.privacidad = privacidad;
    }

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }
    
    
    
    
    
    
}
