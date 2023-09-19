package com.mycompany.lista3_ex5;
import java.awt.*;
import java.text.NumberFormat;
import javax.swing.*;

public class NMath{
    public static double decimal2(double A){
        A *=100;
        double B = A- (int)A ;
        if(B>=0.5){
            A = Math.ceil(A);
            A /=100;
        }
        else{
            A = Math.floor(A);
            A /=100;
        }
        return A ;
    }
}
