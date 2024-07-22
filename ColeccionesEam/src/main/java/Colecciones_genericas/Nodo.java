/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Colecciones_genericas;

/**
 *
 * @author paula
 * @param <Tipo>
 */
public class Nodo<Tipo> {
    
    private Tipo dato;
    private Nodo<Tipo> siguiente;
    
    public Nodo (Tipo dato, Nodo<Tipo> siguiente) {
        this.dato = dato;
        this. siguiente = siguiente;
        
        
    }

    public Tipo getDato() {
        return dato;
    }

    public void setDato(Tipo dato) {
        this.dato = dato;
    }

    public Nodo<Tipo> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo<Tipo> siguiente) {
        this.siguiente = siguiente;
    }
    
    }

