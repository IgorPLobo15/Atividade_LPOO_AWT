package com.mycompany.ex_4;

import java.awt.*;

import java.awt.event.*;

public class Ex_4 extends Frame{
    public Button B1,B2,B3,B4, B5, B6, B7, B8,B9,B0,
            B11,B12, B13,B14,B15,B16,B17,B18,B19,B20,
            B21,B22,B23,B24,B25,B26;
    public Panel P1 ;

    public Ex_4(){
        setSize(370,310);
        setLocation(150,150);
        setTitle("Afabeto");
        setBackground(Color.black);
        setLayout(null);

        P1 =new Panel();
        P1.setSize(350,250);
        P1.setLocation(5,20);
        P1.setLayout(new GridLayout(3,10,2,2));

        B1 = new Button("A");
        B1.setBackground(Color.lightGray);
        
        B2 = new Button("B");
        B2.setBackground(Color.lightGray);

        B3 = new Button("C");
        B3.setBackground(Color.lightGray);

        B4 = new Button("D");
        B4.setBackground(Color.lightGray);

        B5 = new Button("E");
        B5.setBackground(Color.lightGray);

        B6 = new Button("F");
        B6.setBackground(Color.lightGray);

        B7 = new Button("G");
        B7.setBackground(Color.lightGray);
        
        B8 = new Button("H");
        B8.setBackground(Color.lightGray);

        B9 = new Button("I");
        B9.setBackground(Color.lightGray);

        B0 = new Button("J");
        B0.setBackground(Color.lightGray);

        B11 = new Button("K");
        B11.setBackground(Color.lightGray);

        B12 = new Button("L");
        B12.setBackground(Color.lightGray);

        B13 = new Button("M");
        B13.setBackground(Color.lightGray);
        
        B14 = new Button("N");
        B14.setBackground(Color.lightGray);

        B15 = new Button("O");
        B15.setBackground(Color.lightGray);

        B16 = new Button("P");
        B16.setBackground(Color.lightGray);
        
        B17 = new Button("O");
        B17.setBackground(Color.lightGray);
        
        B18 = new Button("R");
        B18.setBackground(Color.lightGray);
        
        B19 = new Button("S");
        B19.setBackground(Color.lightGray);
        
        B20 = new Button("T");
        B20.setBackground(Color.lightGray);
        
        B21 = new Button("U");
        B21.setBackground(Color.lightGray);
        
        B22 = new Button("V");
        B22.setBackground(Color.lightGray);
        
        B23 = new Button("W");
        B23.setBackground(Color.lightGray);
        
        B24 = new Button("X");
        B24.setBackground(Color.lightGray);
        
        B25 = new Button("Y");
        B25.setBackground(Color.lightGray);
        
        B26 = new Button("Z");
        B26.setBackground(Color.lightGray);
        
        

        P1.add(B1);
        P1.add(B2);
        P1.add(B3);
        P1.add(B4);
        P1.add(B5);
        P1.add(B6);
        P1.add(B7);
        P1.add(B8);
        P1.add(B9);
        P1.add(B0);
        P1.add(B11);
        P1.add(B12);
        P1.add(B13);
        P1.add(B14);
        P1.add(B15);
        P1.add(B16);
        P1.add(B17);
        P1.add(B18);
        P1.add(B19);
        P1.add(B20);
        P1.add(B21);
        P1.add(B22);
        P1.add(B23);
        P1.add(B24);
        P1.add(B25);
        P1.add(B26);

        add(P1);
        
        addWindowListener(new FecharJanela());
    }
    public static void main(String arg[]){

        new Ex_4().show();

    }
}