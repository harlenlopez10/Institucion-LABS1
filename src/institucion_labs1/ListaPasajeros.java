/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package institucion_labs1;

/**
 *
 * @author harle
 */
public class ListaPasajeros extends javax.swing.JFrame {

    private PalindromoAir Funcion;
    private Ticket[] Asiento;
   
    public ListaPasajeros(Ticket[] AsientoExternos, PalindromoAir ClaseExterno) {
        Asiento = AsientoExternos != null ? AsientoExternos : new Ticket[30];
        Funcion = ClaseExterno;
    
        initComponents();
    }

    /**
     * WARNING: Do NOT modify this code.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Lista_Button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Listado = new javax.swing.JTextPane();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Lista_Button.setBackground(new java.awt.Color(50, 50, 200));
        Lista_Button.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Lista_Button.setForeground(new java.awt.Color(255, 255, 255));
        Lista_Button.setText("MOSTRAR");
        Lista_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lista_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(Lista_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 200, 40));

        Listado.setEditable(false);
        Listado.setBackground(new java.awt.Color(255, 255, 255));
        Listado.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(Listado);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 450, 230));

        jButton1.setBackground(new java.awt.Color(50, 50, 200));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("REGRESAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 110, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ListaMenu.jpg"))); // NOI18N
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Lista_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lista_ButtonActionPerformed

        
        Listado.setText(Funcion.printPassengers());

    }//GEN-LAST:event_Lista_ButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MainMenu pasar = new MainMenu(null,null);
        pasar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ListaPasajeros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaPasajeros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaPasajeros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaPasajeros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaPasajeros(null,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Lista_Button;
    private javax.swing.JTextPane Listado;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
