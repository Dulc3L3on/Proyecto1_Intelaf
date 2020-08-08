/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrontendTrabajadores;

/**
 *
 * @author phily
 */
public class NuevoUsuario extends javax.swing.JFrame {

    /**
     * Creates new form NuevoCliente
     */
    public NuevoUsuario() {
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

        lbl_tituloOperacion = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtF_Nombre = new javax.swing.JTextField();
        txtF_DPI = new javax.swing.JTextField();
        txtF_Telefono = new javax.swing.JTextField();
        FtxtF_Correo = new javax.swing.JFormattedTextField();
        txtF_Direccion = new javax.swing.JTextField();
        lbl_NIT = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lbl_Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(626, 626));
        setMinimumSize(new java.awt.Dimension(626, 626));
        setPreferredSize(new java.awt.Dimension(626, 626));
        setResizable(false);
        getContentPane().setLayout(null);

        lbl_tituloOperacion.setBackground(new java.awt.Color(124, 112, 99));
        lbl_tituloOperacion.setFont(new java.awt.Font("Sawasdee", 1, 27)); // NOI18N
        lbl_tituloOperacion.setForeground(new java.awt.Color(240, 224, 224));
        lbl_tituloOperacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_tituloOperacion.setText("NUEVO CLIENTE");
        lbl_tituloOperacion.setOpaque(true);
        getContentPane().add(lbl_tituloOperacion);
        lbl_tituloOperacion.setBounds(0, 30, 580, 30);

        jLabel1.setFont(new java.awt.Font("Sawasdee", 1, 20)); // NOI18N
        jLabel1.setText("NIT:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(90, 160, 50, 35);

        jLabel3.setFont(new java.awt.Font("Sawasdee", 1, 20)); // NOI18N
        jLabel3.setText("NOMBRE:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(90, 120, 120, 35);

        jLabel4.setFont(new java.awt.Font("Sawasdee", 1, 20)); // NOI18N
        jLabel4.setText("DPI:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(90, 200, 50, 35);

        jLabel5.setFont(new java.awt.Font("Sawasdee", 1, 20)); // NOI18N
        jLabel5.setText("No. TELÉFONO:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(90, 240, 170, 30);

        jLabel6.setFont(new java.awt.Font("Sawasdee", 1, 20)); // NOI18N
        jLabel6.setText("CORREO:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(90, 280, 91, 35);

        jLabel7.setFont(new java.awt.Font("Sawasdee", 1, 20)); // NOI18N
        jLabel7.setText("DIRECCIÓN:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(90, 320, 140, 35);
        getContentPane().add(txtF_Nombre);
        txtF_Nombre.setBounds(200, 120, 190, 28);
        getContentPane().add(txtF_DPI);
        txtF_DPI.setBounds(140, 200, 150, 28);
        getContentPane().add(txtF_Telefono);
        txtF_Telefono.setBounds(260, 240, 130, 28);
        getContentPane().add(FtxtF_Correo);
        FtxtF_Correo.setBounds(200, 280, 190, 28);
        getContentPane().add(txtF_Direccion);
        txtF_Direccion.setBounds(220, 320, 170, 28);

        lbl_NIT.setBackground(new java.awt.Color(224, 215, 205));
        lbl_NIT.setOpaque(true);
        getContentPane().add(lbl_NIT);
        lbl_NIT.setBounds(140, 160, 150, 30);

        jButton1.setFont(new java.awt.Font("Sawasdee", 1, 19)); // NOI18N
        jButton1.setText("AGREGAR");
        getContentPane().add(jButton1);
        jButton1.setBounds(420, 380, 130, 50);

        lbl_Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sencillo-fondo-poligonal-amarillo_1057-2586.jpg"))); // NOI18N
        getContentPane().add(lbl_Fondo);
        lbl_Fondo.setBounds(0, 0, 580, 460);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void establecerTituloCorrecto(String tituloOperacion){
        lbl_tituloOperacion.setText(tituloOperacion);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField FtxtF_Correo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lbl_Fondo;
    private javax.swing.JLabel lbl_NIT;
    private javax.swing.JLabel lbl_tituloOperacion;
    private javax.swing.JTextField txtF_DPI;
    private javax.swing.JTextField txtF_Direccion;
    private javax.swing.JTextField txtF_Nombre;
    private javax.swing.JTextField txtF_Telefono;
    // End of variables declaration//GEN-END:variables
}
