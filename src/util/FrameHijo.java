package util;

import java.awt.Frame;
import java.awt.Window;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class FrameHijo {
    
    public static Frame obtenerPadre(JPanel panelVista)
    {
        Window padre = SwingUtilities.windowForComponent(panelVista);
        java.awt.Frame parentFrame = (java.awt.Frame)padre;
        
        return parentFrame;
    }
}