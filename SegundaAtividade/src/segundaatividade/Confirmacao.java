/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundaatividade;

/**
 *
 * @author Francisco
 */
import Eventos.Evento3;
import java.awt.*;
import javax.swing.*;


public class Confirmacao{
    JFrame f2 = new JFrame();
    JPanel p = new JPanel();
    JTextField j;
    JComboBox<String> combo;
    JTextArea texto;
    
    
    
    public Confirmacao(JTextField j,JComboBox<String> combo, JTextArea texto1){
     
    //PRE-DEFINIÇÕES DA JANELA    
    f2.setTitle("Atenção!");
    this.texto = texto1;
    this.j = j; 
    this.combo = combo;
    
   
    f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f2.setVisible(true);
    f2.setSize(350,170);
    f2.setResizable(false);
    f2.setLocationRelativeTo(null);
    
    
    //TIPO DE LAYOUT
    p.setLayout(null);
    
    //CRIA UM LABEL
    JLabel label = new JLabel("Deseja realmente cadastrar essas informações?");
    label.setLocation(10, 10);
    label.setSize(300, 25);
    p.add(label);
    
    //CRIA UM BUTÃO
    JButton ok = new JButton("OK");
    ok.setLocation(40, 60);
    ok.setSize(99,40);
    p.add(ok);
    ok.addActionListener(new Evento3(this.j,this.combo,this.texto,f2));
    
    //CRIA UM BUTÃO
    JButton cancel = new JButton("CANCEL");
    cancel.setLocation(170, 60);
    cancel.setSize(99,40);
    p.add(cancel);
    f2.add(p);
    }    
    
}
