/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.javabnb;

/**
 *
 * @author eva
 */
public class Inmuebles {
    
    private String titulo;

    private String calle;
    private String numero;
    private String codigoPostal;
    private String ciudad;
    
    
    private int numHuespedes;
    private int numHabitaciones;
    private int numCamas;
    private int numBanos;

    private String tipoPropiedad;
    private static final String CASA = "Casa";
    private static final String APARTAMENTO = "Apartamento";


    /**
     * Get the value of tipoPropiedad
     *
     * @return the value of tipoPropiedad
     */
    public String getTipoPropiedad() {
        return tipoPropiedad;
    }

    /**
     * Set the value of tipoPropiedad
     *
     * @param tipoPropiedad new value of tipoPropiedad
     */
    public void setTipoPropiedad(String tipoPropiedad) {
        this.tipoPropiedad = tipoPropiedad;
    }
    
    //los metodos para verificar el tipo de propiedad (casa o propiedad)

    public boolean esCasa() {
        return tipoPropiedad.equalsIgnoreCase(CASA); // se usa para comparar dos cadenas de texto sin tener en cuenta mayusculas o minusculas 
    }

    public boolean esApartamento() {
        return tipoPropiedad.equalsIgnoreCase(APARTAMENTO);
    }
    
    
    
    /**
     * Get the value of numBanos
     *
     * @return the value of numBanos
     */
    public int getNumBanos() {
        return numBanos;
    }

    /**
     * Set the value of numBanos
     *
     * @param numBanos new value of numBanos
     */
    public void setNumBanos(int numBanos) {
        this.numBanos = numBanos;
    }


    /**
     * Get the value of numCamas
     *
     * @return the value of numCamas
     */
    public int getNumCamas() {
        return numCamas;
    }

    /**
     * Set the value of numCamas
     *
     * @param numCamas new value of numCamas
     */
    public void setNumCamas(int numCamas) {
        this.numCamas = numCamas;
    }

    /**
     * Get the value of numHabitaciones
     *
     * @return the value of numHabitaciones
     */
    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    /**
     * Set the value of numHabitaciones
     *
     * @param numHabitaciones new value of numHabitaciones
     */
    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    /**
     * Get the value of numHuespedes
     *
     * @return the value of numHuespedes
     */
    public int getNumHuespedes() {
        return numHuespedes;
    }

    /**
     * Set the value of numHuespedes
     *
     * @param numHuespedes new value of numHuespedes
     */
    public void setNumHuespedes(int numHuespedes) {
        this.numHuespedes = numHuespedes;
    }


    /**
     * Get the value of ciudad
     *
     * @return the value of ciudad
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * Set the value of ciudad
     *
     * @param ciudad new value of ciudad
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * Get the value of codigoPostal
     *
     * @return the value of codigoPostal
     */
    public String getCodigoPostal() {
        return codigoPostal;
    }

    /**
     * Set the value of codigoPostal
     *
     * @param codigoPostal new value of codigoPostal
     */
    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
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
        this.numero = numero;
    }

    /**
     * Get the value of calle
     *
     * @return the value of calle
     */
    public String getCalle() {
        return calle;
    }

    /**
     * Set the value of calle
     *
     * @param calle new value of calle
     */
    public void setCalle(String calle) {
        this.calle = calle;
    }

    
    
    /**
     * Get the value of titulo
     *
     * @return the value of titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Set the value of titulo
     *
     * @param titulo new value of titulo
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

}
