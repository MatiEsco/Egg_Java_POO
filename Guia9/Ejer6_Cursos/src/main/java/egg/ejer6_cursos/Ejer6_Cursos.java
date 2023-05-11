/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package egg.ejer6_cursos;
import Entidad.Cursos;
import Servicios.CursoService;

public class Ejer6_Cursos {

    public static void main(String[] args) {
        CursoService sv = new CursoService();
        Cursos curso = sv.crearCurso();
        
        System.out.printf("Ganancia --> $%.2f",sv.calcularGananciaSemana1(curso));
    }
}
