package com.mycompany.proyectob;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author emely
 */
public class Perfilvendedor extends javax.swing.JFrame {

    private usuario usuarioActual;

    /**
     * Creates new form Perfilvendedor
     */
    public Perfilvendedor(usuario usuario) {
          initComponents();
        usuarioActual = usuario;
        jTextField_usuario.setText(usuarioActual.nombre);
        pintarTabla();
   
        usuarioActual = usuario;
        jTextField_password.setText(usuarioActual.password);
        pintarTabla();
    }
    private void pintarTabla() {
        String cabeceras[] = {"vendedor", "contraseña", "calle", "avendida", "dirrecion", "zona"};

        DefaultTableModel t = new DefaultTableModel(cabeceras, usuarioActual.miperfil.size());
        jTable1.setModel(t);

        TableModel tabla = jTable1.getModel();

        for (int i = 0; i < usuarioActual.miperfil.size(); i++) {
            Miperfil tel = usuarioActual.miperfil.get(i);
            tabla.setValueAt(tel.vendedor2, i, 0);
            tabla.setValueAt(tel.contrasena2, i, 1);
            tabla.setValueAt(tel.calle2, i, 2);
            tabla.setValueAt(tel.avenida2, i, 3);
            tabla.setValueAt(tel.direccion2, i, 4);
            tabla.setValueAt(tel.zona2, i, 5);
            

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton_cerrar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField_usuario = new javax.swing.JTextField();
        jTextField_password = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField_calle = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField_avenida = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField_direccion = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField_zona = new javax.swing.JTextField();
        jButton_guardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel1.setText("Mi perfil");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton_cerrar.setFont(new java.awt.Font("URW Gothic", 1, 13)); // NOI18N
        jButton_cerrar.setText("Cerrar");
        jButton_cerrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cerrarActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(255, 153, 153));

        jLabel2.setFont(new java.awt.Font("URW Gothic", 1, 13)); // NOI18N
        jLabel2.setText("Usuario:");

        jLabel3.setFont(new java.awt.Font("URW Gothic", 1, 13)); // NOI18N
        jLabel3.setText("Contraseña:");

        jTextField_usuario.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("URW Gothic", 1, 13)); // NOI18N
        jLabel4.setText("Dirección");

        jLabel7.setFont(new java.awt.Font("URW Gothic", 1, 13)); // NOI18N
        jLabel7.setText("Calle:");

        jLabel6.setFont(new java.awt.Font("URW Gothic", 1, 13)); // NOI18N
        jLabel6.setText("Avenida:");

        jLabel8.setFont(new java.awt.Font("URW Gothic", 1, 13)); // NOI18N
        jLabel8.setText("DIrección:");

        jTextField_direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_direccionActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("URW Gothic", 1, 13)); // NOI18N
        jLabel9.setText("Zona:");

        jButton_guardar.setFont(new java.awt.Font("URW Gothic", 1, 13)); // NOI18N
        jButton_guardar.setText("Guardar");
        jButton_guardar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_guardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_direccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addComponent(jTextField_password)
                            .addComponent(jTextField_calle)
                            .addComponent(jTextField_avenida)
                            .addComponent(jTextField_zona)
                            .addComponent(jTextField_usuario))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField_calle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField_avenida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jTextField_zona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_guardar)
                .addGap(151, 151, 151))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(161, 161, 161)
                        .addComponent(jButton_cerrar)
                        .addGap(15, 15, 15))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton_cerrar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_guardarActionPerformed
                
        usuarioActual.password = jTextField_password.getText();
        Miperfil u = new Miperfil();
        
        u.vendedor2 = jTextField_usuario.getText();
        u.contrasena2 =jTextField_password.getText();
        u.calle2 = jTextField_calle.getText();
        u.avenida2 = jTextField_avenida.getText();
        u.direccion2 = jTextField_direccion.getText();
        u.zona2 = jTextField_zona.getText();
         
        usuarioActual.miperfil.add(u);
        pintarTabla();
    }//GEN-LAST:event_jButton_guardarActionPerformed

    private void jButton_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton_cerrarActionPerformed

    private void jTextField_direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_direccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_direccionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_cerrar;
    private javax.swing.JButton jButton_guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField_avenida;
    private javax.swing.JTextField jTextField_calle;
    private javax.swing.JTextField jTextField_direccion;
    private javax.swing.JTextField jTextField_password;
    private javax.swing.JTextField jTextField_usuario;
    private javax.swing.JTextField jTextField_zona;
    // End of variables declaration//GEN-END:variables
}
