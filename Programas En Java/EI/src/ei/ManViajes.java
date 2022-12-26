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
import javax.swing.table.DefaultTableModel;

public class ManViajes extends javax.swing.JFrame {

    public ManViajes() {
        initComponents();
        limpiar();
        combo();
        combo2();
        cargar(0);
    }

    void cargar(int codigo) {
        Conexion cc = new Conexion();
        Connection cn = cc.conexion();
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM Viajes, Rutas where Viajes.Codigo = Rutas.Codigo");
            while (rs.next()) {
                this.Cb_Rutas.add(rs.getString("Ruta"), this);
                this.Cb_Autobus.add(rs.getString("Autobus"), this);
                this.Cb_Chofer.add(rs.getString("Chofer"), this);
                this.Txt_Codigo.add(rs.getString("Codigo"), this);
                this.Txt_Salida.add(rs.getString("HoraSalida"), this);
                this.Txt_Llegada.add(rs.getString("HoraLlegada"), this);
                this.Txt_Fecha.add(rs.getString("Fecha"), this);
                this.Txt_Precio.add(rs.getString("Precio"), this);

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

    void combo2() {

        Conexion cc = new Conexion();
        Connection cn = cc.conexion();
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT Codigo FROM Viajes");
            while (rs.next()) {
                this.Cb_Viajes.addItem(rs.getString("Codigo"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    void limpiar() {
        Txt_Fecha.setText("");
        Txt_Codigo.setText("");
        Txt_Llegada.setText("");
        Txt_Precio.setText("");
        Txt_Salida.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Btn_Desactivar = new javax.swing.JButton();
        Btn_Salir = new javax.swing.JButton();
        Btn_Guardar = new javax.swing.JButton();
        Btn_Nuevo = new javax.swing.JButton();
        Btn_Activar = new javax.swing.JButton();
        Cb_Rutas = new javax.swing.JComboBox<>();
        Cb_Autobus = new javax.swing.JComboBox<>();
        Cb_Chofer = new javax.swing.JComboBox<>();
        Txt_Fecha = new javax.swing.JTextField();
        Txt_Codigo = new javax.swing.JTextField();
        Txt_Salida = new javax.swing.JTextField();
        Txt_Llegada = new javax.swing.JTextField();
        Txt_Precio = new javax.swing.JTextField();
        Cb_Viajes = new javax.swing.JComboBox<>();
        Btn_Elegir = new javax.swing.JButton();
        Cb_Estado = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 510));

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

        Cb_Autobus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "El diablo", "El Rojo", "El maquin", "El Pepe" }));

        Cb_Chofer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Micahel Jackson", "Pablo Escobar", "Jefe Maestro", "Marcus Fenix", "Kratos" }));
        Cb_Chofer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cb_ChoferActionPerformed(evt);
            }
        });

        Txt_Codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_CodigoActionPerformed(evt);
            }
        });

        Txt_Precio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_PrecioActionPerformed(evt);
            }
        });

        Btn_Elegir.setText("Elegir");
        Btn_Elegir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ElegirActionPerformed(evt);
            }
        });

        Cb_Estado.setText("Estado");
        Cb_Estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cb_EstadoActionPerformed(evt);
            }
        });

        jLabel1.setText("Rutas");

        jLabel2.setText("Autobus");

        jLabel3.setText("Chofer");

        jLabel4.setText("Fecha");

        jLabel5.setText("Codigo del viaje");

        jLabel6.setText("Hora de salida");

        jLabel7.setText("Hora de Llegada");

        jLabel8.setText("Precio del ticket");

        jLabel9.setText("Viajes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Txt_Codigo)
                            .addComponent(Cb_Rutas, 0, 147, Short.MAX_VALUE))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Txt_Salida)
                            .addComponent(Cb_Autobus, 0, 148, Short.MAX_VALUE))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Txt_Llegada)
                            .addComponent(Cb_Chofer, 0, 137, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel9)
                        .addGap(48, 48, 48)
                        .addComponent(Cb_Viajes, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(Btn_Elegir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel1)
                        .addGap(165, 165, 165)
                        .addComponent(jLabel2)
                        .addGap(152, 152, 152)
                        .addComponent(jLabel3)))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Cb_Estado)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Txt_Precio, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                                .addComponent(Txt_Fecha))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Btn_Nuevo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn_Guardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn_Desactivar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Btn_Salir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn_Activar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel5)
                .addGap(123, 123, 123)
                .addComponent(jLabel6)
                .addGap(106, 106, 106)
                .addComponent(jLabel7)
                .addGap(100, 100, 100)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cb_Rutas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cb_Chofer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cb_Autobus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Salida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Llegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cb_Viajes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Elegir)
                    .addComponent(Cb_Estado)
                    .addComponent(jLabel9))
                .addGap(93, 93, 93))
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(Btn_Guardar)
                .addGap(80, 80, 80)
                .addComponent(Btn_Nuevo)
                .addGap(79, 79, 79)
                .addComponent(Btn_Activar)
                .addGap(85, 85, 85)
                .addComponent(Btn_Desactivar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(Btn_Salir)
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Txt_PrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_PrecioActionPerformed

    }//GEN-LAST:event_Txt_PrecioActionPerformed

    private void Btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SalirActionPerformed

        new Menu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Btn_SalirActionPerformed

    private void Cb_ChoferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cb_ChoferActionPerformed

    }//GEN-LAST:event_Cb_ChoferActionPerformed

    private void Btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_GuardarActionPerformed
        if (this.Txt_Codigo.getText().length() == 0 || this.Txt_Fecha.getText().length() == 0
                || this.Txt_Salida.getText().length() == 0
                || this.Txt_Llegada.getText().length() == 0 || this.Txt_Precio.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Todos los Campos Deben Llenarse", "Mensaje", 1);
        } else {
            Conexion cc = new Conexion();
            Connection cn = cc.conexion();
            String codigo, llega, sal, precio, fecha;
            int CodiRuta;
            String bus, chofer;
            boolean activ;
            String sql = "";
            fecha = Txt_Fecha.getText();
            codigo = Txt_Codigo.getText();
            llega = Txt_Llegada.getText();
            sal = Txt_Salida.getText();
            CodiRuta = Integer.parseInt(Cb_Rutas.getSelectedItem().toString());
            precio = Txt_Precio.getText();
            bus = Cb_Autobus.getSelectedItem().toString();
            chofer = Cb_Chofer.getSelectedItem().toString();
            activ = Cb_Estado.isSelected();
            if (this.Txt_Salida.getText().equals(this.Txt_Llegada.getText())) {
                JOptionPane.showMessageDialog(null, "Hora de llegada y salida identicos");
            } else {
                sql = "INSERT INTO viajes(Codigo, HoraSalida, HoraLlegada, Fecha, Precio, Autobus, Chofer, Ruta, Activada, Lugares, LugaresVendidos) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
                try {
                    PreparedStatement pst = cn.prepareStatement(sql);
                    pst.setString(1, codigo);
                    pst.setString(2, sal);
                    pst.setString(3, llega);
                    pst.setString(4, fecha);
                    pst.setString(5, precio);
                    pst.setString(6, bus);
                    pst.setString(7, chofer);
                    pst.setInt(8, CodiRuta);
                    pst.setBoolean(9, activ);
                    pst.setInt(10, 100);
                    pst.setInt(11, 100);
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

    private void Btn_NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_NuevoActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_Btn_NuevoActionPerformed

    private void Btn_ElegirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ElegirActionPerformed
        // TODO add your handling code here:
        Conexion cc = new Conexion();
        Connection cn = cc.conexion();
        int Codigo;
        Codigo = Cb_Viajes.getSelectedIndex();
        cargar(Codigo);
    }//GEN-LAST:event_Btn_ElegirActionPerformed

    private void Btn_ActivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ActivarActionPerformed
        // TODO add your handling code here:
        boolean valor;
        valor = Cb_Estado.isSelected();

        Cb_Estado.setEnabled(true);
        Conexion cc = new Conexion();
        Connection cn = cc.conexion();
        String sql = "";
        int Codigo;
        Codigo = Integer.parseInt(Txt_Codigo.getText());
        sql = "update Viajes set Activada = ? where Codigo = ?";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setInt(1, 1);
            pst.setInt(2, Codigo);
            pst.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ManViajes.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_Btn_ActivarActionPerformed

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
            sql = "update Viajes set Activada = ? where Codigo = ?";
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

    private void Cb_EstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cb_EstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cb_EstadoActionPerformed

    private void Txt_CodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_CodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_CodigoActionPerformed

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
            java.util.logging.Logger.getLogger(ManViajes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManViajes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManViajes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManViajes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManViajes().setVisible(true);
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
    private javax.swing.JComboBox<String> Cb_Autobus;
    private javax.swing.JComboBox<String> Cb_Chofer;
    private javax.swing.JCheckBox Cb_Estado;
    private javax.swing.JComboBox<String> Cb_Rutas;
    private javax.swing.JComboBox<String> Cb_Viajes;
    private javax.swing.JTextField Txt_Codigo;
    private javax.swing.JTextField Txt_Fecha;
    private javax.swing.JTextField Txt_Llegada;
    private javax.swing.JTextField Txt_Precio;
    private javax.swing.JTextField Txt_Salida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
