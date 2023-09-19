package com.mycompany.lista3_ex1;
import javax.swing.*;


public class classeJFrame2 extends classeJFrame1{
   	public classeJFrame2(){
            super();
            setLocation(50, 100);
            setSize(800, 600); // Alterando o tamanho para 800x600
            setUndecorated(true);
            getRootPane().setWindowDecorationStyle(6); // Usando a constante JRootPane.PLAIN_DIALOG
            
            
            setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	public static void main(String arg[])
	{
		new classeJFrame2().show();
	}
}


