/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ei;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JL_Ejemplo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuRutas = new javax.swing.JMenuItem();
        MenuViajes = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        MenuBoletos = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        MenuVenta = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JL_Ejemplo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/maxresdefault (1).jpg"))); // NOI18N
        getContentPane().add(JL_Ejemplo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 510));

        jMenu1.setText("Mantenimientos");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        MenuRutas.setText("Rutas");
        MenuRutas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuRutasActionPerformed(evt);
            }
        });
        jMenu1.add(MenuRutas);

        MenuViajes.setText("Viajes");
        MenuViajes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuViajesActionPerformed(evt);
            }
        });
        jMenu1.add(MenuViajes);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Consultas");

        MenuBoletos.setText("Boletos");
        MenuBoletos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuBoletosActionPerformed(evt);
            }
        });
        jMenu2.add(MenuBoletos);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Procesos");

        MenuVenta.setText("Venta de Boletos");
        MenuVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuVentaActionPerformed(evt);
            }
        });
        jMenu3.add(MenuVenta);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Cerrar Sesion");
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuRutasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuRutasActionPerformed
        new ManRutas().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MenuRutasActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void MenuViajesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuViajesActionPerformed
        // TODO add your handling code here:
        new ManViajes().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MenuViajesActionPerformed

    private void MenuBoletosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuBoletosActionPerformed
        // TODO add your handling code here:
        new Boletos().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MenuBoletosActionPerformed

    private void MenuVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuVentaActionPerformed
        // TODO add your handling code here:
        new VentaBoletos().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MenuVentaActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JL_Ejemplo;
    private javax.swing.JMenuItem MenuBoletos;
    private javax.swing.JMenuItem MenuRutas;
    private javax.swing.JMenuItem MenuVenta;
    private javax.swing.JMenuItem MenuViajes;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
