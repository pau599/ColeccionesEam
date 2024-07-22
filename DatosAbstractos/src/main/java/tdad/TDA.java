/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tdad;

import declaracione.IEjemplo;
import definiciones.EjemploUno;
import util.IList;
import util.Lista;

/**
 *
 * @author paula
 */
public class TDA{
    
    public static void main(String [] args) {
        
        IEjemplo ejemplo= new EjemploUno();
        //ejemplo.darMensaje();
        IList<String> lista = new Lista<>();
        lista.add("Primero");
        lista.add("Segundo");
        lista.add("Tercero");
        for (int i=0; i< lista.size(); i++){
            System.out.println(lista.get(i));
        }
IList<Perro> perros= new Lista<>();
    }
    
}
