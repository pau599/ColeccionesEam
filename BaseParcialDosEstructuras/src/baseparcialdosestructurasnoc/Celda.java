/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baseparcialdosestructurasnoc;

/**
 *
 * @author paula
 */
public class Celda {
     public void mostrarEstado() {
        private final String id;
        private final int capacidad;
        private final NodoPrisionero cabeza;
        
    // Constructor
    public Celda(String id, int capacidad) {
        this.id = id;
        this.capacidad = capacidad;
        this.cabeza = null;
        
        System.out.println("Celda " + id + ":");
        NodoPrisionero actual = cabeza;
        while (actual != null) {
            Prisionero prisionero = actual.prisionero;
            System.out.println("- " + prisionero.getNombre() + " (" + prisionero.getCategoria() + ")");
            actual = actual.siguiente;
        }
        System.out.println();

}

    private void agregarPrisionero(Prisionero prisionero1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public class Main {
    public static void main(String[] args) {
        Celda celdaRoja = new Celda("Roja", 4);
        Celda celdaVerde = new Celda("Verde", 4);
        Celda celdaAzul = new Celda("Azul", 4);
        Celda celdaBlanca = new Celda("Blanca", 4);

        Prisionero prisionero1 = new Prisionero(1, "Juan", "Peligroso", 30, "Robo", "M", 24);
        Prisionero prisionero2 = new Prisionero(2, "Maria", "Amigable", 25, "Fraude", "F", 18);
        Prisionero prisionero3 = new Prisionero(3, "Pedro", "Peligroso", 28, "Asesinato", "M", 36);

        celdaRoja.agregarPrisionero(prisionero1);
        celdaVerde.agregarPrisionero(prisionero2);
        celdaAzul.agregarPrisionero(prisionero3);

        celdaRoja.mostrarEstado();
        celdaVerde.mostrarEstado();
        celdaAzul.mostrarEstado();

        }
    
    }
    