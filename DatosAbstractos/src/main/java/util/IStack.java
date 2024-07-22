/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package util;

/**
 *
 * @author paula
 * @param <T>
 */
public interface IStack <T> {
    /**
     * Agregar un dato al final de la lista
     * @param dato, el dato que quiero agregar
     */
    
    public void push (T dato);
    
    public T pop();
    
    public T peek ();
    
    public boolean isEmpty();
    
}
