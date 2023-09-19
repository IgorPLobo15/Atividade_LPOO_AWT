package com.mycompany.lista3_ex3;

import javax.swing.*;
import java.awt.*;

public class classeJTextField extends classeJLabel{

    public static JTextField Tx1, Tx2 ;
    public Button B1, B2,B3;
    public static Font F1, F2;
    
    public classeJTextField(){

        setTitle("Adicionando Campos de Texto na apresentação");
        setBounds(200,150,400,300);
        Font F1 = new Font("Arial",Font.ITALIC,14);
        this.F1 = F1;
        this.F2 = F2;
        Font F2 = new Font("Arial",Font.ITALIC,10);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        L1.setBounds(105,25,200,15);
        L1.setText("Registre-se");
        L2.setText("Digite seu Nome :");
        L2.setFont(F1);
        L2.setForeground(Color.black);
        L2.setBounds(10,50,120,15);
        
        JTextField Tx1 = new JTextField();
        this.Tx1 = Tx1 ;
        Tx1.setFont(F2);
        Tx1.setText("Seu Nome :");
        Tx1.setLocation(140,50);
        Tx1.setSize(200,20);
        
        L3.setText("Digite seu e-mail :");
        L3.setFont(F1);
        L3.setForeground(Color.black);
        L3.setBounds(10,90,120,15);
        JTextField Tx2 = new JTextField("Seu e-mail :" );
        this.Tx2 = Tx2 ;
        
        B1 = new Button("Login");
        B1.setSize(60,20);
        B1.setLocation(50,150);
        B1.setBackground(new Color(200,220,200));
        
        B2 = new Button ("Cadastrar");
        B2.setSize(60,20);
        B2.setLocation(200,150);
        B2.setBackground(new Color(200,220,200));
        

        B3 = new Button("Esqueci a Senha");
        B3.setSize(100,20);
        B3.setLocation(200,200);
        B3.setBackground(Color.YELLOW);
        
        
        
        
        Tx2.setFont(F2);
        Tx2.setBackground(Color.yellow);
        Tx2.setForeground(Color.red);
        Tx2.setBounds(140,90,200,20);
        
        getContentPane().add(Tx1);
        getContentPane().add(Tx2);
        getContentPane().add(B1);
        getContentPane().add(B2);
        getContentPane().add(B3);
        
        
    }

    public static void main ( String arg[]){

        classeJTextField Er = new classeJTextField();
        Er.show();
    }
}
