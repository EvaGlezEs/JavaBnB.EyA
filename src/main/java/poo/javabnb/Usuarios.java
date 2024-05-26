/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.javabnb;

/**
 *
 * @author eva
 */
public class Usuarios {
    public String correo;
    public String clave;
    
    
    private static final String ADMIN_CORREO = "admin@javabnb.com";
    private static final String ADMIN_CLAVE = "admin";

    public Usuarios(String correo, String clave) {
        this.correo = correo;
        this.clave = clave;
    }
    
    public Usuarios(){
        
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
        return ADMIN_CORREO.equals(this.correo) && ADMIN_CLAVE.equals(this.clave);
    }
    
    
}
