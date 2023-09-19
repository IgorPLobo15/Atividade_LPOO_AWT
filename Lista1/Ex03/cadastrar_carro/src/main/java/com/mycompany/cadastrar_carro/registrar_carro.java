package com.mycompany.cadastrar_carro;
import java.awt.*;
import javax.swing.*;


public class registrar_carro {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            JFrame frame = new Carroframe();
            frame.setTitle("Cadastro do Carro dos Sonhos");
            
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            
        });
    }
}

class Carroframe extends JFrame {
    public Carroframe() {
        Componenetes();
    }

    private void Componenetes() {
        setLayout(new GridLayout(5, 2, 10, 10));
        setSize(300, 300);
        
        
        JLabel lblNome = new JLabel("Nome:");
        JTextField txtNome = new JTextField(20);
        
        JLabel lblMarca = new JLabel("Marca:");
        JTextField txtMarca = new JTextField(20);
        
        JLabel lblModelo = new JLabel("Modelo:");
        JTextField txtModelo = new JTextField(20);
        
        JLabel lblAno = new JLabel("Ano:");
        JTextField txtAno = new JTextField(20);
        
        JLabel lblPreco = new JLabel("Preço:");
        JTextField txtPreco = new JTextField(20);
        
        
        add(lblNome);
        add(txtNome);
        
        add(lblMarca);
        add(txtMarca);
        
        add(lblModelo);
        add(txtModelo);
        
        add(lblAno);
        add(txtAno);
        
        add(lblPreco);
        add(txtPreco);
        
        
    }
}
