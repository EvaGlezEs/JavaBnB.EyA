/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.javabnb;

import java.io.Serializable;
import java.time.LocalDate; //por la fecha de registro en la app del anfitrion
import java.util.List;

/**
 *Clase compuesta por todos los atributos comunes de los Anfitriones
 * Esta clase hereda los atributos de Usuarios y los de Clientes
 * 
 * @author eva
 */

public class Anfitriones extends Clientes implements Serializable {
    
    private LocalDate fechaRegistro;

    /**
     *
     */
    public int calificacion;

    //constructor

    /**
     *
     * @param DNI
     * @param nombre
     * @param telefono
     * @param correo
     * @param clave
     * @param fechaRegistro
     * @param calificacion
     */

    public Anfitriones(String DNI, String nombre, String telefono, String correo, String clave, LocalDate fechaRegistro, int calificacion) {
        super(DNI, nombre, telefono, correo, clave);
        this.fechaRegistro = fechaRegistro;
        this.calificacion = calificacion;
    }

    /**
     *
     */
    public Anfitriones() {
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

    /**
     *
     * @return
     */
    public int getCalificacion() {
        return calificacion;
    }

    /**
     *
     * @param resenas
     * @param resena
     */
    public static void agregarResena(List<Integer> resenas, int resena) {
        if (resena >= 0 && resena <= 5) {
            resenas.add(resena);
        } else {
            System.out.println("Esta reseña no es válida: " + resena + ". La puntuación debe estar entre 0 y 5");
        }
    }
          
    //después se calcula la calificación, que es la media de las reseñas

    /**
     *
     * @param resenas
     * @return
     */
    public static double calificacion(List<Integer> resenas) {
        if (resenas.isEmpty()) {
            throw new IllegalArgumentException("La lista de reseñas no puede estar vacía");
        }
        
        int suma = 0;
        for (int resena : resenas) {
            suma += resena;
        }
        
        return (double) suma / resenas.size();
        
    }
    
    /**
     *
     * @return
     */
    public boolean esSuperAnfitrion(){
        return this.calificacion > 4.0;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Anfitriones{"
                + "fecha de registro=" + fechaRegistro 
                + ", DNI='" + getDNI() + '\''
                + ", nombre='" + getNombre() + '\''
                + ", correo='" + getCorreo() + '\''
                + ", clave='" + getClave() + '\''
                + ", telefono='" + getTelefono() + '\''
                + '}';
    }

    /**
     *
     * @param var2
     */
    public void setCalificacion(int var2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    

}
