/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

/**
 *
 * @author paula
 * @param <T>
 */
public class NodoQueue <T> {

    T dato;
    NodoQueue<T> nodoSig;
    
    public NodoQueue(T dato){
        this.dato=dato;
        this.nodoSig= null;
        
    }
    
}
