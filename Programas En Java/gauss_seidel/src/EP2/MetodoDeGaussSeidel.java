/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EP2;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Incognito89
 */
public final class MetodoDeGaussSeidel extends javax.swing.JFrame {

    
    
    public MetodoDeGaussSeidel() {
        initComponents();
        this.setLocationRelativeTo( null );
    }
    
    public void refrescar(){
        txtCant.setText("");
        txtEpsilon.setText("");
        lblIteraciones.setText("");
        lblTitulo.setText("");
        DefaultTableModel model = (DefaultTableModel) tblIteraciones.getModel();
        int f = tblIteraciones.getRowCount();
        for (int i = f-1; i >= 0; i--) {
            model.removeRow(i);
        }
        DefaultTableModel modelo = (DefaultTableModel) tblResultado.getModel();
        int fi = tblResultado.getRowCount();
        for (int i = fi-1; i >= 0; i--) {
            modelo.removeRow(i);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtEpsilon = new javax.swing.JTextField();
        txtCant = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        lblIteraciones = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblResultado = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblIteraciones = new javax.swing.JTable();
        btnLimpiar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        jScrollPane1.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 3, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(" GAUSS - SEIDEL");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 435, 51));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Valor del Error");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 65, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Cantidad de ecuaciones:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 105, -1, -1));
        getContentPane().add(txtEpsilon, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 63, 321, -1));
        getContentPane().add(txtCant, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 103, 274, -1));

        jButton1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("ingrese las ecuaciones");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 143, 435, 41));

        lblTitulo.setFont(new java.awt.Font("Segoe UI Semibold", 2, 14)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 214, 435, -1));

        lblIteraciones.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(lblIteraciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 400, 350, -1));

        tblResultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblResultado);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 230, 150, 164));

        tblIteraciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tblIteraciones);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 230, 273, 164));

        btnLimpiar.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(0, 0, 0));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, -1, 30));

        btnSalir.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(0, 0, 0));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 400, -1, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        Double e = Double.parseDouble(txtEpsilon.getText());
        Integer n = Integer.parseInt(txtCant.getText());
        Integer a = n+1;
        Double[][] M = new Double[10][10];
        Double[][] Iter = new Double[999][999];
        Double [] V = new Double[100];
        
        for (int f = 1; f <= n; f++) {
            for (int c = 1; c <= a; c++) {
                if (c == a) {
                    M[f][c] = Double.parseDouble(JOptionPane.showInputDialog("Introduce el termino independiente de la ecuacion"));
                    /*JOptionPane.showMessageDialog(null,"variable de la matriz "+f+" "+c+" : "+ M[f][c]);*/
                }else {
                    M[f][c] = Double.parseDouble(JOptionPane.showInputDialog("Introduce los coeficientes de la "+ f +" ecuacion (uno en uno)"));
                    /*JOptionPane.showMessageDialog(null,"variable de la matriz "+f+" "+c+" : "+ M[f][c]);*/
                }
            }
        }
        
        Double may;
        Integer ban=0;
        /*for (int f = 1; f <= n; f++) {
            may = M[f][f];
            for (int c = 1; c < n+1; c++) {
                if ((Math.abs(may))<(Math.abs(M[f][c]))) {
                    ban = 1;
                }
            }
        }
        */
        if (ban == 1) {
            JOptionPane.showMessageDialog(null,"El sistema de ecuaciones no converge. Intente nuevamente");
            this.refrescar();
        }else {
            JOptionPane.showMessageDialog(null,"El sistema de ecuaciones converge");
            
            for (int f = 1; f <= n; f++) {
                V[f] = Double.parseDouble(JOptionPane.showInputDialog("Introduce los valores iniciales"));
            }
        
            Integer inter = 0, c = 1;
            Double mayor, suma, res, er;
            do {
                mayor = 0.0;
                for (int i = 1; i <= n; i++) {
                    suma = 0.0;
                    for (int j = 1; j <= n; j++) {
                        if (j!=i ) {
                            suma += M[i][j] * V[j];
                        }
                    }
                    res = (M[i][a] - suma) / M[i][i];
                    er = Math.abs(V[i]-res);
                    if (er > mayor) {
                        mayor = er;
                    }
                    V[i] = res;
                    Iter[i][c] = res;
                }
                c++;
                inter ++;
            } while (mayor >= e);
        
            lblTitulo.setText("Solucion Aproximada");
            lblIteraciones.setText("Realizo "+inter+" iteraciones");
        
            DefaultTableModel modelo = (DefaultTableModel) tblResultado.getModel();
            modelo.setRowCount(n);
            modelo.setColumnCount(1);
            for (int i = 0; i < n; i++) {
                tblResultado.setValueAt(V[i+1], i, 0);
            }
            DefaultTableModel model = (DefaultTableModel) tblIteraciones.getModel();
            model.setRowCount(n);
            model.setColumnCount(inter);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < inter; j++) {
                    tblIteraciones.setValueAt(Iter[i+1][j+1], i, j);
                }
            }
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        this.refrescar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(MetodoDeGaussSeidel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MetodoDeGaussSeidel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MetodoDeGaussSeidel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MetodoDeGaussSeidel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MetodoDeGaussSeidel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel lblIteraciones;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblIteraciones;
    private javax.swing.JTable tblResultado;
    private javax.swing.JTextField txtCant;
    private javax.swing.JTextField txtEpsilon;
    // End of variables declaration//GEN-END:variables
}
