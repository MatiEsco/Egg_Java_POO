/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package egg.extra6_rectangulo;

import Entidad.Rectangulo;

/**
 *
 * @author MatiPC
 */
public class Extra6_Rectangulo {

    public static void main(String[] args) {
        Rectangulo rec = new Rectangulo(4,6);
        System.out.printf("Area del Rectangulo --> %.2f", rec.calcular_area(0, 0));
    }
}
