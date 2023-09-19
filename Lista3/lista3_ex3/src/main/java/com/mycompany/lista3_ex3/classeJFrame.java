package com.mycompany.lista3_ex3;

import javax.swing.*;
public class classeJFrame extends JFrame{
    	classeJFrame(){
            setTitle("Descobrindo JFrame");
            setBounds(200,150,400,300);/*parametros corresponden a posicao x,y,
                                            *altura e largura*/
	}
	public static void main(String arg[]){
            classeJFrame Ex = new classeJFrame();
            Ex.show();
	}
}

