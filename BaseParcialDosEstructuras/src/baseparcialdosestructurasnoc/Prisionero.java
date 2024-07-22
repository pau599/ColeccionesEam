/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baseparcialdosestructurasnoc;

/**
 *
 * @author paula
 */
class Prisionero {

    Prisionero(int numCeldas, String juan, String peligroso, int par1, String robo, String m, int par2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void agregarPrisionero(Prisionero prisionero) {
        NodoPrisionero nuevoNodo = new NodoPrisionero(prisionero);
        Object cabeza = null;
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            NodoPrisionero actual = (NodoPrisionero) cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoNodo;
        }
        System.out.println("Prisionero " + prisionero.getNombre() + " agregado a la celda " + id);

    Prisionero(int numCeldas) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDetallerCrimen() {
        return detallerCrimen;
    }

    public void setDetallerCrimen(String detallerCrimen) {
        this.detallerCrimen = detallerCrimen;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getTiempoDeCondena() {
        return tiempoDeCondena;
    }

    public void setTiempoDeCondena(int tiempoDeCondena) {
        this.tiempoDeCondena = tiempoDeCondena;
    }
    
    
    private String id;
    private String nombre;
    private String categoria; //peligroso o amigable
    private int edad;
    private String detallerCrimen;
    private String genero; //hombre o mujer
    private int tiempoDeCondena;
    //constructor get y set 
    
   
    }

