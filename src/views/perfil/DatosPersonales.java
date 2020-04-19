package views.perfil;

import java.awt.Color;
/**
 *
 * @author manuel Estrada Diaz
 */
public class DatosPersonales extends javax.swing.JDialog
{
    public DatosPersonales(java.awt.Frame parent, boolean modal)
    {
        super(parent, modal);
        initComponents();
        rbtHombre.setActionCommand("H");
        rbtMujer.setActionCommand("M");
        this.setTitle("Datos personales");
        this.setSize(520, 620);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(0, 78, 97));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroupSexo = new javax.swing.ButtonGroup();
        buttonGroupExterno = new javax.swing.ButtonGroup();
        panelPrincipal = new javax.swing.JPanel();
        panelTitulo = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        panelDatosPersonales = new javax.swing.JPanel();
        labelRFC = new javax.swing.JLabel();
        labelCURP = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        labelApePaterno = new javax.swing.JLabel();
        labelApeMaterno = new javax.swing.JLabel();
        labelSexo = new javax.swing.JLabel();
        labelCorreo = new javax.swing.JLabel();
        labelTelefono = new javax.swing.JLabel();
        labelClavePresupuestal = new javax.swing.JLabel();
        labelNumTarjeta = new javax.swing.JLabel();
        txtRfc = new javax.swing.JTextField();
        txtCurp = new javax.swing.JTextField();
        boxTituloProfesional = new javax.swing.JComboBox<>();
        txtNombre = new javax.swing.JTextField();
        txtApPaterno = new javax.swing.JTextField();
        txtApMaterno = new javax.swing.JTextField();
        rbtHombre = new javax.swing.JRadioButton();
        rbtMujer = new javax.swing.JRadioButton();
        labelFechaNacimiento = new javax.swing.JLabel();
        txtCorreoElectronico = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JFormattedTextField();
        txtClavePresupuestal = new javax.swing.JTextField();
        txtNumTarjeta = new javax.swing.JFormattedTextField();
        btnGuardarCambios = new javax.swing.JButton();
        chooserFechaNacimiento = new com.toedter.calendar.JDateChooser();
        labelTituloProfesional = new javax.swing.JLabel();
        labelExterno = new javax.swing.JLabel();
        jRadioBotSi = new javax.swing.JRadioButton();
        jRadioButNo = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        boxPlanteles = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        panelPrincipal.setBackground(new java.awt.Color(0, 78, 97));
        panelPrincipal.setLayout(new java.awt.GridBagLayout());

        panelTitulo.setBackground(new java.awt.Color(0, 78, 97));

        labelTitulo.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("Datos personales");
        panelTitulo.add(labelTitulo);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        panelPrincipal.add(panelTitulo, gridBagConstraints);

        panelDatosPersonales.setBackground(new java.awt.Color(0, 78, 97));
        panelDatosPersonales.setLayout(new java.awt.GridBagLayout());

