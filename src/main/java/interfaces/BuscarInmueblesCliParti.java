/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;
import java.util.ArrayList;
import java.util.ListIterator;
import poo.javabnb.UtilInmuebles;
import poo.javabnb.Inmuebles;
import javax.swing.JOptionPane;

/**
 * Interfaz para que los clientes particulares busquen inmuebles según sus preferencias 
 * @author Alejandro
 */
public class BuscarInmueblesCliParti extends javax.swing.JFrame {

    private ArrayList<Inmuebles> peraux; //Referencia al ArrayList de personas de la clase UtilCenso
    private ListIterator<Inmuebles> li; //Iterador para recorrer el ArrayList en ambas direcciones
    private Inmuebles objinmu; //Referencia a un objeto de tipo persona del ArrayList

    /**
     * Creates new form VerInmueblesAdmin
     */
    public BuscarInmueblesCliParti() {
        initComponents();
        consultarTodo();
    }

    /**
     *
     * @param txt
     */
    public void setJTextFieldTitulo(String txt) {
        this.jTextFieldTitulo.setText(txt);
    }

    /**
     *
     * @param txt
     */
    public void setJTextFieldCalle(String txt) {
        this.jTextFieldCalle.setText(txt);
    }

    /**
     *
     * @param txt
     */
    public void setJTextFieldNumero(String txt) {
        this.jTextFieldNumero.setText(txt);
    }

    /**
     *
     * @param txt
     */
    public void setJTextFieldCodigoPostal(String txt) {
        this.jTextFieldCodigoPostal.setText(txt);
    }

    /**
     *
     * @param txt
     */
    public void setJTextFieldCiudad(String txt) {
        this.jTextFieldCiudad.setText(txt);
    }

    /**
     *
     * @param txt
     */
    public void setJTextFieldNumHuespedes(String txt) {
        this.jTextFieldNumHuespedes.setText(txt);
    }

    /**
     *
     * @param txt
     */
    public void setJTextFieldNumHabitaciones(String txt) {
        this.jTextFieldNumHabitaciones.setText(txt);
    }

    /**
     *
     * @param txt
     */
    public void setJTextFieldNumCamas(String txt) {
        this.jTextFieldNumCamas.setText(txt);
    }

    /**
     *
     * @param txt
     */
    public void setJTextFieldNumBanos(String txt) {
        this.jTextFieldNumBanos.setText(txt);
    }

    /**
     *
     * @param txt
     */
    public void setJTextFieldTipoPropiedad(String txt) {
        this.jTextFieldTipoPropiedad.setText(txt);
    }

    /**
     *
     * @param txt
     */
    public void setJTextFieldPrecioNoche(String txt) {
        this.jTextFieldPrecioNoche.setText(txt);
    }

    /**
     *
     * @param txt
     */
    public void setJTextFieldCalificacion(String txt) {
        this.jTextFieldCalificacion.setText(txt);
    }

    /**
     *
     * @param txt
     */
    public void setJTextFieldServicios(String txt) {
        this.jTextFieldServicios.setText(txt);
    }

    //borra el contenido del panel

    /**
     *
     */
    public void borrar() {

        setJTextFieldTitulo("");
        setJTextFieldCalle("");
        setJTextFieldNumero("");
        setJTextFieldCodigoPostal("");
        setJTextFieldCiudad("");
        setJTextFieldNumHuespedes("");
        setJTextFieldNumHabitaciones("");
        setJTextFieldNumCamas("");
        setJTextFieldNumBanos("");
        setJTextFieldTipoPropiedad("");
        setJTextFieldPrecioNoche("");
        setJTextFieldCalificacion("");
        setJTextFieldServicios("");
    }

    //activa la caja de texto dni

    /**
     *
     */
    public void activaTitulo() {
        this.jTextFieldTitulo.setEditable(true);
    }

    //desactiva la caja de texto dni

    /**
     *
     */
    public void desactivaTitulo() {
        this.jTextFieldTitulo.setEditable(false);
    }

    /**
     * Consulta las personas del ArrayList ordenadas para su presentación
     */
    private void consultarTodo() {
        try {
            //referenciamos al ArrayList de UtilCenso
            peraux = UtilInmuebles.getInmuebles();
            //creamos el iterador sobre el ArrayList
            li = peraux.listIterator();
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
                objinmu = (Inmuebles) li.next();
            }
            if (objinmu != null) {
                presenta(objinmu);
            } else {
                JOptionPane.showMessageDialog(this, "No hay personas.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Mensaje", JOptionPane.ERROR_MESSAGE);
            System.out.println("Error: " + e.toString());
        }
    }//fin consultarTodo

