/*
Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
Método para crear cuenta pidiéndole los datos al usuario.

 */
package Servicio;
import Entidad.CuentaBancaria;
import java.util.Scanner;

public class CuentaBancariaServicio {
    Scanner leer = new Scanner(System.in);
    
    public CuentaBancaria crearCuenta(){
        System.out.println("Numero Cuenta: ");
        int numCuenta = leer.nextInt();
        
        System.out.println("Dni: ");
        int dni = leer.nextInt();
        
        System.out.println("Saldo Actual: ");
        double saldo = leer.nextDouble();
        
        return new CuentaBancaria(numCuenta,dni,saldo);
        
    }
    //Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.
    public void ingresar(CuentaBancaria cuenta ){
        double monto;
        System.out.println("Ingresar monto: ");
        monto = leer.nextDouble();
        
        cuenta.setSaldoActual(cuenta.getSaldoActual() + monto);
    }
    
    //Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual. 
    //Si la cuenta no tiene la cantidad de dinero a retirar se retirará el máximo posible hasta dejar la cuenta en 0.
    
    public void retirar(CuentaBancaria cuenta ){
        double saldoActual = cuenta.getSaldoActual();
        double montoRetiro;
        System.out.println("Ingrese un monto: ");
        montoRetiro = leer.nextDouble();
        
        if(montoRetiro > saldoActual){
            System.out.println("Sobrepasa el limite. Se retirará todo el saldo disponible.");
            montoRetiro = saldoActual;
        }
        
        cuenta.setSaldoActual(saldoActual - montoRetiro);
    }
    
    //Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
    public void extraccionRapida(CuentaBancaria cuenta){
        double saldoActual = cuenta.getSaldoActual();
        double maximo = (saldoActual * 0.2);
        
        System.out.println("Puede retirar hasta $" + maximo);
        
        System.out.println("Ingrese Monto: ");
        double monto = leer.nextDouble();
        
        if(monto > maximo){
            monto = maximo;
        }
        
        cuenta.setSaldoActual(saldoActual - monto);
        
            
    }
    
    //Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
    public double consultarSaldo(CuentaBancaria cuenta){
        return cuenta.getSaldoActual();
    }
    
    //Método consultarDatos: permitirá mostrar todos los datos de la cuenta.
    public void consultarDatos(CuentaBancaria cuenta){
        System.out.println("Numero Cuenta: " + cuenta.getNumeroCuenta());
        System.out.println("Dni: " + cuenta.getDniCliente());
        System.out.println("Saldo: " + cuenta.getSaldoActual());
    }
    
}

