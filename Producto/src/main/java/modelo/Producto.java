/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author paula
 */
public class Producto extends Vademecum{
    
    private double valorUnitario;
    private double iva;
    private boolean esPos;
    private boolean esIvaIncluido;

    public Producto(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Producto(double valorUnitario, double iva, boolean esPos, boolean esIvaIncluido) {
        this.valorUnitario = valorUnitario;
        this.iva = iva;
        this.esPos = esPos;
        this.esIvaIncluido = esIvaIncluido;
    }

    
    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public boolean getEsPos() {
        return esPos;
    }

    public void setEsPos(boolean esPos) {
        this.esPos = esPos;
    }

    public boolean getEsIvaIncluido() {
        return esIvaIncluido;
    }

    public void setEsIvaIncluido(boolean esIvaIncluido) {
        this.esIvaIncluido = esIvaIncluido;
    }
    
    
    public double obtenerPrecioConIva () {
        double ivaNoIncluido= 0;
        double suma2= 0;
        
        if (esIvaIncluido== true){
            return valorUnitario;
        }else if( esIvaIncluido== false){
            ivaNoIncluido=valorUnitario*0.1;
            suma2= valorUnitario+ ivaNoIncluido;
            
        } 
        return suma2;
    }
    
    public double obtenerPrecioSinIva() {
        if (esIvaIncluido== true){
            valorUnitario= valorUnitario*100 /(100+iva);
            
            return valorUnitario;
            
        } return valorUnitario;
        
        
        }
        
    }
