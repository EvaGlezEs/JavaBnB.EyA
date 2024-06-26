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
import poo.javabnb.UtilClientes;
import poo.javabnb.Usuarios;


/**
 * interfaz para modificar los datos si lso clientes desean cambiar sus datos personales, u añadir otros como es el caso de ser VIP o Superanfitrión
 * @author eva
 */
public class ModificacionCliParti extends javax.swing.JFrame {
    private static Particular objparti;
   
    
    /**
     * Creates new form ModificacionDatos
     */
    public ModificacionCliParti() {
        initComponents();
    }
    
    //metodos para devolver y mostrar el contenido de los campos del registro

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
    public String getjTextFieldNombreTitular() {
        return jTextFieldNombreTitular.getText();
    }

    /**
     *
     * @param txt
     */
    public void setjTextFieldNombreTitular(String txt) {
        this.jTextFieldNombreTitular.setText(txt);
    }
    
    /**
     *
     * @return
     */
    public String getjTextFieldNumero() {
        return jTextFieldNumero.getText();
    }

    /**
     *
     * @param txt
     */
    public void setjTextFieldNumero(String txt) {
        this.jTextFieldNumero.setText(txt);
    }
    
    /**
     *
     * @return
     */
    public LocalDate getjFormattedTextFieldFechaCaducidad() {
        try {
        Date fecha = (Date) jFormattedTextFieldFechaCaducidad.getValue();
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
        this.jFormattedTextFieldFechaCaducidad.setText(txt);
    }
    
    /**
     *
     * @return
     */
    public Boolean getjCheckBoxVip() {
    return jCheckBoxVip.isSelected();
}

    /**
     *
     * @param isVip
     */
    public void setjCheckBoxVip(Boolean isVip) {
    jCheckBoxVip.setSelected(isVip);
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
        nombreTitular = new javax.swing.JLabel();
        numero = new javax.swing.JLabel();
        jbuttonModificar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldDNI = new javax.swing.JTextField();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldCorreo = new javax.swing.JTextField();
        jPasswordFieldClave = new javax.swing.JPasswordField();
        jTextFieldNombreTitular = new javax.swing.JTextField();
        jTextFieldNumero = new javax.swing.JTextField();
        fechaCaducidad = new javax.swing.JLabel();
        jFormattedTextFieldTelefono = new javax.swing.JFormattedTextField();
        jFormattedTextFieldFechaCaducidad = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        jCheckBoxVip = new javax.swing.JCheckBox();
        jButtonVolver = new javax.swing.JButton();

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
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, -1, -1));

        nombreTitular.setText("Nombre del Titular");
        jPanel1.add(nombreTitular, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, -1, -1));

        numero.setText("Número");
        jPanel1.add(numero, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 420, -1, -1));

        jbuttonModificar.setText("Modificar");
        jbuttonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuttonModificarActionPerformed(evt);
            }
        });
        jPanel1.add(jbuttonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 420, 100, 30));

        jLabel12.setFont(new java.awt.Font("Avenir", 0, 12)); // NOI18N
        jLabel12.setText("En esta ventana, si lo desea puede modificar sus datos ");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, -1, -1));

        jTextFieldDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDNIActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 230, 20));

        jTextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 230, 20));

        jTextFieldCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCorreoActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, 210, 20));
        jPanel1.add(jPasswordFieldClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 190, 210, -1));

        jTextFieldNombreTitular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreTitularActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldNombreTitular, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, 190, 20));

        jTextFieldNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumeroActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 420, 190, 20));

        fechaCaducidad.setText("Fecha caducidad ");
        jPanel1.add(fechaCaducidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, 110, 20));
        jPanel1.add(jFormattedTextFieldTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 230, 20));
        jPanel1.add(jFormattedTextFieldFechaCaducidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, 190, -1));

        jLabel8.setText("¿Es usted un cliente VIP?");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 460, -1, -1));

        jCheckBoxVip.setText("VIP");
        jPanel1.add(jCheckBoxVip, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 460, -1, -1));

        jButtonVolver.setText("Volver");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 460, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbuttonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuttonModificarActionPerformed
     try {
            String DNI = getJTextFieldDNI();
            String nombre = getJTextFieldNombre();
            long telefono = getjFormattedTextFieldTelefono();
            String correo = getJTextFieldCorreo();
            String clave = getjPasswordFieldClave();
            String nombreTitular = getjTextFieldNombreTitular();
            String numero = getjTextFieldNumero();
            LocalDate fechaCaducidad = getjFormattedTextFieldFechaCaducidad();
            Boolean VIP = getjCheckBoxVip();


            //Para validar los campos
            if (DNI.isEmpty() || nombre.isEmpty() ||correo.isEmpty() || clave.isEmpty() || nombreTitular.isEmpty() || numero.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos obligatorios.", "Mensaje", JOptionPane.WARNING_MESSAGE);
                return;
            }



            //se inserta en el array
            if (UtilClientes.modificaParticular(objparti, DNI, nombre, telefono, correo, clave, nombreTitular, numero, fechaCaducidad, VIP)) {
                
            JOptionPane.showMessageDialog(this, "Cliente dado de alta.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Error al dar de alta.", "Mensaje", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Formato de número incorrecto en algún campo.", "Mensaje", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Excepción al dar de alta.", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }

      
    }//GEN-LAST:event_jbuttonModificarActionPerformed

    /**
     *
     * @param cli
     * @param jTextFieldDNI
     * @param jTextFieldNombre
     * @param jTextFieldTelefono
     * @param jTextFieldCorreo
     * @param jPasswordFieldClave
     * @param jSpinnerVar1
     * @param jTextFieldVar2
     * @param jTextFieldVar3
     * @param jRadioButtonVar4
     * @param jComboBoxVar5
     */
    
    

    private void jTextFieldDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDNIActionPerformed

    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreActionPerformed

    private void jTextFieldCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCorreoActionPerformed

    private void jTextFieldNombreTitularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreTitularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreTitularActionPerformed

    private void jTextFieldNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNumeroActionPerformed

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
    OperacionesCliParti  operacionesCliParti= new OperacionesCliParti();
       operacionesCliParti.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButtonVolverActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        ArrayList<Clientes> clientes = new ArrayList<>();
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
            java.util.logging.Logger.getLogger(ModificacionCliParti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificacionCliParti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificacionCliParti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificacionCliParti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificacionCliParti().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fechaCaducidad;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JCheckBox jCheckBoxVip;
    private javax.swing.JFormattedTextField jFormattedTextFieldFechaCaducidad;
    private javax.swing.JFormattedTextField jFormattedTextFieldTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordFieldClave;
    private javax.swing.JTextField jTextFieldCorreo;
    private javax.swing.JTextField jTextFieldDNI;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldNombreTitular;
    private javax.swing.JTextField jTextFieldNumero;
    private javax.swing.JButton jbuttonModificar;
    private javax.swing.JLabel nombreTitular;
    private javax.swing.JLabel numero;
    // End of variables declaration//GEN-END:variables
}
