/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructura.datos.modelo;

/**
 *
 * @author Boris Perez
 */
public class RegistroNegocio {

    private String nombre, apellido;
    
    public boolean registrarPersona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        
        System.out.println("Registro exitoso: "+nombre+" "+apellido);
        
        return true;
    }
    
}
