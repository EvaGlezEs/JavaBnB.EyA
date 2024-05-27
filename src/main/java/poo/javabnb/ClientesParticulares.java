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
    
    public Boolean VIP;
    public TarjetaCredito tarjetaCredito;
    public LocalDate var1;
    public String var2;
    public String var3;
    public boolean var4;
 
    
   
//constructor

    /**
     *
     * @param VIP
     * @param tarjetaCredito
     */
    public ClientesParticulares(String DNI, String nombre, String telefono, String correo, String clave, LocalDate var1, String var2, String var3, Boolean var4) {
        super(DNI, nombre, telefono, correo, clave);
        this.VIP = VIP;
        this.tarjetaCredito = tarjetaCredito;
    }

    public LocalDate getVar1() {
        LocalDate var1 = null;
        return var1;
    }
    
    public void setVar1(LocalDate var1) {
        this.var1 = var1;
    }

    public String getVar2() {
        String var2 = null;
        return var2;
    }
    
    public void setVar2(String var2) {
        this.var2 = var2;
    }

    public String getVar3() {
        String var3 = null;
        return var3;
    }
    
    public void setVar3(String var3) {
        this.var3 = var3;
    }

    public boolean getVar4() {
        boolean var4 = false;
        return var4;
    }
    
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

    public void setFechaCaducidad(LocalDate var1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setNombreTitular(String var2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   public  void setNumero(String var3) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    

    
}
