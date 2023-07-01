/*

 */

package egg.extra_01_barco;
import Entidad.*;
import java.time.LocalDate;


public class Extra_01_Barco {

    public static void main(String[] args) {
        Velero velero = new Velero(2,"V123",20,2017);
        Alquiler alquiler = new Alquiler("Juan Pérez", "12345678", LocalDate.of(2023, 6, 1),
                                        LocalDate.of(2023, 6, 7), "Amarre 1", velero);
        double precioFinal = alquiler.calcularAlquiler();
        System.out.println("Precio final del alquiler: " + precioFinal);
    }
}
