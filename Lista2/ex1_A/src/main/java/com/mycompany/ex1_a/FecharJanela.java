
package com.mycompany.ex1_a;

import java.awt.*;
import java.awt.event.*;

public class FecharJanela extends WindowAdapter{
    public void windowClosing(WindowEvent e)
    {
        System.exit(0);
    }
}