/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.javabnb;

import java.util.ArrayList;

/**
 *
 * @author Alejandro
 */
public class Ordenaciones {

    private ArrayList<Inmuebles> Inmuebles;

    public Ordenaciones(ArrayList<Inmuebles> Inmuebles) {
        Inmuebles = new ArrayList<>();
    }
    
    

    public static int[] OrdenacionMenorAMayor(int[] Inmuebles) {
        int min, j;
        for (int i = 1; i < Inmuebles.length; i++) {
            min = Inmuebles[i];
            j = i - 1;
            while (min < Inmuebles[j] && j > 0) {
                Inmuebles[j + 1] = Inmuebles[j];
                j = j - 1;
            }

            if (Inmuebles[j] <= min) {
                Inmuebles[j + 1] = min;
            } else {
                Inmuebles[j + 1] = Inmuebles[j];
                Inmuebles[j] = min;
            }
        }
        return Inmuebles;
    }

    public int TipoInmueble(int[] Inmuebles, int tipoPropiedad) {
        int size = Inmuebles.length;
        int inf = 0;
        int sup = size - 1;

        while (inf <= sup) {
            int centro = (sup + inf) / 2;

            if (Inmuebles[centro] == tipoPropiedad) {
                return centro;
            }
            if (tipoPropiedad < Inmuebles[centro]) {
                sup = centro - 1;
            } else {
                inf = centro + 1;
            }
        }
        return -1;
    }

    public static void bubbleSortDescending(ArrayList<Integer> Inmuebles) {
        int n = Inmuebles.size();
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (Inmuebles.get(j) < Inmuebles.get(j + 1)) {
                    // Intercambiar list[j] y list[j + 1]
                    int temp = Inmuebles.get(j);
                    Inmuebles.set(j, Inmuebles.get(j + 1));
                    Inmuebles.set(j + 1, temp);
                    swapped = true;
                }
            }
            // Si no hubo intercambios en la pasada, la lista ya está ordenada
            if (!swapped) break;
        }
    }
}
