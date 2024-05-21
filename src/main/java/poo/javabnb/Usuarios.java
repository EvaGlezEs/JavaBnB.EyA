/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.javabnb;

/**
 *
 * @author eva
 */
public class Usuarios // abstract???

{
    
    private String correo;
    private String clave;
    
    
    private static final String ADMIN_CORREO = "admin@javabnb.com";
    private static final String ADMIN_CLAVE = "admin";

    public Usuarios(String correo, String clave) {
        this.correo = correo;
        this.clave = clave;
    }
    
    

    /**
     * Get the value of correo
     *
     * @return the value of correo
     */
    public String getCorreo() {
        return correo;
    }
   /**
     * Get the value of clave
     *
     * @return the value of clave
     */
    public String getClave() {
        return clave;
    }
    
    /**
     * Set the value of correo
     *
     * @param correo new value of correo
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Set the value of clave
     *
     * @param clave new value of clave
     */
    public void setClave(String clave) {
        this.clave = clave;
    }
    
    public boolean esAdministrador(){
        return this.correo.equals(ADMIN_CORREO) && this.clave.equals(ADMIN_CLAVE);
    }
    
}
