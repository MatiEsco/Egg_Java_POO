/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package egg.ejer_04;

import Servicios.PeliculaService;

public class Ejer_04 {

    public static void main(String[] args) {
        PeliculaService sv = new PeliculaService();
        sv.cargaPeliculas();
        sv.InformeFinal();
    }
}
