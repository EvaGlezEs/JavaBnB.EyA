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
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
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
 * Interfaz para el registro de clientes, tanto de particulares como de anfitriones
 * 
 * @author eva
 */
public class RegistroCliParti extends javax.swing.JFrame {
    
    private static Particular objparti;
    
    
    /**
     * Creates new form RegistroAnfitrion
     */
    public RegistroCliParti() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        DateFormatter dateFormatter = new DateFormatter(dateFormat);
        jFormattedTextFieldFechaCaducidad = new JFormattedTextField(dateFormatter);
        jFormattedTextFieldFechaCaducidad.setValue(new Date()); // Inicializar con la fecha actual
        
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
        String text = jFormattedTextFieldFechaCaducidad.getText();
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // Asegúrate de que el patrón coincida con el formato del texto
            return LocalDate.parse(text, formatter);
        } catch (DateTimeParseException e) {
            // Manejo de excepción en caso de que el texto no sea una fecha válida
            e.printStackTrace();
            return null; // O lanza una excepción, o maneja el error de la manera que prefieras
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
        fechaCaducidad = new javax.swing.JLabel();
        jButtonRegistrar = new javax.swing.JButton();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldDNI = new javax.swing.JTextField();
        jTextFieldCorreo = new javax.swing.JTextField();
        jPasswordFieldClave = new javax.swing.JPasswordField();
        jButtonVolver = new javax.swing.JButton();
        nombreTitular = new javax.swing.JLabel();
        jTextFieldNombreTitular = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        numero = new javax.swing.JLabel();
        jTextFieldNumero = new javax.swing.JTextField();
        jFormattedTextFieldFechaCaducidad = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jFormattedTextFieldTelefono = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 219, 183));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Avenir", 2, 18)); // NOI18N
        jLabel1.setText("REGISTRO CLIENTE PARTICULAR");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Avenir", 0, 12)); // NOI18N
        jLabel2.setText("Nombre");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Avenir", 0, 12)); // NOI18N
        jLabel3.setText("DNI");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Avenir", 0, 12)); // NOI18N
        jLabel4.setText("Correo ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Avenir", 0, 12)); // NOI18N
        jLabel5.setText("Clave");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, -1, -1));

        jLabel6.setFont(new java.awt.Font("Avenir", 0, 12)); // NOI18N
        jLabel6.setText("Teléfono ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));

        fechaCaducidad.setFont(new java.awt.Font("Avenir", 0, 12)); // NOI18N
        fechaCaducidad.setText("Fecha de caducidad de la tarjeta ");
        jPanel1.add(fechaCaducidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, -1, -1));

        jButtonRegistrar.setFont(new java.awt.Font("Avenir", 0, 12)); // NOI18N
        jButtonRegistrar.setText("Registrar");
        jButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(617, 373, 90, 30));
        jPanel1.add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 210, 30));
        jPanel1.add(jTextFieldDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 210, 30));

        jTextFieldCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCorreoActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 220, 30));
        jPanel1.add(jPasswordFieldClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, 220, 30));

        jButtonVolver.setFont(new java.awt.Font("Avenir", 0, 12)); // NOI18N
        jButtonVolver.setText("Volver");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 420, -1, -1));

        nombreTitular.setFont(new java.awt.Font("Avenir", 0, 12)); // NOI18N
        nombreTitular.setText("Nombre del titular de la tarjeta");
        jPanel1.add(nombreTitular, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, -1, -1));
        jPanel1.add(jTextFieldNombreTitular, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, 210, 30));
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 60, 20));

        numero.setFont(new java.awt.Font("Avenir", 0, 12)); // NOI18N
        numero.setText("Número tarjeta");
        jPanel1.add(numero, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, -1, 20));
        jPanel1.add(jTextFieldNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, 260, 30));
        jPanel1.add(jFormattedTextFieldFechaCaducidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 410, 200, 30));

        jLabel7.setFont(new java.awt.Font("Avenir", 3, 14)); // NOI18N
        jLabel7.setText("Introduzca los datos de su tarjeta bancaria");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, -1, -1));
        jPanel1.add(jFormattedTextFieldTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 200, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        RegistrarseComo registrarseComo = new RegistrarseComo ();
        registrarseComo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonVolverActionPerformed

    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
        try {
            String DNI = getJTextFieldDNI();
            String nombre = getJTextFieldNombre();
            long telefono = getjFormattedTextFieldTelefono();
            String correo = getJTextFieldCorreo();
            String clave = getjPasswordFieldClave();
            String nombreTitular = getjTextFieldNombreTitular();
            String numero = getjTextFieldNumero();
            LocalDate fechaCaducidad = getjFormattedTextFieldFechaCaducidad();


            //Para validar los campos
            if (DNI.isEmpty() || nombre.isEmpty() ||correo.isEmpty() || clave.isEmpty() || nombreTitular.isEmpty() || numero.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos obligatorios.", "Mensaje", JOptionPane.WARNING_MESSAGE);
                return;
            }



            //se inserta en el array
            if (UtilClientes.altaParticular(objparti)) {
                JOptionPane.showMessageDialog(this, "Cliente dado de alta.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Error al dar de alta.", "Mensaje", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Formato de número incorrecto en algún campo.", "Mensaje", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Excepción al dar de alta.", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonRegistrarActionPerformed

    private void jTextFieldCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCorreoActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroCliParti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroCliParti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroCliParti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroCliParti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroCliParti().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fechaCaducidad;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JFormattedTextField jFormattedTextFieldFechaCaducidad;
    private javax.swing.JFormattedTextField jFormattedTextFieldTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordFieldClave;
    private javax.swing.JTextField jTextFieldCorreo;
    private javax.swing.JTextField jTextFieldDNI;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldNombreTitular;
    private javax.swing.JTextField jTextFieldNumero;
    private javax.swing.JLabel nombreTitular;
    private javax.swing.JLabel numero;
    // End of variables declaration//GEN-END:variables

   
}
