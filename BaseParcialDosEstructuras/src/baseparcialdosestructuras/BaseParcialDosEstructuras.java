/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baseparcialdosestructurasnoc;

import java.util.Scanner;

/**
 *
 * @author brian
 */
public class BaseParcialDosEstructuras {
    
    /**
     * @param args the command line arguments
     * @param Salir
     * @param Añadir
     * @param Remover
     * @param Imprimir
     */
    public static void main(String[] args, boolean Salir, boolean Añadir, boolean Remover, boolean Imprimir) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("ingrese numero de celdas:");
        int numCeldas= scanner.nextInt();
        Prisionero prision= new Prisionero(numCeldas, "Juan", "Peligroso", 30, "Robo", "M", 24);
        
        while(true){
            System.out.println("Elige una opcion");
            
            System.out.println(Añadir Prisionero);
            
            System.out.println(Remover prisionero);
            
            System.out.println(Imprimir estado );
            
            System.out.println(Salir);
            
        }
        // TODO code application logic here
    }
    
}
