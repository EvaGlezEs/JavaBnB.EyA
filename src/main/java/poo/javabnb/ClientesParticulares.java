/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.javabnb;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author eva
 */
public class ClientesParticulares extends Clientes implements Serializable {
    
    private boolean VIP;
    private TarjetaCredito tarjetaCredito;
 
    
   
//constructor

    /**
     *
     * @param VIP
     * @param tarjetaCredito
     */
    public ClientesParticulares(boolean VIP, TarjetaCredito tarjetaCredito, String DNI, String nombre, String telefono, String correo, String clave) {
        super(DNI, nombre, telefono, correo, clave);
        this.VIP = VIP;
        this.tarjetaCredito = tarjetaCredito;
    }

    /**
     * Get the value of tarjetaCredito
     *
     * @return the value of tarjetaCredito
     */
    public TarjetaCredito getTarjetaCredito() {
        return tarjetaCredito;
    }

    /**
     * Set the value of tarjetaCredito
     *
     * @param tarjetaCredito new value of tarjetaCredito
     */
    public void setTarjetaCredito(TarjetaCredito tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    /**
     * Get the value of VIP
     *
     * @return the value of VIP
     */
    public boolean getVIP() {
        return VIP;
    }

    /**
     * Set the value of VIP
     *
     * @param VIP new value of VIP
     */
    public void setVIP(boolean VIP) {
        this.VIP = VIP;
    }

    @Override
    public String toString() {
        return "ClientesParticulares{"
                + "VIP=" + VIP
                + ", tarjetaCredito=" + tarjetaCredito
                + ", DNI='" + getDNI() + '\''
                + ", nombre='" + getNombre() + '\''
                + ", correo='" + getCorreo() + '\''
                + ", clave='" + getClave() + '\''
                + ", telefono='" + getTelefono() + '\''
                + '}';
                
             
        
     
    }

    

    
}
