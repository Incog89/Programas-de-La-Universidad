/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ei;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ManRutas extends javax.swing.JFrame {

    public ManRutas() {
        initComponents();
        limpiar();
        combo();
        cargar(0);
    }

    void cargar(int codigo) {
        Conexion cc = new Conexion();
        Connection cn = cc.conexion();
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM Viajes, Rutas where Viajes.Codigo = Rutas.Codigo");
            while (rs.next()) {
                this.Txt_Codigo.add(rs.getString("Codigo"), this);
                this.Txt_Salida.add(rs.getString("HoraSalida"), this);
                this.Txt_Llegada.add(rs.getString("HoraLlegada"), this);
                this.Txt_Distancia.add(rs.getString("Distancia"), this);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    void combo() {
        Conexion cc = new Conexion();
        Connection cn = cc.conexion();
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT Codigo FROM rutas");
            while (rs.next()) {
                this.Cb_Rutas.addItem(rs.getString("Codigo"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    void limpiar() {
        Txt_Codigo.setText("");
        Txt_Llegada.setText("");
        Txt_Salida.setText("");
        Txt_Distancia.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Cb_Estado = new javax.swing.JCheckBox();
        Cb_Rutas = new javax.swing.JComboBox<>();
        Txt_Salida = new javax.swing.JTextField();
        Txt_Distancia = new javax.swing.JTextField();
        Txt_Llegada = new javax.swing.JTextField();
        Txt_Codigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Btn_Elegir = new javax.swing.JButton();
        Btn_Guardar = new javax.swing.JButton();
        Btn_Nuevo = new javax.swing.JButton();
        Btn_Activar = new javax.swing.JButton();
        Btn_Desactivar = new javax.swing.JButton();
        Btn_Salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 510));
        setPreferredSize(new java.awt.Dimension(900, 510));

        Cb_Estado.setText("Estado");

        Cb_Rutas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cb_RutasActionPerformed(evt);
            }
        });

        jLabel1.setText("Lugar Llegada");

        jLabel2.setText("Lugar Salida");

        jLabel3.setText("Distancia");

        jLabel4.setText("Codigo");

        jLabel5.setText("Rutas");

        Btn_Elegir.setText("Elegir");
        Btn_Elegir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ElegirActionPerformed(evt);
            }
        });

        Btn_Guardar.setText("Guardar");
        Btn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_GuardarActionPerformed(evt);
            }
        });

        Btn_Nuevo.setText("Nuevo");
        Btn_Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_NuevoActionPerformed(evt);
            }
        });

        Btn_Activar.setText("Activar");
        Btn_Activar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ActivarActionPerformed(evt);
            }
        });

        Btn_Desactivar.setText("Desactivar");
        Btn_Desactivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_DesactivarActionPerformed(evt);
            }
        });

        Btn_Salir.setText("Salir");
        Btn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Txt_Salida)
                            .addComponent(Txt_Distancia, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Txt_Codigo)
                            .addComponent(Cb_Rutas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Txt_Llegada, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Cb_Estado)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Btn_Desactivar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Btn_Activar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Btn_Nuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Btn_Guardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Btn_Salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(122, 122, 122))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Btn_Elegir)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Txt_Salida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Txt_Distancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(Cb_Estado)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Txt_Llegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1))
                            .addComponent(jLabel2))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Txt_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(Btn_Nuevo))
                            .addComponent(Btn_Guardar))
                        .addGap(71, 71, 71)
                        .addComponent(Btn_Activar)))
                .addGap(54, 54, 54)
                .addComponent(Btn_Desactivar)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cb_Rutas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(Btn_Elegir))
                .addGap(32, 32, 32)
                .addComponent(Btn_Salir)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SalirActionPerformed
        new Menu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Btn_SalirActionPerformed

    private void Btn_ActivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ActivarActionPerformed

        boolean valor;
        valor = Cb_Estado.isSelected();

        Cb_Estado.setEnabled(true);
        Conexion cc = new Conexion();
        Connection cn = cc.conexion();
        String sql = "";
        int Codigo;
        Codigo = Integer.parseInt(Txt_Codigo.getText());
        sql = "update Rutas set Activada = ? where Codigo = ?";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setInt(1, 1);
            pst.setInt(2, Codigo);
            pst.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ManViajes.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_Btn_ActivarActionPerformed

    private void Btn_NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_NuevoActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_Btn_NuevoActionPerformed

    private void Btn_DesactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_DesactivarActionPerformed
        // TODO add your handling code here:
        boolean valor;
        valor = Cb_Estado.isSelected();
        if (valor = false) {
            JOptionPane.showMessageDialog(null, "Ya se encuentra desactivada");
        } else {
            Cb_Estado.setEnabled(false);
            Conexion cc = new Conexion();
            Connection cn = cc.conexion();
            String sql = "";
            int Codigo;
            Codigo = Integer.parseInt(Txt_Codigo.getText());
            sql = "update Rutas set Activada = ? where Codigo = ?";
            try {
                PreparedStatement pst = cn.prepareStatement(sql);
                pst.setInt(1, 0);
                pst.setInt(2, Codigo);
                pst.execute();
            } catch (SQLException ex) {
                Logger.getLogger(ManViajes.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_Btn_DesactivarActionPerformed

    private void Btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_GuardarActionPerformed
        // TODO add your handling code here:
        if (this.Txt_Codigo.getText().length() == 0 || this.Txt_Distancia.getText().length() == 0
                || this.Txt_Salida.getText().length() == 0 || this.Txt_Llegada.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Todos los Campos Deben Llenarse", "Mensaje", 1);
        } else {
            Conexion cc = new Conexion();
            Connection cn = cc.conexion();
            String codigo, llega, sal, Dis;
            boolean activ;
            String sql = "";
            codigo = Txt_Codigo.getText();
            llega = Txt_Llegada.getText();
            sal = Txt_Salida.getText();
            Dis = Txt_Distancia.getText();
            activ = Cb_Estado.isSelected();
            if (this.Txt_Salida.getText().equals(this.Txt_Llegada.getText())) {
                JOptionPane.showMessageDialog(null, "Hora de llegada y salida identicos");
            } else {
                sql = "INSERT INTO Rutas(LugarSalida, Distancia, Codigo, LugarLLegada, Activada) VALUES(?,?,?,?,?)";
                try {
                    PreparedStatement pst = cn.prepareStatement(sql);
                    pst.setString(1, sal);
                    pst.setString(2, Dis);
                    pst.setString(3, codigo);
                    pst.setString(4, llega);
                    pst.setBoolean(5, activ);
                    int n = pst.executeUpdate();
                    if (n > 0) {
                        JOptionPane.showMessageDialog(null, "Registro Guardado");
                    }
                    limpiar();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error de Registro");
                    Logger.getLogger(Boletos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_Btn_GuardarActionPerformed

    private void Btn_ElegirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ElegirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_ElegirActionPerformed

    private void Cb_RutasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cb_RutasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cb_RutasActionPerformed

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
            java.util.logging.Logger.getLogger(ManRutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManRutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManRutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManRutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManRutas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Activar;
    private javax.swing.JButton Btn_Desactivar;
    private javax.swing.JButton Btn_Elegir;
    private javax.swing.JButton Btn_Guardar;
    private javax.swing.JButton Btn_Nuevo;
    private javax.swing.JButton Btn_Salir;
    private javax.swing.JCheckBox Cb_Estado;
    private javax.swing.JComboBox<String> Cb_Rutas;
    private javax.swing.JTextField Txt_Codigo;
    private javax.swing.JTextField Txt_Distancia;
    private javax.swing.JTextField Txt_Llegada;
    private javax.swing.JTextField Txt_Salida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
