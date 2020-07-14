package views.personal;

import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
/**
 *
 * @author Jose Manuel Estrada Diaz
 */
public class JDialog_EditarDatosLaborales extends javax.swing.JDialog
{
    public JDialog_EditarDatosLaborales(java.awt.Frame parent, boolean modal){
        super(parent, modal);
        initComponents();
        this.setTitle("Gestionar personal");
        this.setSize(950, 530);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(0, 78, 97));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        panelPrincipal = new javax.swing.JPanel();
        panelDatosLaborales = new javax.swing.JPanel();
        labelCargo = new javax.swing.JLabel();
        labelPlantel = new javax.swing.JLabel();
        labelClavePresupuestal = new javax.swing.JLabel();
        labelNumTarjeta = new javax.swing.JLabel();
        labelPersonalExterno = new javax.swing.JLabel();
        labelStatusPersona = new javax.swing.JLabel();
        cmbCargo = new javax.swing.JComboBox<>();
        cmbClavePlantel = new javax.swing.JComboBox<>();
        txtClavePresupuestal = new javax.swing.JTextField();
        txtNumTarjeta = new javax.swing.JTextField();
        rbtExternoSi = new javax.swing.JRadioButton();
        rbtExternoNo = new javax.swing.JRadioButton();
        rbtActivo = new javax.swing.JRadioButton();
        rbtInactivo = new javax.swing.JRadioButton();
        cmbPuesto = new javax.swing.JComboBox<>();
        labelPuesto = new javax.swing.JLabel();
        labelTituloDatosLaborales = new javax.swing.JLabel();
        labelJornadaLaboral = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        panelVacio = new javax.swing.JPanel();
        btnRegistrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editar datos laborales");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(0, 78, 97));
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        panelPrincipal.setBackground(new java.awt.Color(0, 78, 97));
        panelPrincipal.setLayout(new java.awt.GridBagLayout());

        panelDatosLaborales.setBackground(new java.awt.Color(0, 78, 97));
        panelDatosLaborales.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelDatosLaborales.setLayout(new java.awt.GridBagLayout());

        labelCargo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelCargo.setForeground(new java.awt.Color(255, 255, 255));
        labelCargo.setText("Cargo ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 0, 0);
        panelDatosLaborales.add(labelCargo, gridBagConstraints);

        labelPlantel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelPlantel.setForeground(new java.awt.Color(255, 255, 255));
        labelPlantel.setText("Plantel");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 0, 0);
        panelDatosLaborales.add(labelPlantel, gridBagConstraints);

