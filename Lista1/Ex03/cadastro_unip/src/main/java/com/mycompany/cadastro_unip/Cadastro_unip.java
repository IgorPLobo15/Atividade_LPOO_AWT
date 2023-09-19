package com.mycompany.cadastro_unip;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Cadastro_unip extends JFrame{
    private JLabel lblNome, lblEmail, lblmatri,lbltelefone;
    private JTextField txtNome, txtEmail,txttelefone;
    private JPasswordField txtSenha;
    private JButton btnCadastrar;

    public Cadastro_unip() {
        setTitle("Cadastro de Aluno");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        lblNome = new JLabel("Nome:");
        lblEmail = new JLabel("E-mail:");   
        lblmatri = new JLabel("Matricula:");
        lbltelefone= new JLabel("Telefone:");
        

        txtNome = new JTextField(20);
        txtEmail = new JTextField(20);
        txtSenha = new JPasswordField(20);
        txttelefone=new JTextField(20);

        btnCadastrar = new JButton("Cadastrar");

        setLayout(new GridLayout(5, 2, 10, 10)); 
     
        add(lblNome);
        add(txtNome);
        add(lblEmail);
        add(txtEmail);
        add(lblmatri);
        add(txtSenha);
        add(lbltelefone);
        add(txttelefone);
        add(new JLabel());
        add(btnCadastrar);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Cadastro_unip());
    }
}
