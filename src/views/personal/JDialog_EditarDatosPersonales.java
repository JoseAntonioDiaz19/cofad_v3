package views.personal;

import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
/**
 *
 * @author Jose Manuel Estrada Diaz
 */
public class JDialog_EditarDatosPersonales extends javax.swing.JDialog
{
    public JDialog_EditarDatosPersonales(java.awt.Frame parent, boolean modal){
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
        panelDatosPersonales = new javax.swing.JPanel();
        labelRFC = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        labelApePaterno = new javax.swing.JLabel();
        labelApeMaterno = new javax.swing.JLabel();
        labelCurp = new javax.swing.JLabel();
        labelSexo = new javax.swing.JLabel();
        labelCorreo = new javax.swing.JLabel();
        labelTelefono = new javax.swing.JLabel();
        labelFechaNacimiento = new javax.swing.JLabel();
        labelTituloDatosPersonales = new javax.swing.JLabel();
        labelTituloProfesional = new javax.swing.JLabel();
        txtRFC = new javax.swing.JTextField();
        cmbTitulo = new javax.swing.JComboBox<>();
        txtNombre = new javax.swing.JTextField();
        txtApellidoPat = new javax.swing.JTextField();
        txtApellidoMat = new javax.swing.JTextField();
        txtCURP = new javax.swing.JTextField();
        rbtMasculino = new javax.swing.JRadioButton();
        rbtFemenino = new javax.swing.JRadioButton();
        txtCorreoElectronico = new javax.swing.JTextField();
        txtNumTelefono = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        panelVacio = new javax.swing.JPanel();
        btnRegistrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Datos personales");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(0, 78, 97));
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        panelPrincipal.setBackground(new java.awt.Color(0, 78, 97));
        panelPrincipal.setLayout(new java.awt.GridBagLayout());

        panelDatosPersonales.setBackground(new java.awt.Color(0, 78, 97));
        panelDatosPersonales.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelDatosPersonales.setLayout(new java.awt.GridBagLayout());

        labelRFC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelRFC.setForeground(new java.awt.Color(255, 255, 255));
        labelRFC.setText("R.F.C ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 0, 0);
        panelDatosPersonales.add(labelRFC, gridBagConstraints);

        labelNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelNombre.setForeground(new java.awt.Color(255, 255, 255));
        labelNombre.setText("Nombre (s) ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        panelDatosPersonales.add(labelNombre, gridBagConstraints);

        labelApePaterno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelApePaterno.setForeground(new java.awt.Color(255, 255, 255));
        labelApePaterno.setText("Apellido paterno ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        panelDatosPersonales.add(labelApePaterno, gridBagConstraints);

        labelApeMaterno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelApeMaterno.setForeground(new java.awt.Color(255, 255, 255));
        labelApeMaterno.setText("Apellido materno ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        panelDatosPersonales.add(labelApeMaterno, gridBagConstraints);

        labelCurp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelCurp.setForeground(new java.awt.Color(255, 255, 255));
        labelCurp.setText("CURP ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 0);
        panelDatosPersonales.add(labelCurp, gridBagConstraints);

        labelSexo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelSexo.setForeground(new java.awt.Color(255, 255, 255));
        labelSexo.setText("Sexo ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 0);
        panelDatosPersonales.add(labelSexo, gridBagConstraints);

        labelCorreo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelCorreo.setForeground(new java.awt.Color(255, 255, 255));
        labelCorreo.setText("Correo electrónico ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 0);
        panelDatosPersonales.add(labelCorreo, gridBagConstraints);

        labelTelefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelTelefono.setForeground(new java.awt.Color(255, 255, 255));
        labelTelefono.setText("No. de teléfono ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 10, 0);
        panelDatosPersonales.add(labelTelefono, gridBagConstraints);

        labelFechaNacimiento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelFechaNacimiento.setForeground(new java.awt.Color(255, 255, 255));
        labelFechaNacimiento.setText("Fecha de nacimiento ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 0);
        panelDatosPersonales.add(labelFechaNacimiento, gridBagConstraints);

        labelTituloDatosPersonales.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelTituloDatosPersonales.setForeground(new java.awt.Color(255, 255, 255));
        labelTituloDatosPersonales.setText("Datos personales");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 0, 0);
        panelDatosPersonales.add(labelTituloDatosPersonales, gridBagConstraints);

        labelTituloProfesional.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelTituloProfesional.setForeground(new java.awt.Color(255, 255, 255));
        labelTituloProfesional.setText("Titulo profesional ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 10, 0);
        panelDatosPersonales.add(labelTituloProfesional, gridBagConstraints);

        txtRFC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 5, 0);
        panelDatosPersonales.add(txtRFC, gridBagConstraints);

        cmbTitulo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmbTitulo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Seleccione --" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        panelDatosPersonales.add(cmbTitulo, gridBagConstraints);

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        panelDatosPersonales.add(txtNombre, gridBagConstraints);

        txtApellidoPat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        panelDatosPersonales.add(txtApellidoPat, gridBagConstraints);

        txtApellidoMat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        panelDatosPersonales.add(txtApellidoMat, gridBagConstraints);

        txtCURP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 5);
        panelDatosPersonales.add(txtCURP, gridBagConstraints);

        rbtMasculino.setBackground(new java.awt.Color(0, 78, 97));
        buttonGroup1.add(rbtMasculino);
        rbtMasculino.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbtMasculino.setForeground(new java.awt.Color(255, 255, 255));
        rbtMasculino.setText("Hombre");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
        panelDatosPersonales.add(rbtMasculino, gridBagConstraints);

        rbtFemenino.setBackground(new java.awt.Color(0, 78, 97));
        buttonGroup1.add(rbtFemenino);
        rbtFemenino.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbtFemenino.setForeground(new java.awt.Color(255, 255, 255));
        rbtFemenino.setText("Mujer");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        panelDatosPersonales.add(rbtFemenino, gridBagConstraints);

        txtCorreoElectronico.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
        panelDatosPersonales.add(txtCorreoElectronico, gridBagConstraints);

        txtNumTelefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 5);
        panelDatosPersonales.add(txtNumTelefono, gridBagConstraints);

        jDateChooser1.setDateFormatString("yyyy/MM/dd");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
        panelDatosPersonales.add(jDateChooser1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 10);
        panelPrincipal.add(panelDatosPersonales, gridBagConstraints);

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
            java.util.logging.Logger.getLogger(JDialog_EditarDatosPersonales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialog_EditarDatosPersonales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialog_EditarDatosPersonales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialog_EditarDatosPersonales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                JDialog_EditarDatosPersonales dialog = new JDialog_EditarDatosPersonales(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> cmbTitulo;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel labelApeMaterno;
    private javax.swing.JLabel labelApePaterno;
    private javax.swing.JLabel labelCorreo;
    private javax.swing.JLabel labelCurp;
    private javax.swing.JLabel labelFechaNacimiento;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelRFC;
    private javax.swing.JLabel labelSexo;
    private javax.swing.JLabel labelTelefono;
    private javax.swing.JLabel labelTituloDatosPersonales;
    private javax.swing.JLabel labelTituloProfesional;
    private javax.swing.JPanel panelDatosPersonales;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelVacio;
    public javax.swing.JRadioButton rbtFemenino;
    public javax.swing.JRadioButton rbtMasculino;
    public javax.swing.JTextField txtApellidoMat;
    public javax.swing.JTextField txtApellidoPat;
    public javax.swing.JTextField txtCURP;
    public javax.swing.JTextField txtCorreoElectronico;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JTextField txtNumTelefono;
    public javax.swing.JTextField txtRFC;
    // End of variables declaration//GEN-END:variables
}
