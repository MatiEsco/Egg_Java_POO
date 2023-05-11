/*
Vamos a usar la clase Date que ya existe en Java. Crearemos la clase
FechaService, en paquete Servicios, que tenga los siguientes métodos:
a) Método fechaNacimiento que pregunte al usuario día, mes y año de
su nacimiento. Luego los pase por parámetro a un nuevo objeto Date.
El método debe retornar el objeto Date. Ejemplo fecha: Date fecha =
new Date(anio, mes, dia);
b) Método fechaActual que cree un objeto fecha con el día actual. Para
esto usaremos el constructor vacío de la clase Date. Ejemplo: Date
fechaActual = new Date();
El método debe retornar el objeto Date.
c) Método diferencia que reciba las dos fechas por parámetro y retorna
la diferencia de años entre una y otra (edad del usuario).
 */
package Servicios;

import java.util.Date;
import java.util.Scanner;

public class FechaService {

    Scanner leer = new Scanner(System.in);

    public Date fechaNacimiento() {
        int dia, mes, anio;
        System.out.println("Fecha de nacimiento");
        System.out.print("Dia: ");
        dia = leer.nextInt();
        System.out.print("Mes: ");
        mes = leer.nextInt();
        System.out.print("Año: ");
        anio = leer.nextInt();
        
        anio-=1900;
        mes-=1;

        return new Date(anio, mes, dia);

    }

    public Date fechaActual(){
        Date fechaActual = new Date();
        return fechaActual;
    }
    
    public int diferencia(Date nacimiento, Date actual){
        
       int anios = actual.getYear() - nacimiento.getYear();
        if (actual.getMonth() < nacimiento.getMonth() || (actual.getMonth() == nacimiento.getMonth()
                        && actual.getDate() < nacimiento.getDate())) {
            anios--;
        }
        return anios;
        
    }
}
