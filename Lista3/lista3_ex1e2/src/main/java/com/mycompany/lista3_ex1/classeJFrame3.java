package com.mycompany.lista3_ex1;

import javax.swing.*;
import java.awt.*;
import static javax.swing.BorderFactory.createEmptyBorder;

public class classeJFrame3 extends classeJFrame1{    
    public classeJFrame3(){
                    super();
                    setLocation(50,100);
                    setSize(600,450);
                    setUndecorated(true);
                    getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
                    getRootPane().setBorder(createEmptyBorder(4, 6, 4, 6));
                    /*Tipos:
                    createEmptyBorder(int superior, int esquerda, int inferior, int direita);ria uma borda vazia com espaçamento definido nas quatro direções.
                    createRaisedBevelBorder(): Cria uma borda em relevo elevada.
                    createLoweredBevelBorder(): Cria uma borda em relevo abaixada.
                    createTitledBorder(Border borde, String título): Cria uma borda com um título opcional.
                    createTitledBorder(String título): Cria uma borda com um título sem necessidade de borda adicional.
                    createCompoundBorder(Border bordaExterna, Border bordaInterna): Cria uma borda composta com duas bordas.
                    createMatteBorder(int superior, int esquerda, int inferior, int direita, Color cor): Cria uma borda fosca com uma cor e espaçamento definidos.                
                    */

                    setDefaultCloseOperation(EXIT_ON_CLOSE);
            }
	public static void main(String arg[]){
		new classeJFrame3().show();
	}
}