        labelClavePresupuestal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelClavePresupuestal.setForeground(new java.awt.Color(255, 255, 255));
        labelClavePresupuestal.setText("Clave presupuestal   ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 0, 0);
        panelDatosLaborales.add(labelClavePresupuestal, gridBagConstraints);

        labelNumTarjeta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelNumTarjeta.setForeground(new java.awt.Color(255, 255, 255));
        labelNumTarjeta.setText("No. tarjeta ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 0);
        panelDatosLaborales.add(labelNumTarjeta, gridBagConstraints);

        labelPersonalExterno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelPersonalExterno.setForeground(new java.awt.Color(255, 255, 255));
        labelPersonalExterno.setText("Personal externo ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 0, 0);
        panelDatosLaborales.add(labelPersonalExterno, gridBagConstraints);

        labelStatusPersona.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelStatusPersona.setForeground(new java.awt.Color(255, 255, 255));
        labelStatusPersona.setText("Status de persona ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 10, 0);
        panelDatosLaborales.add(labelStatusPersona, gridBagConstraints);

        cmbCargo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmbCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Seleccione --" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 5);
        panelDatosLaborales.add(cmbCargo, gridBagConstraints);

        cmbClavePlantel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmbClavePlantel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Seleccione --" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 5);
        panelDatosLaborales.add(cmbClavePlantel, gridBagConstraints);

        txtClavePresupuestal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.7;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 5);
        panelDatosLaborales.add(txtClavePresupuestal, gridBagConstraints);

        txtNumTarjeta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 5);
        panelDatosLaborales.add(txtNumTarjeta, gridBagConstraints);

        rbtExternoSi.setBackground(new java.awt.Color(0, 78, 97));
        buttonGroup2.add(rbtExternoSi);
        rbtExternoSi.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbtExternoSi.setForeground(new java.awt.Color(255, 255, 255));
        rbtExternoSi.setText("SI");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        panelDatosLaborales.add(rbtExternoSi, gridBagConstraints);

        rbtExternoNo.setBackground(new java.awt.Color(0, 78, 97));
        buttonGroup2.add(rbtExternoNo);
        rbtExternoNo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbtExternoNo.setForeground(new java.awt.Color(255, 255, 255));
        rbtExternoNo.setText("NO");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        panelDatosLaborales.add(rbtExternoNo, gridBagConstraints);

        rbtActivo.setBackground(new java.awt.Color(0, 78, 97));
        buttonGroup3.add(rbtActivo);
        rbtActivo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbtActivo.setForeground(new java.awt.Color(255, 255, 255));
        rbtActivo.setText("ACTIVO");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        panelDatosLaborales.add(rbtActivo, gridBagConstraints);

        rbtInactivo.setBackground(new java.awt.Color(0, 78, 97));
        buttonGroup3.add(rbtInactivo);
        rbtInactivo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbtInactivo.setForeground(new java.awt.Color(255, 255, 255));
        rbtInactivo.setText("INACTIVO");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        panelDatosLaborales.add(rbtInactivo, gridBagConstraints);

        cmbPuesto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmbPuesto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Seleccione --" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 5);
        panelDatosLaborales.add(cmbPuesto, gridBagConstraints);

        labelPuesto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelPuesto.setForeground(new java.awt.Color(255, 255, 255));
        labelPuesto.setText("Puesto  ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 0, 0);
        panelDatosLaborales.add(labelPuesto, gridBagConstraints);

        labelTituloDatosLaborales.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelTituloDatosLaborales.setForeground(new java.awt.Color(255, 255, 255));
        labelTituloDatosLaborales.setText("Datos laborales");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 0);
        panelDatosLaborales.add(labelTituloDatosLaborales, gridBagConstraints);

        labelJornadaLaboral.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelJornadaLaboral.setForeground(new java.awt.Color(255, 255, 255));
        labelJornadaLaboral.setText("Jornada laboral   ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 0, 0);
        panelDatosLaborales.add(labelJornadaLaboral, gridBagConstraints);

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Seleccione --" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 5);
        panelDatosLaborales.add(jComboBox1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelPrincipal.add(panelDatosLaborales, gridBagConstraints);

        panelVacio.setBackground(new java.awt.Color(0, 78, 97));
        panelVacio.setLayout(new java.awt.GridBagLayout());

        btnRegistrar.setBackground(new java.awt.Color(0, 153, 153));
        btnRegistrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("Guardar cambios");
        btnRegistrar.setContentAreaFilled(false);
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegistrar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnRegistrar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnRegistrar.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        panelVacio.add(btnRegistrar, gridBagConstraints);
        String urlEditar = "/recursos/imagenes/update.png";
        ImageIcon imgEditar = new ImageIcon(getClass().getResource(urlEditar));
        Icon iconEditar = new ImageIcon(imgEditar.getImage().getScaledInstance(
            22, 22, Image.SCALE_SMOOTH));
    btnRegistrar.setIcon(iconEditar);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.ipady = 10;
    gridBagConstraints.weightx = 1.0;
    gridBagConstraints.weighty = 0.5;
    panelPrincipal.add(panelVacio, gridBagConstraints);

    getContentPane().add(panelPrincipal);

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
            java.util.logging.Logger.getLogger(JDialog_EditarDatosLaborales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialog_EditarDatosLaborales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialog_EditarDatosLaborales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialog_EditarDatosLaborales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialog_EditarDatosLaborales dialog = new JDialog_EditarDatosLaborales(new javax.swing.JFrame(), true);
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
    public javax.swing.JButton btnRegistrar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    public javax.swing.JComboBox<String> cmbCargo;
    public javax.swing.JComboBox<String> cmbClavePlantel;
    public javax.swing.JComboBox<String> cmbPuesto;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel labelCargo;
    private javax.swing.JLabel labelClavePresupuestal;
    private javax.swing.JLabel labelJornadaLaboral;
    private javax.swing.JLabel labelNumTarjeta;
    private javax.swing.JLabel labelPersonalExterno;
    private javax.swing.JLabel labelPlantel;
    private javax.swing.JLabel labelPuesto;
    private javax.swing.JLabel labelStatusPersona;
    private javax.swing.JLabel labelTituloDatosLaborales;
    private javax.swing.JPanel panelDatosLaborales;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelVacio;
    public javax.swing.JRadioButton rbtActivo;
    public javax.swing.JRadioButton rbtExternoNo;
    public javax.swing.JRadioButton rbtExternoSi;
    public javax.swing.JRadioButton rbtInactivo;
    public javax.swing.JTextField txtClavePresupuestal;
    public javax.swing.JTextField txtNumTarjeta;
    // End of variables declaration//GEN-END:variables
}
