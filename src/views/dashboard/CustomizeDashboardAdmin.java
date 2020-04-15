package views.dashboard;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Jose Manuel Estrada Diaz
 */
public class CustomizeDashboardAdmin
{
    private final DashboardAdmin pnl;
    
    public CustomizeDashboardAdmin(DashboardAdmin pnl)
    {
        this.pnl = pnl;
        
        initialize();
    }
    
    private void initialize()
    {
        pnl.getContentPane().setBackground(new Color(0, 10, 20));
        pnl.btnRestaurar.setVisible(false);
        
        addIconsBarTitle();
        addIconsMenuSlider();
        customizeCursorJButton();
        removeJButtonArea();
    }
    
    private void addIconsBarTitle()
    {
        String urlMenu = "/recursos/imagenes/Menu1.png";
        String urlMinimizar = "/recursos/imagenes/Minimize.png";
        String urlMaximizar = "/recursos/imagenes/Maximize.png";
        String urlRestaurar = "/recursos/imagenes/Restore.png";
        String urlCerrar = "/recursos/imagenes/Close.png";
        
        ImageIcon imgMenu = new ImageIcon(getClass().getResource(urlMenu));
        ImageIcon imgMinimizar = new ImageIcon(getClass().getResource(urlMinimizar));
        ImageIcon imgMaximzar = new ImageIcon(getClass().getResource(urlMaximizar));
        ImageIcon imgRestaurar = new ImageIcon(getClass().getResource(urlRestaurar));
        ImageIcon imgCerrar = new ImageIcon(getClass().getResource(urlCerrar));
        
        Icon iconMenu = new ImageIcon(imgMenu.getImage().getScaledInstance(
                pnl.btnMenu.getWidth(), pnl.btnMenu.getHeight(), Image.SCALE_SMOOTH));
        Icon iconMinimizar = new ImageIcon(imgMinimizar.getImage().getScaledInstance(
                pnl.btnMinimizar.getWidth(), pnl.btnMinimizar.getHeight(),
                Image.SCALE_SMOOTH));
        Icon iconMaximizar = new ImageIcon(imgMaximzar.getImage().getScaledInstance(
                pnl.btnMaximizar.getWidth(), pnl.btnMaximizar.getHeight(),
                Image.SCALE_SMOOTH));
        Icon iconRestaurar = new ImageIcon(imgRestaurar.getImage().getScaledInstance(
                pnl.btnRestaurar.getWidth(), pnl.btnRestaurar.getHeight(),
                Image.SCALE_SMOOTH));
        Icon iconCerrar = new ImageIcon(imgCerrar.getImage().getScaledInstance(
                pnl.btnCerrar.getWidth(), pnl.btnCerrar.getHeight(),
                Image.SCALE_SMOOTH));
        
        pnl.btnMenu.setIcon(iconMenu);
        pnl.btnMinimizar.setIcon(iconMinimizar);
        pnl.btnMaximizar.setIcon(iconMaximizar);
        pnl.btnRestaurar.setIcon(iconRestaurar);
        pnl.btnCerrar.setIcon(iconCerrar);
    }
    
