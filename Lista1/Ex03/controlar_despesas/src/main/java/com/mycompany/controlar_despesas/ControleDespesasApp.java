package com.mycompany.controlar_despesas;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ControleDespesasApp {
    private static double totalDespesas = 0;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            criarGUI();
        });
    }

    private static void criarGUI() {
        JFrame frame = new JFrame("Controle de Despesas Diárias");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        JPanel painelPrincipal = new JPanel();
        painelPrincipal.setLayout(new BoxLayout(painelPrincipal, BoxLayout.Y_AXIS));

        JLabel lbltitulo = new JLabel("Controle de Despesas Diárias");
        lbltitulo.setFont(new Font("Arial", Font.BOLD, 18));
        lbltitulo.setAlignmentX(Component.CENTER_ALIGNMENT);
        lbltitulo.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0));

        JLabel lblDespesas = new JLabel("Despesa do Dia: R$" + totalDespesas);
        lblDespesas.setFont(new Font("Arial", Font.PLAIN, 16));
        lblDespesas.setAlignmentX(Component.CENTER_ALIGNMENT);
        lblDespesas.setBorder(BorderFactory.createEmptyBorder(0, 0, 10, 0));

        JButton btnAdicionarDespesas = new JButton("Adicionar Despesa");
        btnAdicionarDespesas.setAlignmentX(Component.CENTER_ALIGNMENT);
        btnAdicionarDespesas.setFont(new Font("Arial", Font.PLAIN, 14));
        btnAdicionarDespesas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String valorDespesaStr = JOptionPane.showInputDialog(frame, "Digite o valor da despesa:", "Adicionar Despesa", JOptionPane.PLAIN_MESSAGE);
                if (valorDespesaStr != null && !valorDespesaStr.isEmpty()) {
                    try {
                        double valorDespesa = Double.parseDouble(valorDespesaStr);
                        totalDespesas += valorDespesa;
                        lblDespesas.setText("Despesa do Dia: R$" + totalDespesas);
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(frame, "Valor inválido. Digite um número válido.", "Erro", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });

        painelPrincipal.add(lbltitulo);
        painelPrincipal.add(lblDespesas);
        painelPrincipal.add(btnAdicionarDespesas);

        frame.add(painelPrincipal);
        frame.setVisible(true);
    }
}
