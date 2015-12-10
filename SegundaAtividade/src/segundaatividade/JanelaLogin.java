/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundaatividade;

import Eventos.Evento1;
import javax.swing.*;

public class JanelaLogin{
    
    //ATRIBUTOS DA JANELA
    JFrame f = new JFrame();
    JPanel p = new JPanel();
    
    //CONSTRUTOR
    public JanelaLogin(){
        
        //PRE-DEFINIÇÕES DA JANELA
        f.setTitle("Login");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.setLocationRelativeTo(null);
        f.setSize(300,300);
        
        //TIPO DE LAYOUT
        p.setLayout(null);
        
        //CRIA UM LABEL
        JLabel labelEmail = new JLabel("Email");
        labelEmail.setLocation(20,50);
        labelEmail.setSize(80, 25);
        p.add(labelEmail);
        
        //CRIA UM TEXTFIELD
        JTextField j1 = new JTextField();
        j1.setLocation(80,50);
        j1.setSize(200, 25);
        p.add(j1);
        
        //CRIA UM LABEL
        JLabel labelSenha = new JLabel("Senha");
        labelSenha.setLocation(20,80);
        labelSenha.setSize(80, 25);
        p.add(labelSenha);
        
        //CRIA UM PASSWORDFIELD
        JPasswordField j2 = new JPasswordField();
        j2.setLocation(80,80);
        j2.setSize(200, 25);
        p.add(j2);
        
        //CRIA UM BUTÃO
        JButton login = new JButton("Login");
        login.setLocation(30,150);
        login.setSize(80, 25);
        login.addActionListener(new Evento1(j1,j2,f));
        p.add(login);
        
        //ADICIONA PAINEL NO FRAME
        f.add(p);
        
    }
    
}
