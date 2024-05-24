/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.javabnb;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Alejandro
 */
public class UtilInmuebles {
     
    private static ArrayList<Inmuebles> inmuebles = new ArrayList<>();
    private static Inmuebles objinmu;
    
    public static void setInmuebles(ArrayList<Inmuebles> i) {
        inmuebles = i;
    }
    
    public static ArrayList<Inmuebles> getInmuebles() {
        //Comparador para ordenar los inmuebles por su precio
        Comparator PrecioPerComp = new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                Inmuebles p1 = (Inmuebles) o1;
                Inmuebles p2 = (Inmuebles) o2;
                return p1.getPrecioNoche().compareTo(p2.getPrecioNoche());
            }
        };
        //Ordenamos el array
        Collections.sort(inmuebles, PrecioPerComp);
        return inmuebles;
    }
    
    /** Da de baja un inmueble
     * @param objinmu
     * @return boolean */
    public static boolean bajaInmueble(Inmuebles objinmu) {
        if (inmuebles.contains(objinmu)) {
            inmuebles.remove(objinmu);
            return true;
        } else {
            return false;
        }
    }
    
    /** Modifica los datos de una persona
     * @param Inmu
     * @param i_titulo
     * @param i_calle
     * @param i_numero
     * @param i_codiPostal
     * @param i_ciudad
     * @param i_numHuesp
     * @param i_numHabi
     * @param i_numCamas
     * @param i_numBanos
     * @param i_tipoPro
     * @param i_PrecioNoche
     * @return boolean */
    public static boolean modificaInmuebles(Inmuebles Inmu, String i_titulo, String i_calle, String i_numero, String i_codiPostal, String i_ciudad, int i_numHuesp, int i_numHabi, int i_numCamas, int i_numBanos, String i_tipoPro, String i_PrecioNoche) {
        if (Inmu == null || !inmuebles.contains(Inmu)) {
            return false;
        }
        Inmu.setTitulo(i_titulo);
        Inmu.setCalle(i_calle);
        Inmu.setNumero(i_numero);
        Inmu.setCodigoPostal(i_codiPostal);
        Inmu.setCiudad(i_ciudad);
        Inmu.setNumHuespedes(i_numHuesp);
        Inmu.setNumHabitaciones(i_numHabi);
        Inmu.setNumCamas(i_numCamas);
        Inmu.setNumBanos(i_numBanos);
        Inmu.setTipoPropiedad(i_tipoPro);
        Inmu.setPrecioNoche(i_PrecioNoche);
       
        return true;
    }
    
    
    /** Consulta los datos de un inmueble por su calificacion
     * @param precioNoche
     * @return objinmu */
    public static Inmuebles consultaInmueblePorPrecio(String precioNoche) {
        //Comparador para ordenar los immuebles por su calificacion
        Comparator PrecioNochePerComp = new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                Inmuebles p1 = (Inmuebles) o1;
                Inmuebles p2 = (Inmuebles) o2;
                return p1.getCalificacion().compareTo(p2.getCalificacion());
            }
        };
        //Ordenamos el array
        Collections.sort(inmuebles, PrecioNochePerComp);
        //creamos una persona con el dni a buscar
        Inmuebles p = new Inmuebles();
        p.setCalificacion(precioNoche);
        int pos = Collections.binarySearch(inmuebles, p, PrecioNochePerComp);
        if (pos >= 0) {
            objinmu = inmuebles.get(pos);
        } else {
            objinmu = null;
        }

        return objinmu;
    }
    
    /** Consulta los datos de un inmueble por su calificacion
     * @param calificacion
     * @return objinmu */
    public static Inmuebles consultaInmueblePorCalificacion(String calificacion) {
        //Comparador para ordenar los immuebles por su calificacion
        Comparator CalificacionPerComp = new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                Inmuebles p1 = (Inmuebles) o1;
                Inmuebles p2 = (Inmuebles) o2;
                return p1.getCalificacion().compareTo(p2.getCalificacion());
            }
        };
        //Ordenamos el array
        Collections.sort(inmuebles, CalificacionPerComp);
        //creamos una persona con el dni a buscar
        Inmuebles p = new Inmuebles();
        p.setCalificacion(calificacion);
        int pos = Collections.binarySearch(inmuebles, p, CalificacionPerComp);
        if (pos >= 0) {
            objinmu = inmuebles.get(pos);
        } else {
            objinmu = null;
        }

        return objinmu;
    }
     public static boolean registrarInmueble(Inmuebles objinmu) {
        if (!inmuebles.contains(objinmu)) {
            inmuebles.add(objinmu);
            return true;
        } else {
            return false;
        }

    }
}
