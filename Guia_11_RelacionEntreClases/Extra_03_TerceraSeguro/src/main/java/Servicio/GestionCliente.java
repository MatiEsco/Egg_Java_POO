/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Cliente;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class GestionCliente {
    Scanner leer = new Scanner(System.in);
     private  List<Cliente> clientes;

    public GestionCliente() {
        this.clientes = new ArrayList<>();
    }
    
    public Cliente registrarCliente(){
        Cliente cliente = new Cliente();
        System.out.print("Nombre: ");
        cliente.setNombre(leer.nextLine());
        System.out.print("Apellido: ");
        cliente.setApellido(leer.nextLine());
        System.out.print("Dni: ");
        cliente.setDni(leer.nextLine());
        System.out.print("Mail: ");
        cliente.setMail(leer.nextLine());
        System.out.print("Domicilio: ");
        cliente.setDomicilio(leer.nextLine());
        System.out.print("Telefono: ");
        cliente.setTelefono(leer.nextLine()); 
        leer.nextLine();
         
        return cliente;
    }

    public void agregarCliente() {
        clientes.add(registrarCliente());
    }

    public void eliminarCliente(Cliente cliente) {
        clientes.remove(cliente);
    }

    public Cliente buscarCliente(String documento) {
        for (Cliente cliente : clientes) {
            if (cliente.getDni().equals(documento)) {
                return cliente;
            }
        }
        return null;
    }

    public List<Cliente> obtenerClientes() {
        return clientes;
    }
}
