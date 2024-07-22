/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author paula
 */
public class ArticuloCientifico extends Publicacion{
    
     private String autor;
    private String resumen;
    
    //constructor
    public ArticuloCientifico(String titulo, String fechaPublicacion, String revista_Científica) {
        super(titulo, fechaPublicacion);
        this.autor = autor;
        this.resumen = resumen;
        
    }

    //get and set
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }
    
    
    //muestra información especifica al respecto
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Autor: " + autor);
        System.out.println("Resumen: " + resumen);
    }
    
}
