package views.dashboard;

/**
 *
 * @author Jose Manuel Estrada Diaz
 */
public class ToolTipText
{
    private final DashboardAdmin mainView;
    
    public ToolTipText(DashboardAdmin mainView)
    {
        this.mainView = mainView;
        
        initialize();
    }
    
    private void initialize()
    {
        if (mainView.pnlMenu.getWidth() < 200)
            toolTipTextMenu();
        else
            toolTipsDisable();
    }
    
    private void toolTipsDisable()
    {
        mainView.btnPerfil.setToolTipText(null);
        mainView.btnPersonal.setToolTipText(null);
        mainView.btnListaCursos.setToolTipText(null);
        mainView.btnFacilitadores.setToolTipText(null);
        mainView.btnParticipantes.setToolTipText(null);
        mainView.btnUsuarios.setToolTipText(null);
        mainView.btnReportes.setToolTipText(null);
        mainView.btnCursos.setToolTipText(null);
        mainView.btnOtros.setToolTipText(null);
        
        mainView.btnMisCursos.setToolTipText(null);
        mainView.btnCursosImpartidos.setToolTipText(null);
        mainView.btnSeguimientoJefes.setToolTipText(null);
        mainView.btnPendientes.setToolTipText(null);
    }
    
    private void toolTipTextMenu()
    {
        mainView.btnPerfil.setToolTipText(""
                + "<html>"
                +     "<head>"
                +         "<style>"
                +             "#contenido {"
                +                 "padding : 10px 50px;"
                +                 "background : #FF0000;"
                +                 "color : #FFFFFF;"
                +             "}"
                +         "</style>"
                +     "</head>"
                +     "<body>"
                +         "<div id = 'contenido'>"
                +             "<> PERFIL <>"
                +         "</div>"
                +     "</body>"
                + "</html>");
        
        mainView.btnPersonal.setToolTipText(""
                + "<html>"
                +     "<head>"
                +         "<style>"
                +             "#contenido {"
                +                 "padding : 10px 42px;"
                +                 "background : #FF0000;"
                +                 "color : #FFFFFF;"
                +             "}"
                +         "</style>"
                +     "</head>"
                +     "<body>"
                +         "<div id = 'contenido'>"
                +             "<> PERSONAL <>"
                +         "</div>"
                +     "</body>"
                + "</html>");
        
        mainView.btnListaCursos.setToolTipText(""
                + "<html>"
                +     "<head>"
                +         "<style>"
                +             "#contenido {"
                +                 "padding : 10px 26px;"
                +                 "background : #FF0000;"
                +                 "color : #FFFFFF;"
                +             "}"
                +         "</style>"
                +     "</head>"
                +     "<body>"
                +         "<div id = 'contenido'>"
                +             "<> LISTA DE CURSOS <>"
                +         "</div>"
                +     "</body>"
                + "</html>");
        
        mainView.btnFacilitadores.setToolTipText(""
                + "<html>"
                +     "<head>"
                +         "<style>"
                +             "#contenido {"
                +                 "padding : 10px 30px;"
                +                 "background : #FF0000;"
                +                 "color : #FFFFFF;"
                +             "}"
                +         "</style>"
                +     "</head>"
                +     "<body>"
                +         "<div id = 'contenido'>"
                +             "<> FACILITADORES <>"
                +         "</div>"
                +     "</body>"
                + "</html>");
        
        mainView.btnParticipantes.setToolTipText(""
                + "<html>"
                +     "<head>"
                +         "<style>"
                +             "#contenido {"
                +                 "padding : 10px 30px;"
                +                 "background : #FF0000;"
                +                 "color : #FFFFFF;"
                +             "}"
                +         "</style>"
                +     "</head>"
                +     "<body>"
                +         "<div id = 'contenido'>"
                +             "<> PARTICIPANTES <>"
                +         "</div>"
                +     "</body>"
                + "</html>");
        
        mainView.btnUsuarios.setToolTipText(""
                + "<html>"
                +     "<head>"
                +         "<style>"
                +             "#contenido {"
                +                 "padding : 10px 42px;"
                +                 "background : #FF0000;"
                +                 "color : #FFFFFF;"
                +             "}"
                +         "</style>"
                +     "</head>"
                +     "<body>"
                +         "<div id = 'contenido'>"
                +             "<> USUARIOS <>"
                +         "</div>"
                +     "</body>"
                + "</html>");
        
        mainView.btnReportes.setToolTipText(""
                + "<html>"
                +     "<head>"
                +         "<style>"
                +             "#contenido {"
                +                 "padding : 10px 40px;"
                +                 "background : #FF0000;"
                +                 "color : #FFFFFF;"
                +             "}"
                +         "</style>"
                +     "</head>"
                +     "<body>"
                +         "<div id = 'contenido'>"
                +             "<> REPORTES <>"
                +         "</div>"
                +     "</body>"
                + "</html>");
        
        mainView.btnCursos.setToolTipText(""
                + "<html>"
                +     "<head>"
                +         "<style>"
                +             "#contenido {"
                +                 "padding : 10px 46px;"
                +                 "background : #FF0000;"
                +                 "color : #FFFFFF;"
                +             "}"
                +         "</style>"
                +     "</head>"
                +     "<body>"
                +         "<div id = 'contenido'>"
                +             "<> CURSOS <>"
                +         "</div>"
                +     "</body>"
                + "</html>");
        
        mainView.btnOtros.setToolTipText(""
                + "<html>"
                +     "<head>"
                +         "<style>"
                +             "#contenido {"
                +                 "padding : 10px 50px;"
                +                 "background : #FF0000;"
                +                 "color : #FFFFFF;"
                +             "}"
                +         "</style>"
                +     "</head>"
                +     "<body>"
                +         "<div id = 'contenido'>"
                +             "<> OTROS <>"
                +         "</div>"
                +     "</body>"
                + "</html>");
        
        mainView.btnMisCursos.setToolTipText(""
                + "<html>"
                +     "<head>"
                +         "<style>"
                +             "#contenido {"
                +                 "padding : 10px 35px;"
                +                 "background : #FF0000;"
                +                 "color : #FFFFFF;"
                +             "}"
                +         "</style>"
                +     "</head>"
                +     "<body>"
                +         "<div id = 'contenido'>"
                +             "<> MIS CURSOS <>"
                +         "</div>"
                +     "</body>"
                + "</html>");
        
        mainView.btnCursosImpartidos.setToolTipText(""
                + "<html>"
                +     "<head>"
                +         "<style>"
                +             "#contenido {"
                +                 "padding : 10px 20px;"
                +                 "background : #FF0000;"
                +                 "color : #FFFFFF;"
                +             "}"
                +         "</style>"
                +     "</head>"
                +     "<body>"
                +         "<div id = 'contenido'>"
                +             "<> CURSOS IMPARTIDOS <>"
                +         "</div>"
                +     "</body>"
                + "</html>");
        
        mainView.btnSeguimientoJefes.setToolTipText(""
                + "<html>"
                +     "<head>"
                +         "<style>"
                +             "#contenido {"
                +                 "padding : 10px 10px;"
                +                 "background : #FF0000;"
                +                 "color : #FFFFFF;"
                +             "}"
                +         "</style>"
                +     "</head>"
                +     "<body>"
                +         "<div id = 'contenido'>"
                +             "<> SEGUIMIENTO DE JEFES <>"
                +         "</div>"
                +     "</body>"
                + "</html>");
        
        mainView.btnPendientes.setToolTipText(""
                + "<html>"
                +     "<head>"
                +         "<style>"
                +             "#contenido {"
                +                 "padding : 10px 35px;"
                +                 "background : #FF0000;"
                +                 "color : #FFFFFF;"
                +             "}"
                +         "</style>"
                +     "</head>"
                +     "<body>"
                +         "<div id = 'contenido'>"
                +             "<> PENDIENTES <>"
                +         "</div>"
                +     "</body>"
                + "</html>");
    }
}
