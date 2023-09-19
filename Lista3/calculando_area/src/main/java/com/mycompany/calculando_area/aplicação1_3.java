package com.mycompany.calculando_area;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class aplicação1_3 extends aplicação1_2 implements ActionListener{

    aplicação1_3(){

        B1.addActionListener(this);
        B2.addActionListener(this);
        B3.addActionListener(this);
        B4.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){

        if(e.getSource()==B1){
            Tx1.setText(" ");
            Tx2.setText(" ");
            Tx3.setText(" ");            
        }
        if(e.getSource()==B2){
            aplicação1_4.calcularaAreaRetangulo();
        }
        if(e.getSource()==B3){
            aplicação1_4.calcularaAreaTriangulo();
        }
        if(e.getSource()==B4){
            aplicação1_4.calcularaAreaQuadrado();
        }
        
    }

    public static void main ( String arg[]){

        NFrame Fx = new aplicação1_3();
        Fx. show();

    }
}