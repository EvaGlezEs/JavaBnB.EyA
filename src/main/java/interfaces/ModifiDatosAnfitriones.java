/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.DateFormatter;

import poo.javabnb.Clientes;
import poo.javabnb.Particular;
import poo.javabnb.Anfitrion;
import static poo.javabnb.Anfitrion.calificacion;
import poo.javabnb.UtilClientes;
import poo.javabnb.Usuarios;



/**
 * Interfaz para que los anfitriones puedan modificar sus datos 
 * @author Alejandro
 */
public class ModifiDatosAnfitriones extends javax.swing.JFrame {
    
    private static Anfitrion objanfi;
    
    
    /**
     * Creates new form DatosAnfitriones
     */
    public ModifiDatosAnfitriones() {
        initComponents();
    }

    
    
    /**
     *
     * @return
     */
    public String getJTextFieldDNI() {
        return jTextFieldDNI.getText();
    }

    /**
     *
     * @param txt
     */
    public void setJTextFieldDNI(String txt) {
        this.jTextFieldDNI.setText(txt);
    }

    /**
     *
     * @return
     */
    public String getJTextFieldNombre() {
        return jTextFieldNombre.getText();
    }

    /**
     *
     * @param txt
     */
    public void setJTextFieldNombre(String txt) {
        this.jTextFieldNombre.setText(txt);
    }
    
    /**
     *
     * @return
     */
    public String getJTextFieldCorreo() {
        return jTextFieldCorreo.getText();
    }

    /**
     *
     * @param txt
     */
    public void setJTextFieldCorreo(String txt) {
        this.jTextFieldCorreo.setText(txt);
    }

    /**
     *
     * @return
     */
    public String getjPasswordFieldClave() {
        return jPasswordFieldClave.getText();
    }

    /**
     *
     * @param txt
     */
    public void setJPasswordFieldClave(String txt) {
        this.jPasswordFieldClave.setText(txt);
    }

    /**
     *
     * @return
     */
    public long getjFormattedTextFieldTelefono() {
    try {
        return Long.parseLong(jFormattedTextFieldTelefono.getText());
    } catch (NumberFormatException e) {
        // Manejar el caso donde el texto no es un número válido
        // Por ejemplo, lanzar una excepción personalizada o devolver un valor predeterminado
        System.err.println("El texto ingresado no es un número válido: " + e.getMessage());
        return -1; // O cualquier valor que consideres adecuado como valor predeterminado
    }
}

    /**
     *
     * @param telefono
     */
    public void setjFormattedTextFieldTelefono(long telefono) {
    jFormattedTextFieldTelefono.setText(Long.toString(telefono));
}

    
    /**
     *
     * @return
     */
    public LocalDate getjFormattedTextFieldFechaCaducidad() {
        try {
        Date fecha = (Date) jFormattedTextFieldFechaRegistro.getValue();
         if (fecha == null) {
            JOptionPane.showMessageDialog(this, "Fecha no válida o no ingresada.", "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        Instant instant = fecha.toInstant();
        return instant.atZone(ZoneId.systemDefault()).toLocalDate();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error al obtener la fecha: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        return null;
    }
    }

    /**
     *
     * @param txt
     */
    public void setjFormattedTextFieldFechaCaducidad(String txt) {
        this.jFormattedTextFieldFechaRegistro.setText(txt);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButtonModificar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldDNI = new javax.swing.JTextField();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldCorreo = new javax.swing.JTextField();
        jPasswordFieldClave = new javax.swing.JPasswordField();
        jFormattedTextFieldFechaRegistro = new javax.swing.JFormattedTextField();
        jButtonVolver = new javax.swing.JButton();
        jFormattedTextFieldTelefono = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 220, 186));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Avenir", 2, 18)); // NOI18N
        jLabel1.setText("MODIFICACIÓN DATOS ANFITRIONES");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, -1, -1));

        jLabel2.setText("DNI");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 37, -1));

        jLabel3.setText("Nombre");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, -1, -1));

        jLabel4.setText("Correo");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, 60, 20));

        jLabel5.setText("Clave");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, 37, -1));

        jLabel6.setText("Teléfono");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, -1, -1));

        jLabel7.setText("Fecha de Registro");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, -1, -1));

        jButtonModificar.setText("Modificar");
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 360, 100, 30));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        jLabel10.setFont(new java.awt.Font("Avenir", 0, 12)); // NOI18N
        jLabel10.setText("En esta ventana, si lo desea puede modificar sus datos ");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, -1, -1));
        jPanel1.add(jTextFieldDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 210, 30));

        jTextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 210, 30));
        jPanel1.add(jTextFieldCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 200, 180, 30));
        jPanel1.add(jPasswordFieldClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, 190, 30));
        jPanel1.add(jFormattedTextFieldFechaRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 270, 30));

        jButtonVolver.setText("Volver");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 400, -1, -1));
        jPanel1.add(jFormattedTextFieldTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 220, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 741, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 451, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreActionPerformed

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
    try {
            String DNI = getJTextFieldDNI();
            String nombre = getJTextFieldNombre();
            long telefono = getjFormattedTextFieldTelefono();
            String correo = getJTextFieldCorreo();
            String clave = getjPasswordFieldClave();
            LocalDate fechaRegistro = getjFormattedTextFieldFechaRegistro();
            int calificacion = 0;
            if (DNI.isEmpty() || nombre.isEmpty() ||correo.isEmpty() || clave.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos obligatorios.", "Mensaje", JOptionPane.WARNING_MESSAGE);
                return;
            }
        



            //se inserta en el array
            if (UtilClientes.modificaAnfitriones(objanfi, DNI, nombre, telefono, correo, clave, fechaRegistro, calificacion)) {
                
            JOptionPane.showMessageDialog(this, "Cliente dado de alta.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Error al dar de alta.", "Mensaje", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Formato de número incorrecto en algún campo.", "Mensaje", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Excepción al dar de alta.", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonModificarActionPerformed

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
    OperacionesAnfitriones operacionesAnfitriones = new OperacionesAnfitriones();
    operacionesAnfitriones.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_jButtonVolverActionPerformed

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
            java.util.logging.Logger.getLogger(ModifiDatosAnfitriones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModifiDatosAnfitriones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModifiDatosAnfitriones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModifiDatosAnfitriones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModifiDatosAnfitriones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JFormattedTextField jFormattedTextFieldFechaRegistro;
    private javax.swing.JFormattedTextField jFormattedTextFieldTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordFieldClave;
    private javax.swing.JTextField jTextFieldCorreo;
    private javax.swing.JTextField jTextFieldDNI;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables

    private LocalDate getjFormattedTextFieldFechaRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
