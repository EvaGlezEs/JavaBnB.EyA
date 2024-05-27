/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.javabnb;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.io.Serializable;
import javax.imageio.ImageIO;

/**
 *
 * @author eva
 */
public class Inmuebles implements Serializable {
    
    private String titulo;

    private String calle;
    private String numero;
    private String codigoPostal;
    private String ciudad;
    
    
    private String numHuespedes;
    private String numHabitaciones;
    private String numCamas;
    private String  numBanos;

    private String tipoPropiedad;
    
    private double precioNoche;
    
    private double calificacion;
    
    private String servicios;
    
    private String correoAnfitrion;
    
   private transient BufferedImage foto; 
    
    private static final String CASA = "Casa";
    private static final String APARTAMENTO = "Apartamento";

    public Inmuebles(String titulo, String calle, String numero, String codigoPostal, String ciudad, String numHuespedes, String numHabitaciones, String numCamas, String numBanos, String tipoPropiedad, double precioNoche, double calificacion, String servicios, String correo) {
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
        this.correoAnfitrion = correo;
        
    }

    public Inmuebles(String titulo, String calle, String numero, String codigoPostal, String ciudad, String numHuespedes, String numHabitaciones, String numCamas, String numBanos, String tipoPropiedad, double precioNoche, double calificacion, String servicios, String correoAnfitrion, BufferedImage foto) {
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
        this.correoAnfitrion = correoAnfitrion;
        this.foto = foto;
    }

    


    
    public Inmuebles(){
        
    }

    public BufferedImage getFoto() {
        return foto;
    }

    public void setFoto(BufferedImage foto) {
        this.foto = foto;
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        // Copiado dese
        //<<<https://stackoverflow.com/questions/15058663/how-to-serialize-an-object-that-includes-bufferedimages
        out.defaultWriteObject();  //todo lo q no es transient lo guarda, y luego guardamos la foto por separado
        if (foto != null) //pasar sofi
        {
            ImageIO.write(foto, "png", out); // png is lossless
        }
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        // Copiado dese
        // https://stackoverflow.com/questions/15058663/how-to-serialize-an-object-that-includes-bufferedimages
        in.defaultReadObject();
        foto = ImageIO.read(in);
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
    public double getPrecioNoche() {
        return precioNoche;
    }

    /**
     * Set the value of precioNoche
     *
     * @param precioNoche new value of precioNoche
     */
    public void setPrecioNoche(double precioNoche) {
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

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public String getServicios() {
        return servicios;
    }

    public void setServicios(String servicios) {
        this.servicios = servicios;
    }

    public String getCorreoAnfitrion() {
        return correoAnfitrion;
    }

    public void setCorreoAnfitrion(String correoAnfitrion) {
        this.correoAnfitrion = correoAnfitrion;
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
