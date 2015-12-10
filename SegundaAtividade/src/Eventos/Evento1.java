/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eventos;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import segundaatividade.Cadastro;
import segundaatividade.JanelaLogin;

/**
 *
 * @author Francisco
 */
public class Evento1 implements ActionListener{
    
    //ATRIBUTOS
    String defaultUser = "user";
    String defaultPassword = "123";
    JTextField usuario;
    JPasswordField senha;
    Cadastro janelaCadastro;
    JFrame f;
    
    //CONSTRUTOR
    public Evento1(JTextField usuario, JPasswordField senha, JFrame f){
        this.usuario = usuario;
        this.senha = senha;
        this.f = f;
    }
    
    //MÉTODO DO EVENTO DA JANELA DE LOGIN
    @Override
    public void actionPerformed(ActionEvent e) {
        String usuarioDigitado = this.usuario.getText();
        String senhaDigitada = this.senha.getText();
        
        if (usuarioDigitado.equals(defaultUser) && senhaDigitada.equals(defaultPassword)) {
            if (janelaCadastro == null) {
                janelaCadastro = new Cadastro();
                f.setVisible(false);
                
            }
        } else {
            System.out.println("USUARIO OU/E SENHA INCORRETO!");
           this.usuario.setText(null);
           this.senha.setText(null);
        }
    }
    
}
