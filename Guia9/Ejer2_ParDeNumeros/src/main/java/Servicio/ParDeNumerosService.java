/*
En el constructor vacío se usará el Math.random para generar los dos números.
Crear una clase ParDeNumerosService, en el paquete Servicios, que deberá además implementar los siguientes métodos:
Método mostrarValores que muestra cuáles son los dos números guardados.
Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor
Método calcularPotencia para calcular la potencia del mayor valor de la clase elevado al menor número. 
Previamente se deben redondear ambos valores.
Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores. 
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package Servicio;
import Entidad.ParDeNumeros;
import java.util.Scanner;

public class ParDeNumerosService {
    Scanner leer = new Scanner(System.in);
    
    ParDeNumeros par = new ParDeNumeros();
    public ParDeNumeros crearNumeros(){
        
        System.out.print("Ingrese num1: ");
        par.setNum1(leer.nextDouble());
        System.out.print("Ingrese num2: ");
        par.setNum2(leer.nextDouble());
        
        return par;
    }
   
    public void mostrarValores(ParDeNumeros par){
        System.out.println(par);
        
    }
    
    public double devolverMayor(){
        double mayor;
        if(par.getNum1()>par.getNum2()){
            mayor = par.getNum1();
        }else{
            mayor = par.getNum2();
        }
        
        return mayor;
    }
    
    public double devolverMenor(){
        double menor;
        if(par.getNum1()<par.getNum2()){
            menor = par.getNum1();
        }else{
            menor = par.getNum2();
        }
        
        return menor;
    }
    
    
    public void calcularPotencia(){
        double mayorRedondeado = Math.round(devolverMayor());
        double menorRedondeado = Math.round(devolverMenor());
        double potencia = Math.pow(mayorRedondeado,menorRedondeado);
        
        System.out.println(mayorRedondeado+"^"+menorRedondeado+" = " + potencia);
    }
    

    public void calcularRaiz(){
        double absoluto = Math.abs(devolverMenor());
        System.out.printf("La raiz cuadrada de %.2f",absoluto);
        System.out.printf(" = %.2f",Math.sqrt(absoluto));
        
    }
    
    
    public void menu() {
        int op;
        do {
            System.out.println("");
            System.out.println("*** Menu ***");
            System.out.println("1_ Ingresar numeros");
            System.out.println("2_ Mostrar Valores");
            System.out.println("3_ Devolver Mayor");
            System.out.println("4_ Calcular Potencia");
            System.out.println("5_ Calcular Raiz");
            System.out.println("6_ Salir");
            op = leer.nextInt();

            switch (op) {
                case 1:
                    crearNumeros();
                    break;
                case 2:
                    mostrarValores(par);
                    break;
                case 3:
                    System.out.println("Mayor --> " + devolverMayor());
                    break;

                case 4:
                    calcularPotencia();
                    break;

                case 5:
                    calcularRaiz();
                    break;
                case 6:
                    System.out.println("Saliendo..");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida.");
            }

        } while (op != 6);
    
    }
}