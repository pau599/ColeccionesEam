package modelo;

/**
 *
 * @author paula
 */
public class Jornada {
    
    private String nombreJornada;
    private Horario[] horarios;

    public Jornada(String nombreJornada, Horario[] horarios) {
        this.nombreJornada = nombreJornada;
        this.horarios = horarios;
    }

    public String getNombreJornada() {
        return nombreJornada;
    }

    public void setNombreJornada(String nombreJornada) {
        this.nombreJornada = nombreJornada;
    }

    public Horario[] getHorarios() {
        return horarios;
    }

    public void setHorarios(Horario[] horarios) {
        this.horarios = horarios;
    }
    
    
}
