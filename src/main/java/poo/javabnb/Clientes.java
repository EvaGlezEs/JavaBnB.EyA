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

public class Clientes extends Usuarios implements Serializable {
    
    private String DNI;
    private String nombre;
    private String telefono;
    

    //constructor

    /**
     *
     * @param DNI
     * @param nombre
     * @param telefono
     * @param correo
     * @param clave
     */

    public Clientes(String DNI, String nombre, String telefono, String correo, String clave) {
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
    public String getTelefono() {
        return telefono;
    }

    /**
     *
     * @param telefono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "cliente{" + "DNI=" + DNI + ", nombre=" + nombre + ", correo=" + correo + ", clave" + clave + ", telefono" + telefono + '}';
        
    }

    /**
     *
     * @param c
     * @return
     */
    public int compareTo(Clientes c) {
        return this.correo.compareTo(c.getCorreo());
    }
     
    /**
     *
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Clientes other = (Clientes) obj;
        if ((this.correo == null) ? (other.correo != null) : !this.correo.equals(other.correo)) {
            return false;
        }
        return true;
    }
    
}
