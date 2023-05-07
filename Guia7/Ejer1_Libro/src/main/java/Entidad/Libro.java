/*
 Crear una clase llamada Libro que contenga los siguientes atributos: 
ISBN, Título, Autor, Número de páginas,
y un constructor con todos los atributos pasados por parámetro 
y un constructor vacío. 
Crear un método para cargar un libro pidiendo los datos al usuario 
y luego informar mediante otro método el número de ISBN, el título, 
el autor del libro y el número de páginas.

 */
package Entidad;
import java.util.Scanner;
/**
 *
 * @author MatiPC
 */
public class Libro {
    
    private String ISBN;
    private String titulo;
    private String autor;
    private int paginas;

    public Libro() {
    }

    public Libro(String ISBN, String titulo, String autor, int paginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", paginas=" + paginas + '}';
    }
    
    
    
    
    public void cargaLibro(){
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Titulo: ");
        this.titulo = leer.nextLine();
        
        System.out.print("Autor: ");
        this.autor = leer.nextLine();
        
        System.out.print("Numero de Paginas: ");
        this.paginas = leer.nextInt();
        
        System.out.print("ISBN: ");
        this.ISBN = leer.next();
    }
    
    
    public void informarLibro(){
        System.out.println("ISBN --> " + this.ISBN);
        System.out.println("Titulo --> "+ this.titulo);
        System.out.println("Autor --> "+ this.autor);
        System.out.println("Numero Paginas --> " + this.paginas);
    }
}
