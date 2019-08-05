

package vista.empleado;

/**
 *
 * @author User
 */
public class JfrmPerfil extends javax.swing.JFrame {

    /**
     * Creates new form JfrmEmpleado
     */
    public JfrmPerfil() {
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

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        JDesktop = new javax.swing.JDesktopPane();
        jLblCodigo = new javax.swing.JPanel();
        JBtnClose = new javax.swing.JButton();
        jLblImgPerfil = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLblNombre = new javax.swing.JLabel();
        jLblApellido = new javax.swing.JLabel();
        jLblFechaNac = new javax.swing.JLabel();
        jLblDpi = new javax.swing.JLabel();
        jLblCod = new javax.swing.JLabel();
        jLblTelefono = new javax.swing.JLabel();
        jLblCorreo = new javax.swing.JLabel();

        jMenuItem1.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        jMenuItem1.setText("Cartera");
        jMenuItem1.setContentAreaFilled(false);
        jMenuItem1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        jMenuItem2.setText("Facturacion o Venta");
        jMenuItem2.setContentAreaFilled(false);
        jMenuItem2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPopupMenu1.add(jMenuItem2);

        jMenuItem3.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        jMenuItem3.setText("Clientes");
        jMenuItem3.setContentAreaFilled(false);
        jMenuItem3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPopupMenu1.add(jMenuItem3);

        jMenuItem4.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        jMenuItem4.setText("Pagos");
        jMenuItem4.setContentAreaFilled(false);
        jMenuItem4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPopupMenu1.add(jMenuItem4);

        jMenuItem5.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        jMenuItem5.setText("Perfil");
        jMenuItem5.setContentAreaFilled(false);
        jMenuItem5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPopupMenu1.add(jMenuItem5);

        jMenuItem6.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        jMenuItem6.setText("Ingreso de Inmueble");
        jMenuItem6.setContentAreaFilled(false);
        jMenuItem6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPopupMenu1.add(jMenuItem6);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1280, 720));

        jLblCodigo.setBackground(new java.awt.Color(0, 0, 0));
        jLblCodigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        JBtnClose.setBackground(new java.awt.Color(3, 3, 102));
        JBtnClose.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        JBtnClose.setForeground(new java.awt.Color(255, 255, 255));
        JBtnClose.setText("X");
        JBtnClose.setBorder(null);
        JBtnClose.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JBtnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnCloseActionPerformed(evt);
            }
        });

        jLblImgPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usuario2.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(34, 37, 123));

        jLblNombre.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        jLblNombre.setText("Nombre :");

        jLblApellido.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        jLblApellido.setText("Apellido :");

        jLblFechaNac.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        jLblFechaNac.setText("Fecha de Nacimiento :");

        jLblDpi.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        jLblDpi.setText("DPI :");

        jLblCod.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        jLblCod.setText("Codigo :");

        jLblTelefono.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        jLblTelefono.setText("Telefono :");

        jLblCorreo.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        jLblCorreo.setText("Correo ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLblCorreo)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLblApellido)
                                .addComponent(jLblNombre))
                            .addComponent(jLblDpi)
                            .addComponent(jLblCod)
                            .addComponent(jLblTelefono)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLblFechaNac)))
                .addContainerGap(411, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLblNombre)
                .addGap(47, 47, 47)
                .addComponent(jLblApellido)
                .addGap(37, 37, 37)
                .addComponent(jLblFechaNac)
                .addGap(53, 53, 53)
                .addComponent(jLblDpi)
                .addGap(48, 48, 48)
                .addComponent(jLblCod)
                .addGap(40, 40, 40)
                .addComponent(jLblTelefono)
                .addGap(55, 55, 55)
                .addComponent(jLblCorreo)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jLblCodigoLayout = new javax.swing.GroupLayout(jLblCodigo);
        jLblCodigo.setLayout(jLblCodigoLayout);
        jLblCodigoLayout.setHorizontalGroup(
            jLblCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLblCodigoLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLblImgPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jLblCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLblCodigoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JBtnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(jLblCodigoLayout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(303, Short.MAX_VALUE))))
        );
        jLblCodigoLayout.setVerticalGroup(
            jLblCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLblCodigoLayout.createSequentialGroup()
                .addGroup(jLblCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLblCodigoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JBtnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLblCodigoLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLblImgPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLblCodigoLayout.createSequentialGroup()
                .addGap(0, 116, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );

        JDesktop.setLayer(jLblCodigo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout JDesktopLayout = new javax.swing.GroupLayout(JDesktop);
        JDesktop.setLayout(JDesktopLayout);
        JDesktopLayout.setHorizontalGroup(
            JDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JDesktopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        JDesktopLayout.setVerticalGroup(
            JDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JDesktopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLblCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JDesktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JDesktop)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBtnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnCloseActionPerformed
     System.exit(0);
    }//GEN-LAST:event_JBtnCloseActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(JfrmPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JfrmPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JfrmPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JfrmPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JfrmPerfil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBtnClose;
    private javax.swing.JDesktopPane JDesktop;
    private javax.swing.JLabel jLblApellido;
    private javax.swing.JLabel jLblCod;
    private javax.swing.JPanel jLblCodigo;
    private javax.swing.JLabel jLblCorreo;
    private javax.swing.JLabel jLblDpi;
    private javax.swing.JLabel jLblFechaNac;
    private javax.swing.JLabel jLblImgPerfil;
    private javax.swing.JLabel jLblNombre;
    private javax.swing.JLabel jLblTelefono;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    // End of variables declaration//GEN-END:variables
}
