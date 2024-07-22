package modelo;

/**
 *
 * @author paula
 */

public class Administrador extends Persona{
     private  String cargo;

    public Administrador(String tipo) {
        super(tipo);
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }


}