    private void addIconsMenuSlider()
    {
        String urlPerfil = "/recursos/imagenes/Perfil.png";
        String urlPersonal = "/recursos/imagenes/personal.png";
        String urlListaCursos = "/recursos/imagenes/listaCursos.png";
        String urlFacilitadores = "/recursos/imagenes/facilitadores.png";
        String urlParticipantes = "/recursos/imagenes/participantes.png";
        String urlUsuarios = "/recursos/imagenes/users.png";
        String urlReportes = "/recursos/imagenes/reportes.png";
        String urlCursos = "/recursos/imagenes/cursos.png";
        String urlOtros = "/recursos/imagenes/otros.png";
        
        String urlMisCursos = "/recursos/imagenes/misCursos.png";
        String urlCursosImpartidos = "/recursos/imagenes/cursosImpartidos.png";
        String urlSeguimientoJefes = "/recursos/imagenes/seguimientoJefes.png";
        String urlPendientes = "/recursos/imagenes/pendientes.png";
        
        ImageIcon imgPerfil = new ImageIcon(getClass().getResource(urlPerfil));
        ImageIcon imgPersonal = new ImageIcon(getClass().getResource(urlPersonal));
        ImageIcon imgListaCursos = new ImageIcon(getClass().getResource(urlListaCursos));
        ImageIcon imgFacilitadores = new ImageIcon(getClass().getResource(urlFacilitadores));
        ImageIcon imgParticipantes = new ImageIcon(getClass().getResource(urlParticipantes));
        ImageIcon imgUsuarios = new ImageIcon(getClass().getResource(urlUsuarios));
        ImageIcon imgReportes = new ImageIcon(getClass().getResource(urlReportes));
        ImageIcon imgCursos = new ImageIcon(getClass().getResource(urlCursos));
        ImageIcon imgOtros = new ImageIcon(getClass().getResource(urlOtros));
        
        ImageIcon imgMisCursos = new ImageIcon(getClass().getResource(urlMisCursos));
        ImageIcon imgCursosImpartidos = new ImageIcon(getClass().getResource(urlCursosImpartidos));
        ImageIcon imgSeguimientoJefes = new ImageIcon(getClass().getResource(urlSeguimientoJefes));
        ImageIcon imgPendientes = new ImageIcon(getClass().getResource(urlPendientes));
        
        Icon iconPerfil = new ImageIcon(imgPerfil.getImage().getScaledInstance(
                40, 40, Image.SCALE_SMOOTH));
        Icon iconPersonal = new ImageIcon(imgPersonal.getImage().getScaledInstance(
                40, 40, Image.SCALE_SMOOTH));
        Icon iconListaCursos = new ImageIcon(imgListaCursos.getImage().getScaledInstance(
                40, 40, Image.SCALE_SMOOTH));
        Icon iconFacilitadores = new ImageIcon(imgFacilitadores.getImage().getScaledInstance(
                40, 40, Image.SCALE_SMOOTH));
        Icon iconParticipantes = new ImageIcon(imgParticipantes.getImage().getScaledInstance(
                40, 40, Image.SCALE_SMOOTH));
        Icon iconUsuarios = new ImageIcon(imgUsuarios.getImage().getScaledInstance(
                40, 40, Image.SCALE_SMOOTH));
        Icon iconReportes = new ImageIcon(imgReportes.getImage().getScaledInstance(
                40, 40, Image.SCALE_SMOOTH));
        Icon iconCursos = new ImageIcon(imgCursos.getImage().getScaledInstance(
                40, 40, Image.SCALE_SMOOTH));
        Icon iconOtros = new ImageIcon(imgOtros.getImage().getScaledInstance(
                40, 40, Image.SCALE_SMOOTH));
        
        Icon iconMisCursos = new ImageIcon(imgMisCursos.getImage().getScaledInstance(
                40, 40, Image.SCALE_SMOOTH));
        Icon iconCursosImpartidos = new ImageIcon(imgCursosImpartidos.getImage().getScaledInstance(
                40, 40, Image.SCALE_SMOOTH));
        Icon iconSeguimientoJefes = new ImageIcon(imgSeguimientoJefes.getImage().getScaledInstance(
                40, 40, Image.SCALE_SMOOTH));
        Icon iconPendientes = new ImageIcon(imgPendientes.getImage().getScaledInstance(
                45, 45, Image.SCALE_SMOOTH));
        
        pnl.btnPerfil.setIcon(iconPerfil);
        pnl.btnPersonal.setIcon(iconPersonal);
        pnl.btnListaCursos.setIcon(iconListaCursos);
        pnl.btnFacilitadores.setIcon(iconFacilitadores);
        pnl.btnParticipantes.setIcon(iconParticipantes);
        pnl.btnUsuarios.setIcon(iconUsuarios);
        pnl.btnReportes.setIcon(iconReportes);
        pnl.btnCursos.setIcon(iconCursos);
        pnl.btnOtros.setIcon(iconOtros);
        
        pnl.btnMisCursos.setIcon(iconMisCursos);
        pnl.btnCursosImpartidos.setIcon(iconCursosImpartidos);
        pnl.btnSeguimientoJefes.setIcon(iconSeguimientoJefes);
        pnl.btnPendientes.setIcon(iconPendientes);
    }
    
    private void customizeCursorJButton()
    {
        pnl.btnMenu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        pnl.btnMinimizar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        pnl.btnMaximizar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        pnl.btnRestaurar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        pnl.btnCerrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
        pnl.btnPerfil.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        pnl.btnPersonal.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        pnl.btnListaCursos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        pnl.btnFacilitadores.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        pnl.btnParticipantes.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        pnl.btnUsuarios.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        pnl.btnReportes.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        pnl.btnCursos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        pnl.btnOtros.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
        pnl.btnMisCursos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        pnl.btnCursosImpartidos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        pnl.btnSeguimientoJefes.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        pnl.btnPendientes.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }

    private void removeJButtonArea()
    {
        pnl.btnMenu.setContentAreaFilled(false);
        pnl.btnMinimizar.setContentAreaFilled(false);
        pnl.btnMaximizar.setContentAreaFilled(false);
        pnl.btnRestaurar.setContentAreaFilled(false);
        pnl.btnCerrar.setContentAreaFilled(false);
        
        pnl.btnPerfil.setContentAreaFilled(false);
        pnl.btnPersonal.setContentAreaFilled(false);
        pnl.btnListaCursos.setContentAreaFilled(false);
        pnl.btnFacilitadores.setContentAreaFilled(false);
        pnl.btnParticipantes.setContentAreaFilled(false);
        pnl.btnUsuarios.setContentAreaFilled(false);
        pnl.btnReportes.setContentAreaFilled(false);
        pnl.btnCursos.setContentAreaFilled(false);
        pnl.btnOtros.setContentAreaFilled(false);
        
        pnl.btnMisCursos.setContentAreaFilled(false);
        pnl.btnCursosImpartidos.setContentAreaFilled(false);
        pnl.btnSeguimientoJefes.setContentAreaFilled(false);
        pnl.btnPendientes.setContentAreaFilled(false);
        
        pnl.btnMenu.setOpaque(true);
        pnl.btnMinimizar.setOpaque(true);
        pnl.btnMaximizar.setOpaque(true);
        pnl.btnRestaurar.setOpaque(true);
        pnl.btnCerrar.setOpaque(true);
        
        pnl.btnPerfil.setOpaque(true);
        pnl.btnPersonal.setOpaque(true);
        pnl.btnListaCursos.setOpaque(true);
        pnl.btnFacilitadores.setOpaque(true);
        pnl.btnParticipantes.setOpaque(true);
        pnl.btnUsuarios.setOpaque(true);
        pnl.btnReportes.setOpaque(true);
        pnl.btnCursos.setOpaque(true);
        pnl.btnOtros.setOpaque(true);
        
        pnl.btnMisCursos.setOpaque(true);
        pnl.btnCursosImpartidos.setOpaque(true);
        pnl.btnSeguimientoJefes.setOpaque(true);
        pnl.btnPendientes.setOpaque(true);
    }
}
