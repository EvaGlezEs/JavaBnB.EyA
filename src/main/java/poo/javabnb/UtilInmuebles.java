/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.javabnb;

import java.awt.image.BufferedImage;
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
 *Esta clase sirve para almacenar, guardar, ordenar, buscar, etc los inmuebles registrados por los anfitriones en nuestra app
 * 
 * @author Alejandro
 */

public class UtilInmuebles implements Serializable  {
     
    private static  ArrayList<Inmuebles> inmuebles = new ArrayList<>();
    private static  Inmuebles objinmu;
    
    /** Establece el ArrayList de inmuebles
     *
     * @param i
     */
    public static void setInmuebles(ArrayList<Inmuebles> i) {
        inmuebles = i;
        
    }
    
    /** Devuelve el ArrayList de inmuebles
     *
     * @return
     */
    public static ArrayList<Inmuebles> getInmuebles() {
        //Comparador para ordenar los inmuebles por su precio
        Comparator PrecioInmuComp = new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                Inmuebles i1 = (Inmuebles) o1;
                Inmuebles i2 = (Inmuebles) o2;
                return Double.compare(i1.getPrecioNoche(), i2.getPrecioNoche());
            }
        };
        //Ordenamos el array
        Collections.sort(inmuebles, PrecioInmuComp);
        return inmuebles;
    }

    /**
     *
     * @return
     */
    public static ArrayList<Inmuebles> getCalificacion() {
        //Comparador para ordenar los inmuebles por su precio
        Comparator PrecioInmuComp = new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                Inmuebles i1 = (Inmuebles) o1;
                Inmuebles i2 = (Inmuebles) o2;
                return Double.compare(i1.getCalificacion(), i2.getCalificacion());
            }
        };
        //Ordenamos el array
        Collections.sort(inmuebles, PrecioInmuComp);
        return inmuebles;
    }
    
  
    /**Da de alta un inmueble
     *
     * @param objinmu
     * @return
     */
    public static boolean registrarInmueble(Inmuebles objinmu) {
        if (!inmuebles.contains(objinmu)) {
            inmuebles.add(objinmu);
            return true;
        } else {
            return false;
        }

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
    
    /** Modifica los datos de un inmueble
     * @param inmu
     * @param titulo
     * @param calle
     * @param numero
     * @param codigoPostal
     * @param ciudad
     * @param numHuespedes
     * @param numHabitaciones
     * @param numCamas
     * @param numBanos
     * @param tipoPropiedad
     * @param precioNoche
     * @param calificacion
     * @param servicios
     * @param correoAnfitrion
     * @param foto
     * @return boolean */
    public static boolean modificaInmuebles(Inmuebles inmu, String titulo,String calle, String numero, String codigoPostal, String ciudad, String numHuespedes, String numHabitaciones, String numCamas, String numBanos, String tipoPropiedad, double precioNoche, double calificacion, String servicios, String correoAnfitrion, BufferedImage foto) {
        if (inmu == null || !inmuebles.contains(inmu)) {
            return false;
        }
        else{
             if(!inmu.getTitulo().equals(titulo)){
                inmu.setTitulo(titulo);
                return true;
            }
            if(!inmu.getCalle().equals(calle)){
                inmu.setCalle(calle);
                return true;
            }
            if(!inmu.getNumero().equals(numero)){
                inmu.setNumero(numero);
                return true;
            }
            if(!inmu.getCodigoPostal().equals(codigoPostal)){
                inmu.setCodigoPostal(codigoPostal);
                return true;
            }
            if(!inmu.getCiudad().equals(ciudad)){
                inmu.setCiudad(ciudad);
                return true;
            }
            if(!inmu.getNumHuespedes().equals(numHuespedes)){
                inmu.setNumHuespedes(numHuespedes);
                return true;
            }
            if(!inmu.getNumHabitaciones().equals(numHabitaciones)){
                inmu.setNumHabitaciones(numHabitaciones);
                return true;
            }
            if(!inmu.getNumCamas().equals(numCamas)){
                inmu.setNumCamas(numCamas);
                return true;
            }
            if(!inmu.getNumBanos().equals(numBanos)){
                inmu.setNumBanos(numBanos);
                return true;
            }
            if(!inmu.getTipoPropiedad().equals(tipoPropiedad)){
                inmu.setTipoPropiedad(tipoPropiedad);
                return true;
            }
            
            if(!(inmu.getPrecioNoche()==(precioNoche))){
                inmu.setPrecioNoche(precioNoche);
                return true;
            }
            if(!(inmu.getCalificacion()==(calificacion))){
                inmu.setCalificacion(calificacion);
                return true;
            }
            if(!inmu.getServicios().equals(servicios)){
                inmu.setServicios(servicios);
                return true;
            }
            if(!inmu.getCorreoAnfitrion().equals(correoAnfitrion)){
                inmu.setCorreoAnfitrion(correoAnfitrion);
                return true;
            }
            if(!inmu.getFoto().equals(foto)){
                inmu.setFoto(foto);
                return true;
            }
            else{
                return false;
            }
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
     * @param inmu
     * @throws java.io.IOException */
    public static void generaFicha(Inmuebles inmu) throws IOException {
        PrintWriter salida = new PrintWriter(new BufferedWriter(new FileWriter(inmu.getTitulo() + ".txt")));

        salida.println("-------------------------------- Ficha Inmueble --------------------------------");
        salida.println("\n");
        salida.println("Titulo: " + inmu.getTitulo());
        salida.println("\n");
        salida.println("Nombre: " + inmu.getCalle());
        salida.println("\n");
        salida.println("Numero: " + inmu.getNumero());
        salida.println("\n");
        salida.println("Código Postal: " + inmu.getCodigoPostal());
        salida.println("\n");
        salida.println("Ciudad: " + inmu.getCiudad());
        salida.println("\n");
        salida.println("Número de Huespedes: " + inmu.getNumHuespedes());
        salida.println("\n");
        salida.println("Número de Habitaciones: " + inmu.getNumHabitaciones());
        salida.println("\n");
        salida.println("Número de Camas: " + inmu.getNumCamas());
        salida.println("\n");
        salida.println("Número de Baños: " + inmu.getNumBanos());
        salida.println("\n");
        salida.println("Tipo de propiedad: " + inmu.getTipoPropiedad());
        salida.println("\n");
        salida.println("Precio por noche: " + inmu.getPrecioNoche());
        salida.println("\n");
        salida.println("Calificación: " + inmu.getCalificacion());
        salida.println("\n");
        salida.println("Servicios: " + inmu.getServicios());
        salida.println("\n");
        salida.println("Correo anfitrión: " + inmu.getCorreoAnfitrion());
        salida.println("\n");
        salida.println("Foto: " + inmu.getFoto());
        salida.println("\n");
        salida.println("\n");
        salida.println("-------------------------------------------------------------------------------");
        salida.close();
    }
}
