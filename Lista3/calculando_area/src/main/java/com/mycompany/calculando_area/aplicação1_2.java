package com.mycompany.calculando_area;

import java.awt.*;
import javax.swing.*;

public class aplicação1_2 extends aplicação1_1{

    static JTextField Tx1, Tx2, Tx3 ;
    JButton B1, B2, B3, B4 ;

    public aplicação1_2(){

        Tx1 = new JTextField();
        this.Tx1 = Tx1;
        Tx1.setBounds(190,120,80,20);
        Tx2 = new JTextField();
        this.Tx2 = Tx2;
        Tx2.setBounds(190,150,80,20);
        Tx3 = new JTextField();
        this.Tx3 = Tx3;
        Tx3.setBounds(190,220,80,20);
        
        B1 =new JButton("Limpar");
        B1.setSize(95,30);
        B1.setLocation(50,280);
        
        B2 =new JButton("Retângulo");
        B2.setSize(95,30);
        B2.setLocation(150,280);
        
        B3 =new JButton("Triângulo");
        B3.setSize(95,30);
        B3.setLocation(250,280);
        
        B4 =new JButton("Quadrado");
        B4.setSize(95,30);
        B4.setLocation(350,280);
        
        getContentPane().add(Tx1);
        getContentPane().add(Tx2);
        getContentPane().add(Tx3);
        getContentPane().add(B1);
        getContentPane().add(B2);
        getContentPane().add(B3);
        getContentPane().add(B4);

    }

}
