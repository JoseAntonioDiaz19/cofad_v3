package controllers.login;

import views.login.Login;
import views.dashboard.DashboardAdmin;
import models.pojo.Personas;

import com.sun.awt.AWTUtilities;
import controllers.DashboardAdminController;
import java.awt.event.ActionEvent;
import java.awt.EventQueue;
import java.awt.Shape;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.geom.RoundRectangle2D;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JOptionPane;
import models.dao.PersonasDAO;
import models.dao.UserDAO;
import models.implementation.PersonasDaoImpl;
import models.implementation.UserDaoImpl;
import util.Conexion;


public class LoginController {
    
    Login plog;
    
    private int yMouse;
    private int xMouse;
    
    UserDAO Userdao;

    public LoginController(Login plog) {
        this.plog = plog;
        Userdao = new UserDaoImpl(Conexion.getConnection());
        init();
    }
    
    private void init()
    {
        plog.btnLogin.addActionListener(this::btnIniciarSesion);
        plog.btnCerrar.addActionListener(this::btnCerrar);
        plog.btnMinimizar.addActionListener(this::minimizarFrame);
        plog.setResizable(false);
        plog.setLocationRelativeTo(null);
        Shape forma = new RoundRectangle2D.Double(0, 0, plog.getBounds().width, plog.getBounds().height, 20, 20);
        AWTUtilities.setWindowShape(plog, forma);
        plog.txtUser.requestFocus();
        moveFrame();
        plog.setVisible(true);
    }
    
    private void moveFrame()
    {
        this.plog.pnlTitulo.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mousePressed(MouseEvent evt)
            {
                moveFrameMousePressed(evt);
            }
        });
        
        this.plog.pnlTitulo.addMouseMotionListener(new MouseMotionAdapter()
        {
            @Override
            public void mouseDragged(MouseEvent evt)
            {
                moveFrameMouseDragged(evt);
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
        if (plog.getExtendedState() != 6)
        {
            plog.setLocation(evt.getXOnScreen()- xMouse, evt.getYOnScreen()- yMouse);
        }
    }
    
    private void minimizarFrame(ActionEvent evt)
    {
        plog.setExtendedState(1);
    }
    
    public void btnCerrar(ActionEvent evt)
    {
        System.exit(0);
    }
    
    public void btnIniciarSesion(ActionEvent evt)
    {
        if(plog.txtUser.getText().isEmpty() || plog.txtPass.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(plog, "No puede haber campos vacíos", "Campos vacíos", JOptionPane.ERROR_MESSAGE);
        }
        else if(Userdao.buscarUsuario(plog.txtUser.getText(), plog.txtPass.getText()))
        {
            
            PersonasDAO personaDAO = new PersonasDaoImpl(Conexion.getConnection());
            Personas encontrado = personaDAO.obtenerDatosUsuario(plog.txtUser.getText());
            if(encontrado.getIdstatus_persona() == 1)
            {
                abrirPrincipal_GUI(encontrado);
                plog.dispose();
            }
            else
            {
                JOptionPane.showMessageDialog(plog, "El usuario no se encuentra activo", "Usuario suspendido", JOptionPane.ERROR_MESSAGE);
            }
            
        }
        else
        {
            JOptionPane.showMessageDialog(plog, "Verifique sus credenciales", "Credenciales erroneas", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    private void abrirPrincipal_GUI(Personas encontrado)
    {
        try
        {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex)
        {
            Logger.getLogger(DashboardAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                DashboardAdmin mainView = new DashboardAdmin();
                mainView.setVisible(true);
                DashboardAdminController ctrl = new DashboardAdminController(mainView, encontrado);
            }
        });
    }
}