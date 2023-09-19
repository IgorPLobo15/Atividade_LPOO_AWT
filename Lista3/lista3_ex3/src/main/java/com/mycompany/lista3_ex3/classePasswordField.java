package com.mycompany.lista3_ex3;

import javax.swing.*;
import java.awt.*;

public class classePasswordField extends classeJTextField{

    public static JPasswordField Sx ;
    public static JLabel L4;

    public classePasswordField(){

        setTitle("Registrando Conta");
        setBackground(new Color(170,170,170));
        setUndecorated(true);
        getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
       
        JLabel L4 = new JLabel();
        this.L4 = L4;
        L4.setText("Digite sua senha :");
        L4.setBounds(10,120,200,15);
        L4.setFont(F1);
        JPasswordField Sx = new JPasswordField();
        this.Sx = Sx ;
        Sx.setEchoChar('*');
        Sx.setBounds(140,120,200,20);
        getContentPane().add(Sx);
        getContentPane().add(L4);
    }

    public static void main ( String arg[]){

        classePasswordField Er = new classePasswordField();
        Er.show();

    }

}
