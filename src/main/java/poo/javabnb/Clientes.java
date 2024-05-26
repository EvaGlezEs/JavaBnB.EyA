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


}
