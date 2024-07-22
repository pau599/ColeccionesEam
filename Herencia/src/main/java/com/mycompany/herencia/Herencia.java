/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.herencia;

import modelo.ArticuloCientifico;
import modelo.Foto;
import modelo.Noticia;

/**
 *
 * @author paula
 */
public class Herencia {

    public static void main(String[] args) {
     
          // Crea objetos y uso de métodos
        ArticuloCientifico articulo = new ArticuloCientifico("Título del Artículo", "Autor del Artículo", "Revista Científica");
        Noticia noticia = new Noticia("Título de la Noticia", "Autor de la Noticia", "Periódico Nacional");
        Foto foto = new Foto("Título de la Foto", "Fotógrafo", "Puesta de sol en la playa");

        // Muestra info de cada objeto
        System.out.println("Información del Artículo Científico:");
        articulo.mostrarDetalles();

        System.out.println("\nInformación de la Noticia:");
        noticia.mostrarDetalles();

        System.out.println("\nInformación de la Foto:");
        foto.mostrarDetalles();
    }
}
