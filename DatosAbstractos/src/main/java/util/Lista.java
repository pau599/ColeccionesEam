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
public class Lista<T> implements IList<T> {
    
    Nodo<T> primero;
    int size;
    
    public Lista(){
        this.size=0;
        this.primero= null;
    }

    @Override
    public void add(T dato) {
        Nodo<T> nuevo =new Nodo<>(dato);
        if (isEmpty()){
            this.primero=nuevo;
        }else{
            Nodo<T> observador = primero;
            while(observador.nodoSig!= null){
                observador= observador.nodoSig;
            }
            observador.nodoSig= nuevo;
        }
        size++;
    }

    @Override
    public T get(int index) {
        if(index< 0  || index >= size){
            throw new ArrayIndexOutOfBoundsException(index);
        }else{
            if(index ==0){
                return primero.dato;
            }else{
                Nodo<T> aux = primero;
                int contador = 0;
                while(contador < index){
                    contador++;
                    aux = aux.nodoSig;
                }
                return aux.dato;
            }
        }
        
    }

    public void add(String dato, int index) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void remove(int index) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int size() {
       return size;
    }

    @Override
    public boolean isEmpty() {
        return primero == null; //true o false
    }

    @Override
    public void add(T dato, int index) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
