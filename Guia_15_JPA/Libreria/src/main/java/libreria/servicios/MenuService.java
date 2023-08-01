
package libreria.servicios;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;


public class MenuService {

    LibroService lsv = new LibroService();
    Scanner leer = new Scanner(System.in);

    public void menu() {

        int op;

        do {
            System.out.println("---- Menu ----");
            System.out.println("1_ Guardar Libro");
            System.out.println("2_ Editar Libro");
            System.out.println("3_ Eliminar Libro");
            System.out.println("4_ Busqueda por ISBN");
            System.out.println("5_ Busqueda por Titulo");
            System.out.println("6_ Busqueda por Autor");
            System.out.println("7_ Busqueda por Editorial");
            System.out.println("8_ Mostrar todos los libros");
            System.out.println("9_ Salir");

            op = leer.nextInt();
            leer.nextLine();

            switch (op) {

                case 1: {
                    try {
                        lsv.guardarLibro(pedirDatos());
                        System.out.println("Libro guardado Correctamente");
                    } catch (Exception ex) {

                        //Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                        System.out.println("Error al guardar");
                    }
                    break;
                }

                case 2:
                    lsv.editarLibro(pedirDatos());
                    System.out.println("Editado correctamente");
                    break;

                case 3:
                    System.out.print("ISBN del libro: ");
                    Long numIsbn = leer.nextLong();
                    leer.nextLine();
                    lsv.eliminarLibro(numIsbn);
                    System.out.println("Libro Eliminado");
                    break;

                case 4:
                    System.out.print("ISBN del libro: ");
                    Long buscarISBN = leer.nextLong();
                    leer.nextLine();
                    Libro libroISBN = lsv.consultarLibro(buscarISBN);
                    if(libroISBN != null){
                        System.out.println(libroISBN);
                    }else{
                        System.out.println("El libro no existe en la Base de Datos");
                    }
                    
                    
                    break;

                case 5:
                    System.out.print("Titulo del Libro: ");
                    String titulo = leer.nextLine();
                    
                    Libro libroPorNombre = new Libro();
                    
                    libroPorNombre = lsv.consultarLibroPorNombre(titulo);
                    
                    if(libroPorNombre == null){
                        System.out.println("No se encontró coincidencias en la Base de Datos");
                    }else{
                        System.out.println(libroPorNombre);
                        
                    }
                    
                    
                    break;

                case 6:
                    System.out.print("Nombre Autor: ");
                    String nombreAutor = leer.nextLine();
                    ArrayList<Libro> listaPorAutor = lsv.consultarLibroPorAutor(nombreAutor);
                    if (listaPorAutor.isEmpty()) {
                        System.out.println("No se encontraron libros con el Autor especificado");
                    } else {
                        System.out.println("---- Lista de libros por Autor ----");
                        for (Libro libro : listaPorAutor) {
                            System.out.println(libro);
                        }
                    }
                    
                    break;

                case 7:
                    System.out.print("Nombre Editorial: ");
                    String nombreEditorial = leer.nextLine();
                    ArrayList<Libro> listaPorEditorial = lsv.consultarLibroPorEditorial(nombreEditorial);
                    if (listaPorEditorial.isEmpty()) {
                        System.out.println("No se encontraron libros con el Editorial especificado");
                    } else {
                        System.out.println("---- Lista de libros por Editorial ----");
                        for (Libro libro : listaPorEditorial) {
                            System.out.println(libro);
                        }
                    }

                    break;

                case 8:
                    
                    ArrayList<Libro> listaCompleta = lsv.consultarLibros();
                    if (listaCompleta.isEmpty()) {
                        System.out.println("No hay libros cargados en la Base de Datos");
                    } else {
                        System.out.println("---- Mostrando todos los libros disponibles ----");
                        for (Libro libro : listaCompleta) {
                            System.out.println(libro);
                        }
                    }

                    break;

                case 9:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opcion Invalida");
                    break;
            }

        } while (op != 9);

    }

    public Libro pedirDatos() {
        Libro libro = new Libro();
        System.out.println("Ingrese datos del libro");
        System.out.print("ISBN: ");
        libro.setIsbn(leer.nextLong());
        leer.nextLine();
        System.out.print("Titulo: ");
        libro.setTitulo(leer.nextLine());
        System.out.print("Año: ");
        libro.setAnio(leer.nextInt());
        leer.nextLine();
        System.out.print("Ejemplares: ");
        libro.setEjemplares(leer.nextInt());
        leer.nextLine();
        System.out.print("Ejemplares Prestados: ");
        libro.setEjemplaresPrestados(leer.nextInt());
        leer.nextLine();
        System.out.print("Ejemplares Restantes: ");
        libro.setEjemplaresRestantes(leer.nextInt());
        leer.nextLine();
        libro.setAlta(true);

        Autor autor = new Autor();

        System.out.print("Autor: ");
        autor.setNombre(leer.nextLine());
        autor.setAlta(true);
        autor.setId(Integer.SIZE);

        Editorial editorial = new Editorial();

        System.out.print("Nombre Editorial: ");
        editorial.setNombre(leer.nextLine());
        editorial.setAlta(true);
        editorial.setId(Integer.SIZE);

        libro.setAutor(autor);
        libro.setEditorial(editorial);

        return libro;

    }

}
