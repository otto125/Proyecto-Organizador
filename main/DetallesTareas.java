
package main;

/**
 *
 * @author 50242
 */
public class DetallesTareas extends javax.swing.JFrame {

    /**
     * Creates new form DetallesTareas
     */
    public DetallesTareas() {
        initComponents();
         setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMAlumnos1 = new javax.swing.JMenu();
        jMAListar1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMSalir1 = new javax.swing.JMenuItem();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMAlumnos2 = new javax.swing.JMenu();
        jMAListar2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMSalir2 = new javax.swing.JMenuItem();

        jMenuBar2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuBar2.setMinimumSize(new java.awt.Dimension(0, 4));

        jMAlumnos1.setText("Lista Tareas");
        jMAlumnos1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jMAListar1.setText("Ver Lista de Tareas");
        jMAListar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMAListar1ActionPerformed(evt);
            }
        });
        jMAlumnos1.add(jMAListar1);

        jMenuBar2.add(jMAlumnos1);

        jMenu2.setText("Regresar a lista de tareas");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMSalir1.setText("Regresar");
        jMSalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMSalir1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMSalir1);

        jMenuBar2.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel1.setText("Detalles Lista de Tareas ");

        jLabel2.setText("Nombre de la lista de Tareas");

        jLabel3.setText("ID Unico ");

        jMenuBar3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuBar3.setMinimumSize(new java.awt.Dimension(0, 4));

        jMAlumnos2.setText("Tareas");
        jMAlumnos2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jMAListar2.setText("Ver Lista de Tareas");
        jMAListar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMAListar2ActionPerformed(evt);
            }
        });
        jMAlumnos2.add(jMAListar2);

        jMenuBar3.add(jMAlumnos2);

        jMenu3.setText("Regresar a lista de tareas");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        jMSalir2.setText("Regresar");
        jMSalir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMSalir2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMSalir2);

        jMenuBar3.add(jMenu3);

        setJMenuBar(jMenuBar3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3))
                .addGap(198, 198, 198))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jMAListar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMAListar1ActionPerformed

        frameListaTareas1 frm = new frameListaTareas1();
        frm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMAListar1ActionPerformed

    private void jMSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMSalir1ActionPerformed

    }//GEN-LAST:event_jMSalir1ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMAListar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMAListar2ActionPerformed

        frameTareas frm = new frameTareas();
        frm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMAListar2ActionPerformed

    private void jMSalir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMSalir2ActionPerformed
this.dispose();
    }//GEN-LAST:event_jMSalir2ActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu3ActionPerformed

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
            java.util.logging.Logger.getLogger(DetallesTareas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetallesTareas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetallesTareas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetallesTareas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DetallesTareas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuItem jMAListar1;
    private javax.swing.JMenuItem jMAListar2;
    private javax.swing.JMenu jMAlumnos1;
    private javax.swing.JMenu jMAlumnos2;
    private javax.swing.JMenuItem jMSalir1;
    private javax.swing.JMenuItem jMSalir2;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    public javax.swing.JTextField jTextField1;
    public javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
