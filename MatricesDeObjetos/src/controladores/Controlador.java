/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import modelo.Casilla;
import modelo.Libro;

/**
 *
 * @author brian
 */
public class Controlador {
    
    Casilla[][] casillas;

    public Controlador() {
        casillas = new Casilla[3][4];
        initCasillas();
    }
    
    /**
     * Método que permite iniciar la instancia para 
     * cada posición de la matriz de casillas
     */
    private void initCasillas(){
        for (int i = 0; i < casillas.length; i++) {
            for (int j = 0; j < casillas[i].length; j++) {
                casillas[i][j] = new Casilla();
            }
        }
    }
    
    /**
     * Método para agregar un libro en una posición indicada
     * de la matriz
     * @param libro, el libro que se desea guardar
     * @param fila, la posición en fila
     * @param columna, la posición en columna 
     */
    public void agregarLibro(Libro libro, int fila, int columna){
        casillas[fila][columna].setLibro(libro);
        casillas[fila][columna].setEstado(Casilla.OCUPADO);
    }
    
    /**
     * Método que permite obtener la información de una
     * casilla específica
     * @param fila, la posición en fila
     * @param columna, la posición en columna
     * @return La instancia de Casilla que se solicitó
     */
    public Casilla obtenerCasilla(int fila, int columna){
        return casillas[fila][columna];
    }
    
    
}
