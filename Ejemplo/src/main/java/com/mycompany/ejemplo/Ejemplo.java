/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejemplo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author paula
 */
public class Ejemplo {

    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>(); // LO que esta a la izquierda del igual se usa para definir el tipo de dato
//        int edad = 10;  //Lo que esta a la derecha del igual asigna un valor 
//        String nombre = "Juan";
//        
//        Persona profesor = new Profesor("Carlos", "Calarca",33);
        nombres.add("pepe");
        nombres.add(0,"grillo");
        nombres.remove("pepe");
        nombres.remove(0);
        
        
        LinkedList<String> ciudades = new LinkedList<String> ();
        ciudades.add("barranquilla");
        ciudades.add("bogota");
        ciudades.remove();
        //For normal 
        for(int i = 0;i<nombres.size();i++){
        System.out.println(nombres.get(i));
        //For eich 
        for (String actual: ciudades){
            System.out.println(actual);
        }
        
    }
        
        List<String> apellidos = new ArrayList<>(); //La interfaz list declara 10 metodos
        ArrayList<String> apellidos2 = new ArrayList<>();//EL array list declara e implemnta 15 metodos 
        
                ArrayList<String> departamentos = new ArrayList<>(ciudades);
                for(int i =0; i<departamentos.size(); i++){
                    System.out.println(departamentos.get(i));
                }
    }
}
