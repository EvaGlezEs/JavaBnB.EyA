/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.javabnb;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * Clase compuesta por todos los atributos comunes de los clientes particulares
 * Esta clase hereda los atributos de Usuarios y los de Clientes
 * 
 * @author eva
 */
public class Particular extends Clientes implements Serializable {
    
   
    /**
     *
     */
    public String nombreTitular;

    /**
     *
     */
    public String numero;

    /**
     *
     */
    public LocalDate fechaCaducidad;
    
    /**
     *
     */
    public Boolean VIP;
 
    
   
//constructor

    /**
     *
     * @param DNI
     * @param nombre
     * @param telefono
     * @param correo
     * @param clave
     * @param nombreTitular
     * @param fechaCaducidad
     * @param numero
     * @param VIP
     */
    
    

    public Particular(String DNI, String nombre, long telefono, String correo, String clave, String nombreTitular, String numero, LocalDate fechaCaducidad, Boolean VIP) {    
        super(DNI, nombre, telefono, correo, clave);
        this.nombreTitular = nombreTitular;
        this.numero = numero;
        this.fechaCaducidad = fechaCaducidad;
        this.VIP = VIP;
    }

    /**
     *
     */
    public Particular() {
    }

    /**
     *
     * @return
     */
    public String getNombreTitular() {
        return nombreTitular;
    }

    /**
     *
     * @param nombreTitular
     */
    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    /**
     *
     * @return
     */
    public String getNumero() {
        return numero;
    }

    /**
     *
     * @param numero
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     *
     * @return
     */
    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    /**
     * Get the value of tarjetaCredito
     *
     * @param fechaCaducidad
     */
    public void setFechaCaducidad(LocalDate fechaCaducidad) {    
        this.fechaCaducidad = fechaCaducidad;
    }

    /**
     * Get the value of VIP
     *
     * @return the value of VIP
     */
    public Boolean getVIP() {
        return VIP;
    }

    /**
     * Set the value of VIP
     *
     * @param VIP new value of VIP
     */
    public void setVIP(Boolean VIP) {
        this.VIP = VIP;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "ClientesParticulares{"
                + ", DNI='" + this.getDNI() + '\''
                + ", nombre='" + this.getNombre() + '\''
                + ", telefono='" + this.getTelefono() + '\''
                + ", correo='" + this.getCorreo()
                + ", clave='" + this.getClave() + '\''
                + ", nombreTitular='" + this.nombreTitular + '\''
                + ", numero='" + this.numero + '\''
                + ", fechaCaducidad='" + this.fechaCaducidad + '\''
                + ", VIP='" + this.VIP + '\''
                + '}';
                
             
    }

    /**
     *
     * @param p
     * @return
     */
    public int compareTo(Particular p) {
        return this.correo.compareTo(p.getCorreo());
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
        final Particular other = (Particular) obj;
        if ((this.correo == null) ? (other.correo != null) : !this.correo.equals(other.correo)) {
            return false;
        }
        return true;
    }

    String getfechaCaducidad() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
  
    

    
}
