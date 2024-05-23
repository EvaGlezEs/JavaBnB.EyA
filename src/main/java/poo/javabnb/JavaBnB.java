/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package poo.javabnb;

import java.util.*;
/**
 *
 * @author eva
 */
public class JavaBnB {

    private static ArrayList<Usuarios> usuarios = new ArrayList<>();
    private static Usuarios objper;
    
    //establece el arraylist de usuarios
    public static void setUsuarios(ArrayList<Usuarios> u) {
        usuarios = u;
    }
    
    public void agregarUsuarios(Usuarios usuario){
        usuarios.add(usuario);
    }
    
    public ArrayList<Usuarios> getUsuarios(){
        return usuarios;
    }
    
    
    public static void main(String[] args) {
    }
}
