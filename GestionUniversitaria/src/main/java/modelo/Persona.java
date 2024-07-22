package modelo;


import java.util.Date;

/**
 *
 * @author paula
 */
class Persona extends Usuario{
      
   private  String nombre;
    private Date fechaNacimiento;
    private String tipoPersona;
    
    public Persona(String tipo) {
        super(tipo);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTipoPersona() {
        return tipoPersona;
    }

    public void setTipoPersona(String tipoPersona) {
        this.tipoPersona = tipoPersona;
    }

    }

