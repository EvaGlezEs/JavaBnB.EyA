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
import java.util.Date;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.text.DateFormatter;

import poo.javabnb.Clientes;
import poo.javabnb.Particular;
import poo.javabnb.Anfitrion;
import poo.javabnb.UtilClientes;

/**
 * Interfaz para el registro de clientes, tanto de particulares como de anfitriones
 * 
 * @author eva
 */
public class RegistroCliParti extends javax.swing.JFrame {
    private Clientes cli = null;
    
    
    /**
     * Creates new form RegistroAnfitrion
     */
    public RegistroCliParti() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        DateFormatter dateFormatter = new DateFormatter(dateFormat);
        jFormattedTextFieldVar1 = new JFormattedTextField(dateFormatter);
        jFormattedTextFieldVar1.setValue(new Date()); // Inicializar con la fecha actual
        
        initComponents();
        jComboBoxTipo.setSelectedIndex(0);
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
    public String getJTextFieldTelefono() {
        return jTextFieldTelefono.getText();
    }

    /**
     *
     * @param txt
     */
    public void setJTextFieldTelefono(String txt) {
        this.jTextFieldTelefono.setText(txt);
    }

    /**
     *
     * @return
     */
    public LocalDate getjFormattedTextFieldVar1() {
    try {
        Date fecha = (Date) jFormattedTextFieldVar1.getValue();
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
     * @param d
     */
    public void setjFormattedTextFieldVar1(Date d) {
        this.jFormattedTextFieldVar1.setValue(d);
    }
    
    /**
     *
     * @return
     */
    public String getJTextFieldVar2() {
        return jTextFieldVar2.getText();
    }

    /**
     *
     * @param txt
     */
    public void setJTextFieldVar2(String txt) {
        this.jTextFieldVar2.setText(txt);
    }
   
    /**
     *
     * @return
     */
    public String getJTextFieldVar3() {
        return jTextFieldVar3.getText();
    }

    /**
     *
     * @param txt
     */
    public void setJTextFieldVar3(String txt) {
        this.jTextFieldVar3.setText(txt);
    }
  
    /**
     *
     * @return
     */
    public Boolean getjRadioButtonVar4() {
        return jRadioButtonVar4.isSelected();
    }

    /**
     *
     * @param t
     */
    public void setjRadioButtonVar4(Boolean t) {
        this.jRadioButtonVar4.setSelected(t);
    }
    
    /**
     *
     * @return
     */
    public int getjComboBoxVar5() {
    // Convierte el texto de jComboBoxVar5 a un int
    return Integer.parseInt(jComboBoxVar5.getSelectedItem().toString());
    }

    /**
     *
     * @param num
     */
    public void setjComboBoxVar5(int num) {
    // Convierte el número a texto y lo establece en jComboBoxVar5
    this.jComboBoxVar5.setSelectedItem(String.valueOf(num));
    }
    
    
    
    //metodos para cambiar las etiquetas variables

    /**
     *
     * @param txt
     */
    public void setEtiVar1(String txt) {
        this.etiVar1.setText(txt);
    }

    /**
     *
     * @param txt
     */
    public void setEtiVar2(String txt) {
        this.etiVar2.setText(txt);
    } 
    
    /**
     *
     * @param txt
     */
    public void setEtiVar3(String txt) {
        this.etiVar3.setText(txt);
    } 
    
    /**
     *
     * @param txt
     */
    public void setEtiVar4(String txt) {
        this.etiVar4.setText(txt);
    } 
    
    /**
     *
     * @param txt
     */
    public void setEtiVar5(String txt) {
        this.etiVar5.setText(txt);
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
        etiVar1 = new javax.swing.JLabel();
        jButtonRegistrar = new javax.swing.JButton();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldDNI = new javax.swing.JTextField();
        jTextFieldTelefono = new javax.swing.JTextField();
        jTextFieldCorreo = new javax.swing.JTextField();
        jPasswordFieldClave = new javax.swing.JPasswordField();
        jButtonVolver = new javax.swing.JButton();
        jComboBoxTipo = new javax.swing.JComboBox<>();
        etiVar2 = new javax.swing.JLabel();
        jTextFieldVar2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        etiVar3 = new javax.swing.JLabel();
        jTextFieldVar3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        etiVar4 = new javax.swing.JLabel();
        etiVar5 = new javax.swing.JLabel();
        jRadioButtonVar4 = new javax.swing.JRadioButton();
        jComboBoxVar5 = new javax.swing.JComboBox<>();
        jFormattedTextFieldVar1 = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 219, 183));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Avenir", 2, 18)); // NOI18N
        jLabel1.setText("REGISTRO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Avenir", 0, 12)); // NOI18N
        jLabel2.setText("Nombre");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Avenir", 0, 12)); // NOI18N
        jLabel3.setText("DNI");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        jLabel4.setFont(new java.awt.Font("Avenir", 0, 12)); // NOI18N
        jLabel4.setText("Correo ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Avenir", 0, 12)); // NOI18N
        jLabel5.setText("Clave");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, -1, -1));

        jLabel6.setFont(new java.awt.Font("Avenir", 0, 12)); // NOI18N
        jLabel6.setText("Teléfono ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        etiVar1.setFont(new java.awt.Font("Avenir", 0, 12)); // NOI18N
        etiVar1.setText("Fecha de hoy (día en el que se está usted registrando)");
        jPanel1.add(etiVar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, -1));

        jButtonRegistrar.setFont(new java.awt.Font("Avenir", 0, 12)); // NOI18N
        jButtonRegistrar.setText("Registrar");
        jButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 420, -1, -1));
        jPanel1.add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 160, 20));
        jPanel1.add(jTextFieldDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 160, 20));
        jPanel1.add(jTextFieldTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 150, 20));
        jPanel1.add(jTextFieldCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 180, 20));
        jPanel1.add(jPasswordFieldClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, 180, 20));

        jButtonVolver.setFont(new java.awt.Font("Avenir", 0, 12)); // NOI18N
        jButtonVolver.setText("Volver");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 420, -1, -1));

        jComboBoxTipo.setFont(new java.awt.Font("Avenir", 0, 12)); // NOI18N
        jComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cliente particular", "Anfitrión" }));
        jComboBoxTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBoxTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, -1, -1));

        etiVar2.setFont(new java.awt.Font("Avenir", 0, 12)); // NOI18N
        etiVar2.setText("Nombre del titular de la tarjeta");
        jPanel1.add(etiVar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, -1, -1));
        jPanel1.add(jTextFieldVar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 150, 20));
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 60, 20));

        etiVar3.setFont(new java.awt.Font("Avenir", 0, 12)); // NOI18N
        etiVar3.setText("Número tarjeta");
        jPanel1.add(etiVar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, -1, 20));
        jPanel1.add(jTextFieldVar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 170, 20));

        jLabel7.setFont(new java.awt.Font("Avenir", 0, 12)); // NOI18N
        jLabel7.setText("Selecione como desea registrarse");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, -1, -1));

        etiVar4.setText("jLabel8");
        jPanel1.add(etiVar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 410, -1, 30));

        etiVar5.setText("jLabel9");
        jPanel1.add(etiVar5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 390, -1, -1));
        jPanel1.add(jRadioButtonVar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, -1, -1));

        jPanel1.add(jComboBoxVar5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, -1, -1));
        jPanel1.add(jFormattedTextFieldVar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 120, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
     try {
        String DNI = getJTextFieldDNI();
        String nombre = getJTextFieldNombre();
        String correo = getJTextFieldCorreo();
        String clave = getjPasswordFieldClave();
        String telefono = getJTextFieldTelefono();
        LocalDate var1 = getjFormattedTextFieldVar1();
        
        // Validar fecha
        if (var1 == null) {
            return; // Ya se mostró el mensaje de error dentro del método getjFormattedTextFieldVar1
        }
        
        String var2 = getJTextFieldVar2();
        String var3 = getJTextFieldVar3();
        Boolean var4 = getjRadioButtonVar4();
        int var5 = getjComboBoxVar5();
        
        //Para validar los campos 
        if (DNI.isEmpty() || nombre.isEmpty() || correo.isEmpty() || clave.isEmpty() || telefono.isEmpty() || var1 == null) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos obligatorios.", "Mensaje", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        
        if (jComboBoxTipo.getSelectedItem().equals("Cliente particular")) {
            cli = new Particular(DNI, nombre, telefono, correo, clave, var1, var2, var3, var4);
        } else {
            cli = new Anfitrion(DNI, nombre, telefono, correo, clave, var1, var5);
        }
        
    //se inserta en el array
        if (UtilClientes.altaClientes(cli)) {
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

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
     RegistrarseComo registrarseComo = new RegistrarseComo ();
     registrarseComo.setVisible(true);
     this.dispose();
    }//GEN-LAST:event_jButtonVolverActionPerformed

    private void jComboBoxTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoActionPerformed
        
    if (jComboBoxTipo.getSelectedItem().equals("Cliente particular")) {
        setEtiVar1("Fecha de caducidad de la tarjeta");
        setEtiVar2("Nombre titular de la tarjeta");
        setEtiVar3("número de tarjeta");
        setEtiVar4(" ");
        setEtiVar5(" ");
        
    } else { 
        setEtiVar1("Fecha de registro en la aplicación");
        setEtiVar2(" ");
        setEtiVar3(" ");
        setEtiVar4(" ");
        setEtiVar5("Calificación");
    }
    }//GEN-LAST:event_jComboBoxTipoActionPerformed

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
    private javax.swing.JLabel etiVar1;
    private javax.swing.JLabel etiVar2;
    private javax.swing.JLabel etiVar3;
    private javax.swing.JLabel etiVar4;
    private javax.swing.JLabel etiVar5;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JComboBox<String> jComboBoxTipo;
    private javax.swing.JComboBox<String> jComboBoxVar5;
    private javax.swing.JFormattedTextField jFormattedTextFieldVar1;
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
    private javax.swing.JRadioButton jRadioButtonVar4;
    private javax.swing.JTextField jTextFieldCorreo;
    private javax.swing.JTextField jTextFieldDNI;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldTelefono;
    private javax.swing.JTextField jTextFieldVar2;
    private javax.swing.JTextField jTextFieldVar3;
    // End of variables declaration//GEN-END:variables
}
