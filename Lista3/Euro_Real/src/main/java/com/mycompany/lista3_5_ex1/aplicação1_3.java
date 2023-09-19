package com.mycompany.lista3_5_ex1;
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
        }
        if(e.getSource()==B2){
            aplicação1_4.calcularEuroparaReal();
        }
        if(e.getSource()==B3){           
            aplicação1_4.calcularRealparaEuro();
        }
    }

    public static void main ( String arg[]){

        NFrame Fx = new aplicação1_3();
        Fx. show();

    }
}