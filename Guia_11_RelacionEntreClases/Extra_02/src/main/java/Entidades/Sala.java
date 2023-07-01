/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;


public class Sala {
    private Asiento[][] sala;

    public Sala() {
    }

    public Sala(Asiento[][] sala) {
        this.sala = sala;
    }

    public Asiento[][] getSala() {
        return sala;
    }

    public void setSala(Asiento[][] sala) {
        this.sala = sala;
    }

 @Override
public String toString() {
    StringBuilder sb = new StringBuilder();
    for (int i = sala.length - 1; i >= 0; i--) {
        for (int j = 0; j < sala[i].length; j++) {
            Asiento asiento = sala[i][j];
            sb.append(asiento.toString()).append(" | ");
        }
        sb.append("\n");
    }
    return sb.toString();
}
    
    
}
