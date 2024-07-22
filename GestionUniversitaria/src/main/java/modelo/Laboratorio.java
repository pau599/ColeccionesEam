package modelo;


/**
 *
 * @author paula
 */

import java.util.Date;

public class Laboratorio {
    private String nombre;
    private int capacidadMaxima;
    private boolean[][] matrizOcupacion; // Representa los puestos ocupados y reservados
    private Reserva[] reservasActivas;
    private boolean fueraDeServicio;
    private Date fechaMantenimiento;

    public Laboratorio(String nombre, int capacidadMaxima) {
        this.nombre = nombre;
        this.capacidadMaxima = capacidadMaxima;
        this.matrizOcupacion = new boolean[4][capacidadMaxima / 4];
        this.reservasActivas = new Reserva[capacidadMaxima]; // Asumiendo que la capacidad de reservas es igual a la capacidad máxima
        this.fueraDeServicio = false;
        this.fechaMantenimiento = null;
    }

    // Método para prestar el laboratorio
    public boolean prestarLaboratorio(Estudiante estudiante, Date fecha) {
        if (fueraDeServicio || !hayEspacioDisponible() || (fechaMantenimiento != null && fecha.equals(fechaMantenimiento))) {
            return false;
        }
        // Encontrar un lugar disponible en la matriz
        for (boolean[] matrizOcupacion1 : matrizOcupacion) {
            for (int j = 0; j < matrizOcupacion1.length; j++) {
                if (!matrizOcupacion1[j]) {
                    matrizOcupacion1[j] = true;
                    return true;
                }
            }
        }
        return false; // Si no hay espacio disponible
    }

    // Método para hacer una reserva
    public boolean reservarLaboratorio(Estudiante estudiante, Date fechaInicio, Date fechaFin) {
        if (fueraDeServicio || !hayEspacioDisponible() || (fechaMantenimiento != null && fechaInicio.equals(fechaMantenimiento))) {
            return false;
        }
        // Encontrar una reserva disponible
        for (int i = 0; i < reservasActivas.length; i++) {
            if (reservasActivas[i] == null) {
                reservasActivas[i] = new Reserva(estudiante, fechaInicio, fechaFin);
                return true;
            }
        }
        return false; // Si no hay reservas disponibles
    }

    // Método para verificar si hay espacio disponible
    private boolean hayEspacioDisponible() {
        for (boolean[] matrizOcupacion1 : matrizOcupacion) {
            for (int j = 0; j < matrizOcupacion1.length; j++) {
                if (!matrizOcupacion1[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    // Método para cancelar reservas desde una fecha específica
    private void cancelarReservasDesde(Date fecha) {
        for (int i = 0; i < reservasActivas.length; i++) {
            if (reservasActivas[i] != null && !reservasActivas[i].getFechaInicio().before(fecha)) {
                reservasActivas[i].getEstudiante().recibirNotificacion("Reserva cancelada por mantenimiento.");
                reservasActivas[i] = null;
            }
        }
    }

    // Método para visualizar la matriz de ocupación
    public void visualizarMatrizOcupacion() {
        for (boolean[] matrizOcupacion1 : matrizOcupacion) {
            for (int j = 0; j < matrizOcupacion1.length; j++) {
                System.out.print(matrizOcupacion1[j] ? "[Ocupado]" : "[Disponible]");
            }
            System.out.println();
        }
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.matrizOcupacion = new boolean[4][capacidadMaxima / 4];
        this.reservasActivas = new Reserva[capacidadMaxima];
    }

    public boolean isFueraDeServicio() {
        return fueraDeServicio;
    }

    public void setFueraDeServicio(boolean fueraDeServicio) {
        this.fueraDeServicio = fueraDeServicio;
    }

    public Date getFechaMantenimiento() {
        return fechaMantenimiento;
    }

    public void setFechaMantenimiento(Date fechaMantenimiento) {
        this.fechaMantenimiento = fechaMantenimiento;
        cancelarReservasDesde(fechaMantenimiento);
    }

    private void recibirNotificacion(String mensaje) {
        // Implementar el método para recibir notificaciones
        System.out.println("Notificación: " + mensaje);
    }

    public void ponerFueraDeServicio(Date fecha) {
        this.fueraDeServicio = true;
        this.fechaMantenimiento = fecha;
        cancelarReservasDesde(fecha);
    }
}
