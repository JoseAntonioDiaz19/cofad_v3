package views.perfil;

import java.awt.Color;
/**
 *
 * @author Jose Manuel Estrada Diaz
 */
public class DatosLaboralesVista extends javax.swing.JDialog
{
    public DatosLaboralesVista(java.awt.Frame parent, boolean modal)
    {
        super(parent, modal);
        initComponents();
        this.setTitle("DATOS LABORALES");
        this.setSize(500, 380);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(0, 78, 97));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroup1 = new javax.swing.ButtonGroup();
        panelPrincipal = new javax.swing.JPanel();
        panelTitulo = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        panelDatosLaborales = new javax.swing.JPanel();
        labelCargo = new javax.swing.JLabel();
        labelPuesto = new javax.swing.JLabel();
        boxCargo = new javax.swing.JComboBox<>();
        boxPuesto = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        panelBotones = new javax.swing.JPanel();
        btnRegistrar = new javax.swing.JButton();
        btnGuardarCambios = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        panelTabla = new javax.swing.JPanel();
        jScrollTablaDatosLaborales = new javax.swing.JScrollPane();
        tblDatosLaborales = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        panelPrincipal.setBackground(new java.awt.Color(0, 78, 97));
        panelPrincipal.setLayout(new java.awt.GridBagLayout());

        panelTitulo.setBackground(new java.awt.Color(0, 78, 97));

        labelTitulo.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("Datos laborales actuales");
        panelTitulo.add(labelTitulo);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        panelPrincipal.add(panelTitulo, gridBagConstraints);

        panelDatosLaborales.setBackground(new java.awt.Color(0, 78, 97));
        panelDatosLaborales.setLayout(new java.awt.GridBagLayout());

        labelCargo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelCargo.setForeground(new java.awt.Color(255, 255, 255));
        labelCargo.setText("Cargo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        panelDatosLaborales.add(labelCargo, gridBagConstraints);

        labelPuesto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelPuesto.setForeground(new java.awt.Color(255, 255, 255));
        labelPuesto.setText("Puesto");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        panelDatosLaborales.add(labelPuesto, gridBagConstraints);

        boxCargo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        boxCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Seleccione un cargo --" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 200);
        panelDatosLaborales.add(boxCargo, gridBagConstraints);

        boxPuesto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        boxPuesto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Seleccione un puesto --" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 0, 0, 200);
        panelDatosLaborales.add(boxPuesto, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Jornada laboral  ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        panelDatosLaborales.add(jLabel1, gridBagConstraints);

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Seleccione Jornada Laboral --" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 200);
        panelDatosLaborales.add(jComboBox1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 5, 10);
        panelPrincipal.add(panelDatosLaborales, gridBagConstraints);

        panelBotones.setBackground(new java.awt.Color(0, 78, 97));

        btnRegistrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegistrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegistrar.setPreferredSize(new java.awt.Dimension(135, 25));
        panelBotones.add(btnRegistrar);

        btnGuardarCambios.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnGuardarCambios.setText("Guardar cambios");
        btnGuardarCambios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnGuardarCambios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelBotones.add(btnGuardarCambios);

        btnEliminar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminar.setPreferredSize(new java.awt.Dimension(135, 25));
        panelBotones.add(btnEliminar);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 0, 10);
        panelPrincipal.add(panelBotones, gridBagConstraints);

        panelTabla.setBackground(new java.awt.Color(0, 78, 97));
        panelTabla.setLayout(new java.awt.GridBagLayout());

        tblDatosLaborales.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblDatosLaborales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "PUESTO", "CARGO", "JORNADA LABORAL", "HORAS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDatosLaborales.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollTablaDatosLaborales.setViewportView(tblDatosLaborales);
        if (tblDatosLaborales.getColumnModel().getColumnCount() > 0) {
            tblDatosLaborales.getColumnModel().getColumn(0).setMinWidth(50);
            tblDatosLaborales.getColumnModel().getColumn(0).setPreferredWidth(60);
            tblDatosLaborales.getColumnModel().getColumn(0).setMaxWidth(100);
            tblDatosLaborales.getColumnModel().getColumn(3).setMinWidth(120);
            tblDatosLaborales.getColumnModel().getColumn(3).setPreferredWidth(150);
            tblDatosLaborales.getColumnModel().getColumn(3).setMaxWidth(200);
            tblDatosLaborales.getColumnModel().getColumn(4).setMinWidth(50);
            tblDatosLaborales.getColumnModel().getColumn(4).setPreferredWidth(60);
            tblDatosLaborales.getColumnModel().getColumn(4).setMaxWidth(80);
        }

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        panelTabla.add(jScrollTablaDatosLaborales, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelPrincipal.add(panelTabla, gridBagConstraints);

        getContentPane().add(panelPrincipal);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarActionPerformed

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
            java.util.logging.Logger.getLogger(DatosLaboralesVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DatosLaboralesVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DatosLaboralesVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DatosLaboralesVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DatosLaboralesVista dialog = new DatosLaboralesVista(new javax.swing.JFrame(), true);
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
    public javax.swing.JComboBox<String> boxCargo;
    public javax.swing.JComboBox<String> boxPuesto;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnGuardarCambios;
    public javax.swing.JButton btnRegistrar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JScrollPane jScrollTablaDatosLaborales;
    private javax.swing.JLabel labelCargo;
    private javax.swing.JLabel labelPuesto;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelDatosLaborales;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelTabla;
    private javax.swing.JPanel panelTitulo;
    public javax.swing.JTable tblDatosLaborales;
    // End of variables declaration//GEN-END:variables
}
