/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package egg.extra_02;

import Entidades.Cine;
import Entidades.Espectador;
import Entidades.Pelicula;
import Entidades.Sala;
import Servicios.CineService;
import Servicios.EspectadorService;
import Servicios.SalaService;
import java.util.List;

public class Extra_02 {

    public static void main(String[] args) {
        Pelicula peli = new Pelicula("Titanic",180,12,"James Cameron");
        SalaService sala_sv = new SalaService();
        Sala sala1 = new Sala();
        sala1 = sala_sv.crearSala();
        System.out.println("****Mostrando Sala Vacia****");
        System.out.println(sala1);
        
        EspectadorService espec_sv = new EspectadorService();
        Cine cine = new Cine(peli,sala1,95);
        
        List<Espectador> listaEspectadores=espec_sv.generarListaEspectadores(30);
        
        CineService cine_sv = new CineService();
        System.out.println("Ubicando Espectadores...");
        cine_sv.ubicarEspectadores(cine, listaEspectadores);
        
        System.out.println(sala1);
     
    }
}
