/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tareaextra;
import javax.swing.JOptionPane;
/**
 *
 * @author crs12_am5gzcc
 */
public class Tareaextra {

    public static void main(String[] args) {
        
                int opcion;
        float ingreso, ladridoActual, abrirPuertaA;
        String Eliminar;
        

        opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenidos\n"
        +"1. Grabar Nuevo Ladrido\n"
        +"2. Abrir la Puerta\n "
        +"3. Eliminar Ladrido\n"
        +"4. Salir"));
        
        switch(opcion){
            case 1: ingreso = Integer.parseInt(JOptionPane.showInputDialog("Grabar Ladrido"));
                ladridoActual = ingreso;
                JOptionPane.showMessageDialog(null,"El Ladrido Nuevo es"+ladridoActual);
                break;
                
            
            case 2: ingreso   =  Integer.parseInt(JOptionPane.showInputDialog("Desea abrir la puerta"));
             String []arreglo = {"si", "No"};
              
             JOptionPane.showOptionDialog(null, "Desea abrir la Puerta", "Elige", 0, JOptionPane.QUESTION_MESSAGE, null, arreglo, "");
             break;
             
            case 3: ingreso   =  Integer.parseInt(JOptionPane.showInputDialog("Desea eliminar el perro "));
             String []arreglo1 = {"si", "No"};
              
             JOptionPane.showOptionDialog(null, "Desea Eliminar el perro", "Elige", 0, JOptionPane.QUESTION_MESSAGE, null, arreglo1, "");
             break;
             
            case 4: break;
            default: JOptionPane.showMessageDialog(null,"Se equivoco de opcion");
                    

        }
    }
    
}
