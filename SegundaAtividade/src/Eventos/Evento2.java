/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import segundaatividade.Confirmacao;

/**
 *
 * @author Francisco
 */
public class Evento2 implements ActionListener{
    
    //ATRIBUTOS
    JTextField j;
    JComboBox<String> combo;
    Confirmacao confirm; 
    JTextArea texto;
  
    
    //CONSTRUTOR
    public Evento2(JTextField textFieldNome,JComboBox<String> combo,JTextArea texto) {
        this.j = textFieldNome;  
        this.combo = combo;
        this.texto = texto;
    }
    
    //EVENTO CHAMA TELA DE CONFIRMAÇÃO
    @Override
    public void actionPerformed(ActionEvent e) {
      
        
            confirm = new Confirmacao(this.j,combo,texto);
           
        
    }
    
}
