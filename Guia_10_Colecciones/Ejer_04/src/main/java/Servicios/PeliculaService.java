/*
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:

• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla
 */
package Servicios;
import Entidad.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class PeliculaService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Pelicula> peliculas = new ArrayList<>();
    
    public Pelicula crearPelicula() {
        System.out.print("Titulo: ");
        String titulo = leer.nextLine();
        System.out.print("Director: ");
        String director = leer.nextLine();
        System.out.print("Duracion: ");
        int duracion = leer.nextInt();
        leer.nextLine();

        return new Pelicula(titulo, director, duracion);

    }

    public void agregarPelicula(Pelicula peli) {
        peliculas.add(peli);
    }

    public void cargaPeliculas() {
        String respuesta;
        do {
            agregarPelicula(crearPelicula());
            System.out.print("Desea seguir agregando peliculas? (S/N): ");
            respuesta = leer.nextLine();

        } while (respuesta.equalsIgnoreCase("s"));
    }

    public void mostrarTodas() {
        for (Pelicula peli : peliculas) {
            System.out.println(peli);
        }
        System.out.println("------------------------------");
    }

    public void mostrarMayor1Hora() {
        for (Pelicula peli : peliculas) {
            if (peli.getDuracion() > 60) {
                System.out.println(peli);
            }
        }
        System.out.println("------------------------------");
        System.out.println("");
    }

    public void ordenarPorDuracionMenoraMayor() {
        ArrayList<Pelicula> copiaPeliculas = new ArrayList<>(peliculas);

        Collections.sort(copiaPeliculas, Comparator.comparing(Pelicula::getDuracion));
        System.out.println("------ Peliculas ordenadas por Duracion de Menor a Mayor -------");
        for (Pelicula peli : copiaPeliculas) {
            System.out.println(peli);
        }
        System.out.println("------------------------------");
        System.out.println("");
    }

    public void ordenarPorDuracionMayorAMenor() {
        ArrayList<Pelicula> copiaLista = new ArrayList<>(peliculas);

        Collections.sort(copiaLista, Collections.reverseOrder(Comparator.comparing(Pelicula::getDuracion)));
        System.out.println("------ Peliculas ordenadas por Duracion de Mayor a Menor -------");
        for (Pelicula peli : copiaLista) {
            System.out.println(peli);
        }
        System.out.println("------------------------------");
        System.out.println("");
    }

    public void ordenarPorTitulo() {
        ArrayList<Pelicula> copiaLista = new ArrayList<>(peliculas);
        Collections.sort(copiaLista, Comparator.comparing(Pelicula::getTitulo));
        System.out.println("----- Peliculas ordenadas por Titulo ------");
        for (Pelicula peli : copiaLista) {
            System.out.println(peli);
        }
        System.out.println("------------------------------");
        System.out.println("");
    }

    public void ordenarPorDirector() {
        ArrayList<Pelicula> copia = new ArrayList<>(peliculas);
        Collections.sort(copia, Comparator.comparing(Pelicula::getDirector));
        System.out.println("------- Peliculas ordenadas por Director -------");
        for (Pelicula peli : copia) {
            System.out.println(peli);
        }
        System.out.println("------------------------------");
        System.out.println("");
    }

    public void InformeFinal() {
        System.out.println("======= Mostrando todas las Peliculas =========");
        mostrarTodas();
        System.out.println("----- Peliculas con duracion mayor a 1 hora -----");

        mostrarMayor1Hora();
        ordenarPorDuracionMayorAMenor();
        ordenarPorDuracionMenoraMayor();
        ordenarPorTitulo();
        ordenarPorDirector();
    }
}
