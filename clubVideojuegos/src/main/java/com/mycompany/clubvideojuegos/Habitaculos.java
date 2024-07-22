/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clubvideojuegos;

/**
 *
 * @author paula
 */
public class Habitaculos {
    
    VACIA("Blanco")
    MENOR_EDAD("Verde"),
    MAYOR_EDAD("Amarillo");
    
    private String color;
    
    Habitaculos(String color){
        this.color= color;
    }
    
    public String getColor(){
        return color;
    }
}