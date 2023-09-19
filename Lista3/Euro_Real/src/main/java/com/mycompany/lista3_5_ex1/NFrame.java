package com.mycompany.lista3_5_ex1;
import javax.swing.*;

import java.awt.*;

public class NFrame extends JFrame{

    public NFrame(){

        setLocation(50,100);
        setTitle("Este é NFrame ( um JFrame personalizado )");
        setSize(500,400);
        setUndecorated(true);
        getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
        getRootPane().setBorder(BorderFactory.createLineBorder(Color.black,3));
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String arg[]){
        new NFrame().show();
    }
}