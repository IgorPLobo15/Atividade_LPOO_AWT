package com.mycompany.lista3_ex5;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class aplicação1_4{

    static String K1, K2,L ;
    static double ant, at, l, aut, rend ;
    public static void calcularConsumo(){

        try{
        K1 = aplicação1_2.Tx1.getText();//trás informação do JtextField
        K1 = K1.replace(',','.');// Se chegar , aqui, troca pra ponto
        ant = Double.parseDouble(K1);
        K2 = aplicação1_2.Tx2.getText();
        K2 = K2.replace(',','.');
        at = Double.parseDouble(K2);
        L = aplicação1_2.Tx3.getText();
        L = L.replace(',','.');
        l = Double.parseDouble(L);
        aut = at - ant ;
            if(aut<=0){
                JOptionPane.showMessageDialog(null,"A kilometragem atual deve ser \n maior do que a anterior","Erro",0);

               return ;
            }

        rend = aut/l ;
        rend = NMath.decimal2(rend);
        JOptionPane.showMessageDialog(null,"O consumo foi de :"+" "+rend+" Km / L\n a autonomia foi de "+
aut+" Kilometros","Resultado",-1);

        }

        catch(NumberFormatException ex){

            JOptionPane.showMessageDialog(null,"Digite apenas números !","Erro !", 0);
        }
    }
}
