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
public class PasoFinal extends javax.swing.JDialog {

    /**
     * Creates new form PasoFinal
     */
    public PasoFinal(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        lbl_Fondo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtF_NIT = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        FtxtF_descuento = new javax.swing.JFormattedTextField();
        lbl_credito = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lbl_subtotal = new javax.swing.JLabel();
        spn_anticipo = new javax.swing.JSpinner();
        lbl_total = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lbl_Fondo1 = new javax.swing.JLabel();

        lbl_Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondo-blanco-abstracto-con-las-ondas-y-sombras-117841640.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(514, 630));
        setMinimumSize(new java.awt.Dimension(514, 630));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(248, 247, 246));
        jLabel1.setFont(new java.awt.Font("Sawasdee", 1, 27)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DATOS del CLIENTE");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-1, 10, 490, 40);

        jLabel2.setFont(new java.awt.Font("Sawasdee", 1, 20)); // NOI18N
        jLabel2.setText("NIT:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 90, 49, 18);

        jLabel3.setFont(new java.awt.Font("Sawasdee", 1, 20)); // NOI18N
        jLabel3.setText("NOMBRE:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 140, 100, 35);
        getContentPane().add(txtF_NIT);
        txtF_NIT.setBounds(90, 90, 210, 28);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(140, 140, 250, 28);

        jLabel4.setFont(new java.awt.Font("Sawasdee", 1, 20)); // NOI18N
        jLabel4.setText("DIRECCIÓN:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 200, 120, 35);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(170, 200, 220, 28);

        jLabel5.setFont(new java.awt.Font("Sawasdee", 1, 20)); // NOI18N
        jLabel5.setText("CRÉDITO:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(260, 310, 90, 30);

        FtxtF_descuento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        getContentPane().add(FtxtF_descuento);
        FtxtF_descuento.setBounds(360, 460, 110, 28);

        lbl_credito.setOpaque(true);
        getContentPane().add(lbl_credito);
        lbl_credito.setBounds(360, 310, 110, 30);

        jLabel7.setFont(new java.awt.Font("Sawasdee", 1, 20)); // NOI18N
        jLabel7.setText("Sub Total:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(190, 410, 120, 35);

        jLabel8.setFont(new java.awt.Font("Sawasdee", 1, 20)); // NOI18N
        jLabel8.setText("ANTICIPO:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(190, 370, 120, 35);

        jLabel9.setFont(new java.awt.Font("Sawasdee", 1, 20)); // NOI18N
        jLabel9.setText("DESCUENTO:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(190, 460, 130, 35);

        jLabel10.setFont(new java.awt.Font("Sawasdee", 1, 20)); // NOI18N
        jLabel10.setText("TOTAL:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(190, 540, 120, 18);

        lbl_subtotal.setOpaque(true);
        getContentPane().add(lbl_subtotal);
        lbl_subtotal.setBounds(360, 410, 110, 30);
        getContentPane().add(spn_anticipo);
        spn_anticipo.setBounds(360, 370, 110, 28);

        lbl_total.setOpaque(true);
        getContentPane().add(lbl_total);
        lbl_total.setBounds(330, 530, 140, 30);

        jLabel6.setText("-----------------------");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(330, 500, 140, 18);

        jLabel11.setText("-----------------------");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(330, 580, 140, 18);

        jLabel12.setText("-----------------------");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(330, 590, 140, 18);

        lbl_Fondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondo-blanco-abstracto-con-las-ondas-y-sombras-117841640.jpg"))); // NOI18N
        getContentPane().add(lbl_Fondo1);
        lbl_Fondo1.setBounds(0, 0, 490, 630);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField FtxtF_descuento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lbl_Fondo;
    private javax.swing.JLabel lbl_Fondo1;
    private javax.swing.JLabel lbl_credito;
    private javax.swing.JLabel lbl_subtotal;
    private javax.swing.JLabel lbl_total;
    private javax.swing.JSpinner spn_anticipo;
    private javax.swing.JTextField txtF_NIT;
    // End of variables declaration//GEN-END:variables
}
