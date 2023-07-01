/*
Para los Camping se indica la capacidad máxima de carpas, la cantidad de baños
disponibles y si posee o no un restaurante dentro de las instalaciones.
 */
package Entidad;

import ClasesAbstractas.ExtraHoteleros;
import java.util.Scanner;

public class Camping extends ExtraHoteleros{
    Scanner leer = new Scanner(System.in);
    
    private int maxCarpas;
    private int cantBanios;
    private boolean restaurante;

    public Camping() {
    }

    public Camping(int maxCarpas, int cantBanios, boolean restaurante, boolean privacidad, double metrosCuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(privacidad, metrosCuadrados, nombre, direccion, localidad, gerente);
        this.maxCarpas = maxCarpas;
        this.cantBanios = cantBanios;
        this.restaurante = restaurante;
    }
    
    public Camping crearCamping(){
        Camping camp = new Camping();
        System.out.println("--- Datos Camping ---");
        System.out.print("Nombre: "); camp.setNombre(leer.nextLine());
        System.out.print("Direccion: "); camp.setDireccion(leer.nextLine());
        System.out.print("Localidad: "); camp.setLocalidad(leer.nextLine());
        System.out.print("Gerente: "); camp.setGerente(leer.nextLine());
        System.out.print("Metros Cuadrados: "); camp.setMetrosCuadrados(leer.nextDouble());
        System.out.println("Es privado? (S/N): "); String privado = leer.next();
        if(privado.equalsIgnoreCase("s")){
            camp.setPrivacidad(true);
        }else{
            camp.setPrivacidad(false);
        }
        
        
        System.out.print("Cantidad Maxima Carpas: "); camp.setMaxCarpas(leer.nextInt());
        System.out.print("Cantidad Baños: "); camp.setCantBanios(leer.nextInt());
        System.out.print("Tiene Restaurante? (S/N): "); String rest = leer.next();
        
        if(rest.equalsIgnoreCase("S")){
            camp.setRestaurante(true);
        }else{
            camp.setRestaurante(false);
        }
        
        return camp;
        
    }
    

    public int getMaxCarpas() {
        return maxCarpas;
    }

    public void setMaxCarpas(int maxCarpas) {
        this.maxCarpas = maxCarpas;
    }

    public int getCantBanios() {
        return cantBanios;
    }

    public void setCantBanios(int cantBanios) {
        this.cantBanios = cantBanios;
    }

    public boolean isRestaurante() {
        return restaurante;
    }

    public void setRestaurante(boolean restaurante) {
        this.restaurante = restaurante;
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
