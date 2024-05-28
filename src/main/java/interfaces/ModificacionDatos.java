/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import poo.javabnb.Anfitrion;
import poo.javabnb.Clientes;
import poo.javabnb.Particular;

/**
 * interfaz para modificar los datos si lso clientes desean cambiar sus datos personales, u añadir otros como es el caso de ser VIP o Superanfitrión
 * @author eva
 */
public class ModificacionDatos extends javax.swing.JFrame {
    private static ArrayList<Clientes> clientes = new ArrayList<>();
    private static Clientes objcli;
   
    
    /**
     * Creates new form ModificacionDatos
     */
    public ModificacionDatos() {
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
    public LocalDate getjSpinnerVar1() {
        Date fecha = (Date) jSpinnerVar1.getValue();
        Instant instant = Instant.ofEpochMilli(fecha.getTime());
        LocalDate localDate = LocalDateTime.ofInstant(instant, ZoneId.systemDefault()).toLocalDate();
        return localDate;
    }

    /**
     *
     * @param d
     */
    public void setjSpinnerVar1(Date d) {
        this.jSpinnerVar1.setValue(d);
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
    public String getjRadioButtonVar4() {
        return jRadioButtonVar4.getText();
    }

    /**
     *
     * @param txt
     */
    public void setjRadioButtonVar4(String txt) {
        this.jRadioButtonVar4.setText(txt);
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
        jLabel7 = new javax.swing.JLabel();
        etiVar2 = new javax.swing.JLabel();
        etiVar3 = new javax.swing.JLabel();
        jbuttonModificar = new javax.swing.JButton();
        etiVar4 = new javax.swing.JLabel();
        jRadioButtonVar4 = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldDNI = new javax.swing.JTextField();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldTelefono = new javax.swing.JTextField();
        jTextFieldCorreo = new javax.swing.JTextField();
        jPasswordFieldClave = new javax.swing.JPasswordField();
        jTextFieldVar2 = new javax.swing.JTextField();
        jTextFieldVar3 = new javax.swing.JTextField();
        jSpinnerVar1 = new javax.swing.JSpinner();
        etiVar5 = new javax.swing.JLabel();
        jComboBoxVar5 = new javax.swing.JComboBox<>();
        jComboBoxTipo = new javax.swing.JComboBox<>();
        etiVar1 = new javax.swing.JLabel();

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
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, -1, -1));

        etiVar2.setText("Nombre del Titular");
        jPanel1.add(etiVar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, -1, -1));

