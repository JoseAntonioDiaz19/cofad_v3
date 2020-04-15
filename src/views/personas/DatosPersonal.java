package views.personas;

import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
/**
 *
 * @author Jose Manuel Estrada Diaz
 */
public class DatosPersonal extends javax.swing.JDialog
{
    public DatosPersonal(java.awt.Frame parent, boolean modal)
    {
        super(parent, modal);
        initComponents();
        this.setTitle("Datos de personal");
        this.setSize(400, 550);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(0, 78, 97));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel4 = new javax.swing.JPanel();
        lblRfc = new javax.swing.JLabel();
        lblCargo = new javax.swing.JLabel();
        lblDepartamento = new javax.swing.JLabel();
        lblPlantel = new javax.swing.JLabel();
        lblCurp = new javax.swing.JLabel();
        lblApePaterno = new javax.swing.JLabel();
        lblApeMaterno = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        lblCorreoElect = new javax.swing.JLabel();
        lblClavePresupuestal = new javax.swing.JLabel();
        lblNumTarjeta = new javax.swing.JLabel();
        lblExterno = new javax.swing.JLabel();
        lblHoras = new javax.swing.JLabel();
        lblTipoPuesto = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblJefeInmediato = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        lblClaveCarrera = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnGuardarCambios = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel4.setBackground(new java.awt.Color(0, 78, 97));
        jPanel4.setLayout(new java.awt.GridBagLayout());

        lblRfc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblRfc.setForeground(new java.awt.Color(255, 255, 255));
        lblRfc.setText("R.F.C. :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 0);
        jPanel4.add(lblRfc, gridBagConstraints);

        lblCargo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCargo.setForeground(new java.awt.Color(255, 255, 255));
        lblCargo.setText("Cargo :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 0, 0);
        jPanel4.add(lblCargo, gridBagConstraints);

        lblDepartamento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDepartamento.setForeground(new java.awt.Color(255, 255, 255));
        lblDepartamento.setText("Departamento :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 0, 0);
        jPanel4.add(lblDepartamento, gridBagConstraints);

        lblPlantel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPlantel.setForeground(new java.awt.Color(255, 255, 255));
        lblPlantel.setText("Plantel :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 0, 0);
        jPanel4.add(lblPlantel, gridBagConstraints);

        lblCurp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCurp.setForeground(new java.awt.Color(255, 255, 255));
        lblCurp.setText("CURP :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 0, 0);
        jPanel4.add(lblCurp, gridBagConstraints);

        lblApePaterno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblApePaterno.setForeground(new java.awt.Color(255, 255, 255));
        lblApePaterno.setText("Apellido paterno :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 0, 0);
        jPanel4.add(lblApePaterno, gridBagConstraints);

        lblApeMaterno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblApeMaterno.setForeground(new java.awt.Color(255, 255, 255));
        lblApeMaterno.setText("Apellido materno :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 0, 0);
        jPanel4.add(lblApeMaterno, gridBagConstraints);

        lblNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 0, 0);
        jPanel4.add(lblNombre, gridBagConstraints);

        lblSexo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSexo.setForeground(new java.awt.Color(255, 255, 255));
        lblSexo.setText("Sexo :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 0, 0);
        jPanel4.add(lblSexo, gridBagConstraints);

        lblCorreoElect.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCorreoElect.setForeground(new java.awt.Color(255, 255, 255));
        lblCorreoElect.setText("Correo elect. :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 0, 0);
        jPanel4.add(lblCorreoElect, gridBagConstraints);

        lblClavePresupuestal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblClavePresupuestal.setForeground(new java.awt.Color(255, 255, 255));
        lblClavePresupuestal.setText("Clave presupuestal :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 0, 0);
        jPanel4.add(lblClavePresupuestal, gridBagConstraints);

        lblNumTarjeta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNumTarjeta.setForeground(new java.awt.Color(255, 255, 255));
        lblNumTarjeta.setText("Num. tarjeta :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 0, 0);
        jPanel4.add(lblNumTarjeta, gridBagConstraints);

        lblExterno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblExterno.setForeground(new java.awt.Color(255, 255, 255));
        lblExterno.setText("Externo :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 0, 0);
        jPanel4.add(lblExterno, gridBagConstraints);

        lblHoras.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblHoras.setForeground(new java.awt.Color(255, 255, 255));
        lblHoras.setText("Horas :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 0, 0);
        jPanel4.add(lblHoras, gridBagConstraints);

        lblTipoPuesto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTipoPuesto.setForeground(new java.awt.Color(255, 255, 255));
        lblTipoPuesto.setText("Tipo puesto :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 0, 0);
        jPanel4.add(lblTipoPuesto, gridBagConstraints);

        lblTelefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTelefono.setForeground(new java.awt.Color(255, 255, 255));
        lblTelefono.setText("Telefono :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 0, 0);
        jPanel4.add(lblTelefono, gridBagConstraints);

        lblJefeInmediato.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblJefeInmediato.setForeground(new java.awt.Color(255, 255, 255));
        lblJefeInmediato.setText("Jefe inmediato :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 17;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 0, 0);
        jPanel4.add(lblJefeInmediato, gridBagConstraints);

        lblStatus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblStatus.setForeground(new java.awt.Color(255, 255, 255));
        lblStatus.setText("Status :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 0, 0);
        jPanel4.add(lblStatus, gridBagConstraints);

        lblClaveCarrera.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblClaveCarrera.setForeground(new java.awt.Color(255, 255, 255));
        lblClaveCarrera.setText("Clave carrera :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 19;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 0, 0);
        jPanel4.add(lblClaveCarrera, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Datos de personal");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        jPanel4.add(jLabel1, gridBagConstraints);

        btnGuardarCambios.setBackground(new java.awt.Color(0, 153, 153));
        btnGuardarCambios.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnGuardarCambios.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarCambios.setText("Guardar cambios");
        btnGuardarCambios.setContentAreaFilled(false);
        btnGuardarCambios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardarCambios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnGuardarCambios.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnGuardarCambios.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        jPanel4.add(btnGuardarCambios, gridBagConstraints);
        String urlGuardarCambios = "/recursos/imagenes/save.png";
        ImageIcon imgGuardarCambios = new ImageIcon(getClass().getResource(urlGuardarCambios));
        Icon iconGuardarCambios = new ImageIcon(imgGuardarCambios.getImage().getScaledInstance(
            22, 22, Image.SCALE_SMOOTH));
    btnGuardarCambios.setIcon(iconGuardarCambios);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 1.0;
    gridBagConstraints.weighty = 1.0;
    gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
    getContentPane().add(jPanel4, gridBagConstraints);

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
            java.util.logging.Logger.getLogger(DatosPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DatosPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DatosPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DatosPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DatosPersonal dialog = new DatosPersonal(new javax.swing.JFrame(), true);
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
    public javax.swing.JButton btnGuardarCambios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblApeMaterno;
    private javax.swing.JLabel lblApePaterno;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblClaveCarrera;
    private javax.swing.JLabel lblClavePresupuestal;
    private javax.swing.JLabel lblCorreoElect;
    private javax.swing.JLabel lblCurp;
    private javax.swing.JLabel lblDepartamento;
    private javax.swing.JLabel lblExterno;
    private javax.swing.JLabel lblHoras;
    private javax.swing.JLabel lblJefeInmediato;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNumTarjeta;
    private javax.swing.JLabel lblPlantel;
    private javax.swing.JLabel lblRfc;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTipoPuesto;
    // End of variables declaration//GEN-END:variables
}
