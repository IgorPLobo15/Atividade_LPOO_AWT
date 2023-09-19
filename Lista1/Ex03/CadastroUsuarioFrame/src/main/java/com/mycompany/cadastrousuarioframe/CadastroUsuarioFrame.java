package com.mycompany.cadastrousuarioframe;
import java.awt.*;
import javax.swing.*;

public class CadastroUsuarioFrame extends JFrame {
    private JLabel lblNome, lblEmail, lblSenha;
    private JTextField txtNome, txtEmail;
    private JPasswordField txtSenha;
    private JButton btnCadastrar;

    public CadastroUsuarioFrame() {
        setTitle("Cadastro de Usuários");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        lblNome = new JLabel("Nome:");
        lblEmail = new JLabel("E-mail:");
        lblSenha = new JLabel("Senha:");

        txtNome = new JTextField(20);
        txtEmail = new JTextField(20);
        txtSenha = new JPasswordField(20);

        btnCadastrar = new JButton("Cadastrar");

        setLayout(new GridLayout(4, 2, 10, 10)); 

        add(lblNome);
        add(txtNome);
        add(lblEmail);
        add(txtEmail);
        add(lblSenha);
        add(txtSenha);
        add(new JLabel()); 
        add(btnCadastrar);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CadastroUsuarioFrame());
    }
}

