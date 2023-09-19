package com.mycompany.ex_3;

import java.awt.*;
import java.awt.event.*;

public class Ex_3 extends Frame{
    public Label L1, L2,L3,L4,L5 ;
    public Panel P1, P2, P3, P4, P5 ;
    public Dimension dim;

    public Ex_3(){

        dim = new Dimension(400,300);
        setSize(dim);
        setLocation(150,150);
        setTitle("Blocos da UNIP");
        setBackground(Color.black);
        setLayout(new BorderLayout(5,5));
        
        P1 = new Panel();
        P1.setLayout(new FlowLayout(1));
        P1.setBackground(new Color(176,151,154));

        P2 = new Panel();
        P2.setLayout(new FlowLayout(1));
        P2.setBackground(new Color(252,251,217));

        P3 = new Panel();
        P3.setLayout(new FlowLayout(1));
        P3.setBackground(new Color(252,243,244));

        P4 = new Panel();
        P4.setLayout(new FlowLayout(1));
        P4.setBackground(new Color(217,241,252));

        P5 = new Panel();
        P5.setLayout(new FlowLayout(1));
        P5.setBackground(new Color(158,170,176));

        L1 = new Label("Bloco A");
        L1.setBackground(new Color(176,151,154));

        L2 = new Label(" Bloco B");
        L2.setBackground(new Color(252,251,217));

        L3 = new Label(" Bloco C");
        L3.setBackground(new Color(252,243,244));

        L4 = new Label("Bloco D");
        L4.setBackground(new Color(217,241,252));

        L5 = new Label(" Bloco E ");
        L5.setBackground(new Color(158,170,176));

        P1.add(L1);
        P2.add(L2);
        P3.add(L3);
        P4.add(L4);
        P5.add(L5);

        add(P1,BorderLayout.NORTH);
        add(P2,BorderLayout.WEST);
        add(P3,BorderLayout.EAST);
        add(P4,BorderLayout.CENTER);
        add(P5,BorderLayout.SOUTH);

        addWindowListener(new FecharJanela());
}
    public static void main(String arg[]){
        //new j2exe_10 ().show();
        new Ex_3().setVisible(true);
}
}
