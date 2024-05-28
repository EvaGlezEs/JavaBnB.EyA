/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.javabnb;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Alejandro
 */
public class UtilInmuebles implements Serializable  {
     
    private static  ArrayList<Inmuebles> inmuebles = new ArrayList<>();
    private static  Inmuebles objinmu;
    
    
    
   
    
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
                return Double.compare(p1.getPrecioNoche(), p2.getPrecioNoche());
            }
        };
        //Ordenamos el array
        Collections.sort(inmuebles, PrecioPerComp);
        return inmuebles;
    }
    public static ArrayList<Inmuebles> getCalificacion() {
        //Comparador para ordenar los inmuebles por su precio
        Comparator PrecioPerComp = new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                Inmuebles p1 = (Inmuebles) o1;
                Inmuebles p2 = (Inmuebles) o2;
                return Double.compare(p1.getCalificacion(), p2.getCalificacion());
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
     * @param i_servicios
     * @return boolean */
    public static boolean modificaInmuebles(Inmuebles Inmu, String i_titulo, String i_calle, String i_numero, String i_codiPostal, String i_ciudad, String i_numHuesp, String i_numHabi, String i_numCamas, String i_numBanos, String i_tipoPro, double i_PrecioNoche, String i_servicios) {
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
        Inmu.setServicios(i_servicios);
       
        return true;
    }
    
    
    
    
    
     public static boolean registrarInmueble(Inmuebles objinmu) {
        if (!inmuebles.contains(objinmu)) {
            inmuebles.add(objinmu);
            return true;
        } else {
            return false;
        }

    }
     
     /** Carga los datos de Inmuebles del fichero */
    public static void cargarDatos() {
        try {
            //Lectura de los objetos de tipo inmuebles
            FileInputStream istreamInmu = new FileInputStream("copiasegInmu.dat");
            ObjectInputStream oisInmu = new ObjectInputStream(istreamInmu);
            inmuebles = (ArrayList) oisInmu.readObject();
            istreamInmu.close();
        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Error de clase no encontrada: " + cnfe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }//fin cargarDatos

    /** Guarda los datos de Inmuebles en el fichero */
    public static void guardarDatos() {
        try {
            //Si hay datos los guardamos...
            if (!inmuebles.isEmpty()) {
                /****** Serialización de los objetos ******/
                //Serialización de los inmuebles
                FileOutputStream ostreamInmu = new FileOutputStream("copiasegInmu.dat");
                ObjectOutputStream oosInmu = new ObjectOutputStream(ostreamInmu);
                //guardamos el array de inmuebles
                oosInmu.writeObject(inmuebles);
                ostreamInmu.close();
            } else {
                System.out.println("Error: No hay datos");
            }

        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }//fin guardarDatos

    /** Crea un fichero de texto con los datos de un Inmueble
     * @param per
     * @throws java.io.IOException */
    public static void generaFicha(Inmuebles per) throws IOException {
        PrintWriter salida = new PrintWriter(new BufferedWriter(new FileWriter(per.getTitulo() + ".txt")));

        salida.println("-------------------------------- Ficha Inmueble --------------------------------");
        salida.println("\n");
        salida.println("Titulo: " + per.getTitulo());
        salida.println("\n");
        salida.println("Nombre: " + per.getCalle());
        salida.println("\n");
        salida.println("Numero: " + per.getNumero());
        salida.println("\n");
        salida.println("Código Postal: " + per.getCodigoPostal());
        salida.println("\n");
        salida.println("Ciudad: " + per.getCiudad());
        salida.println("\n");
        salida.println("Número de Huespedes: " + per.getNumHuespedes());
        salida.println("\n");
        salida.println("Número de Habitaciones: " + per.getNumHabitaciones());
        salida.println("\n");
        salida.println("Número de Camas: " + per.getNumCamas());
        salida.println("\n");
        salida.println("Número de Baños: " + per.getNumBanos());
        salida.println("\n");
        salida.println("Tipo de propiedad: " + per.getTipoPropiedad());
        salida.println("\n");
        salida.println("Precio por noche: " + per.getPrecioNoche());
        salida.println("\n");
        salida.println("Calificación: " + per.getCalificacion());
        salida.println("\n");
        salida.println("Servicios: " + per.getServicios());
        salida.println("\n");
        salida.println("-------------------------------------------------------------------------------");
        salida.close();
    }
}
