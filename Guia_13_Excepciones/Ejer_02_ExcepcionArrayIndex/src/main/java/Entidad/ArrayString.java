/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

public class ArrayString {
    private String[] nombres;

    public ArrayString() {
    }

    public ArrayString(String[] nombres) {
        this.nombres = nombres;
    }
   
    public void mostrarVector(){
        try{
            for(int i = 0; i<2; i++){
                System.out.println(nombres[i]);
            }
            System.out.println("");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Indice fuera de rango!!");
            System.out.println(e.getMessage());
            System.out.println(e.getClass().getSimpleName());
        }
        
    }
    
    
    
}
