package util;

import java.awt.Component;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class AlertMarket {
    
    public static void GetInfoAlert(Component component, String content, String titulo)
    {
        Icon ICON_INFO_IMAGE = new ImageIcon("src/recursos/iconos/info.png");
        JOptionPane.showMessageDialog(component, content, titulo, JOptionPane.INFORMATION_MESSAGE, ICON_INFO_IMAGE);
    }
    
    public static void GetErrorAlert(Component component, String content, String titulo)
    {
        Icon ICON_ERROR_IMAGE = new ImageIcon("src/recursos/iconos/error.png");
        JOptionPane.showMessageDialog(component, content, titulo, JOptionPane.ERROR_MESSAGE, ICON_ERROR_IMAGE);
    }
    
    public static void GetWarnAlert(Component component, String content, String titulo)
    {
        Icon ICON_WARN_IMAGE = new ImageIcon("src/recursos/iconos/warning.png");
        JOptionPane.showMessageDialog(component, content, titulo, JOptionPane.WARNING_MESSAGE, ICON_WARN_IMAGE);
    }
    
    public static void GetDoneAlert(Component component, String content, String titulo)
    {
        Icon ICON_DONE_IMAGE = new ImageIcon("src/recursos/iconos/done.png");
        JOptionPane.showMessageDialog(component, content, titulo, JOptionPane.WARNING_MESSAGE, ICON_DONE_IMAGE);
    }
}