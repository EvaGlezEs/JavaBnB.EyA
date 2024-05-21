/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.javabnb;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author eva
 */
public class Calificacion {
    
    private int resenas;
    /**
     * Get the value of resenas
     *
     * @return the value of resenas
     */
    public float getResenas() {
        return resenas;
    }

    /**
     * Set the value of resenas
     *
     * @param resenas new value of resenas
     */
    public void setResenas(int resenas) {
        this.resenas = resenas;
    }
    
    
    //primero se agrega la reseña
    public static void agregarResena(List<Integer> resenas, int resena) {
        if (resena >= 0 && resena <= 5) {
            resenas.add(resena);
        } else {
            System.out.println("Esta reseña no es válida: " + resena + ". La puntuación debe estar entre 0 y 5");
        }
    }
          
    //después se calcula la calificación, que es la media de las reseñas
    public static double calificacion(List<Integer> resenas) {
        if (resenas.isEmpty()) {
            throw new IllegalArgumentException("La lista de reseñas no puede estar vacía");
        }
        
        int suma = 0;
        for (int resena : resenas) {
            suma += resena;
        }
        
        return (double) suma / resenas.size();
        
    }
}

