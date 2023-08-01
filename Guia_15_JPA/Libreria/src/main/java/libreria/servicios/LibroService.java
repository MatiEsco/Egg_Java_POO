
package libreria.servicios;

import java.util.ArrayList;
import libreria.entidades.Libro;
import libreria.persistencia.ControladoraPersistencia;


public class LibroService {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void guardarLibro(Libro libro) throws Exception {

        controlPersis.guardarLibro(libro);

    }

    public void eliminarLibro(Long isbn) {
        controlPersis.eliminarLibro(isbn);

    }

    public void editarLibro(Libro libro) {
        controlPersis.editarLibro(libro);
    }

    public Libro consultarLibro(Long isbn) {
        return controlPersis.consultarLibro(isbn);
    }

    public Libro consultarLibroPorNombre(String titulo) {
        return controlPersis.consultarLibroPorNombre(titulo);
    }

    public ArrayList<Libro> consultarLibros() {
        return controlPersis.consultarLibros();
    }

    public ArrayList<Libro> consultarLibroPorAutor(String autor) {
        return controlPersis.consultarLibroPorAutor(autor);
    }
    
    
    public ArrayList<Libro> consultarLibroPorEditorial(String editorial){
        return controlPersis.consultarLibroPorEditorial(editorial);
    }
     
}
