/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author paula
 */
public class Noticia extends Publicacion {
    
    private String reportero;
    private String contenido;
    
    
    //Constructor
    public Noticia(String titulo, String fechaPublicacion, String periódico_Nacional) {
        super(titulo, fechaPublicacion);
        this.reportero = reportero;
        this.contenido = contenido;
    }
    
    //Get and Set
    public String getReportero() {
        return reportero;
    }

    public void setReportero(String reportero) {
        this.reportero = reportero;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    
    //Muestra información especifica al respecto
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Reportero: " + reportero);
        System.out.println("Contenido: " + contenido);
    }

}
