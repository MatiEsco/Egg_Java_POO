/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Cliente;
import Entidad.Poliza;
import Entidad.Vehiculo;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class GestionPolizas {
    Scanner leer = new Scanner(System.in);
    private List<Poliza> polizas;

    public GestionPolizas() {
        this.polizas = new ArrayList<>();
    }
    
    public Poliza registrarPoliza(Vehiculo vehiculo, Cliente cliente){
        Poliza poliza = new Poliza();
        poliza.setVehiculo(vehiculo);
        poliza.setCliente(cliente);
        
        System.out.print("Numero Poliza: "); poliza.setNumeroPoliza(leer.nextInt()); leer.nextLine();
        System.out.println("Fecha Inicio"); System.out.println("Año: "); int anio = leer.nextInt();
        System.out.print("Mes: "); int mes = leer.nextInt();
        System.out.print("Dia: "); int dia = leer.nextInt();
        poliza.setFechaInicio(LocalDate.of(anio,mes,dia));
        
        System.out.println("Fecha Fin");
        System.out.print("Año: "); anio = leer.nextInt();
        System.out.print("Mes: "); mes = leer.nextInt();
        System.out.print("Dia: "); dia = leer.nextInt();
        
        poliza.setFinPoliza(LocalDate.of(anio,mes,dia));
        
        System.out.print("Cantidad Cuotas: "); poliza.setCantidadCuotas(leer.nextInt()); leer.nextLine();
        System.out.print("Forma de Pago: "); poliza.setFormaPago(leer.nextLine());
        System.out.print("Monto Total Asegurado: "); poliza.setMontoTotalAsegurado(leer.nextDouble());
        System.out.print("Incluye Granizo(S/N): "); String granizo = leer.next();
        if(granizo.equalsIgnoreCase("S")){
            poliza.setIncluyeGranizo(true);
        }else{
            poliza.setIncluyeGranizo(false);
        }
        
        
        if(poliza.isIncluyeGranizo()){
            System.out.print("Monto Maximo Granizo: ");
            poliza.setMontoMaximoGranizo(leer.nextDouble());
        }else{
            poliza.setMontoMaximoGranizo(0);
        }
        
        System.out.print("Tipo Cobertura: ");
        poliza.setTipoCobertura(leer.nextLine());
        
        
        return poliza;
        
    }
    

    public void agregarPoliza(Poliza poliza) {
        polizas.add(poliza);
    }

    public void eliminarPoliza(Poliza poliza) {
        polizas.remove(poliza);
    }

    public List<Poliza> obtenerPolizas() {
        return polizas;
    }
}
