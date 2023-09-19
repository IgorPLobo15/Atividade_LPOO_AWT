package com.mycompany.lista3_ex1;

import java.awt.Color;
import javax.swing.*;
public class classeJFrame extends JFrame{
    	classeJFrame(){
            setTitle("Descobrindo JFrame");
            setBounds(200,150,400,300);
            setBackground(new Color(170,170,170));
	}
	public static void main(String arg[]){
            classeJFrame Ex = new classeJFrame();
            Ex.show();
	}
}
