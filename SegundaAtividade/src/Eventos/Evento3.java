/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Francisco
 */
public class Evento3 implements ActionListener{
    JTextField j;
    JComboBox<String> combo;
    JTextArea texto;
    JFrame f2;
     
    

    public Evento3(JTextField j,JComboBox<String> combo,JTextArea texto, JFrame f2) {
        this.j = j;
        this.combo = combo;
        this.texto = texto;
        this.f2 = f2;
        
    }    

    
    
     @Override
    public void actionPerformed(ActionEvent e){
        f2.setVisible(false);
        System.out.println("\nNOME: "+j.getText());  
        System.out.println("\nSEXO: "+combo.getSelectedItem());
        System.out.println("\nCOMENTARIOS: "+texto.getText());
       
        
    }
    
    
}
