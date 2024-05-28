/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.javabnb;

import java.util.*;
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
 *clase para almacenar, guardar, ordenar, buscar, etc los clientes registrados en nuestra app
 * 
 * @author Alejandro
 */
public class UtilClientes implements Serializable {

    private static ArrayList<Particular> particulares = new ArrayList<>();
    private static Particular objparti;
    

    /** Establece el ArrayList de particulares
    * @param p */
    public static void setParticulares(ArrayList<Particular> p) {
        particulares = p;
    }
        

    /** Da de alta un cliente particular
     * @param objparti
     * @return  boolean */
    public static boolean altaParticular(Particular objparti) {
        if (!particulares.contains(objparti)) {
            particulares.add(objparti);
            return true;
        } else {
            return false;
        }

    }

    /** Da de baja un cliente particular
     * @param objparti
     * @return boolean */
    public static boolean bajaParticular(Particular objparti) {
        if (particulares.contains(objparti)) {
            particulares.remove(objparti);
            return true;
        } else {
            return false;
        }
    }
   
    
    /**@return Devuelve el ArrayList de particulares */
    public static ArrayList<Particular> getParticulares() {
        //Comparador para ordenar a los particulares por su correo
        Comparator CorreoPartiComp = new Comparator() {
            
            @Override
            public int compare(Object o1, Object o2) {
                Particular p1 = (Particular) o1;
                Particular p2 = (Particular) o2;
                return p1.getCorreo().compareTo(p2.getCorreo());
            }
        };
        //Ordenamos el array
        Collections.sort(particulares, CorreoPartiComp);
        return particulares;
    }
         
   /** Devuelve un particular por la posición dentro del ArrayList
     * @param indice
     * @return objper */
    public static Particular consultaParticular(int indice) {
        objparti = particulares.get(indice);
        return objparti;
    }

