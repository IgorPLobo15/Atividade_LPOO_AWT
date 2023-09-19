package com.mycompany.ex01frame1;
import java.awt.*;
import java.awt.event.*;

public class Ex01frame1 extends Frame {
    public Ex01frame1(){
    setTitle("Primeira tela"); // nome da barra de títulos
    setResizable(true); 
    setSize(100,600); //tamanho da tela
    setLocation(120,200); //localização na tela
    setBackground(Color.blue); //cor de fundo
    
    class Ouvidoria implements WindowListener {
        public void windowOpened(WindowEvent e) { }
        public void windowClosing(WindowEvent e) { System.exit(0); }
        public void windowClosed(WindowEvent e) { } // fecha
        public void windowIconified(WindowEvent e) { }
        public void windowDeiconified(WindowEvent e) { }
        public void windowActivated(WindowEvent e) { }
        public void windowDeactivated(WindowEvent e) { }
} 
    addWindowListener(new Ouvidoria());
}

    public static void main(String[] args) {
        //new j2exe1().show();
        new Ex01frame1().setVisible(true);
    }
    
}
