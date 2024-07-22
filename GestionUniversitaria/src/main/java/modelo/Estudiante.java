package modelo;

/**
 *
 * @author paula
 */
class Estudiante {
    private String nombre;

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void recibirNotificacion(String mensaje) {
        // Implementar el método para recibir notificaciones
        System.out.println("Notificación para " + nombre + ": " + mensaje);
    }
}

