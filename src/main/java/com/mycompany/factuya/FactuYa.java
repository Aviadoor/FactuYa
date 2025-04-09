/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.factuya;

/**
 *
 * @author Jhon
 */
public class FactuYa {
    public FactuYa(){
        
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
        FactuYa factura = new FactuYa();
        factura.AgregarCliente("Pedro");
    }
    public void AgregarCliente(String nombre){
        System.out.print("Cliente agregado: " + nombre);
        System.out.print("Se eliminara el cliente luego de 9 dias: " + nombre);
    }
}
