package com.mycompany.curriculo;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.net.URI;

public class curriculo extends Frame {
    public curriculo() {
        setTitle("Minhas Principais Qualidades");
        setSize(400, 500); 
        setResizable(false);
        setBackground(new Color(240, 240, 240));
        setLayout(null);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        Panel painel = new Panel();
        painel.setBounds(30, 70, 340, 380); 
        painel.setBackground(Color.white);
        painel.setLayout(null);

        Font tituloFont = new Font("Arial", Font.BOLD, 20);
        Font qualidadeFont = new Font("Arial", Font.PLAIN, 16);

        Label lblTitulo = new Label("Minhas Principais Qualidades");
        lblTitulo.setBounds(20, 15, 300, 30);
        lblTitulo.setFont(tituloFont);
        lblTitulo.setForeground(new Color(44, 62, 80));
        painel.add(lblTitulo);

        String[] qualities = {
            "Comunicativo",
            "Trabalho em Equipe",
            "Aprendizado Rápido",
            "Resolução de Problemas",
            "Flexível",
            "Java,Python,Html,Css",
            "MySql,Sql,NoSql",
            "Desenvolvimento Bubble.io"
                
        };

        int yPosition = 60;
        for (String quality : qualities) {
            Label lblQualidades = new Label(quality);
            lblQualidades.setBounds(20, yPosition, 300, 25);
            lblQualidades.setFont(qualidadeFont);
            lblQualidades.setForeground(new Color(52, 152, 219));
            painel.add(lblQualidades);
            yPosition += 35;
        }

        Label lblPortfolio = new Label("Portfolio");
        lblPortfolio.setBounds(20, yPosition, 300, 25);
        lblPortfolio.setFont(qualidadeFont);
        lblPortfolio.setForeground(new Color(34, 139, 34));
        lblPortfolio.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        lblPortfolio.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://github.com/IgorPLobo15"));
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        painel.add(lblPortfolio);

        add(painel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new curriculo();
    }
}

