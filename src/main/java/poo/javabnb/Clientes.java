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
public class Clientes extends Usuarios implements Serializable {
    
    private String DNI;
    private String nombre;
    private String telefono;
    

    //constructor

    public Clientes(String DNI, String nombre, String telefono, String correo, String clave) {
        super(correo, clave);
        this.DNI = DNI;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public Clientes() {
    }

    

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    @Override
    public String toString() {
        return "cliente{" + "DNI=" + DNI + ", nombre=" + nombre + ", correo=" + correo + ", clave" + clave + ", telefono" + telefono + '}';
        
    }

    
    public int compareTo(Clientes c) {
        return this.correo.compareTo(c.getCorreo());
    }
     

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
