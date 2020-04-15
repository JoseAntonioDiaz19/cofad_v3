package views.dashboard;

import java.awt.Dimension;

/**
 * https://github.com/insomjos09/cofad.git
 * 
 * @author Jose Manuel Estrada Diaz
 */
public class DashboardAdmin extends javax.swing.JFrame
{   
    public DashboardAdmin()
    {
        setUndecorated(true);
        initComponents();
        setSize(new Dimension(1000, 550));
        setLocationRelativeTo(this);
        
        new CustomizeDashboardAdmin(this);
        new HoverEffectButtons(this);
        
//        btnMisCursos.setVisible(false);
//        btnCursosImpartidos.setVisible(false);
//        btnSeguimientoJefes.setVisible(false);
//        btnPendientes.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        pnlMenu = new javax.swing.JPanel();
        btnListaCursos = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();
        btnPersonal = new javax.swing.JButton();
        btnPerfil = new javax.swing.JButton();
        btnUsuarios = new javax.swing.JButton();
        btnFacilitadores = new javax.swing.JButton();
        btnCursos = new javax.swing.JButton();
        btnOtros = new javax.swing.JButton();
        btnParticipantes = new javax.swing.JButton();
        btnMisCursos = new javax.swing.JButton();
        btnCursosImpartidos = new javax.swing.JButton();
        btnSeguimientoJefes = new javax.swing.JButton();
        btnPendientes = new javax.swing.JButton();
        pnlBarraTitulo = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JButton();
        btnRestaurar = new javax.swing.JButton();
        btnMinimizar = new javax.swing.JButton();
        btnMaximizar = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pnlContenedor = new javax.swing.JPanel();

        jMenuItem1.setText("jMenuItem1");

        jMenu1.setText("jMenu1");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        pnlMenu.setBackground(new java.awt.Color(0, 10, 20));
        pnlMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlMenu.setLayout(null);

        btnListaCursos.setBackground(new java.awt.Color(0, 10, 20));
        btnListaCursos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnListaCursos.setForeground(new java.awt.Color(255, 255, 255));
        btnListaCursos.setText("    Lista de Cursos");
        btnListaCursos.setBorderPainted(false);
        btnListaCursos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnListaCursos.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnListaCursos.setPreferredSize(new java.awt.Dimension(50, 23));
        pnlMenu.add(btnListaCursos);
        btnListaCursos.setBounds(0, 120, 200, 50);

        btnReportes.setBackground(new java.awt.Color(0, 10, 20));
        btnReportes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnReportes.setForeground(new java.awt.Color(255, 255, 255));
        btnReportes.setText("    Reportes");
        btnReportes.setBorderPainted(false);
        btnReportes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnReportes.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnReportes.setPreferredSize(new java.awt.Dimension(50, 23));
        pnlMenu.add(btnReportes);
        btnReportes.setBounds(0, 320, 200, 50);

        btnPersonal.setBackground(new java.awt.Color(0, 10, 20));
        btnPersonal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPersonal.setForeground(new java.awt.Color(255, 255, 255));
        btnPersonal.setText("    Personal");
        btnPersonal.setBorderPainted(false);
        btnPersonal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnPersonal.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnPersonal.setMaximumSize(new java.awt.Dimension(197, 23));
        btnPersonal.setMinimumSize(new java.awt.Dimension(197, 23));
        btnPersonal.setPreferredSize(new java.awt.Dimension(50, 23));
        pnlMenu.add(btnPersonal);
        btnPersonal.setBounds(0, 70, 200, 50);

        btnPerfil.setBackground(new java.awt.Color(0, 10, 20));
        btnPerfil.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPerfil.setForeground(new java.awt.Color(255, 255, 255));
        btnPerfil.setText("    Perfil");
        btnPerfil.setBorderPainted(false);
        btnPerfil.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnPerfil.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnPerfil.setMaximumSize(new java.awt.Dimension(197, 23));
        btnPerfil.setMinimumSize(new java.awt.Dimension(197, 23));
        btnPerfil.setPreferredSize(new java.awt.Dimension(50, 23));
        pnlMenu.add(btnPerfil);
        btnPerfil.setBounds(0, 20, 200, 50);

        btnUsuarios.setBackground(new java.awt.Color(0, 10, 20));
        btnUsuarios.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        btnUsuarios.setText("    Usuarios");
        btnUsuarios.setBorderPainted(false);
        btnUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnUsuarios.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnUsuarios.setMaximumSize(new java.awt.Dimension(197, 23));
        btnUsuarios.setMinimumSize(new java.awt.Dimension(197, 23));
        btnUsuarios.setPreferredSize(new java.awt.Dimension(50, 23));
        pnlMenu.add(btnUsuarios);
        btnUsuarios.setBounds(0, 270, 200, 50);

        btnFacilitadores.setBackground(new java.awt.Color(0, 10, 20));
        btnFacilitadores.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnFacilitadores.setForeground(new java.awt.Color(255, 255, 255));
        btnFacilitadores.setText("    Facilitadores");
        btnFacilitadores.setBorderPainted(false);
        btnFacilitadores.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnFacilitadores.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnFacilitadores.setMaximumSize(new java.awt.Dimension(197, 23));
        btnFacilitadores.setMinimumSize(new java.awt.Dimension(197, 23));
        btnFacilitadores.setPreferredSize(new java.awt.Dimension(50, 23));
        pnlMenu.add(btnFacilitadores);
        btnFacilitadores.setBounds(0, 170, 200, 50);

        btnCursos.setBackground(new java.awt.Color(0, 10, 20));
        btnCursos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCursos.setForeground(new java.awt.Color(255, 255, 255));
        btnCursos.setText("    Cursos");
        btnCursos.setBorderPainted(false);
        btnCursos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCursos.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnCursos.setPreferredSize(new java.awt.Dimension(50, 23));
        pnlMenu.add(btnCursos);
        btnCursos.setBounds(0, 370, 200, 50);

        btnOtros.setBackground(new java.awt.Color(0, 10, 20));
        btnOtros.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnOtros.setForeground(new java.awt.Color(255, 255, 255));
        btnOtros.setText("    Otros");
        btnOtros.setBorderPainted(false);
        btnOtros.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnOtros.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnOtros.setPreferredSize(new java.awt.Dimension(50, 23));
        pnlMenu.add(btnOtros);
        btnOtros.setBounds(0, 420, 200, 50);

        btnParticipantes.setBackground(new java.awt.Color(0, 10, 20));
        btnParticipantes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnParticipantes.setForeground(new java.awt.Color(255, 255, 255));
        btnParticipantes.setText("    Participantes");
        btnParticipantes.setBorderPainted(false);
        btnParticipantes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnParticipantes.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnParticipantes.setMaximumSize(new java.awt.Dimension(197, 23));
        btnParticipantes.setMinimumSize(new java.awt.Dimension(197, 23));
        btnParticipantes.setPreferredSize(new java.awt.Dimension(50, 23));
        pnlMenu.add(btnParticipantes);
        btnParticipantes.setBounds(0, 220, 200, 50);

        btnMisCursos.setBackground(new java.awt.Color(0, 10, 20));
        btnMisCursos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnMisCursos.setForeground(new java.awt.Color(255, 255, 255));
        btnMisCursos.setText("    Mis Cursos");
        btnMisCursos.setBorderPainted(false);
        btnMisCursos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMisCursos.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnMisCursos.setPreferredSize(new java.awt.Dimension(50, 23));
        pnlMenu.add(btnMisCursos);
        btnMisCursos.setBounds(0, 470, 200, 50);

        btnCursosImpartidos.setBackground(new java.awt.Color(0, 10, 20));
        btnCursosImpartidos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCursosImpartidos.setForeground(new java.awt.Color(255, 255, 255));
        btnCursosImpartidos.setText("<html>.    Cursos Impartidos </html>");
        btnCursosImpartidos.setBorderPainted(false);
        btnCursosImpartidos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCursosImpartidos.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnCursosImpartidos.setPreferredSize(new java.awt.Dimension(50, 23));
        pnlMenu.add(btnCursosImpartidos);
        btnCursosImpartidos.setBounds(0, 520, 200, 50);

        btnSeguimientoJefes.setBackground(new java.awt.Color(0, 10, 20));
        btnSeguimientoJefes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSeguimientoJefes.setForeground(new java.awt.Color(255, 255, 255));
        btnSeguimientoJefes.setText("<html>" + "    " + "Seguimiento de Jefes </html>");
        btnSeguimientoJefes.setBorderPainted(false);
        btnSeguimientoJefes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSeguimientoJefes.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnSeguimientoJefes.setPreferredSize(new java.awt.Dimension(50, 23));
        pnlMenu.add(btnSeguimientoJefes);
        btnSeguimientoJefes.setBounds(0, 570, 200, 50);

        btnPendientes.setBackground(new java.awt.Color(0, 10, 20));
        btnPendientes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPendientes.setForeground(new java.awt.Color(255, 255, 255));
        btnPendientes.setText("    Pendientes");
        btnPendientes.setBorderPainted(false);
        btnPendientes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnPendientes.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnPendientes.setPreferredSize(new java.awt.Dimension(50, 23));
        pnlMenu.add(btnPendientes);
        btnPendientes.setBounds(0, 620, 200, 50);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.ipadx = 65;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        getContentPane().add(pnlMenu, gridBagConstraints);

        pnlBarraTitulo.setBackground(new java.awt.Color(0, 10, 20));
        pnlBarraTitulo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlBarraTitulo.setPreferredSize(new java.awt.Dimension(800, 60));
        pnlBarraTitulo.setLayout(new java.awt.GridBagLayout());

        btnCerrar.setBackground(new java.awt.Color(0, 10, 20));
        btnCerrar.setBorderPainted(false);
        btnCerrar.setPreferredSize(new java.awt.Dimension(30, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        pnlBarraTitulo.add(btnCerrar, gridBagConstraints);

        btnRestaurar.setBackground(new java.awt.Color(0, 10, 20));
        btnRestaurar.setBorderPainted(false);
        btnRestaurar.setPreferredSize(new java.awt.Dimension(30, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        pnlBarraTitulo.add(btnRestaurar, gridBagConstraints);

        btnMinimizar.setBackground(new java.awt.Color(0, 10, 20));
        btnMinimizar.setBorderPainted(false);
        btnMinimizar.setPreferredSize(new java.awt.Dimension(30, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        pnlBarraTitulo.add(btnMinimizar, gridBagConstraints);

        btnMaximizar.setBackground(new java.awt.Color(0, 10, 20));
        btnMaximizar.setBorderPainted(false);
        btnMaximizar.setPreferredSize(new java.awt.Dimension(30, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        pnlBarraTitulo.add(btnMaximizar, gridBagConstraints);

        btnMenu.setBackground(new java.awt.Color(0, 10, 20));
        btnMenu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 10, true));
        btnMenu.setBorderPainted(false);
        btnMenu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMenu.setPreferredSize(new java.awt.Dimension(40, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 15, 5, 0);
        pnlBarraTitulo.add(btnMenu, gridBagConstraints);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Control de Formación y Actualización Docente");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 30, 0, 0);
        pnlBarraTitulo.add(jLabel1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.7;
        pnlBarraTitulo.add(jLabel2, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.7;
        pnlBarraTitulo.add(jLabel3, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
        getContentPane().add(pnlBarraTitulo, gridBagConstraints);

        pnlContenedor.setBackground(new java.awt.Color(255, 255, 255));
        pnlContenedor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlContenedor.setPreferredSize(new java.awt.Dimension(235, 0));
        pnlContenedor.setLayout(new java.awt.GridLayout(1, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 5);
        getContentPane().add(pnlContenedor, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnCerrar;
    public javax.swing.JButton btnCursos;
    public javax.swing.JButton btnCursosImpartidos;
    public javax.swing.JButton btnFacilitadores;
    public javax.swing.JButton btnListaCursos;
    public javax.swing.JButton btnMaximizar;
    public javax.swing.JButton btnMenu;
    public javax.swing.JButton btnMinimizar;
    public javax.swing.JButton btnMisCursos;
    public javax.swing.JButton btnOtros;
    public javax.swing.JButton btnParticipantes;
    public javax.swing.JButton btnPendientes;
    public javax.swing.JButton btnPerfil;
    public javax.swing.JButton btnPersonal;
    public javax.swing.JButton btnReportes;
    public javax.swing.JButton btnRestaurar;
    public javax.swing.JButton btnSeguimientoJefes;
    public javax.swing.JButton btnUsuarios;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    public javax.swing.JPanel pnlBarraTitulo;
    public javax.swing.JPanel pnlContenedor;
    public javax.swing.JPanel pnlMenu;
    // End of variables declaration//GEN-END:variables
}
