/*
Luego, en RaicesServicio las operaciones que se podrán realizar son las siguientes:
Método getDiscriminante(): devuelve el valor del discriminante (double). 
    El discriminante tiene la siguiente fórmula: (b^2)-4*a*c
Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones,
    para que esto ocurra, el discriminante debe ser mayor o igual que 0.
Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, 
    para que esto ocurra, el discriminante debe ser igual que 0.
Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2 posibles soluciones.
Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz.
    Es en el caso en que se tenga una única solución posible.
Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(),
y mostrará por pantalla las posibles soluciones que tiene nuestra ecuación 
con los métodos obtenerRaices() o obtenerRaiz(), según lo que devuelvan 
nuestros métodos y en caso de no existir solución, se mostrará un mensaje.

Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varía el signo delante de -b

 */
package Servicio;
import Entidad.Raices;
import java.util.Scanner;
public class RaicesService {
    Scanner leer = new Scanner(System.in);
    public Raices crearRaiz(){
       System.out.println("Introducir los siguientes valores: a, b, c..");
        System.out.print("A: ");
        int a = leer.nextInt();
        
        while(a == 0) {
            System.out.println("El valor de 'a' no puede ser cero. Introduce otro valor:");
            a = leer.nextInt();
        }
        
        System.out.print("B: ");
        int b = leer.nextInt();
        System.out.print("C: ");
        int c = leer.nextInt();
        
        return new Raices(a,b,c);

    }
    
    public double getDiscriminante(Raices raiz){
        int a = raiz.getA();
        int b = raiz.getB();
        int c = raiz.getC();
        
        return Math.pow(b, 2) - 4 * a * c;
    }
    
    public boolean tieneRaices(Raices raiz){
        double discriminante = getDiscriminante(raiz);
        
        return discriminante >= 0;
    }
    
    public boolean tieneRaiz(Raices raiz){
        double discri = getDiscriminante(raiz);
        
        if(discri == 0){
            System.out.println("Tiene una unica Solución.");
            return true;
        }else{
            return false;
        }
    }
    
    public void obtenerRaices(Raices raiz){
        double x1,x2;
        int a = raiz.getA();
        int b = raiz.getB();
        int c = raiz.getC();
        double discriminante = getDiscriminante(raiz);
        if(discriminante >= 0){
            x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Las raices son x1= " + x1 + " y x2= " + x2);
        }
    }
    
    public void obtenerRaiz(Raices raiz){
        double discriminante = getDiscriminante(raiz);
        double x;
        int a = raiz.getA();
        int b = raiz.getB();
        
        if(tieneRaiz(raiz)){
            x = (-b + Math.sqrt(discriminante)) / (2 * a);
            System.out.println("La raiz de la ecuacion es: " + x);
        }
        
    }
    
   public void calcular(Raices raiz){
        double discriminante = getDiscriminante(raiz);
        if (discriminante > 0) {
            obtenerRaices(raiz);
        } else if (discriminante == 0) {
            obtenerRaiz(raiz);
        } else {
            System.out.println("La ecuación no tiene solución real.");
        }
    }
}