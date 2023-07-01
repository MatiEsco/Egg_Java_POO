/*
Los Hoteles tienen como atributos: Cantidad de Habitaciones, Número de Camas, Cantidad de
Pisos, Precio de Habitaciones. Y estos pueden ser de cuatro o cinco estrellas. Las
características de las distintas categorías son las siguientes:
• Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Precio de las Habitaciones.
 */
package Entidad;

import ClasesAbstractas.Hotel;
import java.util.Scanner;


public class Hotel4Estrellas extends Hotel{
    protected char gimnasio;
    protected String nombreRestaurante;
    protected int capacidadRestaurante;

    Scanner leer = new Scanner(System.in);

    public Hotel4Estrellas() {
    }

    public Hotel4Estrellas(char gimnasio, String nombreRestaurante, int capacidadRestaurante, int cantidadHabitaciones, int numeroCamas, int cantidadPisos, double precioHabitacion, String nombre, String direccion, String localidad, String gerente) {
        super(cantidadHabitaciones, numeroCamas, cantidadPisos, precioHabitacion, nombre, direccion, localidad, gerente);
        this.gimnasio = gimnasio;
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
    }
  
    
    public  Hotel4Estrellas crearHotel(){
        Hotel4Estrellas hotel = new Hotel4Estrellas();
        System.out.print("--- Datos Hotel ---");
        System.out.print("Nombre: "); hotel.setNombre(leer.nextLine());
        System.out.print("Direccion: "); hotel.setDireccion(leer.nextLine());
        System.out.print("Gerente: "); hotel.setGerente(leer.nextLine());
        System.out.print("Localidad: "); hotel.setLocalidad(leer.nextLine());
        System.out.print("Cantidad Habitaciones: "); hotel.setCantidadHabitaciones(leer.nextInt());leer.nextLine();
        System.out.print("Numero Camas: "); hotel.setNumeroCamas(leer.nextInt());
        System.out.print("Cantidad Pisos: "); hotel.setCantidadPisos(leer.nextInt());leer.nextLine();
        System.out.print("Tipo Gimnasio(A/B): "); hotel.setGimnasio(Character.toUpperCase(leer.next().charAt(0)));leer.nextLine();
        System.out.print("Nombre Restaurante: "); hotel.setNombreRestaurante(leer.nextLine());
        System.out.print("Capacidad Restaurante: "); hotel.setCapacidadRestaurante(leer.nextInt());
        
        leer.nextLine(); 
        
        hotel.setPrecioHabitacion(precioHabitacion());
        
        return hotel;
    }

    public char getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(char gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public int getCapacidadRestaurante() {
        return capacidadRestaurante;
    }

    public void setCapacidadRestaurante(int capacidadRestaurante) {
        this.capacidadRestaurante = capacidadRestaurante;
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

    

    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(int cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public int getNumeroCamas() {
        return numeroCamas;
    }

    public void setNumeroCamas(int numeroCamas) {
        this.numeroCamas = numeroCamas;
    }

    public int getCantidadPisos() {
        return cantidadPisos;
    }

    public void setCantidadPisos(int cantidadPisos) {
        this.cantidadPisos = cantidadPisos;
    }

    public double getPrecioHabitacion() {
        return precioHabitacion;
    }

    public void setPrecioHabitacion(double precioHabitacion) {
        this.precioHabitacion = precioHabitacion;
    }
    
    
    
    
    

    
    public char clasificarGimnasio(){
        gimnasio = Character.toUpperCase(gimnasio);
        
        if(gimnasio == 'A' || gimnasio == 'B'){
            return gimnasio;
        }else{
            return 'B'; // por defecto le mando B si no cumple con ninguna 
        }

    }
    /*
    Valor agregado por el restaurante:
• $10 si la capacidad del restaurante es de menos de 30 personas.
• $30 si está entre 30 y 50 personas.
• $50 si es mayor de 50.
    */
    
    public double valorAgregadoRestaurante(){
        double valor;
        if(capacidadRestaurante < 30){
            valor = 10;
        }else if(capacidadRestaurante >=30 && capacidadRestaurante <=50){
            valor = 30;
        }else{
            valor = 50;
        }
        return valor;
    }
    
    /*
    Valor agregado por el gimnasio:
• $50 si el tipo del gimnasio es A.
• $30 si el tipo del gimnasio es B.
    */
    
    public double valorAgregadoGimnasio(){
        double valorGimnasio;
        if(gimnasio == 'A'){
            valorGimnasio = 50;
        }else{
            valorGimnasio = 30;
        }
        return valorGimnasio;
    }
 
    /*
    El precio de una habitación debe calcularse de acuerdo con la siguiente fórmula:
PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por restaurante) + (valor
agregado por gimnasio) + (valor agregado por limosinas).
    */
    
    public double precioHabitacion(){
        double precioHabitacion;
        
        precioHabitacion = 50 +(1 * cantidadHabitaciones) + valorAgregadoRestaurante() + valorAgregadoGimnasio();
        
        return precioHabitacion;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
    
    
}
