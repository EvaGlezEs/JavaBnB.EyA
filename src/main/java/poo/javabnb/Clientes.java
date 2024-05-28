/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.javabnb;

import java.io.Serializable;

/**
 * Clase compuesta por los atributos comunes de los clientes, que luego se diferenciaran en Clientes particulares y Anfitriones
 * Hereda de la clase Usuarios el correo y la clave 
 * @author eva
 */

public class Clientes extends Usuarios implements Serializable  {
    
    private String DNI;
    private String nombre;
    private long telefono;
    

    //constructor

    /**
     *
     * @param DNI
     * @param nombre
     * @param telefono
     * @param correo
     * @param clave
     */

    public Clientes(String DNI, String nombre, long telefono, String correo, String clave) {
        super(correo, clave);
        this.DNI = DNI;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    /**
     *
     */
    public Clientes() {
    }

    /**
     *
     * @return
     */
    public String getDNI() {
        return DNI;
    }

    /**
     *
     * @param DNI
     */
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    /**
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return
     */
    public long getTelefono() {
        return telefono;
    }

    /**
     *
     * @param telefono
     */
    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return this.DNI + " - " + this.nombre + " - " + this.telefono + " - " + this.correo + " - " + this.clave;
        
    }

    /**
     *
     * @param c
     * @return
     */
    
    
}
