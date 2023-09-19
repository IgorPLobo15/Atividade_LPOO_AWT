package com.mycompany.ex_2;

import java.awt.*;
import java.awt.event.*;

    public class Ex_2_1 extends Frame{
        public Label L1 ;
        public Button B1, B2, B3, B4, B5,B6, B7, B8;
        public TextField Tx1, Tx2 ;
        public Dimension dim;

    public Ex_2_1(){
        dim = new Dimension(450,260);
        setSize(dim);
        setLocation(220,180);
        setTitle ("A classe FlowLayout");
        setBackground(new Color(170,170,170));
        
        setLayout(new FlowLayout(1, 15, 15));
        

        L1 = new Label ("Exercício 2");
        L1.setBackground(new Color(217,203,217));

        Tx1 = new TextField(" ");
        Tx2 = new TextField("Para escrever ");

        B1 = new Button("Sair");
        B1.setBackground(new Color(217,203,217));
        B2 = new Button("Botão");
        B2.setBackground(new Color(217,203,217));
        
        B3 = new Button("Botão");
        B3.setBackground(new Color(217,203,217));
        
        B4 = new Button("Botão");
        B4.setBackground(new Color(217,203,217));
        
        B5 = new Button("Botão");
        B5.setBackground(new Color(217,203,217));
        
        B6 = new Button("Botão");
        B6.setBackground(new Color(217,203,217));
        
        B7 = new Button("Botão");
        B7.setBackground(new Color(217,203,217));
        
        B8 = new Button("Botão");
        B8.setBackground(new Color(217,203,217));
        add(L1);
        add(Tx1);
        add(Tx2);
        add(B3);
        add(B4);
        add(B1);
        add(B2);
        add(B5);
        add(B6);
        add(B7);
        add(B8);
        addWindowListener(new FecharJanela());
        
    }
    public static void main(String arg[]){
        //new j2exe9().show();
        new Ex_2_1().setVisible(true);

}
}
