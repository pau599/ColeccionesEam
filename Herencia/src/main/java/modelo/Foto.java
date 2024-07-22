/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author paula
 */
public class Foto extends Publicacion{
    
    private String fotografo;
    private String ubicacion;
    
    
    //Constructor
    public Foto(String titulo, String fechaPublicacion, String puesta_de_sol_en_la_playa) {
        super(titulo, fechaPublicacion);
        this.fotografo= fotografo;
        this.ubicacion= ubicacion;
    }


    //get and set
    public String getFotografo() {
        return fotografo;
    }

    public void setFotografo(String fotografo) {
        this.fotografo = fotografo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    //Muestra información especifica al respecto
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Fotógrafo: " + fotografo);
        System.out.println("Ubicación: " + ubicacion);
    }

}
