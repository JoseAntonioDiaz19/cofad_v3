package controllers;

import controllers.catalogos.OtrosGeneralController;
import controllers.login.LoginController;
import controllers.perfil.PerfilController;
import controllers.personas.PersonasController;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

import views.dashboard.DashboardAdmin;
import views.dashboard.CambioPanel;
import views.dashboard.DashboardSlider;

import models.pojo.Personas;
import models.pojo.Usuarios;
import views.catalogos.Otros;
import views.login.Login;
import views.perfil.PerfilVista;
import views.personal.Personal;

public class DashboardAdminController
{
    private final DashboardAdmin mainView;
    private final Personas personaLogueada;
    
    private int xMouse;
    private int yMouse;
    private String click;
    private Usuarios modeloUsuario;

    public DashboardAdminController(DashboardAdmin mainView, Personas personaLogueada, Usuarios modeloUsuario)
    {
        this.mainView = mainView;
        this.personaLogueada = personaLogueada;
        this.modeloUsuario = modeloUsuario;
        init();
    }
    
    private void init()
    {
        mainView.btnMenu.addActionListener(this::slider);
        mainView.btnMinimizar.addActionListener(this::minimizeFrame);
        mainView.btnMaximizar.addActionListener(this::maximizeFrame);
        mainView.btnRestaurar.addActionListener(this::restoreFrame);
        mainView.btnCerrar.addActionListener(this::closeFrame);
        
        mainView.btnPerfil.addActionListener(this::Perfil);
        mainView.btnPersonal.addActionListener(this::Personal);
        mainView.btnOtros.addActionListener(this::Otros);
        /*mainView.btnListaCursos.addActionListener(this::ListaDeCursos);
        mainView.btnFacilitadores.addActionListener(this::Facilitadores);
        mainView.btnParticipantes.addActionListener(this::Participantes);
        mainView.btnUsuarios.addActionListener(this::Usuarios);
        mainView.btnReportes.addActionListener(this::Reportes);
        mainView.btnCursos.addActionListener(this::Cursos);
        
        
        mainView.btnMisCursos.addActionListener(this::MisCursos);
        mainView.btnCursosImpartidos.addActionListener(this::CursosImpartidos);
        mainView.btnSeguimientoJefes.addActionListener(this::SeguimientoDeJefes);
        mainView.btnPendientes.addActionListener(this::Pendientes);*/
        
        disableClick();
        resizeFrame();
        moveFrame();
        maximizeFrame();
        
        this.mainView.btnPerfil.doClick();
    }
    
    public void slider(ActionEvent evt)
    {
        new DashboardSlider(mainView).start();
    }
    
    public void minimizeFrame(ActionEvent evt)
    {
        mainView.setExtendedState(1);
    }
    
    public void maximizeFrame(ActionEvent evt)
    {
        mainView.btnMaximizar.setVisible(false);
        mainView.btnRestaurar.setVisible(true);
        mainView.setExtendedState(6);
    }
    
    public void restoreFrame(ActionEvent evt)
    {
        mainView.btnRestaurar.setVisible(false);
        mainView.btnMaximizar.setVisible(true);
        mainView.setSize(new Dimension(950, 550));
        mainView.setLocationRelativeTo(null);
    }
    
    public void closeFrame(ActionEvent evt)
    {
        if (JOptionPane.showConfirmDialog(mainView, "¿ Desea Cerrar Sesión ?",
                "ESTA APUNTO DE CERRAR SESIÓN", JOptionPane.YES_NO_OPTION, 2) == 0)
        {
            Login plog = new Login();
        
            LoginController ctrl = new LoginController(plog);
            mainView.dispose();
        }
    }
    
    public void Perfil(ActionEvent evt){
        enableButton();
        mainView.btnPerfil.setEnabled(false);
        
        PerfilVista vistaPerfil = new PerfilVista();
        PerfilController ctrl = new PerfilController(personaLogueada, vistaPerfil, mainView, modeloUsuario);
         
        if (mainView.pnlMenu.getWidth() >= 200)
            new DashboardSlider(mainView).start();
        
        new CambioPanel(mainView.pnlContenedor, vistaPerfil);
    }
    
    public void Personal(ActionEvent evt)
    {
        enableButton();
        mainView.btnPersonal.setEnabled(false);
        
        Personal vista = new Personal();
        PersonasController ctrl = new PersonasController(vista);
        
        if (mainView.pnlMenu.getWidth() >= 200)
            new DashboardSlider(mainView).start();
        
        new CambioPanel(mainView.pnlContenedor, vista);
    }
    
    public void Otros(ActionEvent evt)
    {
        enableButton();
        mainView.btnOtros.setEnabled(false);
        
        Otros vistaCatalogos = new Otros();
        OtrosGeneralController ctrl = new OtrosGeneralController(vistaCatalogos);
        
        if (mainView.pnlMenu.getWidth() >= 200)
            new DashboardSlider(mainView).start();
        
        new CambioPanel(mainView.pnlContenedor, vistaCatalogos);
    }
    
