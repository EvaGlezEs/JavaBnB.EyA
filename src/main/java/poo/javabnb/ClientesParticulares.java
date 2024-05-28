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
public class ClientesParticulares extends Clientes implements Serializable {
    
    /**
     *
     */
    public Boolean VIP;

    /**
     *
     */
    public TarjetaCredito tarjetaCredito;

    /**
     *
     */
    public LocalDate var1;

    /**
     *
     */
    public String var2;

    /**
     *
     */
    public String var3;

    /**
     *
     */
    public boolean var4;
 
    
   
//constructor

    /**
     *
     * @param DNI
     * @param nombre
     * @param telefono
     * @param var4
     * @param correo
     * @param clave
     * @param var1
     * @param var2
     * @param var3
     */
    public ClientesParticulares(String DNI, String nombre, String telefono, String correo, String clave, LocalDate var1, String var2, String var3, Boolean var4) {
        super(DNI, nombre, telefono, correo, clave);
        this.VIP = VIP;
        this.tarjetaCredito = tarjetaCredito;
    }

    /**
     *
     * @return
     */
    public LocalDate getVar1() {
        LocalDate var1 = null;
        return var1;
    }
    
    /**
     *
     * @param var1
     */
    public void setVar1(LocalDate var1) {
        this.var1 = var1;
    }

    /**
     *
     * @return
     */
    public String getVar2() {
        String var2 = null;
        return var2;
    }
    
    /**
     *
     * @param var2
     */
    public void setVar2(String var2) {
        this.var2 = var2;
    }

    /**
     *
     * @return
     */
    public String getVar3() {
        String var3 = null;
        return var3;
    }
    
    /**
     *
     * @param var3
     */
    public void setVar3(String var3) {
        this.var3 = var3;
    }

    /**
     *
     * @return
     */
    public boolean getVar4() {
        boolean var4 = false;
        return var4;
    }
    
    /**
     *
     * @param var4
     */
    public void setVar4(boolean var4) {
        this.var4 = var4;
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
                + "VIP=" + VIP
                + ", tarjetaCredito=" + tarjetaCredito
                + ", DNI='" + getDNI() + '\''
                + ", nombre='" + getNombre() + '\''
                + ", correo='" + getCorreo() + '\''
                + ", clave='" + getClave() + '\''
                + ", telefono='" + getTelefono() + '\''
                + '}';
                
             
        
     
    }

    /**
     *
     * @param var1
     */
    public void setFechaCaducidad(LocalDate var1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     *
     * @param var2
     */
    public void setNombreTitular(String var2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     *
     * @param var3
     */
    public  void setNumero(String var3) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    

    
}
