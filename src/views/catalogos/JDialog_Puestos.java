package views.catalogos;

import java.awt.Color;
import util.AjustarTablas_JDialogOtros;
/**
 *
 * @author Jose Manuel Estrada Diaz
 */
public class JDialog_Puestos extends javax.swing.JDialog
{
    public JDialog_Puestos(java.awt.Frame parent, boolean modal)
    {
        super(parent, modal);
        initComponents();
        this.setSize(730, 500);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(0, 78, 97));
        
        new AjustarTablas_JDialogOtros(jScrollTablaDepartamentos, tblPuestos);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        pnlPrincipal = new javax.swing.JPanel();
        lblDepartamento = new javax.swing.JLabel();
        labelId = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        jScrollTablaDepartamentos = new javax.swing.JScrollPane();
        tblPuestos = new javax.swing.JTable();
        labelTitulo = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        txtPuesto = new javax.swing.JTextField();
        txtExtension = new javax.swing.JTextField();
        lblSubdireccion = new javax.swing.JLabel();
        lblExtension = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cmbTipoPuesto = new javax.swing.JComboBox<>();
        cmbSubdireccion = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        pnlPrincipal.setBackground(new java.awt.Color(0, 78, 97));
        pnlPrincipal.setMinimumSize(new java.awt.Dimension(480, 600));
        pnlPrincipal.setPreferredSize(new java.awt.Dimension(480, 600));
        pnlPrincipal.setLayout(new java.awt.GridBagLayout());

        lblDepartamento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDepartamento.setForeground(new java.awt.Color(255, 255, 255));
        lblDepartamento.setText("Nombre del puesto :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        pnlPrincipal.add(lblDepartamento, gridBagConstraints);

        labelId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelId.setForeground(new java.awt.Color(255, 255, 255));
        labelId.setText("Id :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        pnlPrincipal.add(labelId, gridBagConstraints);

        txtId.setEditable(false);
        txtId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtId.setMaximumSize(new java.awt.Dimension(60, 30));
        txtId.setMinimumSize(new java.awt.Dimension(60, 30));
        txtId.setPreferredSize(new java.awt.Dimension(60, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 5);
        pnlPrincipal.add(txtId, gridBagConstraints);

        btnRegistrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnRegistrar.setText("Registrar");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 5);
        pnlPrincipal.add(btnRegistrar, gridBagConstraints);

        tblPuestos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblPuestos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "TIPO PUESTO", "SUBDIRECCION", "PUESTO", "CORREO", "EXTENSION"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollTablaDepartamentos.setViewportView(tblPuestos);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 5, 5);
        pnlPrincipal.add(jScrollTablaDepartamentos, gridBagConstraints);

        labelTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setText("Puestos");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        pnlPrincipal.add(labelTitulo, gridBagConstraints);

        btnEditar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEditar.setText("Guardar cambios");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 5);
        pnlPrincipal.add(btnEditar, gridBagConstraints);

        txtPuesto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPuesto.setMaximumSize(new java.awt.Dimension(180, 30));
        txtPuesto.setMinimumSize(new java.awt.Dimension(180, 30));
        txtPuesto.setPreferredSize(new java.awt.Dimension(180, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 5);
        pnlPrincipal.add(txtPuesto, gridBagConstraints);

        txtExtension.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtExtension.setMinimumSize(new java.awt.Dimension(50, 30));
        txtExtension.setPreferredSize(new java.awt.Dimension(50, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 5);
        pnlPrincipal.add(txtExtension, gridBagConstraints);

        lblSubdireccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSubdireccion.setForeground(new java.awt.Color(255, 255, 255));
        lblSubdireccion.setText("Subdireccion : ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        pnlPrincipal.add(lblSubdireccion, gridBagConstraints);

        lblExtension.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblExtension.setForeground(new java.awt.Color(255, 255, 255));
        lblExtension.setText("Extension :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(10, 50, 10, 10);
        pnlPrincipal.add(lblExtension, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tipo de puesto :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        pnlPrincipal.add(jLabel1, gridBagConstraints);

        cmbTipoPuesto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbTipoPuesto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Escoja una opcion-", "DIRECCION", "SUBDIRECCION", "DEPARTAMENTO", "COORDINACION" }));
        cmbTipoPuesto.setLightWeightPopupEnabled(false);
        cmbTipoPuesto.setMaximumSize(new java.awt.Dimension(35, 25));
        cmbTipoPuesto.setMinimumSize(new java.awt.Dimension(35, 25));
        cmbTipoPuesto.setPreferredSize(new java.awt.Dimension(35, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 5);
        pnlPrincipal.add(cmbTipoPuesto, gridBagConstraints);

        cmbSubdireccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbSubdireccion.setMaximumSize(new java.awt.Dimension(35, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 5);
        pnlPrincipal.add(cmbSubdireccion, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        getContentPane().add(pnlPrincipal, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JDialog_Puestos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialog_Puestos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialog_Puestos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialog_Puestos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialog_Puestos dialog = new JDialog_Puestos(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnEditar;
    public javax.swing.JButton btnRegistrar;
    public javax.swing.JComboBox<String> cmbSubdireccion;
    public javax.swing.JComboBox<String> cmbTipoPuesto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollTablaDepartamentos;
    private javax.swing.JLabel labelId;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel lblDepartamento;
    private javax.swing.JLabel lblExtension;
    private javax.swing.JLabel lblSubdireccion;
    private javax.swing.JPanel pnlPrincipal;
    public javax.swing.JTable tblPuestos;
    public javax.swing.JTextField txtExtension;
    public javax.swing.JTextField txtId;
    public javax.swing.JTextField txtPuesto;
    // End of variables declaration//GEN-END:variables
}
