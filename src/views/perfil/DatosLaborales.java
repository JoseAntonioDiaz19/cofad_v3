package views.perfil;

import java.awt.Color;
/**
 *
 * @author Jose Manuel Estrada Diaz
 */
public class DatosLaborales extends javax.swing.JDialog
{
    public DatosLaborales(java.awt.Frame parent, boolean modal)
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
        labelPlantel = new javax.swing.JLabel();
        labelExterno = new javax.swing.JLabel();
        labelHoras = new javax.swing.JLabel();
        labelTipoPuesto = new javax.swing.JLabel();
        labelJefeInmediato = new javax.swing.JLabel();
        labelCarreraArea = new javax.swing.JLabel();
        boxCargo = new javax.swing.JComboBox<>();
        boxPuesto = new javax.swing.JComboBox<>();
        boxPlantel = new javax.swing.JComboBox<>();
        boxHoras = new javax.swing.JComboBox<>();
        boxTipoPuesto = new javax.swing.JComboBox<>();
        boxCarreraArea = new javax.swing.JComboBox<>();
        radioBotonExternoSi = new javax.swing.JRadioButton();
        radioBotonExternoNo = new javax.swing.JRadioButton();
        txtJefeInmediato = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        panelBotones = new javax.swing.JPanel();
        btnGuardarCambios = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        panelPrincipal.setBackground(new java.awt.Color(0, 78, 97));
        panelPrincipal.setLayout(new java.awt.GridBagLayout());

        panelTitulo.setBackground(new java.awt.Color(0, 78, 97));

        labelTitulo.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("Datos laborales");
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
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 0, 0, 0);
        panelDatosLaborales.add(labelCargo, gridBagConstraints);

        labelPuesto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelPuesto.setForeground(new java.awt.Color(255, 255, 255));
        labelPuesto.setText("Puesto");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        panelDatosLaborales.add(labelPuesto, gridBagConstraints);

        labelPlantel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelPlantel.setForeground(new java.awt.Color(255, 255, 255));
        labelPlantel.setText("Plantel");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        panelDatosLaborales.add(labelPlantel, gridBagConstraints);

        labelExterno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelExterno.setForeground(new java.awt.Color(255, 255, 255));
        labelExterno.setText("Externo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        panelDatosLaborales.add(labelExterno, gridBagConstraints);

        labelHoras.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelHoras.setForeground(new java.awt.Color(255, 255, 255));
        labelHoras.setText("Horas");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        panelDatosLaborales.add(labelHoras, gridBagConstraints);

        labelTipoPuesto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelTipoPuesto.setForeground(new java.awt.Color(255, 255, 255));
        labelTipoPuesto.setText("Tipo de puesto  ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        panelDatosLaborales.add(labelTipoPuesto, gridBagConstraints);

        labelJefeInmediato.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelJefeInmediato.setForeground(new java.awt.Color(255, 255, 255));
        labelJefeInmediato.setText("Jefe inmediato");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        panelDatosLaborales.add(labelJefeInmediato, gridBagConstraints);

        labelCarreraArea.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelCarreraArea.setForeground(new java.awt.Color(255, 255, 255));
        labelCarreraArea.setText("Carrera o área");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        panelDatosLaborales.add(labelCarreraArea, gridBagConstraints);

        boxCargo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        boxCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Seleccione un cargo --" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(2, 0, 0, 0);
        panelDatosLaborales.add(boxCargo, gridBagConstraints);

        boxPuesto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        boxPuesto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Seleccione un puesto --" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(2, 0, 0, 0);
        panelDatosLaborales.add(boxPuesto, gridBagConstraints);

        boxPlantel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        boxPlantel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Seleccione un plantel --" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(2, 0, 0, 0);
        panelDatosLaborales.add(boxPlantel, gridBagConstraints);

        boxHoras.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        boxHoras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Seleccione las horas --", "NO ESPECIFICADO", "MEDIO TIEMPO", "TIEMPO COMPLETO", "ASIGNATURA", "HORAS", "3/4 DE HORAS" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        panelDatosLaborales.add(boxHoras, gridBagConstraints);

        boxTipoPuesto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        boxTipoPuesto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Seleccione su tipo de puesto --", "NO ESPECIFICADO", "DOCENTE", "APOYO A LA EDUCACIÓN" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(2, 0, 0, 0);
        panelDatosLaborales.add(boxTipoPuesto, gridBagConstraints);

        boxCarreraArea.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        boxCarreraArea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Seleccione su carrera o área --" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(2, 0, 0, 0);
        panelDatosLaborales.add(boxCarreraArea, gridBagConstraints);

        buttonGroup1.add(radioBotonExternoSi);
        radioBotonExternoSi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        radioBotonExternoSi.setForeground(new java.awt.Color(255, 255, 255));
        radioBotonExternoSi.setText("Si");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 0, 3, 0);
        panelDatosLaborales.add(radioBotonExternoSi, gridBagConstraints);

        buttonGroup1.add(radioBotonExternoNo);
        radioBotonExternoNo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        radioBotonExternoNo.setForeground(new java.awt.Color(255, 255, 255));
        radioBotonExternoNo.setText("No");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(3, 60, 3, 0);
        panelDatosLaborales.add(radioBotonExternoNo, gridBagConstraints);

        txtJefeInmediato.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 0, 0);
        panelDatosLaborales.add(txtJefeInmediato, gridBagConstraints);

        btnAgregar.setText("Agregar");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(2, 0, 0, 0);
        panelDatosLaborales.add(btnAgregar, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 5, 10);
        panelPrincipal.add(panelDatosLaborales, gridBagConstraints);

        panelBotones.setBackground(new java.awt.Color(0, 78, 97));

        btnGuardarCambios.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnGuardarCambios.setText("Guardar cambios");
        panelBotones.add(btnGuardarCambios);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        panelPrincipal.add(panelBotones, gridBagConstraints);

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
            java.util.logging.Logger.getLogger(DatosLaborales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DatosLaborales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DatosLaborales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DatosLaborales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DatosLaborales dialog = new DatosLaborales(new javax.swing.JFrame(), true);
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
    public javax.swing.JComboBox<String> boxCarreraArea;
    public javax.swing.JComboBox<String> boxHoras;
    public javax.swing.JComboBox<String> boxPlantel;
    public javax.swing.JComboBox<String> boxPuesto;
    public javax.swing.JComboBox<String> boxTipoPuesto;
    public javax.swing.JButton btnAgregar;
    public javax.swing.JButton btnGuardarCambios;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel labelCargo;
    private javax.swing.JLabel labelCarreraArea;
    private javax.swing.JLabel labelExterno;
    private javax.swing.JLabel labelHoras;
    private javax.swing.JLabel labelJefeInmediato;
    private javax.swing.JLabel labelPlantel;
    private javax.swing.JLabel labelPuesto;
    private javax.swing.JLabel labelTipoPuesto;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelDatosLaborales;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelTitulo;
    public javax.swing.JRadioButton radioBotonExternoNo;
    public javax.swing.JRadioButton radioBotonExternoSi;
    public javax.swing.JTextField txtJefeInmediato;
    // End of variables declaration//GEN-END:variables
}
