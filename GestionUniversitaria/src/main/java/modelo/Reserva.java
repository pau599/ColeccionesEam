package modelo;


import java.util.Date;

/**
 *
 * @author paula
 */
class Reserva {
    private Estudiante estudiante;
    private Date fechaInicio;
    private Date fechaFin;

    public Reserva(Estudiante estudiante, Date fechaInicio, Date fechaFin) {
        this.estudiante = estudiante;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }
}
