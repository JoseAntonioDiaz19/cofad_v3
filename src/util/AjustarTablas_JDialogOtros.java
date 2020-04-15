package util;

import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;
/**
 *
 * @author Jose Manuel Estrada Diaz
 */
public class AjustarTablas_JDialogOtros
{
    JTable jTable;
    JScrollPane jsPane;
    
    public AjustarTablas_JDialogOtros(JScrollPane jsPane, JTable jTable)
    {
        this.jTable = jTable;
        this.jsPane = jsPane;
        
        ajustarColumanas();;
    }
    
    private void ajustarColumanas()
    {
        jsPane.getViewport().setBackground(new Color(0, 78, 97));
        
        jTable.getColumnModel().getColumn(0).setMinWidth(50);
        jTable.getColumnModel().getColumn(0).setPreferredWidth(50);
        jTable.getColumnModel().getColumn(0).setMaxWidth(100);
    }
}
