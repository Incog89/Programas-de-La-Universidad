/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Conexion;

import java.sql.Connection;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author JURIEL
 */
public class reportes extends javax.swing.JFrame {

    /**
     * Creates new form reportes
     */
    public reportes() {
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

        jLabel1 = new javax.swing.JLabel();
        bcamion = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bconductor = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        bvendedor = new javax.swing.JButton();
        bviajes = new javax.swing.JButton();
        bboleto = new javax.swing.JButton();
        bmenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Camion: ");

        bcamion.setText("Reporte");
        bcamion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcamionActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Reportes ");

        jLabel3.setText("Conductor: ");

        bconductor.setText("Reporte");
        bconductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bconductorActionPerformed(evt);
            }
        });

        jLabel4.setText("Vendedor: ");

        jLabel5.setText("Viajes: ");

        jLabel6.setText("Boletos: ");

        bvendedor.setText("Reporte");
        bvendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bvendedorActionPerformed(evt);
            }
        });

        bviajes.setText("Reporte");
        bviajes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bviajesActionPerformed(evt);
            }
        });

        bboleto.setText("Reporte");
        bboleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bboletoActionPerformed(evt);
            }
        });

        bmenu.setText("RMenu");
        bmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bboleto))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bviajes))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bcamion))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(bconductor))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(22, 22, 22)
                                .addComponent(bvendedor))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bmenu, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(bcamion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(bconductor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(bvendedor))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(bviajes))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(bboleto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bmenu)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bcamionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcamionActionPerformed
        // TODO add your handling code here:
        
        try{
            String ubicacionReportes=System.getProperty("user.dir")+"/ReporteCamion.jasper";
            
            JasperReport Report=(JasperReport)JRLoader.loadObject(ubicacionReportes);
            JasperPrint print=JasperFillManager.fillReport(Report, null, cn);
            JasperViewer view=new JasperViewer(print,false);
            view.setVisible(true);
            
        }catch(JRException ex){
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
    }//GEN-LAST:event_bcamionActionPerformed

    private void bmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmenuActionPerformed
        // TODO add your handling code here:
        new Menu().setVisible(true); this.dispose();
    }//GEN-LAST:event_bmenuActionPerformed

    private void bconductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bconductorActionPerformed
        // TODO add your handling code here:
        try{
            String ubicacionReportes=System.getProperty("user.dir")+"/ReporteConductor1.jasper";
            
            JasperReport Report=(JasperReport)JRLoader.loadObject(ubicacionReportes);
            JasperPrint print=JasperFillManager.fillReport(Report, null, cn);
            JasperViewer view=new JasperViewer(print,false);
            view.setVisible(true);
            
        }catch(JRException ex){
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
    }//GEN-LAST:event_bconductorActionPerformed

    private void bvendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bvendedorActionPerformed
        // TODO add your handling code here:
        try{
            String ubicacionReportes=System.getProperty("user.dir")+"/ReporteVendedor.jasper";
            
            JasperReport Report=(JasperReport)JRLoader.loadObject(ubicacionReportes);
            JasperPrint print=JasperFillManager.fillReport(Report, null, cn);
            JasperViewer view=new JasperViewer(print,false);
            view.setVisible(true);
            
        }catch(JRException ex){
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
    }//GEN-LAST:event_bvendedorActionPerformed

    private void bviajesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bviajesActionPerformed
        // TODO add your handling code here:
        try{
            String ubicacionReportes=System.getProperty("user.dir")+"/ReporteViajes.jasper";
            
            JasperReport Report=(JasperReport)JRLoader.loadObject(ubicacionReportes);
            JasperPrint print=JasperFillManager.fillReport(Report, null, cn);
            JasperViewer view=new JasperViewer(print,false);
            view.setVisible(true);
            
        }catch(JRException ex){
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
    }//GEN-LAST:event_bviajesActionPerformed

    private void bboletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bboletoActionPerformed
        // TODO add your handling code here:
         try{
            String ubicacionReportes=System.getProperty("user.dir")+"/ReporteBoleto.jasper";
            
            JasperReport Report=(JasperReport)JRLoader.loadObject(ubicacionReportes);
            JasperPrint print=JasperFillManager.fillReport(Report, null, cn);
            JasperViewer view=new JasperViewer(print,false);
            view.setVisible(true);
            
        }catch(JRException ex){
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
    }//GEN-LAST:event_bboletoActionPerformed

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
            java.util.logging.Logger.getLogger(reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new reportes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bboleto;
    private javax.swing.JButton bcamion;
    private javax.swing.JButton bconductor;
    private javax.swing.JButton bmenu;
    private javax.swing.JButton bvendedor;
    private javax.swing.JButton bviajes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
conectar cc = new conectar();
        Connection cn = cc.conexion();
}
