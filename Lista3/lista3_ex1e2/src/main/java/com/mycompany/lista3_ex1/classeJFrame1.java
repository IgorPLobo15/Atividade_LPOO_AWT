package com.mycompany.lista3_ex1;

import javax.swing.*;
import java.awt.*;
public class classeJFrame1 extends classeJFrame{
	public classeJFrame1(){		
		setLocation(50,100);// Localização
		setSize(600,450);//Tamanho do Frame
		getContentPane().setBackground(Color.green);/*Painel Root Pane gerenciado pelo 
                 JRootPane – javax.swing – aplicando no Frame o método setBackground.*/
	}
	public static void main(String arg[]){
		new classeJFrame1().show();
	}
}
