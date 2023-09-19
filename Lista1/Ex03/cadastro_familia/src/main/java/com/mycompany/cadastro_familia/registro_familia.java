package com.mycompany.cadastro_familia;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class registro_familia extends JFrame {

    public registro_familia() {
        setTitle("Cadastro Familiar");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 400);
        setLocationRelativeTo(null);

        JPanel painelPrincipal = new JPanel();
        painelPrincipal.setLayout(new BoxLayout(painelPrincipal, BoxLayout.Y_AXIS));

        JPanel paiPainel = createRegistrationPanel("Pai");
        JPanel maePainel = createRegistrationPanel("Mãe");
        JPanel filhoPainel = createRegistrationPanel("Filho(a)");

        painelPrincipal.add(paiPainel);
        painelPrincipal.add(maePainel);
        painelPrincipal.add(filhoPainel);

        add(painelPrincipal);
    }

    private JPanel createRegistrationPanel(String role) {
        JPanel panel = new JPanel(new GridLayout(4, 2)); 
        panel.setBorder(BorderFactory.createTitledBorder(role));

        JLabel nameLabel = new JLabel("Nome:");
        JTextField nameField = new JTextField(20);

        JLabel ageLabel = new JLabel("Idade:");
        JTextField ageField = new JTextField(20);

        JButton cadastrarButton = new JButton("Cadastrar");
        cadastrarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {                
                System.out.println("Cadastro realizado para " + role + ": " +
                                   nameField.getText() + ", " + ageField.getText());
            }
        });

        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(ageLabel);
        panel.add(ageField);
        panel.add(cadastrarButton); 

        return panel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            registro_familia app = new registro_familia();
            app.setVisible(true);
        });
    }
}