    private void disableClick()
    {
        this.mainView.pnlMenu.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mousePressed(MouseEvent evt)
            {   }
        });
        
        this.mainView.pnlContenedor.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mousePressed(MouseEvent evt)
            {   }
        });
    }
    private void moveFrame()
    {
        this.mainView.pnlBarraTitulo.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mousePressed(MouseEvent evt)
            {
                moveFrameMousePressed(evt);
            }
        });
        
        this.mainView.pnlBarraTitulo.addMouseMotionListener(new MouseMotionAdapter()
        {
            @Override
            public void mouseDragged(MouseEvent evt)
            {
                moveFrameMouseDragged(evt);
            }
        });
    }
    
    private void resizeFrame()
    {
        this.mainView.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mousePressed(MouseEvent evt)
            {
                resizeFrameMousePressed(evt);
            }
        });
        
        this.mainView.addMouseMotionListener(new MouseMotionAdapter()
        {
            @Override
            public void mouseDragged(MouseEvent evt)
            {
                resizeFrameMouseDragged(evt);
            }
        });
    }
    
    private void maximizeFrame()
    {
        this.mainView.pnlBarraTitulo.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent evt)
            {
                maximizeFrameMouseClicked(evt);
            }
        });
    }
    
    private void moveFrameMousePressed(MouseEvent evt)
    {
        xMouse = evt.getX();
        yMouse = evt.getY();
    }
    
    private void moveFrameMouseDragged(MouseEvent evt)
    {
        if (mainView.getExtendedState() != 6)
        {
            mainView.setLocation(evt.getXOnScreen()- xMouse, evt.getYOnScreen()- yMouse);
        }
    }
    
    private void resizeFrameMousePressed(MouseEvent evt)
    {
        xMouse = evt.getX();
        yMouse = evt.getY();
        click = "";
        
        if (xMouse > (mainView.getWidth() - 7))
        {
            click = "derecha";
        }
        else if (yMouse > (mainView.getHeight() - 7))
        {
            click = "inferior";
        }
    }
    
    private void resizeFrameMouseDragged(MouseEvent evt)
    {
        if (mainView.getExtendedState() != 6)
        {
            xMouse = evt.getX();
            yMouse = evt.getY();
            
            if (xMouse > (mainView.getWidth() - 7)  &&
                    yMouse < (mainView.getHeight() - 20) &&
                    click.equals("derecha"))
            {
                mainView.setSize(xMouse, mainView.getHeight());
            }
            else if (yMouse > (mainView.getHeight() - 7) &&
                    xMouse < (mainView.getWidth() - 20))
            {
                mainView.setSize(mainView.getWidth(), yMouse);
            }
            else if (yMouse < (mainView.getHeight() - 7) &&
                    xMouse < (mainView.getWidth() - 20) &&
                    click.equals("inferior"))
            {
                mainView.setSize(mainView.getWidth(), yMouse);
            }
            else if (xMouse < (mainView.getWidth() - 7) &&
                    yMouse < (mainView.getHeight() - 20))
            {
                mainView.setSize(xMouse, mainView.getHeight());
            }
        }
    }
    
    private void maximizeFrameMouseClicked(MouseEvent evt)
    {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension size = tk.getScreenSize();
        
        if (evt.getClickCount() == 2 && mainView.getExtendedState() == 6)
        {
            mainView.btnRestaurar.setVisible(false);
            mainView.btnMaximizar.setVisible(true);
            
            mainView.setSize(new Dimension(950, 550));
            mainView.setLocationRelativeTo(null);
        }
        else if (evt.getClickCount() == 2 && mainView.getExtendedState() != 6)
        {
            mainView.btnMaximizar.setVisible(false);
            mainView.btnRestaurar.setVisible(true);
            
            mainView.setExtendedState(6);
        }
//                (mainView.getWidth() < size.getWidth() ||
//                mainView.getHeight() < size.getHeight())
    }
    
    private void enableButton()
    {
        mainView.btnPerfil.setEnabled(true);
        mainView.btnPersonal.setEnabled(true);
        mainView.btnListaCursos.setEnabled(true);
        mainView.btnFacilitadores.setEnabled(true);
        mainView.btnParticipantes.setEnabled(true);
        mainView.btnUsuarios.setEnabled(true);
        mainView.btnReportes.setEnabled(true);
        mainView.btnCursos.setEnabled(true);
        mainView.btnOtros.setEnabled(true);
        mainView.btnMisCursos.setEnabled(true);
        mainView.btnCursosImpartidos.setEnabled(true);
        mainView.btnSeguimientoJefes.setEnabled(true);
        mainView.btnPendientes.setEnabled(true);
    }
}