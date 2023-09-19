package com.mycompany.calculando_area;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class aplicação1_4{

    static String B1, H2,Base ;
    static double base,altura, baseq, area ;
    public static void calcularaAreaRetangulo(){

        try{
        B1 = aplicação1_2.Tx1.getText();
        B1 = B1.replace(',','.');
        base = Double.parseDouble(B1);
        H2 = aplicação1_2.Tx2.getText();
        H2 = H2.replace(',','.');
        altura = Double.parseDouble(H2);       
        area = base * altura ;

        JOptionPane.showMessageDialog(null,"A área do retângulo é de "+area);
        }

        catch(NumberFormatException ex){

            JOptionPane.showMessageDialog(null,"Digite apenas números !","Erro !", 0);
        }
    }
    public static void calcularaAreaTriangulo(){

        try{
        B1 = aplicação1_2.Tx1.getText();
        B1 = B1.replace(',','.');
        base = Double.parseDouble(B1);
        H2 = aplicação1_2.Tx2.getText();
        H2 = H2.replace(',','.');
        altura = Double.parseDouble(H2);
        //L = aplicação1_2.Tx3.getText();
        //L = L.replace(',','.');
        //l = Double.parseDouble(L);
        area = (base * altura)/2 ;

        JOptionPane.showMessageDialog(null,"A área do Triângulo é de "+area);
        }

        catch(NumberFormatException ex){

            JOptionPane.showMessageDialog(null,"Digite apenas números !","Erro !", 0);
        }
    }
    public static void calcularaAreaQuadrado(){

        try{        
        Base = aplicação1_2.Tx3.getText();
        Base = Base.replace(',','.');
        baseq = Double.parseDouble(Base);
        area = baseq*baseq ;

        JOptionPane.showMessageDialog(null,"A área do Quadrado é de "+area);
        }

        catch(NumberFormatException ex){

            JOptionPane.showMessageDialog(null,"Digite apenas números !","Erro !", 0);
        }
    }
}
