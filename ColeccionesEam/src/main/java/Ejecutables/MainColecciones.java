/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejecutables;

import Colecciones_genericas.ListaEnlazadaSmp;

/**
 *
 * @author paula
 */
public class MainColecciones {
    
    public static void main(String []args) {
    System.out.println("---Lista Generica---");
    
    ListaEnlazadaSmp <String> ciudades = new ListaEnlazadaSmp <>();
    
    ciudades.agregar ("Cartagena");
    ciudades.agregar ("Armenia");
    ciudades.agregar ("Cali");
    
    ciudades.imprimirContenido();
    
    System.out.println("---Lista No Generica");
    
    ListaEnlazadaSmp ciudades2 = new ListaEnlazadaSmp();
    ciudades2.agregar("Medellin");
    ciudades2.agregar("Pereira");
    ciudades2.agregar("Manizales");
    
    }
}
