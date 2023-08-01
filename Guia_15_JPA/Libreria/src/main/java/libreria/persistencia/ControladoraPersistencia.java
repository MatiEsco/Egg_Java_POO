
package libreria.persistencia;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import libreria.entidades.Libro;
import libreria.persistencia.exceptions.NonexistentEntityException;


public class ControladoraPersistencia {
    ////// Parte para metodos de Libros ////////
    LibroJpaController libroJpa = new LibroJpaController();

    public void guardarLibro(Libro libro) throws Exception {
      libroJpa.create(libro);
        
    }

    public void eliminarLibro(Long bn) {
        try {
            libroJpa.destroy(bn);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarLibro(Libro libro) {
        try {
            libroJpa.edit(libro);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Libro consultarLibro(Long bn) {
       return libroJpa.findLibro(bn);
       
    }

    public ArrayList<Libro> consultarLibros() {
        List<Libro> librosAux = libroJpa.findLibroEntities();
        ArrayList<Libro> listaLibros = new ArrayList<>(librosAux);

        return listaLibros;
    }

    public Libro consultarLibroPorNombre(String titulo) {
        ArrayList<Libro> listaLibros = consultarLibros();
        
        for (Libro libro : listaLibros) {
            if(libro.getTitulo().equalsIgnoreCase(titulo)){
                return libro;
            }
        }
        
        return null;
    }

    public ArrayList<Libro> consultarLibroPorAutor(String autor) {
       ArrayList<Libro> lista = new ArrayList<>();
       ArrayList<Libro> librosPorAutor = new ArrayList<>();
       lista = consultarLibros();
       
        for (Libro libro : lista) {
            if (libro.getAutor().getNombre().equalsIgnoreCase(autor)) {
                librosPorAutor.add(libro);
            }
        }
        if (librosPorAutor.isEmpty()) {
            return null; // Devuelve null si no se encontraron libros con el autor buscado.
        }

        return librosPorAutor;
    }

    public ArrayList<Libro> consultarLibroPorEditorial(String editorial) {
       ArrayList<Libro> listaCompleta = new ArrayList<>();
       ArrayList<Libro> listaPorEditorial = new ArrayList<>();
       
       listaCompleta = consultarLibros();
       
       for(Libro libro : listaCompleta){
           if(libro.getEditorial().getNombre().equalsIgnoreCase(editorial)){
               listaPorEditorial.add(libro);
           }
       }
       
       if(listaPorEditorial.isEmpty()){
           return null;
       }
       
       return listaPorEditorial;
       
    }
    
    
   
    
    
}
