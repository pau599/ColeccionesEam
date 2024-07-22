/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import modelo.Casilla;


/**
 *
 * @author paula
 */
public class ControladorLaboratorio {

    private final Casilla[][] casillas;

    public ControladorLaboratorio() {
       
        casillas = new Casilla[5][3];
        initCasillas();
    }

    private void initCasillas() {
        for (Casilla[] casilla : casillas) {
            for (int j = 0; j < casilla.length; j++) {
                casilla[j] = new Casilla();
            }
        }
    }

    /**
     * Agrega una reserva en una casilla específica.
     *
     * @param reserva La reserva que se desee guardar.
     * @param fila La posición en fila.
     * @param columna La posición en columna.
     */
    public void agregarReserva(Reserva reserva, int fila, int columna) {
        casillas[fila][columna].setReserva(reserva);
    }

    /**
     * Obtiene la información de una casilla específica.
     *
     * @param fila La posición en fila.
     * @param columna La posición en Columna.
     * @return La instancia de Casilla que se solicitó.
     */
    public Casilla obtenerCasilla(int fila, int columna) {
        return casillas[fila][columna];
    }

    public static class Reserva {

        public Reserva() {
        }
    }
}
