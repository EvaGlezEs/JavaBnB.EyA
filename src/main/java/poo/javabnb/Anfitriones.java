/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.javabnb;

import java.io.Serializable;
import java.time.LocalDate; //por la fecha de registro en la app del anfitrion
/**
 *
 * @author eva
 */
public class Anfitriones extends Clientes implements Serializable {
    
    private LocalDate fechaRegistro;
    private boolean superanfitrion;

    //constructor

    public Anfitriones(LocalDate fechaRegistro, boolean superanfitrion, String DNI, String nombre, String correo, String clave, String telefono) {
        super(DNI, nombre, correo, clave, telefono);
        this.fechaRegistro = fechaRegistro;
        this.superanfitrion = superanfitrion;
    }
    

   
    /**
     * Get the value of superanfitrion
     *
     * @return the value of superanfitrion
     */
    public boolean isSuperanfitrion() {
        return superanfitrion;
    }

    /**
     * Set the value of superanfitrion
     *
     * @param superanfitrion new value of superanfitrion
     */
    public void setSuperanfitrion(boolean superanfitrion) {
        this.superanfitrion = superanfitrion;
    }

    /**
     * Get the value of fechaRegistro
     *
     * @return the value of fechaRegistro
     */
    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    /**
     * Set the value of fechaRegistro
     *
     * @param fechaRegistro new value of fechaRegistro
     */
    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    @Override
    public String toString() {
        return "Anfitriones{"
                + "fecha de registro=" + fechaRegistro 
                + ", superanfitrion=" + superanfitrion
                + ", DNI='" + getDNI() + '\''
                + ", nombre='" + getNombre() + '\''
                + ", correo='" + getCorreo() + '\''
                + ", clave='" + getClave() + '\''
                + ", telefono='" + getTelefono() + '\''
                + '}';
    }
    
    
    

}
