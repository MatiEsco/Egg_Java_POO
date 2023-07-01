/*
Realizar un sistema de consulta que le permite al usuario consultar por diferentes criterios:
• todos los alojamientos.
• todos los hoteles de más caro a más barato.
• todos los campings con restaurante
• todos las residencias que tienen descuento.
 */
package Servicio;
import ClasesAbstractas.ExtraHoteleros;
import ClasesAbstractas.Hotel;
import Entidad.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public  class SistemaConsulta {
    List<Hotel> listaHoteles;
    List<ExtraHoteleros> listaExtras;
    Scanner leer = new Scanner(System.in);
    public SistemaConsulta() {
        this.listaHoteles = new ArrayList<>();
        this.listaExtras = new ArrayList<>();
    }
    
    
    public void agregarHotel(Hotel hotel){
        listaHoteles.add(hotel);
    }
    
    public void agregarExtraHoteleros(ExtraHoteleros extra){
        listaExtras.add(extra);
    }
    
    
    public void menu(){
        Hotel4Estrellas h4 = new Hotel4Estrellas();
        Hotel5Estrellas h5 = new Hotel5Estrellas();
        Residencia resi = new Residencia();
        Camping camp = new Camping();
        
        int op, op2,tipoHotel,tipoExtra;
        
        do{
            System.out.println("--- Menu ---");
            System.out.println("1_ Agregar Alojamiento");
            System.out.println("2_ Sistema de Consulta");
            System.out.println("3_ Salir");
            
            op = leer.nextInt(); leer.nextLine();
            
            switch(op){
                case 1:
                    do{
                    System.out.println("1_ Agregar Nuevo Hotel");
                    System.out.println("2_ Agregar Alojamiento ExtraHotelero");
                    System.out.println("3_ Salir");
                    op2 = leer.nextInt();
                    
                    switch(op2){
                        case 1:
                            do{
                            System.out.println("1_ Hotel 4 Estrellas");
                            System.out.println("2_ Hotel 5 Estrellas");
                            System.out.println("3_ Volver Atras");
                            tipoHotel = leer.nextInt();
                            
                            switch(tipoHotel){
                                case 1:
                                    agregarHotel(h4.crearHotel());
                                    break;
                                case 2:
                                    agregarHotel(h5.crearHotel());
                                    break;
                                default: System.out.println("Opcion no valida!");    
                            }
                            
                            }while(tipoHotel != 3);
                            break;
                        case 2:
                            do{
                            System.out.println("1_ Camping");
                            System.out.println("2_ Residencia");
                            System.out.println("3_ Volver Atras");
                            tipoExtra = leer.nextInt();
                            
                            switch(tipoExtra){
                                case 1:
                                    agregarExtraHoteleros(camp.crearCamping());
                                    break;
                                case 2:
                                    agregarExtraHoteleros(resi.crearResidencia());
                                    break;

                                case 3:
                                    System.out.println("Volviendo atras...");
                                    break;
                                default:
                                    System.out.println("Opcion no valida!");
                                    break;
                            }
                            
                            }while(tipoExtra != 3);
                    }
                    
                    
                    }while(op2 != 3);
                    break;
                    
                case 2:
                    consulta();
                    break;
                    
                case 3: 
                    System.out.println("----- Saliendo -----");
                    break;
                    
                default: System.out.println("Opcion no valida");
                break;
                    
            }
            
            
            
      
        }while(op != 3);
        
        
        
    }
    /*
     todos los alojamientos.
• todos los hoteles de más caro a más barato.
• todos los campings con restaurante
• todos las residencias que tienen descuento.
    */
    
    
    public void consulta() {
        int consulta;

        do {
            System.out.println("*** Sistema de Consulta ***");
            System.out.println("1_ Ver todos los Alojamientos");
            System.out.println("2_ Ver Hoteles de mas Caro a mas barato");
            System.out.println("3_ Ver todos los Camping con restaurante");
            System.out.println("4_ Ver Residencias con Descuento");
            System.out.println("5_ Salir");
            consulta = leer.nextInt();
            leer.nextLine();

            switch (consulta) {
                case 1:
                    System.out.println("   Hoteles   ");
                    for (Hotel hotel : listaHoteles) {
                        if (hotel instanceof Hotel4Estrellas) {
                            System.out.println("Hotel 4 Estrellas");
                            System.out.println(hotel);
                            System.out.println("---------------------");
                        } else {
                            System.out.println("Hotel 5 Estrellas");
                            System.out.println(hotel);
                            System.out.println("---------------------");
                        }
                    }
                    System.out.println("   ExtraHoteleros   ");
                    for (ExtraHoteleros extra : listaExtras) {
                        if (extra instanceof Camping) {
                            System.out.println("Camping");
                            System.out.println(extra);
                            System.out.println("--------------------");
                        } else {
                            System.out.println("Residencia");
                            System.out.println(extra);
                            System.out.println("-------------------");
                        }
                    }
                    break;

                case 2:
                    ArrayList<Hotel> copiaHoteles = new ArrayList<>(listaHoteles);
                    Collections.sort(copiaHoteles, Comparator.comparing(Hotel::getPrecioHabitacion).reversed());
                    System.out.println(copiaHoteles);
                    System.out.println("-------------------");
                    break;

                case 3:
                    System.out.println("Mostrando Camping con Restaurantes");
                    for (ExtraHoteleros aux : listaExtras) {
                        if (aux instanceof Camping) {
                            if (((Camping) aux).isRestaurante()) {
                                System.out.println(aux);
                            }
                        }
                    }
                    break;

                case 4:
                    System.out.println("Mostrando Residencias con Descuento");

                    for (ExtraHoteleros aux2 : listaExtras) {
                        if (aux2 instanceof Residencia) {
                            if (((Residencia) aux2).isDescuento()) {
                                System.out.println(aux2);
                            }
                        }
                    }

                    break;

                case 5:
                    System.out.println("Cerrando Sistema de Consultas..");
                    break;

                default:
                    System.out.println("Opcion no valida");
                    break;
                    
            }
            
            
        }while(consulta!= 5);
        
        
    }
    
}
