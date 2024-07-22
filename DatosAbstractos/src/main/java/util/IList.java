/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package util;

/**
 *
 * @author paula
 */
public interface IList<T> {
    
    /**
     * Agregar un dato al final de la lista
     * @param dato, el dato que quiero agregar
     */
    public void add (T dato);
    
    public T get (int index);
    
    public void add(T dato, int index);
    
    public void remove (int index);
    
    public int size();
    
    public boolean isEmpty();
    
}
