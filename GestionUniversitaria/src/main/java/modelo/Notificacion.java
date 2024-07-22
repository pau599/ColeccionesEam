package modelo;

import java.util.Date;

/**
 *
 * @author paula
 */
public class Notificacion {
    
    private Estudiante destinatario;
    private String mensaje;
    private Date fechaEnvio;

    public Notificacion(Estudiante destinatario, String mensaje, Date fechaEnvio) {
        this.destinatario = destinatario;
        this.mensaje = mensaje;
        this.fechaEnvio = fechaEnvio;
    }

    public Estudiante getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Estudiante destinatario) {
        this.destinatario = destinatario;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Date getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(Date fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }
    
    
}
