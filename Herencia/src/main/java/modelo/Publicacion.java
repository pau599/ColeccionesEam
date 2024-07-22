/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author paula
 */
public class Publicacion{
        
    private String titulo;
    private String fechaPublicacion;

    //Constructor
    public Publicacion(String titulo, String fechaPublicacion) {
        this.titulo = titulo;
        this.fechaPublicacion = fechaPublicacion;
    }

    //Get and set
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }
    
    
    public void mostrarDetalles() {
        System.out.println("Título: " + titulo);
        System.out.println("Fecha de Publicación: " + fechaPublicacion);
    }
    
}
