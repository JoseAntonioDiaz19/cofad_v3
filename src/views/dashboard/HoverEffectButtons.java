package views.dashboard;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Jose Manuel Estrada Diaz
 */
public class HoverEffectButtons
{
    private final DashboardAdmin mainView;
    
    public HoverEffectButtons(DashboardAdmin mainView)
    {
        this.mainView = mainView;
        
        changeMenuIcon();
        titleBarButtons();
        MenuButtons();
    }
    
    private void changeMenuIcon()
    {
        this.mainView.btnMenu.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent evt)
            {
                if (mainView.pnlMenu.getWidth() >= 200)
                {
                    Icon menu = changeMenuIcon("/recursos/imagenes/Menu1.png");
                    mainView.btnMenu.setIcon(menu);
                }
                else if (mainView.pnlMenu.getWidth() >= 60)
                {
                    Icon menu = changeMenuIcon("/recursos/imagenes/Menu2.png");
                    mainView.btnMenu.setIcon(menu);
                }
            }
            
            @Override
            public void mouseExited(MouseEvent evt)
            {
                if (mainView.pnlMenu.getWidth() >= 200)
                {
                    Icon menu = changeMenuIcon("/recursos/imagenes/Menu2.png");
                    mainView.btnMenu.setIcon(menu);
                }
                else if (mainView.pnlMenu.getWidth() >= 60)
                {
                    Icon menu = changeMenuIcon("/recursos/imagenes/Menu1.png");
                    mainView.btnMenu.setIcon(menu);
                }
            }
        });
    }
    
    private void titleBarButtons()
    {
        this.mainView.btnMinimizar.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent evt)
            {
                buttonMouseEntered(mainView.btnMinimizar, 0, 255, 0);
            }
            
            @Override
            public void mouseExited(MouseEvent evt)
            {
                buttonMouseExited(mainView.btnMinimizar, 0, 10, 20);
            }
        });
        
        this.mainView.btnMaximizar.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent evt)
            {
                buttonMouseEntered(mainView.btnMaximizar, 255, 255, 0);
            }
            
            @Override
            public void mouseExited(MouseEvent evt)
            {
                buttonMouseExited(mainView.btnMaximizar, 0, 10, 20);
            }
        });
        
        this.mainView.btnRestaurar.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent evt)
            {
                buttonMouseEntered(mainView.btnRestaurar, 0, 0, 255);
            }
            
            @Override
            public void mouseExited(MouseEvent evt)
            {
                buttonMouseExited(mainView.btnRestaurar, 0, 10, 20);
            }
        });
        
        this.mainView.btnCerrar.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent evt)
            {
                buttonMouseEntered(mainView.btnCerrar, 255, 0, 0);
            }
            
            @Override
            public void mouseExited(MouseEvent evt)
            {
                buttonMouseExited(mainView.btnCerrar, 0, 10, 20);
            }
        });
    }
    
    private void MenuButtons()
    {
        this.mainView.btnPerfil.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent evt)
            {
                buttonMouseEntered(mainView.btnPerfil, 255, 0, 0);
            }
            
            @Override
            public void mouseExited(MouseEvent evt)
            {
                buttonMouseExited(mainView.btnPerfil, 0, 10, 20);
            }
        });
        
        this.mainView.btnPersonal.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent evt)
            {
                buttonMouseEntered(mainView.btnPersonal, 255, 0, 0);
            }
            
            @Override
            public void mouseExited(MouseEvent evt)
            {
                buttonMouseExited(mainView.btnPersonal, 0, 10, 20);
            }
        });
        
        this.mainView.btnListaCursos.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent evt)
            {
                buttonMouseEntered(mainView.btnListaCursos, 255, 0, 0);
            }
            
            @Override
            public void mouseExited(MouseEvent evt)
            {
                buttonMouseExited(mainView.btnListaCursos, 0, 10, 20);
            }
        });
        
        this.mainView.btnFacilitadores.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent evt)
            {
                buttonMouseEntered(mainView.btnFacilitadores, 255, 0, 0);
            }
            
            @Override
            public void mouseExited(MouseEvent evt)
            {
                buttonMouseExited(mainView.btnFacilitadores, 0, 10, 20);
            }
        });
        
        this.mainView.btnParticipantes.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent evt)
            {
                buttonMouseEntered(mainView.btnParticipantes, 255, 0, 0);
            }
            
            @Override
            public void mouseExited(MouseEvent evt)
            {
                buttonMouseExited(mainView.btnParticipantes, 0, 10, 20);
            }
        });
        
        this.mainView.btnUsuarios.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent evt)
            {
                buttonMouseEntered(mainView.btnUsuarios, 255, 0, 0);
            }
            
            @Override
            public void mouseExited(MouseEvent evt)
            {
                buttonMouseExited(mainView.btnUsuarios, 0, 10, 20);
            }
        });
        
        this.mainView.btnReportes.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent evt)
            {
                buttonMouseEntered(mainView.btnReportes, 255, 0, 0);
            }
            
            @Override
            public void mouseExited(MouseEvent evt)
            {
                buttonMouseExited(mainView.btnReportes, 0, 10, 20);
            }
        });
        
        this.mainView.btnCursos.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent evt)
            {
                buttonMouseEntered(mainView.btnCursos, 255, 0, 0);
            }
            
            @Override
            public void mouseExited(MouseEvent evt)
            {
                buttonMouseExited(mainView.btnCursos, 0, 10, 20);
            }
        });
        
        this.mainView.btnOtros.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent evt)
            {
                buttonMouseEntered(mainView.btnOtros, 255, 0, 0);
            }
            
            @Override
            public void mouseExited(MouseEvent evt)
            {
                buttonMouseExited(mainView.btnOtros, 0, 10, 20);
            }
        });
        
        this.mainView.btnMisCursos.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent evt)
            {
                buttonMouseEntered(mainView.btnMisCursos, 255, 0, 0);
            }
            
            @Override
            public void mouseExited(MouseEvent evt)
            {
                buttonMouseExited(mainView.btnMisCursos, 0, 10, 20);
            }
        });
        
        this.mainView.btnCursosImpartidos.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent evt)
            {
                buttonMouseEntered(mainView.btnCursosImpartidos, 255, 0, 0);
            }
            
            @Override
            public void mouseExited(MouseEvent evt)
            {
                buttonMouseExited(mainView.btnCursosImpartidos, 0, 10, 20);
            }
        });
        
        this.mainView.btnSeguimientoJefes.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent evt)
            {
                buttonMouseEntered(mainView.btnSeguimientoJefes, 255, 0, 0);
            }
            
            @Override
            public void mouseExited(MouseEvent evt)
            {
                buttonMouseExited(mainView.btnSeguimientoJefes, 0, 10, 20);
            }
        });
        
        this.mainView.btnPendientes.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent evt)
            {
                buttonMouseEntered(mainView.btnPendientes, 255, 0, 0);
            }
            
            @Override
            public void mouseExited(MouseEvent evt)
            {
                buttonMouseExited(mainView.btnPendientes, 0, 10, 20);
            }
        });
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
    
    private void buttonMouseEntered(JButton button, int r, int g, int b)
    {
        if (button.isEnabled())
        {
            button.setBackground(new Color(r, g, b));
        }
        
        new ToolTipText(mainView);
    }

    private void buttonMouseExited(JButton button, int r, int g, int b)
    {
        button.setBackground(new Color(r, g, b));
    }
}
