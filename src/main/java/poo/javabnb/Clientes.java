/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.javabnb;

import java.io.Serializable;
/**
 *
 * @author eva
 */
public class Clientes implements Serializable {
    
    private String DNI;
    private String nombre;
    private String correo;
    private String clave;
    private String telefono;

    //constructor
    
    public Clientes(String DNI, String nombre, String correo, String clave, String telefono) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.correo = correo;
        this.clave = clave;
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }
    public String getClave() {
        return clave;
    }
    public String getCorreo() {
        return correo;
    }
    public String getNombre() {
        return nombre;
    }
    public String getDNI() {
        return DNI;
    }
    
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public void setClave(String clave) {
        this.clave = clave;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    @Override
    public String toString() {
        return "cliente{" + "DNI=" + DNI + ", nombre=" + nombre + ", correo=" + correo + ", clave" + clave + ", telefono" + telefono + '}';
        
    }


}
