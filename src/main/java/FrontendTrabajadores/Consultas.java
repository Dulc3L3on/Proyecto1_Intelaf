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
public class Consultas extends javax.swing.JFrame {

    /**
     * Creates new form Consultas
     */
    public Consultas() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbl_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(830, 877));
        setPreferredSize(new java.awt.Dimension(830, 877));
        setResizable(false);
        getContentPane().setLayout(null);
        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 220, 750, 530);

        jRadioButton1.setFont(new java.awt.Font("Sawasdee", 1, 20)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(186, 172, 172));
        jRadioButton1.setText("TIENDA");
        jRadioButton1.setContentAreaFilled(false);
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(40, 50, 92, 39);

        jRadioButton3.setFont(new java.awt.Font("Sawasdee", 1, 20)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(190, 186, 137));
        jRadioButton3.setText("TRABAJADORES");
        jRadioButton3.setContentAreaFilled(false);
        getContentPane().add(jRadioButton3);
        jRadioButton3.setBounds(610, 50, 190, 40);

        jRadioButton4.setFont(new java.awt.Font("Sawasdee", 1, 20)); // NOI18N
        jRadioButton4.setForeground(new java.awt.Color(184, 173, 165));
        jRadioButton4.setText("PRODUCTOS");
        jRadioButton4.setContentAreaFilled(false);
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton4);
        jRadioButton4.setBounds(200, 50, 160, 39);

        jRadioButton5.setFont(new java.awt.Font("Sawasdee", 1, 20)); // NOI18N
        jRadioButton5.setForeground(new java.awt.Color(199, 183, 151));
        jRadioButton5.setText("CLIENTES");
        jRadioButton5.setContentAreaFilled(false);
        getContentPane().add(jRadioButton5);
        jRadioButton5.setBounds(420, 50, 140, 39);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(630, 820, 160, 28);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(40, 820, 240, 28);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox3);
        jComboBox3.setBounds(340, 820, 220, 28);

        jCheckBox1.setFont(new java.awt.Font("Sawasdee", 1, 17)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(241, 237, 234));
        jCheckBox1.setText("ESTA TIENDA");
        jCheckBox1.setContentAreaFilled(false);
        getContentPane().add(jCheckBox1);
        jCheckBox1.setBounds(640, 120, 150, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inconoBuscar.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(290, 90, 70, 90);

        jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        getContentPane().add(jFormattedTextField1);
        jFormattedTextField1.setBounds(40, 120, 240, 28);

        jLabel1.setFont(new java.awt.Font("Sawasdee", 1, 17)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(182, 167, 167));
        jLabel1.setText("ORDENAR POR:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(340, 780, 140, 33);

        jLabel4.setFont(new java.awt.Font("Sawasdee", 1, 17)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(182, 167, 167));
        jLabel4.setText("FILTRAR POR:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 780, 140, 30);

        jLabel5.setFont(new java.awt.Font("Sawasdee", 1, 17)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(182, 167, 167));
        jLabel5.setText("DE MANERA:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(630, 780, 130, 30);

        jLabel6.setBackground(new java.awt.Color(179, 167, 156));
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 810, 830, 10);

        lbl_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ff82e720aeb98a8e3b84ea44133c5197.jpg"))); // NOI18N
        getContentPane().add(lbl_fondo);
        lbl_fondo.setBounds(0, 0, 830, 878);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_fondo;
    // End of variables declaration//GEN-END:variables
}
