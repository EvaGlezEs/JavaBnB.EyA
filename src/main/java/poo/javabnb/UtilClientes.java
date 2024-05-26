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
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Alejandro
 */
public class UtilClientes {

    private static ArrayList<Clientes> clientes = new ArrayList<>();
    private static Clientes objcli;

    /** Establece el ArrayList de clientes
     * @param c */
    public static void setClientes (ArrayList<Clientes> c) {
        clientes = c;
}

    /**@return Devuelve el ArrayList de clientes */
    public static ArrayList<Clientes> getClientes() {
        //Comparador para ordenar las personas por su correo
        Comparator NomCliComp = new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                Clientes c1 = (Clientes) o1;
                Clientes c2 = (Clientes) o2;
                return c1.getNombre().compareTo(c2.getNombre());
            }
        };
        //Ordenamos el array
        Collections.sort(clientes, NomCliComp);
        return clientes;
    }

 /** Da de alta una persona
     * @param objcli
     * @return  boolean */
    public static boolean altaClientes(Clientes objcli) {
        if (!clientes.contains(objcli)) {
            clientes.add(objcli);
            return true;
        } else {
            return false;
        }
    }
    
    
    /** Carga los datos de los clientes del fichero */
    public static void cargarDatos() {
        try {
            //Lectura de los objetos de tipo persona
            FileInputStream istreamCli = new FileInputStream("copiasegClientes.dat");
            ObjectInputStream oisCli = new ObjectInputStream(istreamCli);
            clientes = (ArrayList) oisCli.readObject();
            istreamCli.close();
        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Error de clase no encontrada: " + cnfe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }//fin cargarDatos

    /** Guarda los datos de los clientes en el fichero */
    public static void guardarDatos() {
        try {
            //Si hay datos los guardamos...
            if (!clientes.isEmpty()) {
                /****** Serialización de los objetos ******/
                //Serialización de los clientes
                FileOutputStream ostreamCli = new FileOutputStream("copiasegClientes.dat");
                ObjectOutputStream oosCli = new ObjectOutputStream(ostreamCli);
                //guardamos el array de clientes
                oosCli.writeObject(clientes);
                ostreamCli.close();
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
     * @param cli
     * @throws java.io.IOException */
    public static void generaFicha(Clientes cli) throws IOException {
        //la siguiente linea de código envuelve el FileWriter en un BufferedWriter para mejoarar la eficiencia de la escritura
        // y a su vez envuelve el BufferedWriter en un PrintWriter para proporcionar metodos de escritura más convenientes
        PrintWriter salida = new PrintWriter(new BufferedWriter(new FileWriter(cli.getDNI() + ".txt"))); 
        //con la siguiente línea formateamos la fecha de registro a la aplicación de los anfitriones
        DateTimeFormatter formatoCorto = DateTimeFormatter.ofPattern("dd/MM/yyyy");        
    

        salida.println("-------------------------------- Ficha Cliente --------------------------------");
        salida.println("\n");
        salida.println("DNI: " + cli.getDNI());
        salida.println("\n");
        salida.println("Nombre: " + cli.getNombre());
        salida.println("\n");
        salida.println("Correo: " + cli.getCorreo());
        salida.println("\n");
        salida.println("Clave: " + cli.getClave());
        salida.println("\n");
        salida.println("Teléfono: " + cli.getTelefono());
        salida.println("\n");
        if (cli.getClass().getSimpleName().equals("Clientes particulares")) {
            ClientesParticulares clientesParticulares = (ClientesParticulares) cli;
            TarjetaCredito tarjetaCredito = clientesParticulares.getTarjetaCredito();
            salida.println("*** Particular ***");
            salida.println("Tarjeta de credito: " + "Nombre del titular: " + tarjetaCredito.getNombreTitular() + " Número tarjeta: " + tarjetaCredito.getNumero() + " Fecha de caducidad: " + tarjetaCredito.getFechaCaducidad().format(formatoCorto));
            salida.println("VIP: " + clientesParticulares.getVIP());
        } else {
            Anfitriones anfitriones = (Anfitriones) cli;
            salida.println("*** Anfitrión ***");
            salida.println("Fecha de registro: " + anfitriones.getFechaRegistro().format(formatoCorto));
            salida.println("Superanfitrión: " + anfitriones.getCalificacion());
        }
        salida.println("\n");
        salida.println("-------------------------------------------------------------------------------");
        salida.close();
    }

}

    
    
