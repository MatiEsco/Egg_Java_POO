/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package egg.ejer3_operacion;

import Entidad.Operacion;

/**
 *
 * @author MatiPC
 */
public class Ejer3_Operacion {

    public static void main(String[] args) {
        Operacion ope = new Operacion();
        
        ope.crearOperacion();
        
        System.out.println("Suma --> " + ope.sumar());
        System.out.println("Resta --> "+ ope.restar());
        System.out.println("Multiplicacion --> " + ope.multiplicar());
        System.out.println("Division --> " + ope.dividir());

        
       
    }
}
