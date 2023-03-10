/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Conexion;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JURIEL
 */
public class Boleto extends javax.swing.JFrame {
    
    DefaultTableModel model;
  

    /**
     * Creates new form Boleto
     */
    public Boleto() {
        initComponents();
        limpiar();
        bloquear();
        combo1();
        bactualizar.setEnabled(false);
    }
    
    void combo1(){
        //this.AC.removeAllItems();
        conectar cc=new conectar();
        Connection cn=cc.conexion();
        String sql="SELECT * FROM viajes";
        try{
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                this.CO.addItem(rs.getString("Orig_cli"));
                this.CD.addItem(rs.getString("Dest_cli"));
                this.CH.addItem(rs.getString("Salida_cli"));
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    void limpiar(){
        np.setText("");
        cos.setText("");
        na.setText("");
        /*org.setText("");
        dest.setText("");
        hor.setText("");*/
        lin.setText("");
        fech.setText("");
    }
    
    void bloquear(){
        np.setEnabled(false);
        cos.setEnabled(false);
        na.setEnabled(false);
        /*org.setEnabled(false);
        dest.setEnabled(false);
        hor.setEnabled(false);*/
        CO.setEnabled(false);
        CD.setEnabled(false);
        CH.setEnabled(false);
        lin.setEnabled(false);
        fech.setEnabled(false);
        bnuevo.setEnabled(true);
        bguardar.setEnabled(false);
        bcancelar.setEnabled(false);        
    }
    
    void habilitar(){
        np.setEnabled(true);
        cos.setEnabled(true);
        na.setEnabled(true);
        /*org.setEnabled(true);
        dest.setEnabled(true);
        hor.setEnabled(true);*/
        CO.setEnabled(true);
        CD.setEnabled(true);
        CH.setEnabled(true);
        lin.setEnabled(true);
        fech.setEnabled(true);
        bnuevo.setEnabled(false);
        bguardar.setEnabled(true);
        bcancelar.setEnabled(true);        
    }
    
    void actualizar(){
        np.setEnabled(true);
        cos.setEnabled(true);
        na.setEnabled(true);
        CO.setEnabled(true);
        CD.setEnabled(true);
        CH.setEnabled(true);
        lin.setEnabled(true);
        fech.setEnabled(true);
        bactualizar.setEnabled(true);
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Label1 = new javax.swing.JLabel();
        Label3 = new javax.swing.JLabel();
        Label4 = new javax.swing.JLabel();
        Label7 = new javax.swing.JLabel();
        np = new javax.swing.JTextField();
        cos = new javax.swing.JTextField();
        na = new javax.swing.JTextField();
        lin = new javax.swing.JTextField();
        bnuevo = new javax.swing.JButton();
        bguardar = new javax.swing.JButton();
        bcancelar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        fech = new javax.swing.JTextField();
        bmenu = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        CO = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        CD = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        CH = new javax.swing.JComboBox();
        bactualizar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Boleto");
        setResizable(false);

        Label1.setText("Nombre del Pasajero: ");

        Label3.setText("Costo:");

        Label4.setText("N?? Asiento: ");

        Label7.setText("Linea: ");

        np.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                npActionPerformed(evt);
            }
        });

