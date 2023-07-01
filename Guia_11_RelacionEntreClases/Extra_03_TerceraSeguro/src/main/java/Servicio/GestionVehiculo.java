/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Vehiculo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class GestionVehiculo {
    Scanner leer = new Scanner(System.in);
     private List<Vehiculo> vehiculos;

    public GestionVehiculo() {
        this.vehiculos = new ArrayList<>();
    }

     public Vehiculo registrarVehiculo(){
        Vehiculo vehiculo = new Vehiculo("Ford", "Focus", 2020, "123456", "ABC123", "Rojo", "Sed\u00e1n");
        System.out.print("Marca: ");
        vehiculo.setMarca(leer.nextLine());
        System.out.print("Modelo: ");
        vehiculo.setModelo(leer.nextLine());
        System.out.print("Año: ");
        vehiculo.setAnio(leer.nextInt()); leer.nextLine();
        System.out.print("Numero Motor: ");
        vehiculo.setNumeroMotor(leer.nextInt()); leer.nextLine();
        System.out.print("Chasis: ");
        vehiculo.setChasis(leer.nextInt());leer.nextLine();
        System.out.print("Color: ");
        vehiculo.setColor(leer.nextLine());
        System.out.print("Tipo: ");
        vehiculo.setTipo(leer.nextLine());
   
        return vehiculo;
        
    }
    
    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    public void eliminarVehiculo(Vehiculo vehiculo) {
        vehiculos.remove(vehiculo);
    }

    public List<Vehiculo> obtenerVehiculos() {
        return vehiculos;
    }
}
