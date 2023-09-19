package com.mycompany.ex1_a;

import java.awt.*;
import java.awt.event.*;

public class Ex1_A extends Frame implements ActionListener{
    public Label L1 ;
    public Button B1, B2, B3;
    public TextField Tx ;
    public Dimension dim;

    public Ex1_A(){
        dim = Toolkit.getDefaultToolkit().getScreenSize();

        setSize(370,310);
        setLocation(0,0);
        setTitle("Exercicio 1A");
        setBackground(Color.black);
        setLayout(null);

        L1 = new Label("Aperte o botão :");
        L1.setLocation(50,50);
        L1.setBackground(Color.white);
        L1.setSize(150,20);

        B1 = new Button("Sair");
        B1.setSize(60,20);
        B1.setLocation(50,150);
        B1.setBackground(new Color(200,220,200));
        B1.addActionListener(this);
        
        B2 = new Button ("Azul");
        B2.setSize(60,20);
        B2.setLocation(200,150);
        B2.setBackground(new Color(200,220,200));
        B2.addActionListener(this);
        
        B3 = new Button("Cor");
        B3.setSize(60,20);
        B3.setLocation(200,200);
        B3.setBackground(new Color(200,220,200));
        B3.addActionListener(this);

        add(L1);
        add(B1);
        add(B2);
        add(B3);
        addWindowListener(new FecharJanela());

}

    public void actionPerformed(ActionEvent e){
        if ( e.getSource( ) == B1 ){
            System.exit ( 0 ) ;
        }
        if ( e.getSource( ) == B2 ){
            setBackground ( Color.blue ) ;
            L1.setBackground(Color.blue);
        }
        if ( e.getSource( ) == B3 ){
            setBackground (new Color(170,170,170)) ;
            L1.setBackground(new Color(170,170,170));
        }
    }

    public static void main(String arg[])
    {
    new Ex1_A().show();
    new Ex1_A().setVisible(true);

    }

}
