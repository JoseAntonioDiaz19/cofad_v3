/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.perfil;

/**
 *
 * @author manue
 */
public class Perfil extends javax.swing.JPanel {

    /**
     * Creates new form Perfil
     */
    public Perfil() {
        initComponents();
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

        panelPrincipal = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        panelDatosGenerales = new javax.swing.JPanel();
        labelNombre = new javax.swing.JLabel();
        labelRFC = new javax.swing.JLabel();
        labelPlantel = new javax.swing.JLabel();
        labelCarrera = new javax.swing.JLabel();
        labelCargo = new javax.swing.JLabel();
        labelPuesto = new javax.swing.JLabel();
        panelEditarDatos = new javax.swing.JPanel();
        botonDatosPersonales = new javax.swing.JButton();
        botonExperienciaLaboral = new javax.swing.JButton();
        botonProductos = new javax.swing.JButton();
        botonHistorialMaterias = new javax.swing.JButton();
        botonDatosLaborales = new javax.swing.JButton();
        botonFormacionAcademica = new javax.swing.JButton();
        botonCambiarContraseña = new javax.swing.JButton();
        botonResumenCursos = new javax.swing.JButton();

        setLayout(new java.awt.GridLayout(1, 0, 10, 10));

        panelPrincipal.setBackground(new java.awt.Color(0, 78, 97));
        panelPrincipal.setLayout(new java.awt.GridBagLayout());

        labelTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("Perfil");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelPrincipal.add(labelTitulo, gridBagConstraints);

        panelDatosGenerales.setBackground(new java.awt.Color(56, 155, 148));
        panelDatosGenerales.setLayout(new java.awt.GridBagLayout());

        labelNombre.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        labelNombre.setForeground(new java.awt.Color(255, 255, 255));
        labelNombre.setText("Nombre");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 0);
        panelDatosGenerales.add(labelNombre, gridBagConstraints);

        labelRFC.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        labelRFC.setForeground(new java.awt.Color(255, 255, 255));
        labelRFC.setText("RFC");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 0);
        panelDatosGenerales.add(labelRFC, gridBagConstraints);

        labelPlantel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        labelPlantel.setForeground(new java.awt.Color(255, 255, 255));
        labelPlantel.setText("Plantel");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 0);
        panelDatosGenerales.add(labelPlantel, gridBagConstraints);

        labelCarrera.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        labelCarrera.setForeground(new java.awt.Color(255, 255, 255));
        labelCarrera.setText("Carrera");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 0);
        panelDatosGenerales.add(labelCarrera, gridBagConstraints);

        labelCargo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        labelCargo.setForeground(new java.awt.Color(255, 255, 255));
        labelCargo.setText("Cargo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 0);
        panelDatosGenerales.add(labelCargo, gridBagConstraints);

        labelPuesto.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        labelPuesto.setForeground(new java.awt.Color(255, 255, 255));
        labelPuesto.setText("Puesto");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 0);
        panelDatosGenerales.add(labelPuesto, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        panelPrincipal.add(panelDatosGenerales, gridBagConstraints);

        panelEditarDatos.setBackground(new java.awt.Color(0, 78, 97));
        panelEditarDatos.setLayout(new java.awt.GridBagLayout());

        botonDatosPersonales.setBackground(new java.awt.Color(204, 119, 34));
        botonDatosPersonales.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        botonDatosPersonales.setForeground(new java.awt.Color(255, 255, 255));
        botonDatosPersonales.setText("Datos personales");
        botonDatosPersonales.setBorderPainted(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        panelEditarDatos.add(botonDatosPersonales, gridBagConstraints);

        botonExperienciaLaboral.setBackground(new java.awt.Color(0, 112, 140));
        botonExperienciaLaboral.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        botonExperienciaLaboral.setForeground(new java.awt.Color(255, 255, 255));
        botonExperienciaLaboral.setText("Experiencia laboral");
        botonExperienciaLaboral.setBorder(null);
        botonExperienciaLaboral.setBorderPainted(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        panelEditarDatos.add(botonExperienciaLaboral, gridBagConstraints);

        botonProductos.setBackground(new java.awt.Color(0, 102, 51));
        botonProductos.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        botonProductos.setForeground(new java.awt.Color(255, 255, 255));
        botonProductos.setText("Productos");
        botonProductos.setBorderPainted(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        panelEditarDatos.add(botonProductos, gridBagConstraints);

        botonHistorialMaterias.setBackground(new java.awt.Color(255, 86, 130));
        botonHistorialMaterias.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        botonHistorialMaterias.setForeground(new java.awt.Color(255, 255, 255));
        botonHistorialMaterias.setText("Historial de materias");
        botonHistorialMaterias.setBorderPainted(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        panelEditarDatos.add(botonHistorialMaterias, gridBagConstraints);

        botonDatosLaborales.setBackground(new java.awt.Color(255, 153, 0));
        botonDatosLaborales.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        botonDatosLaborales.setForeground(new java.awt.Color(255, 255, 255));
        botonDatosLaborales.setText("Datos laborales");
        botonDatosLaborales.setBorderPainted(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 10, 0);
        panelEditarDatos.add(botonDatosLaborales, gridBagConstraints);

        botonFormacionAcademica.setBackground(new java.awt.Color(153, 0, 51));
        botonFormacionAcademica.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        botonFormacionAcademica.setForeground(new java.awt.Color(255, 255, 255));
        botonFormacionAcademica.setText("Formación académica");
        botonFormacionAcademica.setBorderPainted(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 10, 0);
        panelEditarDatos.add(botonFormacionAcademica, gridBagConstraints);

        botonCambiarContraseña.setBackground(new java.awt.Color(0, 25, 61));
        botonCambiarContraseña.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        botonCambiarContraseña.setForeground(new java.awt.Color(255, 255, 255));
        botonCambiarContraseña.setText("Cambiar contraseña");
        botonCambiarContraseña.setBorderPainted(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 10, 0);
        panelEditarDatos.add(botonCambiarContraseña, gridBagConstraints);

        botonResumenCursos.setBackground(new java.awt.Color(0, 204, 102));
        botonResumenCursos.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        botonResumenCursos.setForeground(new java.awt.Color(255, 255, 255));
        botonResumenCursos.setText("Resumen de cursos");
        botonResumenCursos.setBorderPainted(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 10, 0);
        panelEditarDatos.add(botonResumenCursos, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelPrincipal.add(panelEditarDatos, gridBagConstraints);

        add(panelPrincipal);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton botonCambiarContraseña;
    public javax.swing.JButton botonDatosLaborales;
    public javax.swing.JButton botonDatosPersonales;
    public javax.swing.JButton botonExperienciaLaboral;
    public javax.swing.JButton botonFormacionAcademica;
    public javax.swing.JButton botonHistorialMaterias;
    public javax.swing.JButton botonProductos;
    public javax.swing.JButton botonResumenCursos;
    public javax.swing.JLabel labelCargo;
    public javax.swing.JLabel labelCarrera;
    public javax.swing.JLabel labelNombre;
    public javax.swing.JLabel labelPlantel;
    public javax.swing.JLabel labelPuesto;
    public javax.swing.JLabel labelRFC;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel panelDatosGenerales;
    private javax.swing.JPanel panelEditarDatos;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
