package com.mycompany.ex01frame3;
import java.awt.*;
import java.awt.event.*;

public class corframe3 extends Ex01frame3 {
    

    public corframe3()
    {
    setTitle("Segunda tela");
    Color novaCor = new Color(193,21,235);//cria cor mais luminosa
    setBackground(novaCor);//fornece a cor como parâmetro do método
    }

    public static void main(String[] args) {
    //new j2exe2().show();
    new corframe3().setVisible(true);

 }


}