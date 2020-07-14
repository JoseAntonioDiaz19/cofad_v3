package views.personal;

import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
/**
 *
 * @author Jose Manuel Estrada Diaz
 */
public class Personal extends javax.swing.JPanel
{
    public Personal()
    {
        initComponents();
        jScrollTablaPersonal.getViewport().setBackground(new Color(0, 78, 97));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        btnGroupSexo = new javax.swing.ButtonGroup();
        btnGroupPersonalExterno = new javax.swing.ButtonGroup();
        btnGroupEstadoPersona = new javax.swing.ButtonGroup();
        PopupMenu = new javax.swing.JPopupMenu();
        menuItemEditarDatosPersonales = new javax.swing.JMenuItem();
        menuItemEditarDatosLaborales = new javax.swing.JMenuItem();
        menuItemExperienciaLaboral = new javax.swing.JMenuItem();
        menuitemProductosAcademicos = new javax.swing.JMenuItem();
        menuItemExperienciaDocente = new javax.swing.JMenuItem();
        menuItemFormacionAcademica = new javax.swing.JMenuItem();
        menuItemResumenCursos = new javax.swing.JMenuItem();
        menuItemImprimirCurriculum = new javax.swing.JMenuItem();
        menuItemInactivar = new javax.swing.JMenuItem();
        menuItemActivar = new javax.swing.JMenuItem();
        menuItemActualizar = new javax.swing.JMenuItem();
        jPanel4 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        txtFiltrado = new javax.swing.JTextField();
        btnRegistrarPersonal = new javax.swing.JButton();
        jScrollTablaPersonal = new javax.swing.JScrollPane();
        tblPersonal = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        PopupMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        menuItemEditarDatosPersonales.setText("Editar datos personales");
        PopupMenu.add(menuItemEditarDatosPersonales);

        menuItemEditarDatosLaborales.setText("Activar");
        PopupMenu.add(menuItemEditarDatosLaborales);

        menuItemExperienciaLaboral.setText("Desactivar");
        menuItemExperienciaLaboral.setToolTipText("");
        PopupMenu.add(menuItemExperienciaLaboral);

        menuitemProductosAcademicos.setText("Resumen de datos");
        menuitemProductosAcademicos.setToolTipText("");
        PopupMenu.add(menuitemProductosAcademicos);

        menuItemExperienciaDocente.setText("jMenuItem1");
        PopupMenu.add(menuItemExperienciaDocente);

        menuItemFormacionAcademica.setText("jMenuItem1");
        PopupMenu.add(menuItemFormacionAcademica);

        menuItemResumenCursos.setText("jMenuItem1");
        PopupMenu.add(menuItemResumenCursos);

        menuItemImprimirCurriculum.setText("jMenuItem1");
        PopupMenu.add(menuItemImprimirCurriculum);

        menuItemInactivar.setText("jMenuItem1");
        PopupMenu.add(menuItemInactivar);

        menuItemActivar.setText("jMenuItem1");
        PopupMenu.add(menuItemActivar);

        menuItemActualizar.setText("jMenuItem1");
        PopupMenu.add(menuItemActualizar);

        PopupMenu.getAccessibleContext().setAccessibleParent(tblPersonal);

        setBackground(new java.awt.Color(0, 78, 97));
        setLayout(new java.awt.GridBagLayout());

        jPanel4.setBackground(new java.awt.Color(0, 78, 97));
        jPanel4.setLayout(new java.awt.GridBagLayout());

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Buscar personal :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        jPanel4.add(jLabel20, gridBagConstraints);

        txtFiltrado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 350;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        jPanel4.add(txtFiltrado, gridBagConstraints);

        btnRegistrarPersonal.setBackground(new java.awt.Color(0, 0, 100));
        btnRegistrarPersonal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnRegistrarPersonal.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarPersonal.setText("  Registrar nuevo personal");
        btnRegistrarPersonal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegistrarPersonal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnRegistrarPersonal.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        jPanel4.add(btnRegistrarPersonal, gridBagConstraints);
        String urlPersonal = "/recursos/imagenes/add new.png";
        ImageIcon imgPersonal = new ImageIcon(getClass().getResource(urlPersonal));
        Icon iconPersonal = new ImageIcon(imgPersonal.getImage().getScaledInstance(
            25, 25, Image.SCALE_SMOOTH));
    btnRegistrarPersonal.setIcon(iconPersonal);

    tblPersonal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    tblPersonal.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {

        },
        new String [] {
            "R.F.C.", "CURP", "APELLIDO PATERNO", "APELLIDO MATERNO", "NOMBRE", "PUESTO", "CARGO", "STATUS"
        }
    ) {
        boolean[] canEdit = new boolean [] {
            false, false, false, false, false, false, false, false
        };

        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit [columnIndex];
        }
    });
    tblPersonal.setComponentPopupMenu(PopupMenu);
    tblPersonal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    tblPersonal.setInheritsPopupMenu(true);
    jScrollTablaPersonal.setViewportView(tblPersonal);
    if (tblPersonal.getColumnModel().getColumnCount() > 0) {
        tblPersonal.getColumnModel().getColumn(7).setMinWidth(75);
        tblPersonal.getColumnModel().getColumn(7).setPreferredWidth(75);
        tblPersonal.getColumnModel().getColumn(7).setMaxWidth(100);
    }

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 1.0;
    gridBagConstraints.weighty = 1.0;
    gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
    jPanel4.add(jScrollTablaPersonal, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.gridwidth = 2;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 1.0;
    gridBagConstraints.weighty = 1.0;
    gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
    add(jPanel4, gridBagConstraints);

    jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(255, 255, 255));
    jLabel1.setText("PERSONAL");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 2;
    gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
    add(jLabel1, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPopupMenu PopupMenu;
    private javax.swing.ButtonGroup btnGroupEstadoPersona;
    private javax.swing.ButtonGroup btnGroupPersonalExterno;
    private javax.swing.ButtonGroup btnGroupSexo;
    public javax.swing.JButton btnRegistrarPersonal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JPanel jPanel4;
    public javax.swing.JScrollPane jScrollTablaPersonal;
    private javax.swing.JMenuItem menuItemActivar;
    private javax.swing.JMenuItem menuItemActualizar;
    public javax.swing.JMenuItem menuItemEditarDatosLaborales;
    public javax.swing.JMenuItem menuItemEditarDatosPersonales;
    private javax.swing.JMenuItem menuItemExperienciaDocente;
    public javax.swing.JMenuItem menuItemExperienciaLaboral;
    private javax.swing.JMenuItem menuItemFormacionAcademica;
    private javax.swing.JMenuItem menuItemImprimirCurriculum;
    private javax.swing.JMenuItem menuItemInactivar;
    private javax.swing.JMenuItem menuItemResumenCursos;
    public javax.swing.JMenuItem menuitemProductosAcademicos;
    public javax.swing.JTable tblPersonal;
    public javax.swing.JTextField txtFiltrado;
    // End of variables declaration//GEN-END:variables
}
