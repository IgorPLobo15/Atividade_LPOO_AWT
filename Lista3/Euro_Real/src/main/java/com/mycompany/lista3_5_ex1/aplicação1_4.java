package com.mycompany.lista3_5_ex1;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class aplicação1_4{

    static String R1, E2,L ;
    static double real, euro, l, troca, rend ;
    public static void calcularRealparaEuro(){
        try{
        R1 = aplicação1_2.Tx1.getText();
        R1 = R1.replace(',','.');
        real = Double.parseDouble(R1);
        euro=real/6.74;            
                   
        JOptionPane.showMessageDialog(null,"A troca de Real R$"+" "+real+" para Euro foi de €"+
        euro);
        }
        catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null,"Digite apenas números !","Erro !", 0);
        }
    }
    
    public static void calcularEuroparaReal(){
        try{               
        E2 = aplicação1_2.Tx1.getText();;
        E2 = E2.replace(',','.');
        euro = Double.parseDouble(E2);
        real = euro *6.74;                   
        JOptionPane.showMessageDialog(null,"A troca de Euro €"+" "+euro+" para Real foi de R$"+
        real);
        }
        catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null,"Digite apenas números !","Erro !", 0);
        }
    }
}
