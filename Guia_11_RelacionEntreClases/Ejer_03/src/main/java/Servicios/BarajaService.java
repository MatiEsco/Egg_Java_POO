/*
Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al método, este no mostrara esa primera carta.
 */
package Servicios;

import Entidad.Baraja;
import Entidad.Carta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BarajaService {
    Scanner leer = new Scanner(System.in);
    int indice = 0;
    ArrayList<Carta> cartasDadas = new ArrayList<>();

    public Baraja crearBaraja() {
        Baraja baraja = new Baraja();
        String[] palo = {"Oro", "Basto", "Copas", "Espadas"};

        ArrayList<Carta> mazo = new ArrayList<>();

        for (int i = 0; i < palo.length; i++) {
            for (int j = 0; j < 12; j++) {
                if (j == 7 || j == 8) {
                    continue;
                }

                mazo.add(new Carta((j + 1), palo[i]));
            }
        }

        baraja.setBaraja(mazo);

        return baraja;

    }

    public void barajar(Baraja baraja) {
        Collections.shuffle(baraja.getBaraja());
        indice = 0;

    }

    public Carta siguienteCarta(Baraja baraja) {
        ArrayList<Carta> mazo = baraja.getBaraja();

        if (mazo.isEmpty()) {
            System.out.println("No mas Cartas en el mazo..");
        } else {

            Carta cartaDar = mazo.get(indice);
            cartasDadas.add(cartaDar);
            mazo.remove(mazo.get(indice));
            return cartaDar;
        }

        return null;
    }

    public void cartasDisponibles(Baraja baraja) {
        System.out.println("Cartas Disponibles: " + baraja.getBaraja().size());
        System.out.println("Cartas Dadas: " + cartasDadas.size());
        System.out.println("");
    }

    public void darCartas(int cantidad, Baraja baraja) {

        if (cantidad > baraja.getBaraja().size()) {
            System.out.println("No queda esa Cantidad de Cartas en el mazo");
        } else {
            for (int i = 0; i < cantidad; i++) {
                System.out.println(siguienteCarta(baraja));
            }
        }
        System.out.println("");
    }

    public void cartasMonton() {
        System.out.println("Cartas que ya han Salido..");
        for (Carta carta : cartasDadas) {
            System.out.println(carta);
        }
        System.out.println("");
    }

    public void mostrarBaraja(Baraja baraja) {
        ArrayList<Carta> mazo = baraja.getBaraja();
        System.out.println("Mostrando Baraja..");
        if(mazo.isEmpty()){
            System.out.println("No hay mas cartas");
        }else{
            int aux = 0;
            for (Carta carta : mazo) {
               if(aux == 10) {
                   System.out.println("");
                   aux = 0;
               }
               System.out.print("[" + carta + "] ");
               aux ++;
            }
        }
        System.out.println("");
    }
    
    
    public void menu() {
        int opcion;
        Baraja nuevaBaraja = crearBaraja();
        do {
            System.out.println("---- Menu ----");
            System.out.println("1_ Barajar");
            System.out.println("2_ Siguiente Carta");
            System.out.println("3_ Cartas Disponibles");
            System.out.println("4_ Dar Cartas (Elige la cantidad)");
            System.out.println("5_ Mostrar Cartas ya Dadas");
            System.out.println("6_ Mostrar Baraja");
            System.out.println("7_ Salir");
            System.out.print("--> ");

            opcion = leer.nextInt();
            leer.nextLine();

            switch (opcion) {
                case 1:
                    barajar(nuevaBaraja);
                    break;

                case 2:
                    System.out.println(siguienteCarta(nuevaBaraja));
                    System.out.println("");
                    break;

                case 3:
                    cartasDisponibles(nuevaBaraja);
                    break;

                case 4:
                    int cant;
                    System.out.print("Ingrese Cantidad de Cartas: ");
                    cant = leer.nextInt();
                    leer.nextLine();
                    darCartas(cant, nuevaBaraja);
                    break;

                case 5:
                    cartasMonton();
                    break;

                case 6:
                    mostrarBaraja(nuevaBaraja);
                    break;

                case 7:
                    System.out.println("Saliendo..");
                    break;

                default:
                    System.out.println("Ingrese una opcion valida..");
            }
        } while (opcion != 7);

    }


}