    private void presenta(Inmuebles inmueble) {
        setJTextFieldTitulo(inmueble.getTitulo());
        setJTextFieldCalle(inmueble.getCalle());
        setJTextFieldNumero(inmueble.getNumero());
        setJTextFieldCodigoPostal(inmueble.getCodigoPostal());
        setJTextFieldCiudad(inmueble.getCiudad());
        setJTextFieldNumHuespedes(inmueble.getNumHuespedes());
        setJTextFieldNumHabitaciones(inmueble.getNumHabitaciones());
        setJTextFieldNumCamas(inmueble.getNumCamas());
        setJTextFieldNumBanos(inmueble.getNumBanos());
        setJTextFieldTipoPropiedad(inmueble.getTipoPropiedad());
        setJTextFieldPrecioNoche(String.valueOf(inmueble.getPrecioNoche()));
        setJTextFieldCalificacion(String.valueOf(inmueble.getCalificacion()));
        setJTextFieldServicios(inmueble.getServicios());

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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldTitulo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldCalle = new javax.swing.JTextField();
        jTextFieldNumero = new javax.swing.JTextField();
        jTextFieldCodigoPostal = new javax.swing.JTextField();
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
        jLabel17 = new javax.swing.JLabel();
        jTextFieldTipoPropiedad = new javax.swing.JTextField();
        jTextFieldPrecioNoche = new javax.swing.JTextField();
        jTextFieldCalificacion = new javax.swing.JTextField();
        jTextFieldServicios = new javax.swing.JTextField();
        jButtonSIG = new javax.swing.JButton();
        jButtonANT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 220, 186));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Busqueda de Inmuebles");

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

        jLabel6.setText("Código Postal");

        jLabel7.setText("Ciudad");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Especificaciones del inmueble");

        jLabel9.setText("Número de huespedes");

        jLabel10.setText("Número de habitaciones");

        jLabel11.setText("Número de camas");

        jLabel12.setText("Número de baños");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Características");

        jLabel14.setText("Tipo de propiedad");

        jLabel15.setText("Precio por noche");

        jLabel16.setText("Calificación");

        jLabel17.setText("Servicios");

        jButtonSIG.setText("SIG");
        jButtonSIG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSIGActionPerformed(evt);
            }
        });

        jButtonANT.setText("ANT");
        jButtonANT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonANTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(189, 189, 189)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addGap(33, 33, 33)
                                    .addComponent(jTextFieldNumHabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addGap(44, 44, 44)
                                    .addComponent(jTextFieldNumHuespedes, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(125, 125, 125)
                                    .addComponent(jTextFieldCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(89, 89, 89)
                                    .addComponent(jTextFieldCodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(120, 120, 120)
                                    .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(126, 126, 126)
                                    .addComponent(jTextFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel12)
                                        .addComponent(jLabel11))
                                    .addGap(60, 60, 60)
                                    .addComponent(jTextFieldNumCamas, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(2, 2, 2)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel17)
                                            .addGap(109, 109, 109)
                                            .addComponent(jTextFieldServicios, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel16)
                                            .addGap(93, 93, 93)
                                            .addComponent(jTextFieldCalificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel15)
                                            .addGap(65, 65, 65)
                                            .addComponent(jTextFieldPrecioNoche, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel14)))))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(280, 280, 280)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel13)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(236, 236, 236)
                            .addComponent(jLabel8))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jButtonANT)
                            .addGap(197, 197, 197)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldTipoPropiedad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNumBanos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(196, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(208, 208, 208))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonSIG)
                        .addGap(140, 140, 140))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSIG)
                    .addComponent(jButtonANT))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldCodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldNumHuespedes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNumHabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextFieldNumCamas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextFieldNumBanos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTextFieldTipoPropiedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTextFieldPrecioNoche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jTextFieldCalificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jTextFieldServicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonANTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonANTActionPerformed
           // TODO add your handling code here:
    //Comprobamos el rango del ArrayList...
    if (li.hasPrevious()) {
        objinmu = li.previous();
        if (objinmu != null) {
            presenta(objinmu);
        } else {
            JOptionPane.showMessageDialog(this, "No hay personas.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    }//GEN-LAST:event_jButtonANTActionPerformed

    private void jButtonSIGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSIGActionPerformed
      // TODO add your handling code here:
    //Comprobamos el rango del ArrayList...
    if (li.hasNext()) {
        objinmu = li.next();
        if (objinmu != null) {
            presenta(objinmu);
        } else {
            JOptionPane.showMessageDialog(this, "No hay personas.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    }//GEN-LAST:event_jButtonSIGActionPerformed

    private void jTextFieldTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTituloActionPerformed
  
    }//GEN-LAST:event_jTextFieldTituloActionPerformed

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
        java.util.logging.Logger.getLogger(BuscarInmueblesCliParti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
        java.util.logging.Logger.getLogger(BuscarInmueblesCliParti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        java.util.logging.Logger.getLogger(BuscarInmueblesCliParti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(BuscarInmueblesCliParti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new BuscarInmueblesCliParti().setVisible(true);
        }
    });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JPanel jPanel2;
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