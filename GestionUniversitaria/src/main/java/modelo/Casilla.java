package modelo;

import controladores.ControladorLaboratorio;

/**
 *
 * @author paula
 */
public class Casilla {
     public static final int LIBRE = 0;
    public static final int OCUPADO = 1;
    public static final int RESERVADO = 2;
    
    private int estado;
    private Reserva reserva;
    
    public Casilla(){
        this.estado = LIBRE;
        this.reserva = null;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }
    public boolean isDisponible() {
        return estado == LIBRE;
    }

    public boolean isOcupado() {
        return estado == OCUPADO;
    }

    public boolean isEnReserva() {
        return estado == RESERVADO;
    }

    public void setReserva(ControladorLaboratorio.Reserva reserva) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
