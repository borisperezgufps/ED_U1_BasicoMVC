/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructura.datos.controlador;

import estructura.datos.modelo.RegistroNegocio;
import estructura.datos.vista.RegistroVista;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Boris Perez
 */
public class RegistroControlador {
    private RegistroVista frame;
    private RegistroNegocio negocio;

    public RegistroControlador(RegistroVista frame) {
        this.frame = frame;
        negocio = new RegistroNegocio();
        
        // Llena el combo de edad
        DefaultComboBoxModel<String> modeloEdad = (DefaultComboBoxModel<String>)frame.getCmbEdad().getModel();
        modeloEdad.removeAllElements();
        for (int i = 18; i < 30; i++) {
            modeloEdad.addElement(""+i);
        }
        
    }
    
    public void registrarPersona(){
        String nombre = frame.getTxtNombre().getText();
        String apellido = frame.getTxtApellido().getText();
        String edad = frame.getCmbEdad().getModel().getSelectedItem().toString();
        
        boolean exito = negocio.registrarPersona(nombre, apellido, Integer.parseInt(edad));
        if(exito)
            JOptionPane.showMessageDialog(null, "Registro exitoso");
        else
            JOptionPane.showMessageDialog(null, "Registro fallido");
    }
    
}
