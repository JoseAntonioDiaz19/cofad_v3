package views.dashboard;

import java.awt.GridBagConstraints;
import java.awt.Image;
import java.awt.Insets;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import views.dashboard.DashboardAdmin;
/**
 *
 * @author Jose Manuel Estrada Diaz
 */
public class DashboardSlider extends Thread
{
    private final DashboardAdmin mainView;
    
    private GridBagConstraints gridBagCont;
    private Icon menu;

    public DashboardSlider(DashboardAdmin mainView)
    {
        this.mainView = mainView;
    }
    
    @Override
    public void run()
    {
        try
        {
            if (mainView.pnlMenu.getWidth() > 150)
            {
                for (int i = 200; i >= 65; i-=15)
                {
                    gridBagLayout(i);
                    sleep(7);
                    mainView.pnlContenedor.revalidate();
                }
                
                menu = changeMenuIcon("/recursos/imagenes/Menu1.png");
                mainView.btnMenu.setIcon(menu);
            }
            else if (mainView.pnlMenu.getWidth() < 70)
            {
                for (int i = 65; i <= 200; i+=15)
                {
                    gridBagLayout(i);
                    sleep(7);
                    mainView.pnlContenedor.revalidate();
                }
                
                menu = changeMenuIcon("/recursos/imagenes/Menu2.png");
                mainView.btnMenu.setIcon(menu);
            }
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(mainView, "Transición Panel Suspendida"
                    + "\n" + "Error : " + ex);
        }
    }
    
    private void gridBagLayout(int ipadx)
    {
        gridBagCont = new GridBagConstraints();
        gridBagCont.gridx = 0;
        gridBagCont.gridy = 1;
        gridBagCont.fill = GridBagConstraints.VERTICAL;
        gridBagCont.ipadx = ipadx;
        gridBagCont.anchor = GridBagConstraints.WEST;
        gridBagCont.weighty = 1.0;
        gridBagCont.insets = new Insets(0, 0, 5, 0);
        mainView.getContentPane().add(mainView.pnlMenu, gridBagCont);
    }
    
    private Icon changeMenuIcon(String urlMenu)
    {
        ImageIcon imgMenu = new ImageIcon(getClass().getResource(urlMenu));
        Icon iconMenu = new ImageIcon(imgMenu.getImage().getScaledInstance(
                mainView.btnMenu.getWidth(),
                mainView.btnMenu.getHeight(),
                Image.SCALE_SMOOTH));
        
        return iconMenu;
    }
}