    /** Modifica los datos de un particular
     * @param parti
     * @param DNI
     * @param nombre
     * @param telefono
     * @param correo
     * @param clave
     * @param nombreTitular
     * @param numero
     * @param fechaCaducidad
     * @param VIP
     * @return boolean */
    public static boolean modificaParticular(Particular parti, String DNI, String nombre, long telefono, String correo, String clave, String nombreTitular, String numero, LocalDate fechaCaducidad, Boolean VIP) {
        if (parti == null || !particulares.contains(parti)) {
            return false;
        }
        else {
        
         if(!parti.getDNI().equals(DNI)){
                parti.setDNI(DNI);
                return true;
            }
            if(!parti.getNombre().equals(nombre)){
                parti.setNombre(nombre);
                return true;
            }
            if (parti.getTelefono() != telefono) {
                parti.setTelefono(telefono);
                return true;
            }
            if(!parti.getCorreo().equals(correo)){
                parti.setCorreo(correo);
                return true;
            }
            if(!parti.getClave().equals(clave)){
                parti.setClave(clave);
                return true;
            }
            if(!parti.getNombreTitular().equals(nombreTitular)){
                parti.setNombreTitular(nombreTitular);
                return true;
            }
            if(!parti.getNumero().equals(numero)){
                parti.setNumero(numero);
                return true;
            }
            if(!parti.getFechaCaducidad().equals(fechaCaducidad)){
                parti.setFechaCaducidad(fechaCaducidad);
                return true;
            }
            if(!parti.getVIP().equals(VIP)){
                parti.setVIP(VIP);
                return true;
            }
            else{
                return false;
            }
        }
    }

    
    /** Consulta los datos de un particular por su correo
     * @param correo
     * @return objparti */
    public static Particular consultaParticularPorCorreo(String correo) {
        //Comparador para ordenar los particulares por su correo
        Comparator CorreoPartiComp = new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                Particular p1 = (Particular) o1;
                Particular p2 = (Particular) o2;
                return p1.getCorreo().compareTo(p2.getCorreo());
            }
        };
        //Ordenamos el array
        Collections.sort(particulares, CorreoPartiComp);
        //creamos una persona con el nombre a buscar
        Particular p = new Particular();
        p.setCorreo(correo);
        int pos = Collections.binarySearch(particulares, p, CorreoPartiComp);
        if (pos >= 0) {
            objparti = particulares.get(pos);
        } else {
            objparti = null;
        }

        return objparti;
    }

    
    
     /** Consulta los datos de una persona por su correo y clave
     * @param clave
     * @param correo
     * @return objparti */
    public static Particular consultaParticularPorCorreoYClave(String correo, String clave) {
        //Comparador para ordenar las personas por su dni
        Comparator CorreoPartiComp = new Comparator() {

            
            @Override
            public int compare(Object o1, Object o2) {
                Particular p1 = (Particular) o1;
                Particular p2 = (Particular) o2;
                return p1.getCorreo().compareTo(p2.getCorreo());
            }
        };
        //Ordenamos el array
        Collections.sort(particulares, CorreoPartiComp);
        //creamos una persona con el nombre a buscar
        Particular p = new Particular();
        p.setCorreo(correo);
        int pos = Collections.binarySearch(particulares, p, CorreoPartiComp);
        if (pos >= 0) {
            objparti = particulares.get(pos);
            if (objparti.getClave() != clave){
                objparti = null;
            }
        } else {
            objparti = null;
        }

        return objparti;
    }


      /** Carga los datos de los particulares del fichero */
    public static void cargarDatosParti() {
        try (FileInputStream istreamParti = new FileInputStream("copiasegParti.dat");
            ObjectInputStream oisParti = new ObjectInputStream(istreamParti)) {
            //Lectura de los objetos de tipo persona
            
            particulares = (ArrayList) oisParti.readObject();
            
        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Error de clase no encontrada: " + cnfe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }//fin cargarDatos

    /** Guarda los datos de personas en el fichero */
    public static void guardarDatosParti() {
        try {
            //Si hay datos los guardamos...
            if (!particulares.isEmpty()) {
                /****** Serialización de los objetos ******/
                //Serialización de las personas
                try (FileOutputStream ostreamParti = new FileOutputStream("copiasegParti.dat");
                ObjectOutputStream oosParti = new ObjectOutputStream(ostreamParti)){
                    //guardamos el array de personas
                oosParti.writeObject(particulares);
                }
                
            } else {
                System.out.println("Error: No hay datos...");
            }

        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }//fin guardarDatos
    
    


    
    /** Crea un fichero de texto con los datos de un cliente (o particular o anfitrión)
     * @param parti
     * @throws java.io.IOException */
    public static void generaFicha(Particular parti) throws IOException {
        //la siguiente linea de código envuelve el FileWriter en un BufferedWriter para mejoarar la eficiencia de la escritura
        // y a su vez envuelve el BufferedWriter en un PrintWriter para proporcionar metodos de escritura más convenientes
        PrintWriter salida = new PrintWriter(new BufferedWriter(new FileWriter(parti.getCorreo() + ".txt"))); 
        //con la siguiente línea formateamos la fecha de registro a la aplicación de los anfitriones
        DateTimeFormatter formatoCorto = DateTimeFormatter.ofPattern("dd/MM/yyyy");        
    

        salida.println("-------------------------------- Ficha Cliente --------------------------------");
        salida.println("\n");
        salida.println("DNI: " + parti.getDNI());
        salida.println("\n");
        salida.println("Nombre: " + parti.getNombre());
        salida.println("\n");
        salida.println("Teléfono: " + parti.getTelefono());
        salida.println("\n");
        salida.println("Correo: " + parti.getCorreo());
        salida.println("\n");
        salida.println("Clave: " + parti.getClave());
        salida.println("\n");
        salida.println("Nombre titular: " + parti.getNombreTitular());
        salida.println("\n");
        salida.println("Numero: " + parti.getNumero());
        salida.println("\n");
        salida.println("Fecha caducidad: " + parti.getfechaCaducidad());
        salida.println("\n");
        salida.println("VIP: " + parti.getVIP());
        salida.println("\n");
        
        salida.println("\n");
        salida.println("-------------------------------------------------------------------------------");
        salida.close();
    }

    
    private static ArrayList<Anfitrion> anfitriones = new ArrayList<>();
    private static Anfitrion objanfi;
    
    /** Establece el ArrayList de anfitriones
    * @param a */
    public static void setAnfitriones(ArrayList<Anfitrion> a) {
        anfitriones = a;
    }
        

    /** Da de alta a un anfitrion
     * @param objanfi
     * @return  boolean */
    public static boolean altaAnfitriones(Anfitrion objanfi) {
        if (!anfitriones.contains(objanfi)) {
            anfitriones.add(objanfi);
            return true;
        } else {
            return false;
        }

    }

    /** Da de baja un anfitrion
     * @param objanfi
     * @return boolean */
    public static boolean bajaAnfitriones(Anfitrion objanfi) {
        if (anfitriones.contains(objanfi)) {
            anfitriones.remove(objanfi);
            return true;
        } else {
            return false;
        }
    }
   
    
    /**@return Devuelve el ArrayList de anfitriones */
    public static ArrayList<Anfitrion> getAnfitriones() {
        //Comparador para ordenar a los anfitriones por su correo
        Comparator CorreoAnfiComp = new Comparator() {
            
            @Override
            public int compare(Object o1, Object o2) {
                Anfitrion a1 = (Anfitrion) o1;
                Anfitrion a2 = (Anfitrion) o2;
                return a1.getCorreo().compareTo(a2.getCorreo());
            }
        };
        //Ordenamos el array
        Collections.sort(anfitriones, CorreoAnfiComp);
        return anfitriones;
    }
         
   /** Devuelve un anfitrion por la posición dentro del ArrayList
     * @param indice
     * @return objanfi */
    public static Anfitrion consultaAnfitriones(int indice) {
        objanfi = anfitriones.get(indice);
        return objanfi;
    }

    /** Modifica los datos de un particular
     * @param anfi
     * @param DNI
     * @param nombre
     * @param telefono
     * @param correo
     * @param clave
     * @param fechaRegistro
     * @param calificacion
     * @return boolean */
    public static boolean modificaAnfitriones(Anfitrion anfi, String DNI, String nombre, long telefono, String correo, String clave, LocalDate fechaRegistro, int calificacion) {
        if (anfi == null || !anfitriones.contains(anfi)) {
            return false;
        }
        else {
        
         if(!anfi.getDNI().equals(DNI)){
                anfi.setDNI(DNI);
                return true;
            }
            if(!anfi.getNombre().equals(nombre)){
                anfi.setNombre(nombre);
                return true;
            }
            if (anfi.getTelefono() != telefono) {
                anfi.setTelefono(telefono);
                return true;
            }
            if(!anfi.getCorreo().equals(correo)){
                anfi.setCorreo(correo);
                return true;
            }
            if(!anfi.getClave().equals(clave)){
               anfi.setClave(clave);
                return true;
            }
            if(!anfi.getFechaRegistro().equals(fechaRegistro)){
               anfi.setFechaRegistro(fechaRegistro);
                return true;
            }
            if(!(anfi.getCalificacion()==(calificacion))){
                anfi.setCalificacion(calificacion);
                return true;
            }
            else{
                return false;
            }
        }
    }

    
    /** Consulta los datos de un anfitrion por su correo
     * @param correo
     * @return objanfi */
    public static Anfitrion consultaAnfitrionesPorCorreo(String correo) {
        //Comparador para ordenar los particulares por su correo
        Comparator CorreoAnfiComp = new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                Anfitrion a1 = (Anfitrion) o1;
                Anfitrion a2 = (Anfitrion) o2;
                return a1.getCorreo().compareTo(a2.getCorreo());
            }
        };
        //Ordenamos el array
        Collections.sort(anfitriones, CorreoAnfiComp);
        //creamos una persona con el nombre a buscar
        Anfitrion a = new Anfitrion();
        a.setCorreo(correo);
        int pos = Collections.binarySearch(anfitriones, a, CorreoAnfiComp);
        if (pos >= 0) {
            objanfi = anfitriones.get(pos);
        } else {
            objanfi = null;
        }
        return objanfi;
        
    }

    
    
     /** Consulta los datos de un anfitrion por su correo y clave
     * @param clave
     * @param correo
     * @return objanfi */
    public static Anfitrion consultaAnfitrionesPorCorreoYClave(String correo, String clave) {
        //Comparador para ordenar las personas por su dni
        Comparator CorreoAnfiComp = new Comparator() {

            
            @Override
            public int compare(Object o1, Object o2) {
                Anfitrion a1 = (Anfitrion) o1;
                Anfitrion a2 = (Anfitrion) o2;
                return a1.getCorreo().compareTo(a2.getCorreo());
            }
        };
        //Ordenamos el array
        Collections.sort(anfitriones, CorreoAnfiComp);
        //creamos una persona con el nombre a buscar
        Anfitrion a = new Anfitrion();
        a.setCorreo(correo);
        int pos = Collections.binarySearch(anfitriones, a, CorreoAnfiComp);
        if (pos >= 0) {
            objanfi = anfitriones.get(pos);
            if (objanfi.getClave() != clave){
                objanfi = null;
            }
        } else {
            objanfi = null;
        }

        return objanfi;
    }
    


      /** Carga los datos de los anfitriones del fichero */
    public static void cargarDatosAnfi() {
        try {
            //Lectura de los objetos de tipo persona
            FileInputStream istreamAnfi = new FileInputStream("copiasegAnfi.dat");
            ObjectInputStream oisAnfi= new ObjectInputStream(istreamAnfi);
            anfitriones = (ArrayList) oisAnfi.readObject();
            istreamAnfi.close();
        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Error de clase no encontrada: " + cnfe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }//fin cargarDatos

    /** Guarda los datos de personas en el fichero */
    public static void guardarDatosAnfi() {
        try {
            //Si hay datos los guardamos...
            if (!anfitriones.isEmpty()) {
                /****** Serialización de los objetos ******/
                //Serialización de las personas
                FileOutputStream ostreamAnfi = new FileOutputStream("copiasegAnfi.dat");
                ObjectOutputStream oosAnfi = new ObjectOutputStream(ostreamAnfi);
                //guardamos el array de personas
                oosAnfi.writeObject(anfitriones);
                ostreamAnfi.close();
            } else {
                System.out.println("Error: No hay datos...");
            }

        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }//fin guardarDatos
    
    


    
    /** Crea un fichero de texto con los datos de un anfitrion
     * @param anfi
     * @throws java.io.IOException */
    public static void generaFicha(Anfitrion anfi) throws IOException {
        //la siguiente linea de código envuelve el FileWriter en un BufferedWriter para mejoarar la eficiencia de la escritura
        // y a su vez envuelve el BufferedWriter en un PrintWriter para proporcionar metodos de escritura más convenientes
        PrintWriter salida = new PrintWriter(new BufferedWriter(new FileWriter(anfi.getCorreo() + ".txt"))); 
        //con la siguiente línea formateamos la fecha de registro a la aplicación de los anfitriones
        DateTimeFormatter formatoCorto = DateTimeFormatter.ofPattern("dd/MM/yyyy");        
    

        salida.println("-------------------------------- Ficha Cliente --------------------------------");
        salida.println("\n");
        salida.println("DNI: " + anfi.getDNI());
        salida.println("\n");
        salida.println("Nombre: " + anfi.getNombre());
        salida.println("\n");
        salida.println("Teléfono: " + anfi.getTelefono());
        salida.println("\n");
        salida.println("Correo: " + anfi.getCorreo());
        salida.println("\n");
        salida.println("Clave: " + anfi.getClave());
        salida.println("\n");
        salida.println("Fecha registro: " + anfi.getFechaRegistro());
        salida.println("\n");
        salida.println("Calificacion: " + anfi.getCalificacion());
        salida.println("\n");
        salida.println("\n");
        salida.println("-------------------------------------------------------------------------------");
        salida.close();
    }
    
    
   
}

    

    
