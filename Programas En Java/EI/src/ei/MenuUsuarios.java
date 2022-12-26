/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ei;

import javax.swing.JOptionPane;

public class MenuUsuarios extends javax.swing.JFrame {

    public MenuUsuarios() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        txtcontra = new javax.swing.JTextField();
        BT_Entrar = new javax.swing.JButton();
        BT_Salir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Usuario");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        jLabel2.setText("Contraseña");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        txtusuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 196, -1));

        txtcontra.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtcontra, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 196, -1));

        BT_Entrar.setText("Entrar");
        BT_Entrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BT_Entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_EntrarActionPerformed(evt);
            }
        });
        getContentPane().add(BT_Entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 73, -1));

        BT_Salir.setText("Salir");
        BT_Salir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(BT_Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 72, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        jLabel3.setText("Sistema De Transporte");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BT_EntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_EntrarActionPerformed
        if (this.txtusuario.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "No a Indicado el Usuario", "Campo vacio", 1);
        } else {
            String usuario = "Hola";
            String contra = "1234";
            String usuarioA = "Admin";
            String contraA = "Admin123";

            if (this.txtusuario.getText().toString().equals(usuario)) {
                if (this.txtcontra.getText().equals(contra)) {
                    new Menu().setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Contaseña incorrecta", "Error", 0);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Usuario incorrecto", "Error", 0);
            }

        }
    }//GEN-LAST:event_BT_EntrarActionPerformed

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
            java.util.logging.Logger.getLogger(MenuUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUsuarios().setVisible(true);
                Conexion cc = new Conexion();
                cc.conexion();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_Entrar;
    private javax.swing.JButton BT_Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtcontra;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
