/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package egg.extra2_puntos;

import Entidad.Puntos;


public class Extra2_Puntos {

    public static void main(String[] args) {
        Puntos puntos = new Puntos();
        puntos.crearPuntos();
        double distancia = puntos.distancia();
        System.out.printf("Distancia entre los puntos: %.2f",distancia);
    }
}
