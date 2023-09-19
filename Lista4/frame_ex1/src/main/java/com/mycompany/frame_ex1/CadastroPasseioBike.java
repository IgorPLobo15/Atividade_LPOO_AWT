/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.frame_ex1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroPasseioBike extends JFrame {
    private JTextField[] camposNome;
    private JLabel[] labelsCadastro;
    private JButton cadastrarButton;

    public CadastroPasseioBike() {
        setTitle("Cadastro de Passeio de Bike");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(11, 2));

        camposNome = new JTextField[10];
        labelsCadastro = new JLabel[10];

        for (int i = 0; i < 10; i++) {
            labelsCadastro[i] = new JLabel("Cadastro " + (i + 1) + ": ");
            camposNome[i] = new JTextField(20);
            add(labelsCadastro[i]);
            add(camposNome[i]);
        }

        cadastrarButton = new JButton("Cadastrar");
        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastrarPessoas();
            }
        });
        add(new JLabel(""));
        add(cadastrarButton);

        setVisible(true);
    }

    private void cadastrarPessoas() {
        for (int i = 0; i < 10; i++) {
            String nome = camposNome[i].getText();
            if (!nome.isEmpty()) {
                int numeroCadastro = 550 + i;
                JOptionPane.showMessageDialog(this, nome + " cadastrado com número de cadastro: " + numeroCadastro);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CadastroPasseioBike();
            }
        });
    }
}