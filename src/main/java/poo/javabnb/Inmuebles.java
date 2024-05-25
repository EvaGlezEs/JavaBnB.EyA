/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.javabnb;

import java.util.List;

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
    
    private String numHuespedes;
    private String numHabitaciones;
    private String numCamas;
    private String numBanos;

    private String tipoPropiedad;
    
    private String precioNoche;
    
    private String calificacion;
    
    private String servicios;
    
    private static final String CASA = "Casa";
    private static final String APARTAMENTO = "Apartamento";

    public Inmuebles(String titulo, String calle, String numero, String codigoPostal, String ciudad, String numHuespedes, String numHabitaciones, String numCamas, String numBanos, String tipoPropiedad, String precioNoche, String calificacion, String servicios) {
        this.titulo = titulo;
        this.calle = calle;
        this.numero = numero;
        this.codigoPostal = codigoPostal;
        this.ciudad = ciudad;
        this.numHuespedes = numHuespedes;
        this.numHabitaciones = numHabitaciones;
        this.numCamas = numCamas;
        this.numBanos = numBanos;
        this.tipoPropiedad = tipoPropiedad;
        this.precioNoche = precioNoche;
        this.calificacion = calificacion;
        this.servicios = servicios;
    }

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
     * Get the value of precioNoche
     *
     * @return the value of precioNoche
     */
    public String getPrecioNoche() {
        return precioNoche;
    }

    /**
     * Set the value of precioNoche
     *
     * @param precioNoche new value of precioNoche
     */
    public void setPrecioNoche(String precioNoche) {
        this.precioNoche = precioNoche;
    }

    
    
    
    /**
     * Get the value of numBanos
     *
     * @return the value of numBanos
     */
    public String  getNumBanos() {
        return numBanos;
    }

    /**
     * Set the value of numBanos
     *
     * @param numBanos new value of numBanos
     */
    public void setNumBanos(String  numBanos) {
        this.numBanos = numBanos;
    }


    /**
     * Get the value of numCamas
     *
     * @return the value of numCamas
     */
    public String  getNumCamas() {
        return numCamas;
    }

    /**
     * Set the value of numCamas
     *
     * @param numCamas new value of numCamas
     */
    public void setNumCamas(String numCamas) {
        this.numCamas = numCamas;
    }

    /**
     * Get the value of numHabitaciones
     *
     * @return the value of numHabitaciones
     */
    public String  getNumHabitaciones() {
        return numHabitaciones;
    }

    /**
     * Set the value of numHabitaciones
     *
     * @param numHabitaciones new value of numHabitaciones
     */
    public void setNumHabitaciones(String  numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    /**
     * Get the value of numHuespedes
     *
     * @return the value of numHuespedes
     */
    public String  getNumHuespedes() {
        return numHuespedes;
    }

    /**
     * Set the value of numHuespedes
     *
     * @param numHuespedes new value of numHuespedes
     */
    public void setNumHuespedes(String  numHuespedes) {
        this.numHuespedes = numHuespedes;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
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

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    public String getServicios() {
        return servicios;
    }

    public void setServicios(String servicios) {
        this.servicios = servicios;
    }
    
    
    
    

    public static void agregarResena(List<Integer> resenas, int resena) {
        if (resena >= 0 && resena <= 5) {
            resenas.add(resena);
        } else {
            System.out.println("Esta reseña no es válida: " + resena + ". La puntuación debe estar entre 0 y 5");
        }
    }
          
    //después se calcula la calificación, que es la media de las reseñas
    public static double calificacion(List<Integer> resenas) {
        if (resenas.isEmpty()) {
            throw new IllegalArgumentException("La lista de reseñas no puede estar vacía");
        }
        
        int suma = 0;
        for (int resena : resenas) {
            suma += resena;
        }
        
        return (double) suma / resenas.size();
        
        
        
    }

    @Override
    public String toString() {
        return "Inmuebles{" + "titulo=" + titulo + ", calle=" + calle + ", numero=" + numero + ", codigoPostal=" + codigoPostal + ", ciudad=" + ciudad + ", numHuespedes=" + numHuespedes + ", numHabitaciones=" + numHabitaciones + ", numCamas=" + numCamas + ", numBanos=" + numBanos + ", tipoPropiedad=" + tipoPropiedad + ", precioNoche=" + precioNoche + ", calificacion=" + calificacion + ", servicios=" + servicios + '}';
    }

  
}