        etiVar3.setText("Número");
        jPanel1.add(etiVar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, -1, -1));

        jbuttonModificar.setText("Modificar");
        jbuttonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuttonModificarActionPerformed(evt);
            }
        });
        jPanel1.add(jbuttonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 450, 100, 30));

        etiVar4.setText("¿Es usted un cliente VIP?");
        jPanel1.add(etiVar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 460, 160, -1));

        jRadioButtonVar4.setText("Si, lo soy");
        jRadioButtonVar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonVar4ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButtonVar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 450, 150, 30));

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

        jTextFieldTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTelefonoActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 230, 20));

        jTextFieldCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCorreoActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, 210, 20));
        jPanel1.add(jPasswordFieldClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 190, 210, -1));

        jTextFieldVar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldVar2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldVar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 370, 190, 20));

        jTextFieldVar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldVar3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldVar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 400, 190, 20));

        jSpinnerVar1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jSpinnerVar1PropertyChange(evt);
            }
        });
        jPanel1.add(jSpinnerVar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, -1, -1));

        etiVar5.setText("¿Cuál es su calificación? obtenida de las reseñas de sus inmuebles ");
        jPanel1.add(etiVar5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, -1, -1));

        jComboBoxVar5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5 (soy superanfitrión)" }));
        jPanel1.add(jComboBoxVar5, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 260, -1, -1));

        jComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cliente particular", "Anfitrión" }));
        jComboBoxTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBoxTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        etiVar1.setText("Fecha caducidad ");
        jPanel1.add(etiVar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 110, 20));

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
    
        String DNI = jTextFieldDNI.getText();
        String nombre = jTextFieldNombre.getText();
        String telefono = jTextFieldTelefono.getText();
        String correo = jTextFieldCorreo.getText();
        String clave = jPasswordFieldClave.getText();
        LocalDate var1 = LocalDate.parse(jSpinnerVar1.getValue().toString(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        String var2 = jTextFieldVar2.getText();
        String var3 = jTextFieldVar3.getText();
        Boolean var4 = jRadioButtonVar4.isSelected();
        String selectedItem = (String) jComboBoxVar5.getSelectedItem();
        int var5 = Integer.parseInt(selectedItem);

      
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
    public ModificacionDatos(Clientes cli, JTextField jTextFieldDNI, JTextField jTextFieldNombre, JTextField jTextFieldTelefono,JTextField jTextFieldCorreo, JPasswordField jPasswordFieldClave, JSpinner jSpinnerVar1 , JTextField jTextFieldVar2, JTextField jTextFieldVar3,JRadioButton jRadioButtonVar4, JComboBox<String> jComboBoxVar5) {
        this.jComboBoxVar5 = jComboBoxVar5;
        this.jPasswordFieldClave = jPasswordFieldClave;
        this.jRadioButtonVar4 = jRadioButtonVar4;
        this.jSpinnerVar1 = jSpinnerVar1;
        this.jTextFieldCorreo = jTextFieldCorreo;
        this.jTextFieldDNI = jTextFieldDNI;
        this.jTextFieldNombre = jTextFieldNombre;
        this.jTextFieldTelefono = jTextFieldTelefono;
        this.jTextFieldVar2 = jTextFieldVar2;
        this.jTextFieldVar3 = jTextFieldVar3;
        
        
        if (cli == null || !clientes.contains(cli)) {
            
        }
        String DNI = null;
        cli.setDNI(DNI);
        String nombre = null;
        cli.setNombre(nombre);
        String telefono = null;
        cli.setTelefono(telefono);
        String correo = null;
        cli.setCorreo(correo);
        String clave = null;
        cli.setClave(clave);
        
        String tipo = cli.getClass().getSimpleName();
        if (tipo.equals("Clientes Particulares")) {
            Particular parti = (Particular) cli;
            LocalDate var1 = null;
            parti.setFechaCaducidad(var1);
            String var2 = null;
            parti.setNombreTitular(var2);
            String var3 = null;
            parti.setNumero(var3);
            Boolean var4 = null;
            parti.setVIP(var4);
        } else {
            Anfitrion anfi = (Anfitrion) cli;
            LocalDate var1 = null;
            anfi.setFechaRegistro(var1);
            int var5 = 0;
            anfi.setCalificacion(var5);
        }
    }
    

    private void jRadioButtonVar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonVar4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonVar4ActionPerformed

    private void jTextFieldDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDNIActionPerformed

    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreActionPerformed

    private void jTextFieldTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTelefonoActionPerformed

    private void jTextFieldCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCorreoActionPerformed

    private void jTextFieldVar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldVar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldVar2ActionPerformed

    private void jTextFieldVar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldVar3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldVar3ActionPerformed

    private void jSpinnerVar1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jSpinnerVar1PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jSpinnerVar1PropertyChange

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
        setEtiVar5(" ");
    }
    }//GEN-LAST:event_jComboBoxTipoActionPerformed

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
            java.util.logging.Logger.getLogger(ModificacionDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificacionDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificacionDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificacionDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificacionDatos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel etiVar1;
    private javax.swing.JLabel etiVar2;
    private javax.swing.JLabel etiVar3;
    private javax.swing.JLabel etiVar4;
    private javax.swing.JLabel etiVar5;
    private javax.swing.JComboBox<String> jComboBoxTipo;
    private javax.swing.JComboBox<String> jComboBoxVar5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordFieldClave;
    private javax.swing.JRadioButton jRadioButtonVar4;
    private javax.swing.JSpinner jSpinnerVar1;
    private javax.swing.JTextField jTextFieldCorreo;
    private javax.swing.JTextField jTextFieldDNI;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldTelefono;
    private javax.swing.JTextField jTextFieldVar2;
    private javax.swing.JTextField jTextFieldVar3;
    private javax.swing.JButton jbuttonModificar;
    // End of variables declaration//GEN-END:variables
}
