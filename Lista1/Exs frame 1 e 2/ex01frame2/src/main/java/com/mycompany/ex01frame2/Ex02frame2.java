package com.mycompany.ex01frame2;
import java.awt.*;
import java.awt.event.*;

public class Ex02frame2 extends Ex01frame2 {
    

    public Ex02frame2()
    {
    setTitle("Segunda tela");
    Color novaCor = new Color(5,245,217);//cria cor mais luminosa
    setBackground(novaCor);//fornece a cor como parâmetro do método
    }

    public static void main(String[] args) {
    //new j2exe2().show();
    new Ex02frame2().setVisible(true);

 }


}
