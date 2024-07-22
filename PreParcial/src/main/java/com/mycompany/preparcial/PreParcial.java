/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.preparcial;

import java.util.Arrays;

/**
 *
 * @author paula
 */
public class PreParcial {

    public static void main(String[] args) {
   
        int[][] periódicos = {
            {3, 5, 2, 7, 1, 4, 6}, // Periódico 1
            {2, 4, 6, 3, 5, 1, 8}, // Periódico 2
            {1, 3, 5, 2, 6, 4, 7}  // Periódico 3
        };

        
        for (int i = 0; i < periódicos.length; i++) {
            int[] noticias = periódicos[i];
            double media = calcularMedia(noticias);
            double mediana = calcularMediana(noticias);
            double moda = calcularModa(noticias);
            double varianza = calcularVarianza(noticias, media);
            double desviacionEstandar = calcularDesviacionEstandar(varianza);

            System.out.println("Periódico " + (i + 1) + ":");
            System.out.println("  Media: " + media);
            System.out.println("  Mediana: " + mediana);
            System.out.println("  Moda: " + moda);
            System.out.println("  Varianza: " + varianza);
            System.out.println("  Desviación estándar: " + desviacionEstandar);
        }
    }

    // Calcular media
    private static double calcularMedia(int[] noticias) {
        int suma = 0;
        for (int noticia : noticias) {
            suma += noticia;
        }
        return (double) suma / noticias.length;
    }

    // Calcular mediana
    private static double calcularMediana(int[] noticias) {
        Arrays.sort(noticias);
        int middle = noticias.length / 2;
        if (noticias.length % 2 == 0) {
            return (noticias[middle - 1] + noticias[middle]) / 2.0;
        } else {
            return noticias[middle];
        }
    }

    // Calcular moda
    private static double calcularModa(int[] noticias) {
        int maxCount = 0;
        int moda = noticias[0];
        for (int noticia : noticias) {
            int count = 0;
            for (int otherNoticia : noticias) {
                if (noticia == otherNoticia) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                moda = noticia;
            }
        }
        return moda;
    }

    // Calcular varianza
    private static double calcularVarianza(int[] noticias, double media) {
        double sum = 0;
        for (int noticia : noticias) {
            sum += Math.pow(noticia - media, 2);
        }
        return sum / noticias.length;
    }

    // Calcular desviación estándar
    private static double calcularDesviacionEstandar(double varianza) {
        return Math.sqrt(varianza);
    }
}
