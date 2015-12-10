/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundaatividade;

import Eventos.Evento2;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;
import javax.swing.JCheckBox;

/**
 *
 * @author Francisco
 */
public class Cadastro extends JFrame{
    
   
    
    //ATRIBUTOS
    Container c = getContentPane();
    JLabel labelNome = new JLabel("NOME:");
    JTextField textFieldNome = new JTextField();
    JLabel labelSexo = new JLabel("SEXO:");
    JComboBox<String> combo = new JComboBox<String>();
    JLabel labelDisciplinas = new JLabel("Disciplinas:");
    JCheckBox checkBoxDisciplinas = new JCheckBox("POO II");
    JCheckBox checkBoxDisciplinas2 = new JCheckBox("REDES II");
    JCheckBox checkBoxDisciplinas3 = new JCheckBox("CIRCUITOS DIGITAIS");
    JCheckBox checkBoxDisciplinas4 = new JCheckBox("TCC I");
    JCheckBox checkBoxDisciplinas5 = new JCheckBox("AUDITORIA");
    JLabel labelComentario = new JLabel("COMENTARIOS:");
    JTextArea texto = new JTextArea();
    JButton butao = new JButton("CADASTRAR");
    String texto1,texto2,texto3,texto4,texto5;
    
    //CONSTRUTOR
    public Cadastro(){
        
        //PRE-DEFINIÇÕES DA JANELA
        super("Cadastro");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setSize(770,650);
         
        //TIPO DE LAYOUT
        c.setLayout(null);
        
        //DEFINIÇÕES DOS ELEMENTOS
        
        labelNome.setLocation(10,70);
        labelNome.setSize(80, 25);
        
        textFieldNome.setLocation(100,70);
        textFieldNome.setSize(500, 25);
        
        labelSexo.setLocation(10,125);
        labelSexo.setSize(80, 25);
        
        combo.addItem("Masculino");
        combo.addItem("Feminino");
        combo.setLocation(100, 125);
        combo.setSize(200, 25);
        
        labelDisciplinas.setLocation(10,180);
        labelDisciplinas.setSize(80, 25);
        
        
        
        checkBoxDisciplinas.setLocation(100,180);
        checkBoxDisciplinas.setSize(80, 25);
        checkBoxDisciplinas.addItemListener(new Check());
        
        checkBoxDisciplinas2.setLocation(100,200);
        checkBoxDisciplinas2.setSize(80, 25);
        checkBoxDisciplinas2.addItemListener(new Check());
        
        checkBoxDisciplinas3.setLocation(100,220);
        checkBoxDisciplinas3.setSize(300, 25);
        checkBoxDisciplinas3.addItemListener(new Check());
        
        checkBoxDisciplinas4.setLocation(100,240);
        checkBoxDisciplinas4.setSize(80, 25);
        checkBoxDisciplinas4.addItemListener(new Check());
        
        checkBoxDisciplinas5.setLocation(100,260);
        checkBoxDisciplinas5.setSize(300, 25);
        checkBoxDisciplinas5.addItemListener(new Check());
        
        
        
        
        labelComentario.setLocation(10,315);
        labelComentario.setSize(100, 25);
        
        texto.setLocation(110, 315);
        texto.setSize(400, 100);
        
        
        Check check = new Check();
        
        butao.setLocation(300, 500);
        butao.setSize(150,50);
        butao.addActionListener(new Evento2(this.textFieldNome,this.combo,this.texto));
        
        //ADICIONA OS ELEMENTOS NO CONTAINER
        c.add(labelNome);
        c.add(textFieldNome);
        c.add(labelSexo);
        c.add(combo);
        c.add(labelDisciplinas);
        c.add(checkBoxDisciplinas);
        c.add(checkBoxDisciplinas2);
        c.add(checkBoxDisciplinas3);
        c.add(checkBoxDisciplinas4);
        c.add(checkBoxDisciplinas5);
        c.add(labelComentario);
        c.add(texto);
        c.add(butao);
}
    
    class Check implements ItemListener{
    
     @Override
    public void itemStateChanged(ItemEvent e) {
        
         System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nDISCIPLINAS: ");
        if(checkBoxDisciplinas.isSelected()){
            texto1 = "POO II"; 
            System.out.println(texto1);
               
        }
         if(checkBoxDisciplinas2.isSelected()){
            texto2 ="Redes II";
            System.out.println(texto2);
         }
         if(checkBoxDisciplinas3.isSelected()){
            texto3 ="Circuitos digitais";
            System.out.println(texto3);
         }
        
        if(checkBoxDisciplinas4.isSelected()){
            texto4 ="TCC I";
            System.out.println(texto4);
        }
        
        if(checkBoxDisciplinas5.isSelected()){
            texto5 ="Auditoria";
            System.out.println(texto5);
        }
       
    }
    }

    }

