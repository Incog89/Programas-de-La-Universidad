package interfaz;

import control.Control;
import interfaces.Observer;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author Christian Hernandez Najera, Lorena Valle Gonzalez y Eduardo Bustos Moran
 */
public class VentanaPrincipal extends javax.swing.JFrame implements Observer{

    public VentanaPrincipal(Control ctrl) {
        initComponents();
        control = ctrl;
        jTextArea1.disable();
        showIP();
    }
    
    public void showIP() {
        InetAddress ip;
        try {
            ip = InetAddress.getLocalHost();
            labelIP.setText("IP: " + ip.toString());
        } catch (UnknownHostException ex) {
            labelIP.setText("IP: UNKNOWN, TRY> 127.0.0.1");
        }        
    }
    
    public void showText(String txt) {
        jTextArea1.append(txt + "\n");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelIP = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btnConnect = new javax.swing.JButton();
        btnDisconnect = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(512, 320));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelIP.setText("IP: ");
        getContentPane().add(labelIP, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 458, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setFocusable(false);
        jTextArea1.setSelectionColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 28, 458, 196));

        btnConnect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/boton-de-play (1).png"))); // NOI18N
        btnConnect.setText("Conectarse");
        btnConnect.setOpaque(true);
        btnConnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConnectActionPerformed(evt);
            }
        });
        getContentPane().add(btnConnect, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 230, -1, -1));

        btnDisconnect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/boton-x (1).png"))); // NOI18N
        btnDisconnect.setText("Desconectarse");
        btnDisconnect.setOpaque(true);
        btnDisconnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisconnectActionPerformed(evt);
            }
        });
        getContentPane().add(btnDisconnect, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 230, -1, -1));

        jLabel1.setText("Hecho por: Christian Hernandez Najera, Lorena Valle Gonzalez y Eduardo Bustos Moran");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 264, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/RMI-Hexa-loop-blue-multimedia.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 510, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConnectActionPerformed
        control.conectarse();
    }//GEN-LAST:event_btnConnectActionPerformed

    private void btnDisconnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisconnectActionPerformed
        control.desconectarse();
    }//GEN-LAST:event_btnDisconnectActionPerformed


    
    Control control;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConnect;
    private javax.swing.JButton btnDisconnect;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel labelIP;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update() {
        jTextArea1.append(control.getMsg());
    }
}
