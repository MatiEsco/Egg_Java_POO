/*
Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Cantidad Salones de
Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio de las Habitaciones.
 */
package Entidad;

import java.util.Scanner;


public final class Hotel5Estrellas extends Hotel4Estrellas{
    private int cantidadSalones;
    private int cantidadSuites;
    private int cantidadLimosinas;
    Scanner leer = new Scanner(System.in);

    public Hotel5Estrellas(int cantidadSalones, int cantidadSuites, int cantidadLimosinas, char gimnasio, String nombreRestaurante, int capacidadRestaurante, int cantidadHabitaciones, int numeroCamas, int cantidadPisos, double precioHabitacion, String nombre, String direccion, String localidad, String gerente) {
        super(gimnasio, nombreRestaurante, capacidadRestaurante, cantidadHabitaciones, numeroCamas, cantidadPisos, precioHabitacion, nombre, direccion, localidad, gerente);
        this.cantidadSalones = cantidadSalones;
        this.cantidadSuites = cantidadSuites;
        this.cantidadLimosinas = cantidadLimosinas;
    }
    

    public Hotel5Estrellas() {
    }

    
   
    public  Hotel5Estrellas crearHotel() {
        Hotel5Estrellas hotel = new Hotel5Estrellas();
        
        System.out.print("--- Datos Hotel ---");
         System.out.print("Nombre: "); hotel.setNombre(leer.nextLine());
        System.out.print("Direccion: "); hotel.setDireccion(leer.nextLine());
        System.out.print("Gerente: "); hotel.setGerente(leer.nextLine());
        System.out.print("Localidad: "); hotel.setLocalidad(leer.nextLine());
        System.out.print("Cantidad Habitaciones: "); hotel.setCantidadHabitaciones(leer.nextInt());leer.nextLine();
        System.out.print("Numero Camas: "); hotel.setNumeroCamas(leer.nextInt());leer.nextLine();
        System.out.print("Cantidad Pisos: "); hotel.setCantidadPisos(leer.nextInt());leer.nextLine();
        System.out.print("Tipo Gimnasio(A/B): "); hotel.setGimnasio(Character.toUpperCase(leer.next().charAt(0)));leer.nextLine();
        System.out.print("Nombre Restaurante: "); hotel.setNombreRestaurante(leer.nextLine());leer.nextLine();
        System.out.print("Capacidad Restaurante: "); hotel.setCapacidadRestaurante(leer.nextInt());leer.nextLine();
        System.out.print("Cantidad Salones Conferencia: "); hotel.setCantidadSalones(leer.nextInt());leer.nextLine();
        System.out.print("Cantidad Suites: "); hotel.setCantidadSuites(leer.nextInt());
        System.out.print("Cantidad Limosinas: "); hotel.setCantidadLimosinas(leer.nextInt());
        leer.nextLine(); 
        
        hotel.setPrecioHabitacion(precioHabitacion());
        
        return hotel;

    }


    @Override
    public double precioHabitacion() {
        return super.precioHabitacion() + valorAgregadoLimo(); 
    }

    @Override
    public double valorAgregadoGimnasio() {
        return super.valorAgregadoGimnasio();
    }

    @Override
    public double valorAgregadoRestaurante() {
        return super.valorAgregadoRestaurante(); 
    }

    @Override
    public char clasificarGimnasio() {
        return super.clasificarGimnasio(); 
    }
    
    /*
    Valor agregado por las limosinas:
• $15 por la cantidad de limosinas del hotel.
    */

    public double valorAgregadoLimo(){
        return 15 * cantidadLimosinas;
    }

    public int getCantidadSalones() {
        return cantidadSalones;
    }

    public void setCantidadSalones(int cantidadSalones) {
        this.cantidadSalones = cantidadSalones;
    }

    public int getCantidadSuites() {
        return cantidadSuites;
    }

    public void setCantidadSuites(int cantidadSuites) {
        this.cantidadSuites = cantidadSuites;
    }

    public int getCantidadLimosinas() {
        return cantidadLimosinas;
    }

    public void setCantidadLimosinas(int cantidadLimosinas) {
        this.cantidadLimosinas = cantidadLimosinas;
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


    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
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

    @Override
    public String toString() {
        return super.toString() + "Cantida Suites: " + cantidadSuites; 
    }
    

    
}
