/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

/**
 *
 * @author Alejandro
 */
public class ModifiDatosCliParti extends javax.swing.JFrame {

    /**
     * Creates new form DatosCliParti2
     */
    public ModifiDatosCliParti() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jbuttonModificar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jRadioButtonModVIP = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldModDNI = new javax.swing.JTextField();
        jTextFieldModNombre = new javax.swing.JTextField();
        jTextFieldModTelefono = new javax.swing.JTextField();
        jTextFieldModCorreo = new javax.swing.JTextField();
        jPasswordFieldModClave = new javax.swing.JPasswordField();
        jTextFieldModNombreTarjeta = new javax.swing.JTextField();
        jFormattedTextFieldFechaCaducidadTarjeta = new javax.swing.JFormattedTextField();
        jTextFieldNumeroTarjeta = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 220, 186));
        jPanel1.setForeground(new java.awt.Color(255, 214, 173));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Avenir", 2, 18)); // NOI18N
        jLabel1.setText("MODIFICACIÓN DATOS CLIENTES PARTICULARES");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        jLabel2.setText("DNI");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 37, -1));

        jLabel3.setText("Nombre");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));

        jLabel4.setText("Correo");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, 74, -1));

        jLabel5.setText("Clave");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, 37, -1));

        jLabel6.setText("Teléfono");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Tarjeta de Crédito");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, -1, -1));

        jLabel8.setText("Nombre del Titular");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, -1, -1));

        jLabel9.setText("Fecha de Caducidad");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, -1, -1));

        jLabel10.setText("Número");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, -1, -1));

        jbuttonModificar.setText("Modificar");
        jPanel1.add(jbuttonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(694, 473, 100, 30));

        jLabel11.setText("¿Es usted un cliente VIP?");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 460, 160, -1));

        jRadioButtonModVIP.setText("Si, soy un cliente VIP");
        jRadioButtonModVIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonModVIPActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButtonModVIP, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 450, 150, 30));

        jLabel12.setFont(new java.awt.Font("Avenir", 0, 12)); // NOI18N
        jLabel12.setText("En esta ventana, si lo desea puede modificar sus datos ");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, -1, -1));
        jPanel1.add(jTextFieldModDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 230, 20));

        jTextFieldModNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldModNombreActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldModNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 230, 20));

        jTextFieldModTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldModTelefonoActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldModTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 230, 20));

        jTextFieldModCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldModCorreoActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldModCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, 210, 20));
        jPanel1.add(jPasswordFieldModClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 190, 210, -1));
        jPanel1.add(jTextFieldModNombreTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 370, 190, 20));
        jPanel1.add(jFormattedTextFieldFechaCaducidadTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, 190, 20));

        jTextFieldNumeroTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumeroTarjetaActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldNumeroTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 400, 190, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 836, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonModVIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonModVIPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonModVIPActionPerformed

    private void jTextFieldModNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldModNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldModNombreActionPerformed

    private void jTextFieldModCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldModCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldModCorreoActionPerformed

    private void jTextFieldModTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldModTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldModTelefonoActionPerformed

    private void jTextFieldNumeroTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumeroTarjetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNumeroTarjetaActionPerformed

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
            java.util.logging.Logger.getLogger(ModifiDatosCliParti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModifiDatosCliParti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModifiDatosCliParti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModifiDatosCliParti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModifiDatosCliParti().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField jFormattedTextFieldFechaCaducidadTarjeta;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordFieldModClave;
    private javax.swing.JRadioButton jRadioButtonModVIP;
    private javax.swing.JTextField jTextFieldModCorreo;
    private javax.swing.JTextField jTextFieldModDNI;
    private javax.swing.JTextField jTextFieldModNombre;
    private javax.swing.JTextField jTextFieldModNombreTarjeta;
    private javax.swing.JTextField jTextFieldModTelefono;
    private javax.swing.JTextField jTextFieldNumeroTarjeta;
    private javax.swing.JButton jbuttonModificar;
    // End of variables declaration//GEN-END:variables
}
