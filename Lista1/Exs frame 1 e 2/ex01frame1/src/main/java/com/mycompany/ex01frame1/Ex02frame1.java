
package com.mycompany.ex01frame1;
import java.awt.*;
import java.awt.event.*;
public class Ex02frame1 extends Ex01frame1 {
    

    public Ex02frame1()
    {
    setTitle("Segunda tela");
    Color lightPink = Color.pink.brighter();//cria cor mais luminosa
    setBackground(lightPink);//fornece a cor como parâmetro do método
    }

    public static void main(String[] args) {
    //new j2exe2().show();
    new Ex02frame1().setVisible(true);


 }


}
