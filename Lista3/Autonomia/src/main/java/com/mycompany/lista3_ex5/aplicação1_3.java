package com.mycompany.lista3_ex5;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class aplicação1_3 extends aplicação1_2 implements ActionListener{

    aplicação1_3(){

        B1.addActionListener(this);
        B2.addActionListener(this);
        B3.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){

        if(e.getSource()==B1){
            Tx1.setText(" ");
            Tx2.setText(" ");
            Tx3.setText(" ");
        }
        if(e.getSource()==B2){
            aplicação1_4.calcularConsumo();
        }
        if(e.getSource()==B3){
            System.exit(0);
        }
    }

    public static void main ( String arg[]){

        NFrame Fx = new aplicação1_3();
        Fx. show();

    }
}