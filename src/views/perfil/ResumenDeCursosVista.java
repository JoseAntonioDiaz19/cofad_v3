/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.perfil;

import java.awt.Color;

/**
 *
 * @author admin
 */
public class ResumenDeCursosVista extends javax.swing.JDialog {

    /**
     * Creates new form Formacion_Academica
     */
    public ResumenDeCursosVista(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
         jScrollTablaResumenCursos.getViewport().setBackground(new Color(0, 78, 97));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        menuResumenCursos = new javax.swing.JPopupMenu();
        menuItemImprimirCedula = new javax.swing.JMenuItem();
        menuItemEncuestaEficacia = new javax.swing.JMenuItem();
        menuItemEncuestaOpinion = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        panelDatos = new javax.swing.JPanel();
        labelCicloEscolar = new javax.swing.JLabel();
        labelPeriodo = new javax.swing.JLabel();
        labelTipoCurso = new javax.swing.JLabel();
        boxCicloEscolar = new javax.swing.JComboBox<>();
        boxPeriodo = new javax.swing.JComboBox<>();
        boxTipoCurso = new javax.swing.JComboBox<>();
        panelBotones = new javax.swing.JPanel();
        btnFiltrar = new javax.swing.JButton();
        panelTabla = new javax.swing.JPanel();
        jScrollTablaResumenCursos = new javax.swing.JScrollPane();
        tblResumenCursos = new javax.swing.JTable();

        menuItemImprimirCedula.setText("Imprimir cédula de inscripción");
        menuResumenCursos.add(menuItemImprimirCedula);

        menuItemEncuestaEficacia.setText("Encuesta de eficacia");
        menuResumenCursos.add(menuItemEncuestaEficacia);

        menuItemEncuestaOpinion.setText("Encuesta de opinión");
        menuResumenCursos.add(menuItemEncuestaOpinion);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setBackground(new java.awt.Color(0, 78, 97));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        labelTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("Resumen de cursos");
        labelTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel1.add(labelTitulo, gridBagConstraints);

        panelDatos.setBackground(new java.awt.Color(0, 78, 97));
        panelDatos.setLayout(new java.awt.GridBagLayout());

        labelCicloEscolar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelCicloEscolar.setForeground(new java.awt.Color(255, 255, 255));
        labelCicloEscolar.setText("Ciclo escolar");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        panelDatos.add(labelCicloEscolar, gridBagConstraints);

        labelPeriodo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelPeriodo.setForeground(new java.awt.Color(255, 255, 255));
        labelPeriodo.setText("Periodo ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 0, 0);
        panelDatos.add(labelPeriodo, gridBagConstraints);

        labelTipoCurso.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelTipoCurso.setForeground(new java.awt.Color(255, 255, 255));
        labelTipoCurso.setText("Tipo de curso ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        panelDatos.add(labelTipoCurso, gridBagConstraints);

        boxCicloEscolar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Seleccione --" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        panelDatos.add(boxCicloEscolar, gridBagConstraints);

        boxPeriodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Seleccione --" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        panelDatos.add(boxPeriodo, gridBagConstraints);

        boxTipoCurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Seleccione --" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        panelDatos.add(boxTipoCurso, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 10);
        jPanel1.add(panelDatos, gridBagConstraints);

        panelBotones.setBackground(new java.awt.Color(0, 78, 97));
        panelBotones.setLayout(new java.awt.GridBagLayout());

        btnFiltrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnFiltrar.setText("Filtrar");
        btnFiltrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnFiltrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        panelBotones.add(btnFiltrar, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 0, 10);
        jPanel1.add(panelBotones, gridBagConstraints);

        panelTabla.setBackground(new java.awt.Color(0, 78, 97));
        panelTabla.setLayout(new java.awt.GridBagLayout());

        tblResumenCursos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblResumenCursos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CURSO", "FACILITADOR", "PERIODO", "CALIFICACIÓN"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblResumenCursos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollTablaResumenCursos.setViewportView(tblResumenCursos);
        if (tblResumenCursos.getColumnModel().getColumnCount() > 0) {
            tblResumenCursos.getColumnModel().getColumn(0).setMinWidth(50);
            tblResumenCursos.getColumnModel().getColumn(0).setPreferredWidth(60);
            tblResumenCursos.getColumnModel().getColumn(0).setMaxWidth(100);
            tblResumenCursos.getColumnModel().getColumn(2).setMinWidth(150);
            tblResumenCursos.getColumnModel().getColumn(2).setPreferredWidth(150);
            tblResumenCursos.getColumnModel().getColumn(2).setMaxWidth(180);
        }

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        panelTabla.add(jScrollTablaResumenCursos, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel1.add(panelTabla, gridBagConstraints);

        getContentPane().add(jPanel1);

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
            java.util.logging.Logger.getLogger(ResumenDeCursosVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResumenDeCursosVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResumenDeCursosVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResumenDeCursosVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                ResumenDeCursosVista dialog = new ResumenDeCursosVista(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> boxCicloEscolar;
    private javax.swing.JComboBox<String> boxPeriodo;
    private javax.swing.JComboBox<String> boxTipoCurso;
    public javax.swing.JButton btnFiltrar;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JScrollPane jScrollTablaResumenCursos;
    private javax.swing.JLabel labelCicloEscolar;
    private javax.swing.JLabel labelPeriodo;
    private javax.swing.JLabel labelTipoCurso;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JMenuItem menuItemEncuestaEficacia;
    private javax.swing.JMenuItem menuItemEncuestaOpinion;
    private javax.swing.JMenuItem menuItemImprimirCedula;
    private javax.swing.JPopupMenu menuResumenCursos;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JPanel panelTabla;
    public javax.swing.JTable tblResumenCursos;
    // End of variables declaration//GEN-END:variables
}
