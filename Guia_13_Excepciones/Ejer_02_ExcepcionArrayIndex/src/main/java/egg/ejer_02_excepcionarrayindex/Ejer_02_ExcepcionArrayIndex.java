/*
Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
de rango).
 */

package egg.ejer_02_excepcionarrayindex;

import Entidad.ArrayString;

public class Ejer_02_ExcepcionArrayIndex {

    public static void main(String[] args) {
        String[] prueba = {"Matias"};
        ArrayString vector = new ArrayString(prueba);
        
        vector.mostrarVector();
        
    }
}
