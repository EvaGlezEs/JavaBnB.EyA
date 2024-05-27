/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;
import java.util.ArrayList;
import java.util.ListIterator;
import javax.swing.JOptionPane;
import poo.javabnb.Clientes;
import poo.javabnb.Inmuebles;
import poo.javabnb.UtilInmuebles;
/**
 *
 * @author Alejandro
 */
public class AdministrarInmuAnfi extends javax.swing.JFrame {
     
     private Clientes cli;
     private ArrayList<Inmuebles> peraux = null;
     private ListIterator<Inmuebles> li = null;
     private Inmuebles objinmuanfi = null;
    /**
     * Creates new form AdministrarInmu
     * @param cli
     */
    public AdministrarInmuAnfi(Clientes cli){
        this.cli = cli;
        initComponents();
        consultarTodo();
    }
   
    public AdministrarInmuAnfi() {
        initComponents();
    }

        public void setJTextFieldTitulo(String txt) {
        this.jTextFieldTitulo.setText(txt);
    }

    public void setJTextFieldCalle(String txt) {
        this.jTextFieldCalle.setText(txt);
    }
    

    public void setJTextFieldNumero(String txt) {
        this.jTextFieldNumero.setText(txt);
    }


    public void setJTextFieldCodigoPostal(String txt) {
        this.jTextFieldCodigoPostal.setText(txt);
    }


    public void setJTextFieldCiudad(String txt) {
        this.jTextFieldCiudad.setText(txt);
    }
    
    public void setJTextFieldNumHuespedes(String txt) {
        this.jTextFieldNumHuespedes.setText(txt);
    }
    
    public void setJTextFieldNumHabitaciones(String txt) {
        this.jTextFieldNumHabitaciones.setText(txt);
    }
    
    public void setJTextFieldNumCamas(String txt) {
        this.jTextFieldNumCamas.setText(txt);
    }
    
    public void setJTextFieldNumBanos(String txt) {
        this.jTextFieldNumBanos.setText(txt);
    }
    
    public void setJTextFieldTipoPropiedad(String txt) {
        this.jTextFieldTipoPropiedad.setText(txt);
    }
    
    public void setJTextFieldPrecioNoche(String txt) {
        this.jTextFieldPrecioNoche.setText(txt);
    }
    
    public void setJTextFieldCalificacion(String txt) {
        this.jTextFieldCalificacion.setText(txt);
    }
    
    public void setJTextFieldServicios(String txt) {
        this.jTextFieldServicios.setText(txt);
    }
    
   public ArrayList<Inmuebles> ListaInmueblesAnfitrion(){
       ArrayList<Inmuebles> inmueblesanfitriones = new ArrayList <> ();
       for (Inmuebles inmuanfi : UtilInmuebles.getInmuebles()){
           if(cli.getCorreo().equals(inmuanfi.getCorreoAnfitrion())){
               inmueblesanfitriones.add(inmuanfi);
           }
       }
       return inmueblesanfitriones;
   }
  
