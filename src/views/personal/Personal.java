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
        menuPersonal = new javax.swing.JPopupMenu();
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
        labelTitulo = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        txtFiltrado = new javax.swing.JTextField();
        jScrollTablaPersonal = new javax.swing.JScrollPane();
        tblPersonal = new javax.swing.JTable();
        btnRegistrarPersonal = new javax.swing.JButton();

        menuPersonal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        menuItemEditarDatosPersonales.setText("Editar datos personales");
        menuPersonal.add(menuItemEditarDatosPersonales);

        menuItemEditarDatosLaborales.setText("Editar datos laborales");
        menuPersonal.add(menuItemEditarDatosLaborales);

        menuItemExperienciaLaboral.setText("Experiencia laboral");
        menuItemExperienciaLaboral.setToolTipText("");
        menuPersonal.add(menuItemExperienciaLaboral);

        menuitemProductosAcademicos.setText("Productos académicos");
        menuitemProductosAcademicos.setToolTipText("");
        menuPersonal.add(menuitemProductosAcademicos);

        menuItemExperienciaDocente.setText("Experiencia docente");
        menuPersonal.add(menuItemExperienciaDocente);

        menuItemFormacionAcademica.setText("Formación académica");
        menuPersonal.add(menuItemFormacionAcademica);

        menuItemResumenCursos.setText("Resumen de cursos");
        menuPersonal.add(menuItemResumenCursos);

        menuItemImprimirCurriculum.setText("Imprimir curriculum");
        menuPersonal.add(menuItemImprimirCurriculum);

        menuItemInactivar.setText("Inactivar");
        menuPersonal.add(menuItemInactivar);

        menuItemActivar.setText("Activar");
        menuPersonal.add(menuItemActivar);

        menuItemActualizar.setText("Actualizar");
        menuPersonal.add(menuItemActualizar);

        menuPersonal.getAccessibleContext().setAccessibleParent(tblPersonal);

        setBackground(new java.awt.Color(0, 78, 97));
        setLayout(new java.awt.GridBagLayout());

        labelTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setText("Personal");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        add(labelTitulo, gridBagConstraints);

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
        tblPersonal.setComponentPopupMenu(menuPersonal);
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

        btnRegistrarPersonal.setText("Registrar");
        jPanel4.add(btnRegistrarPersonal, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        add(jPanel4, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGroupEstadoPersona;
    private javax.swing.ButtonGroup btnGroupPersonalExterno;
    private javax.swing.ButtonGroup btnGroupSexo;
    public javax.swing.JButton btnRegistrarPersonal;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JPanel jPanel4;
    public javax.swing.JScrollPane jScrollTablaPersonal;
    private javax.swing.JLabel labelTitulo;
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
    public javax.swing.JPopupMenu menuPersonal;
    public javax.swing.JMenuItem menuitemProductosAcademicos;
    public javax.swing.JTable tblPersonal;
    public javax.swing.JTextField txtFiltrado;
    // End of variables declaration//GEN-END:variables
}