        labelRFC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelRFC.setForeground(new java.awt.Color(255, 255, 255));
        labelRFC.setText("RFC*");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 0, 0);
        panelDatosPersonales.add(labelRFC, gridBagConstraints);

        labelCURP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelCURP.setForeground(new java.awt.Color(255, 255, 255));
        labelCURP.setText("CURP*");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 0, 0);
        panelDatosPersonales.add(labelCURP, gridBagConstraints);

        labelNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelNombre.setForeground(new java.awt.Color(255, 255, 255));
        labelNombre.setText("Nombre*");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 0, 0);
        panelDatosPersonales.add(labelNombre, gridBagConstraints);

        labelApePaterno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelApePaterno.setForeground(new java.awt.Color(255, 255, 255));
        labelApePaterno.setText("Apellido paterno*");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 0, 0);
        panelDatosPersonales.add(labelApePaterno, gridBagConstraints);

        labelApeMaterno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelApeMaterno.setForeground(new java.awt.Color(255, 255, 255));
        labelApeMaterno.setText("Apellido materno*");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 0, 0);
        panelDatosPersonales.add(labelApeMaterno, gridBagConstraints);

        labelSexo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelSexo.setForeground(new java.awt.Color(255, 255, 255));
        labelSexo.setText("Sexo*");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 0, 0);
        panelDatosPersonales.add(labelSexo, gridBagConstraints);

        labelCorreo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelCorreo.setForeground(new java.awt.Color(255, 255, 255));
        labelCorreo.setText("Correo*");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 0, 0);
        panelDatosPersonales.add(labelCorreo, gridBagConstraints);

        labelTelefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelTelefono.setForeground(new java.awt.Color(255, 255, 255));
        labelTelefono.setText("Teléfono*");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 0, 0);
        panelDatosPersonales.add(labelTelefono, gridBagConstraints);

        labelClavePresupuestal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelClavePresupuestal.setForeground(new java.awt.Color(255, 255, 255));
        labelClavePresupuestal.setText("Clave presupuestal  ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 0, 0);
        panelDatosPersonales.add(labelClavePresupuestal, gridBagConstraints);

        labelNumTarjeta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelNumTarjeta.setForeground(new java.awt.Color(255, 255, 255));
        labelNumTarjeta.setText("Num. de tarjeta ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 0, 0);
        panelDatosPersonales.add(labelNumTarjeta, gridBagConstraints);

        txtRfc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        panelDatosPersonales.add(txtRfc, gridBagConstraints);

        txtCurp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        panelDatosPersonales.add(txtCurp, gridBagConstraints);

        boxTituloProfesional.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        boxTituloProfesional.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Seleccione --" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        panelDatosPersonales.add(boxTituloProfesional, gridBagConstraints);

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        panelDatosPersonales.add(txtNombre, gridBagConstraints);

        txtApPaterno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        panelDatosPersonales.add(txtApPaterno, gridBagConstraints);

        txtApMaterno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        panelDatosPersonales.add(txtApMaterno, gridBagConstraints);

        buttonGroupSexo.add(rbtHombre);
        rbtHombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbtHombre.setForeground(new java.awt.Color(255, 255, 255));
        rbtHombre.setText("Hombre");
        rbtHombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtHombreActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 3, 0);
        panelDatosPersonales.add(rbtHombre, gridBagConstraints);

        buttonGroupSexo.add(rbtMujer);
        rbtMujer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbtMujer.setForeground(new java.awt.Color(255, 255, 255));
        rbtMujer.setText("Mujer");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 100, 3, 0);
        panelDatosPersonales.add(rbtMujer, gridBagConstraints);

        labelFechaNacimiento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelFechaNacimiento.setForeground(new java.awt.Color(255, 255, 255));
        labelFechaNacimiento.setText("Fecha de nacimiento*  ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 0, 0);
        panelDatosPersonales.add(labelFechaNacimiento, gridBagConstraints);

        txtCorreoElectronico.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        panelDatosPersonales.add(txtCorreoElectronico, gridBagConstraints);

        txtTelefono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtTelefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        panelDatosPersonales.add(txtTelefono, gridBagConstraints);

        txtClavePresupuestal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        panelDatosPersonales.add(txtClavePresupuestal, gridBagConstraints);

        txtNumTarjeta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtNumTarjeta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        panelDatosPersonales.add(txtNumTarjeta, gridBagConstraints);

        btnGuardarCambios.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnGuardarCambios.setText("Guardar cambios");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 5, 0);
        panelDatosPersonales.add(btnGuardarCambios, gridBagConstraints);

        chooserFechaNacimiento.setDateFormatString("yyyy-MM-dd");
        chooserFechaNacimiento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.1;
        panelDatosPersonales.add(chooserFechaNacimiento, gridBagConstraints);

        labelTituloProfesional.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelTituloProfesional.setForeground(new java.awt.Color(255, 255, 255));
        labelTituloProfesional.setText("Titulo profesional*");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 0, 0);
        panelDatosPersonales.add(labelTituloProfesional, gridBagConstraints);

        labelExterno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelExterno.setForeground(new java.awt.Color(255, 255, 255));
        labelExterno.setText("Externo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 0, 0);
        panelDatosPersonales.add(labelExterno, gridBagConstraints);

        buttonGroupExterno.add(jRadioBotSi);
        jRadioBotSi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioBotSi.setForeground(new java.awt.Color(255, 255, 255));
        jRadioBotSi.setText("Si");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        panelDatosPersonales.add(jRadioBotSi, gridBagConstraints);

        buttonGroupExterno.add(jRadioButNo);
        jRadioButNo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButNo.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButNo.setText("No");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 60, 0, 0);
        panelDatosPersonales.add(jRadioButNo, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Plantel");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 0, 0);
        panelDatosPersonales.add(jLabel1, gridBagConstraints);

        boxPlanteles.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        boxPlanteles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Seleccione --" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        panelDatosPersonales.add(boxPlanteles, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 10);
        panelPrincipal.add(panelDatosPersonales, gridBagConstraints);

        getContentPane().add(panelPrincipal);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtHombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtHombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtHombreActionPerformed

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
            java.util.logging.Logger.getLogger(DatosPersonales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DatosPersonales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DatosPersonales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DatosPersonales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DatosPersonales dialog = new DatosPersonales(new javax.swing.JFrame(), true);
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
    public javax.swing.JComboBox<String> boxPlanteles;
    public javax.swing.JComboBox<String> boxTituloProfesional;
    public javax.swing.JButton btnGuardarCambios;
    private javax.swing.ButtonGroup buttonGroupExterno;
    public javax.swing.ButtonGroup buttonGroupSexo;
    public com.toedter.calendar.JDateChooser chooserFechaNacimiento;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JRadioButton jRadioBotSi;
    public javax.swing.JRadioButton jRadioButNo;
    private javax.swing.JLabel labelApeMaterno;
    private javax.swing.JLabel labelApePaterno;
    private javax.swing.JLabel labelCURP;
    private javax.swing.JLabel labelClavePresupuestal;
    private javax.swing.JLabel labelCorreo;
    private javax.swing.JLabel labelExterno;
    private javax.swing.JLabel labelFechaNacimiento;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelNumTarjeta;
    private javax.swing.JLabel labelRFC;
    private javax.swing.JLabel labelSexo;
    private javax.swing.JLabel labelTelefono;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelTituloProfesional;
    private javax.swing.JPanel panelDatosPersonales;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelTitulo;
    public javax.swing.JRadioButton rbtHombre;
    public javax.swing.JRadioButton rbtMujer;
    public javax.swing.JTextField txtApMaterno;
    public javax.swing.JTextField txtApPaterno;
    public javax.swing.JTextField txtClavePresupuestal;
    public javax.swing.JTextField txtCorreoElectronico;
    public javax.swing.JTextField txtCurp;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JFormattedTextField txtNumTarjeta;
    public javax.swing.JTextField txtRfc;
    public javax.swing.JFormattedTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
