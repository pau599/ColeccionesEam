/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

/**
 *
 * @author paula
 * @param <S>
 */
public class NodoStack<S> {
    
    
    S dato;
    
    Nodo<S> nodoSig;
    
    public NodoStack (S dato){
        this.dato=dato;
        this.nodoSig= null;
        
    }
}
