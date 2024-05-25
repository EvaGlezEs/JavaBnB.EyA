/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

/**
 *
 * @author Alejandro
 */
public class IniciarSesionCliParti extends javax.swing.JFrame {

    /**
     * Creates new form IniciarSesionCliParti
     */
    public IniciarSesionCliParti() {
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
        jTextFieldCorreo = new javax.swing.JTextField();
        jTextFieldClave = new javax.swing.JTextField();
        jButtonIniciarSesion = new javax.swing.JButton();
        jButtonVolver = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 220, 186));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Avenir", 2, 14)); // NOI18N
        jLabel1.setText("INICIO DE SESIÓN DE CLIENTE PARTICULAR");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Avenir", 0, 14)); // NOI18N
        jLabel2.setText("Correo");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Avenir", 0, 14)); // NOI18N
        jLabel3.setText("Clave");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));
        jPanel1.add(jTextFieldCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 190, 20));

        jTextFieldClave.setText(" ");
        jPanel1.add(jTextFieldClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 190, 20));

        jButtonIniciarSesion.setFont(new java.awt.Font("Avenir", 0, 12)); // NOI18N
        jButtonIniciarSesion.setText("Iniciar sesión");
        jPanel1.add(jButtonIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jButtonVolver.setFont(new java.awt.Font("Avenir", 0, 12)); // NOI18N
        jButtonVolver.setText("Volver");
        jPanel1.add(jButtonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 80, -1));

        jButtonCancelar.setFont(new java.awt.Font("Avenir", 0, 12)); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jPanel1.add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

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
            java.util.logging.Logger.getLogger(IniciarSesionCliParti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IniciarSesionCliParti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IniciarSesionCliParti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IniciarSesionCliParti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IniciarSesionCliParti().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonIniciarSesion;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldClave;
    private javax.swing.JTextField jTextFieldCorreo;
    // End of variables declaration//GEN-END:variables
}