        cos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cosActionPerformed(evt);
            }
        });

        na.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                naActionPerformed(evt);
            }
        });

        lin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                linActionPerformed(evt);
            }
        });

        bnuevo.setText("Nuevo");
        bnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnuevoActionPerformed(evt);
            }
        });

        bguardar.setText("Guardar");
        bguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bguardarActionPerformed(evt);
            }
        });

        bcancelar.setText("Cancelar");
        bcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcancelarActionPerformed(evt);
            }
        });

        jLabel2.setText("Fecha: ");

        bmenu.setText("RMenu");
        bmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmenuActionPerformed(evt);
            }
        });

        jLabel4.setText("Origen: ");

        CO.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleciona.." }));

        jLabel5.setText("Destino: ");

        CD.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecciona.." }));
        CD.setToolTipText("");

        jLabel6.setText("Horario: ");

        CH.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecciona.." }));

        bactualizar.setText("Actualizar");
        bactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bactualizarActionPerformed(evt);
            }
        });

        jLabel7.setText("ID: ");

        id.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bnuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bactualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bguardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bcancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bmenu))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Label3)
                                    .addGap(18, 18, 18)
                                    .addComponent(cos, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(fech, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CO, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CH, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Label4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(na, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Label7)
                                    .addGap(18, 18, 18)
                                    .addComponent(lin, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(CD, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Label1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(np, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bactualizar, bcancelar, bguardar, bmenu, bnuevo});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label1)
                            .addComponent(np, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label3)
                            .addComponent(cos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(CO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(CH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(fech, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label4)
                            .addComponent(na, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(CD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label7)
                            .addComponent(lin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bnuevo)
                    .addComponent(bguardar)
                    .addComponent(bcancelar)
                    .addComponent(bactualizar)
                    .addComponent(bmenu))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnuevoActionPerformed
        // TODO add your handling code here:
        habilitar();
        np.requestFocus();
    }//GEN-LAST:event_bnuevoActionPerformed

    private void bcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcancelarActionPerformed
        // TODO add your handling code here:
        limpiar();
        bloquear();
    }//GEN-LAST:event_bcancelarActionPerformed

    private void npActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_npActionPerformed
        // TODO add your handling code here:
        np.requestFocus();
    }//GEN-LAST:event_npActionPerformed

    private void cosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cosActionPerformed
        // TODO add your handling code here:
        cos.requestFocus();
    }//GEN-LAST:event_cosActionPerformed

    private void naActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_naActionPerformed
        // TODO add your handling code here:
        na.requestFocus();
    }//GEN-LAST:event_naActionPerformed

    private void linActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_linActionPerformed
        // TODO add your handling code here:
        lin.requestFocus();
    }//GEN-LAST:event_linActionPerformed

    private void bguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bguardarActionPerformed
            // TODO add your handling code here:
        if(this.np.getText().length()==0 || this.cos.getText().length()==0 || 
           this.na.getText().length()==0 || this.CO.getSelectedIndex()==0  || 
           this.CD.getSelectedIndex()==0 || this.CH.getSelectedIndex()==0  ||
           this.lin.getText().length()==0 || this.fech.getText().length()==0){
            JOptionPane.showMessageDialog(this,"Todos los Campos Deben Llenarse","Mensaje",1);
        }else{
                conectar cc = new conectar();
                Connection cn = cc.conexion();
                String nom,cost,nas,li,fe;
                int or,des,hrs;
                String sql="";
                nom = np.getText();
                cost = cos.getText();
                nas = na.getText();
                or = CO.getSelectedIndex();
                des = CD.getSelectedIndex();
                hrs = CH.getSelectedIndex();
                li = lin.getText();
                fe = fech.getText();
                sql="INSERT INTO boleto(NombrePasajero_cli, Costo_cli, NA_cli, Origen_cli, Destino_cli, Horario_cli, Linea_cli, Fecha_cli) VALUES(?,?,?,?,?,?,?,?)";
                try {
                    PreparedStatement pst = cn.prepareStatement(sql);
                    pst.setString(1, nom);
                    pst.setString(2, cost);
                    pst.setString(3, nas);
                    pst.setInt(4, or);
                    pst.setInt(5, des);
                    pst.setInt(6, hrs);
                    pst.setString(7, li);
                    pst.setString(8, fe);
                    int n=pst.executeUpdate();
                    if(n>0){
                        JOptionPane.showMessageDialog(null,"Registro Guardado");
                        bloquear();
                        //cargar("");
                    }
                    limpiar();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null,"Error de Registro");
                    Logger.getLogger(Boleto.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
    }//GEN-LAST:event_bguardarActionPerformed

    private void bmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmenuActionPerformed
        // TODO add your handling code here:
        new Menu().setVisible(true);  this.dispose();
    }//GEN-LAST:event_bmenuActionPerformed

    private void bactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bactualizarActionPerformed
        // TODO add your handling code here:
        conectar cc = new conectar();
        Connection cn = cc.conexion();
        try{
            PreparedStatement pst = cn.prepareStatement("UPDATE boleto SET NombrePasajero_cli='"+np.getText()+"',Costo_cli='"+cos.getText()+"',NA_cli='"+na.getText()+"',Origen_cli='"+CO.getSelectedIndex()+"',Destino_cli='"+CD.getSelectedIndex()+"',Horario_cli='"+CH.getSelectedIndex()+"',Linea_cli='"+lin.getText()+"',Fecha_cli='"+fech.getName()+"' WHERE ID_cli='"+id.getText()+"'");
            pst.executeUpdate();
            //cargar("");
            bactualizar.setEnabled(false);
            bloquear();
            limpiar();
        }
        catch(SQLException e){JOptionPane.showMessageDialog(null,e.getMessage());}
        
    }//GEN-LAST:event_bactualizarActionPerformed

    
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
            java.util.logging.Logger.getLogger(Boleto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Boleto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Boleto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Boleto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Boleto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox CD;
    private javax.swing.JComboBox CH;
    private javax.swing.JComboBox CO;
    private javax.swing.JLabel Label1;
    private javax.swing.JLabel Label3;
    private javax.swing.JLabel Label4;
    private javax.swing.JLabel Label7;
    private javax.swing.JButton bactualizar;
    private javax.swing.JButton bcancelar;
    private javax.swing.JButton bguardar;
    private javax.swing.JButton bmenu;
    private javax.swing.JButton bnuevo;
    private javax.swing.JTextField cos;
    private javax.swing.JTextField fech;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField lin;
    private javax.swing.JTextField na;
    private javax.swing.JTextField np;
    // End of variables declaration//GEN-END:variables
}
