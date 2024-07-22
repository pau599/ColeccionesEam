/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Colecciones_genericas;

/**
 *
 * @author paula
 */
public class ListaEnlazadaSmp<Tipo> {
    
    private int tamano;
    private Nodo <Tipo> cabeza;

    public ListaEnlazadaSmp(int tamano, Nodo<Tipo> cabeza) {
        this.tamano = 0;
        this.cabeza = null;
    }
    
    public void agregar(Tipo elemento){
        Nodo<Tipo>  nuevoNodo= new Nodo<>(elemento, null);
        
        if(this.cabeza==null){
            this.cabeza= nuevoNodo;
        } else{
            Nodo<Tipo> nodoActual= cabeza;
            
            while (nodoActual.getSiguiente() != null) {
                nodoActual= cabeza.getSiguiente();
            }
            
            nodoActual.setSiguiente(nuevoNodo);
            
        }
        
        tamano++;
    }
    
    public void imprimirContenido() {
        if (this.cabeza== null) {
            return;
        }
        
        Nodo nodoActual = this.cabeza;
        while(nodoActual.getSiguiente()!= null) {
            System.out.println(nodoActual.getDato());
            nodoActual= nodoActual.getSiguiente();
            
        }
        
        System.out.println(nodoActual.getDato());
        }
        
}
