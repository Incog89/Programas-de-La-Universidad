package interfaz;

import control.Control;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Christian Hernandez Najera, Lorena Valle Gonzalez y Eduardo Bustos Moran
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal(Control ctrl) {
        initComponents();
        control = ctrl;
        model = (DefaultTableModel) tableIP.getModel();
        tableIP.disable();
    }

    public void addIP(String ip) {
        model.addRow(new Object[]{ip});
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
        jTextArea1 = new javax.swing.JTextArea();
        ipTxtField = new javax.swing.JTextField();
        btnAgregarIP = new javax.swing.JButton();
        qtyTxtField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableIP = new javax.swing.JTable();
        comboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ipTxtField.setToolTipText("IP");
        ipTxtField.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        ipTxtField.setSelectionColor(new java.awt.Color(0, 0, 0));
        getContentPane().add(ipTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 180, 34));

        btnAgregarIP.setText("Agregar IP");
        btnAgregarIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarIPActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarIP, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 131, -1));

        qtyTxtField.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        qtyTxtField.setSelectionColor(new java.awt.Color(0, 0, 0));
        getContentPane().add(qtyTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 52, 180, 34));

        jButton1.setText("Ingresar Cantidad");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, -1, -1));

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 131, -1));

        tableIP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IP"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableIP.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(tableIP);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 120, 148));

        comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PRIMO", "INVERSO" }));
        comboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(comboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 120, 34));

        jLabel1.setText("CALCULAR:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, -1, -1));

        jLabel2.setText("Hecho por: Christian Hernandez Najera, Lorena Valle Gonzalez y Eduardo Bustos Moran");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/thumb2-red-abstraction-geometric-abstraction-background-3d-polygons-background-red-geometric-texture-abstract-texture.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 190));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarIPActionPerformed
        String ip = ipTxtField.getText();
        control.agregarIp(ip);
        ipTxtField.setText("");
    }//GEN-LAST:event_btnAgregarIPActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int cant = Integer.parseInt(qtyTxtField.getText());
        control.agregarCantidad(cant);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        String cmd = (String) comboBox.getSelectedItem();
        control.calcular(cmd);
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void comboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxActionPerformed
        
    }//GEN-LAST:event_comboBoxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarIP;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JTextField ipTxtField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField qtyTxtField;
    private javax.swing.JTable tableIP;
    // End of variables declaration//GEN-END:variables
    DefaultTableModel model;
    Control control = null;
}
