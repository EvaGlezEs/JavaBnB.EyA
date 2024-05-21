/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.javabnb;

import java.time.LocalDate;
/**
 *
 * @author eva
 */
public class TarjetaCredito {
    
    private String nombreTitular;
    private String numero;
    private LocalDate fechaCaducidad;

    public TarjetaCredito(String nombreTitular, String numero, LocalDate fechaCaducidad) {
        this.nombreTitular = nombreTitular;
        this.numero = numero;
        this.fechaCaducidad = fechaCaducidad;
    }

    
    /**
     * Get the value of fechaCaducidad
     *
     * @return the value of fechaCaducidad
     */
    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    /**
     * Set the value of fechaCaducidad
     *
     * @param fechaCaducidad new value of fechaCaducidad
     */
    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }


    /**
     * Get the value of numero
     *
     * @return the value of numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Set the value of numero
     *
     * @param numero new value of numero
     */
    public void setNumero(String numero) {
        //vamos a verficar que el numero no es nulo, contiene exactamente 16 
        //digitos y con ("\\d+") comprobamos que solo tiene caracteres numericos
        if (numero!= null && numero.length()==16 && numero .matches("\\d+")){
            this.numero = numero;
        } else {
            throw new IllegalArgumentException ("El numero de la terjeta debe tener exactamente 16 digitos que sean numericos");
        }
    }

    
    /**
     * Get the value of nombreTitular
     *
     * @return the value of nombreTitular
     */
    public String getNombreTitular() {
        return nombreTitular;
    }

    /**
     * Set the value of nombreTitular
     *
     * @param nombreTitular new value of nombreTitular
     */
    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

}
