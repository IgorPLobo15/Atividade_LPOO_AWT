package com.mycompany.lista3_ex4;

import javax.swing.*;
import java.awt.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class classeJTextField extends classeJLabel{

    public static JTextField Tx1, Tx2,Tx3,Tx4,Tx5 ;
    public Button B3;
    public static Font F1, F2;
    
    public classeJTextField(){

        setTitle("Adicionando Campos de Texto na apresentação");
        setBounds(200,150,400,350);
        Font F1 = new Font("Arial",Font.ITALIC,14);
        this.F1 = F1;
        this.F2 = F2;
        Font F2 = new Font("Arial",Font.ITALIC,10);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        L1.setBounds(105,25,200,20);
        L1.setText("Registre-se");
        
        L2.setText("Digite seu Nome :");
        L2.setFont(F1);
        L2.setForeground(Color.black);
        L2.setBounds(10,50,120,15);
        
        JTextField Tx1 = new JTextField();
        this.Tx1 = Tx1 ;
        Tx1.setFont(F2);
        Tx1.setText("");
        Tx1.setLocation(140,50);
        Tx1.setSize(200,20);
        
        L3.setText("Digite seu e-mail :");
        L3.setFont(F1);
        L3.setForeground(Color.black);
        L3.setBounds(10,90,120,15);
        JTextField Tx2 = new JTextField("" );
        this.Tx2 = Tx2 ;
        
        L4.setBounds(10,120,120,15);
        L4.setText("Matricula: ");
        JTextField Tx3 = new JTextField();
        this.Tx3 = Tx3 ;
        Tx3.setFont(F1);
        Tx3.setText("");
        Tx3.setLocation(140,120);
        Tx3.setSize(200,20);
        
        L5.setBounds(10,150,120,15);
        L5.setText("Curso: ");
        JTextField Tx4 = new JTextField();
        this.Tx4 = Tx4 ;
        Tx4.setFont(F1);
        Tx4.setText("");
        Tx4.setLocation(140,150);
        Tx4.setSize(200,20);
        
        L6.setBounds(10,180,120,15);
        L6.setText("Turno: ");
        JTextField Tx5 = new JTextField();
        this.Tx5 = Tx5 ;
        Tx5.setFont(F1);
        Tx5.setText("");
        Tx5.setLocation(140,180);
        Tx5.setSize(200,20);
        
    
        B3 = new Button("Cadastrar");
        B3.setSize(100,20);
        B3.setLocation(105,250);
        B3.setBackground(Color.YELLOW);
        
        Tx2.setFont(F2);
        Tx2.setBackground(Color.yellow);
        Tx2.setForeground(Color.red);
        Tx2.setBounds(140,90,200,20);
        
        getContentPane().add(Tx1);
        getContentPane().add(Tx2);
        getContentPane().add(Tx3);
        getContentPane().add(Tx4);
        getContentPane().add(Tx5);        
        getContentPane().add(B3);
        
        
    }

    public static void main ( String arg[]){

        classeJTextField Er = new classeJTextField();
        Er.show();
    }
}

