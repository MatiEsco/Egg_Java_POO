/*
Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual
deberá contener como atributos, un vector con la palabra a buscar, la
cantidad de letras encontradas y la cantidad jugadas máximas que
puede realizar el usuario
 */
package Entidad;

public class Ahorcado {
    private String[] palabra;
    private int cant_Encontrada;
    private int cant_Jugadas;
    

    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, int cant_Jugadas) {
        this.palabra = palabra;
        
        this.cant_Jugadas = cant_Jugadas;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getCant_Encontrada() {
        return cant_Encontrada;
    }

    public void setCant_Encontrada(int cant_Encontrada) {
        this.cant_Encontrada = cant_Encontrada;
    }

    public int getCant_Jugadas() {
        return cant_Jugadas;
    }

    public void setCant_Jugadas(int cant_Jugadas) {
        this.cant_Jugadas = cant_Jugadas;
    }
    
    
}