   /** Consulta las personas del ArrayList ordenadas para su presentación */
    private void consultarTodo() {
        try {
            peraux = ListaInmueblesAnfitrion();
             li = peraux.listIterator();
            Inmuebles objinmuanfi = null;
            //si no hay personas...
            if (peraux.size() < 1) {
                JOptionPane.showMessageDialog(this, "No hay personas.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                jButtonSIG.setEnabled(false);
                jButtonANT.setEnabled(false);
                
                return;
            } else {
                jButtonSIG.setEnabled(true);
                jButtonANT.setEnabled(true);
                
            }
            //presentamos la primera persona
            if (li.hasNext()) {
                objinmuanfi = (Inmuebles) li.next();
            }
            if (objinmuanfi != null) {
                presenta(objinmuanfi);
            } else {
                JOptionPane.showMessageDialog(this, "No hay personas.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Mensaje", JOptionPane.ERROR_MESSAGE);
            System.out.println("Error: " + e.toString());
        }
    }//fin consultarTodo

    private void presenta(Inmuebles inmuebles){
        setJTextFieldTitulo(inmuebles.getTitulo());
        setJTextFieldCalle(inmuebles.getCalle());
        setJTextFieldNumero(inmuebles.getNumero());
        setJTextFieldCodigoPostal(inmuebles.getCodigoPostal());
        setJTextFieldCiudad(inmuebles.getCiudad());
        setJTextFieldNumHuespedes(inmuebles.getNumHuespedes());
        setJTextFieldNumHabitaciones(inmuebles.getNumHabitaciones());
        setJTextFieldNumCamas(inmuebles.getNumCamas());
        setJTextFieldNumBanos(inmuebles.getNumBanos());
        setJTextFieldTipoPropiedad(inmuebles.getTipoPropiedad());
        setJTextFieldPrecioNoche(String.valueOf(inmuebles.getPrecioNoche()));
        setJTextFieldCalificacion(String.valueOf(inmuebles.getCalificacion()));
        setJTextFieldServicios(inmuebles.getServicios());
        
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
        jTextFieldTitulo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldCalle = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldNumero = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldCodigoPostal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldCiudad = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldNumHuespedes = new javax.swing.JTextField();
        jTextFieldNumHabitaciones = new javax.swing.JTextField();
        jTextFieldNumCamas = new javax.swing.JTextField();
        jTextFieldNumBanos = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButtonSIG = new javax.swing.JButton();
        jButtonANT = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jTextFieldServicios = new javax.swing.JTextField();
        jTextFieldPrecioNoche = new javax.swing.JTextField();
        jTextFieldTipoPropiedad = new javax.swing.JTextField();
        jTextFieldCalificacion = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 220, 186));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Mis inmuebles");

        jLabel2.setText("Título");

        jTextFieldTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTituloActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Dirección");

        jLabel4.setText("Calle");

        jLabel5.setText("Número");

        jTextFieldNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumeroActionPerformed(evt);
            }
        });

        jLabel6.setText("Código Postal");

        jLabel7.setText("Ciudad");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Especificaciones Inmuebles");

        jLabel9.setText("Número de huespedes");

        jLabel10.setText("Número de habitaciones");

        jLabel11.setText("Número de camas");

        jLabel12.setText("Número de baños");

        jTextFieldNumHuespedes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumHuespedesActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Características");

        jLabel14.setText("Tipo de propiedad");

        jLabel15.setText("Precio por noche");

        jLabel16.setText("Calificación");

        jButtonSIG.setText("SIG");

        jButtonANT.setText("ANT");
        jButtonANT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonANTActionPerformed(evt);
            }
        });

        jButton4.setText("Modificar");

        jButton5.setText("Volver");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel17.setText("Servicios");

        jTextFieldTipoPropiedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTipoPropiedadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jButtonANT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonSIG)
                .addGap(133, 133, 133))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(71, 71, 71)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldNumBanos, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldNumCamas, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldNumHuespedes, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldNumHabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldTipoPropiedad, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldPrecioNoche, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldServicios, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldCalificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(73, 73, 73)
                                        .addComponent(jTextFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(203, 203, 203)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldCodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel15)
                            .addComponent(jLabel14)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(jLabel8)))
                .addContainerGap(191, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSIG)
                    .addComponent(jButtonANT))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldNumHuespedes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextFieldNumHabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextFieldNumCamas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextFieldNumBanos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(jLabel13)
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTextFieldTipoPropiedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTextFieldPrecioNoche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jTextFieldCalificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jTextFieldServicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonANTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonANTActionPerformed
                // TODO add your handling code here:
    //Comprobamos el rango del ArrayList...
    if (li.hasPrevious()) {
        objinmuanfi = li.previous();
        if (objinmuanfi != null) {
            presenta(objinmuanfi);
        } else {
            JOptionPane.showMessageDialog(this, "No hay personas.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    }//GEN-LAST:event_jButtonANTActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         // TODO add your handling code here:
    //Comprobamos el rango del ArrayList...
    if (li.hasNext()) {
        objinmuanfi = li.next();
        if (objinmuanfi != null) {
            presenta(objinmuanfi);
        } else {
            JOptionPane.showMessageDialog(this, "No hay personas.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextFieldTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTituloActionPerformed

    private void jTextFieldNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNumeroActionPerformed

    private void jTextFieldNumHuespedesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumHuespedesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNumHuespedesActionPerformed

    private void jTextFieldTipoPropiedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTipoPropiedadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTipoPropiedadActionPerformed

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
            java.util.logging.Logger.getLogger(AdministrarInmuAnfi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdministrarInmuAnfi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdministrarInmuAnfi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdministrarInmuAnfi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdministrarInmuAnfi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButtonANT;
    private javax.swing.JButton jButtonSIG;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldCalificacion;
    private javax.swing.JTextField jTextFieldCalle;
    private javax.swing.JTextField jTextFieldCiudad;
    private javax.swing.JTextField jTextFieldCodigoPostal;
    private javax.swing.JTextField jTextFieldNumBanos;
    private javax.swing.JTextField jTextFieldNumCamas;
    private javax.swing.JTextField jTextFieldNumHabitaciones;
    private javax.swing.JTextField jTextFieldNumHuespedes;
    private javax.swing.JTextField jTextFieldNumero;
    private javax.swing.JTextField jTextFieldPrecioNoche;
    private javax.swing.JTextField jTextFieldServicios;
    private javax.swing.JTextField jTextFieldTipoPropiedad;
    private javax.swing.JTextField jTextFieldTitulo;
    // End of variables declaration//GEN-END:variables
}
