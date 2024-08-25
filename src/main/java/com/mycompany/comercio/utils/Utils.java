
package com.mycompany.comercio.utils;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;


public class Utils {
    
    public static void mostrarMensaje(String mensaje, String tipo, String titulo) {
        
        JOptionPane optionPane = new JOptionPane(mensaje);
        if (tipo.equals("Info")) {
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        }
        else if (tipo.equals("Error")) {
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }
    
    public static boolean esFilaSeleccionada(JTable tabla) {
        return tabla.getRowCount() > 0 && tabla.getSelectedRow() != -1;
    }
    
    public static boolean confirmarEliminacion(JPanel panel) {
        Object[] opciones = {"Sí", "No"};
        int respuesta = JOptionPane.showOptionDialog(
            panel,
            "¿Estás seguro de que deseas eliminar la venta?",
            "Confirmación de Eliminación",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            opciones,
            opciones[0]
            );
    return respuesta == JOptionPane.YES_OPTION;
    }
    
    public static void mostrarMensajeEliminar(JTable tabla) {
        if (tabla.getRowCount() == 0) {
            Utils.mostrarMensaje("La tabla está vacía, no se puede eliminar", "Error", "Error al eliminar");
        } 
        else {
            Utils.mostrarMensaje("No seleccionó un registro para eliminar", "Error", "Error al eliminar");
        }
    }
    
    public static void mostrarMensajeModificacion(JTable tabla) {
        if (tabla.getRowCount() == 0) {
            Utils.mostrarMensaje("La tabla está vacía, no se puede modificar" , "Error" ,  "Error al modificar");
        } 
        else {
            Utils.mostrarMensaje("No seleccionó un registro para modificar", "Error", "Error al modificar");
        }
    }
    
    public static void mostrarMensajeAgregarProducto(JTable tabla) {
        if (tabla.getRowCount() == 0) {
            Utils.mostrarMensaje("La tabla esta vacia, no se puede agregar" , "Error" ,  "Error al agregar");
        } 
        else {
            Utils.mostrarMensaje("No seleccionó un registro para Agregar", "Error", "Error al agregar");
        }
    }
    
}
