/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package institucion_labs1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author harle
 */
public class MainMenu extends javax.swing.JFrame {
   
    private PalindromoAir Funcion;
    private Ticket[] Asiento;
   
    public MainMenu(Ticket[] AsientoExternos, PalindromoAir ClaseExterno) {
        Asiento = AsientoExternos != null ? AsientoExternos : new Ticket[30];
        Funcion = ClaseExterno != null ? ClaseExterno : new PalindromoAir();
        
        initComponents();
        
    }

  
    

    /**
     * WARNING: Do NOT modify this code.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DespacharVuelo_Button = new javax.swing.JButton();
        ListaPasajeros_Button = new javax.swing.JButton();
        CancelarTicket_Button = new javax.swing.JButton();
        VenderTicket_Button = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DespacharVuelo_Button.setBorder(null);
        DespacharVuelo_Button.setContentAreaFilled(false);
        DespacharVuelo_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DespacharVuelo_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(DespacharVuelo_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 220, 40));

        ListaPasajeros_Button.setBorder(null);
        ListaPasajeros_Button.setContentAreaFilled(false);
        ListaPasajeros_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaPasajeros_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ListaPasajeros_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 220, 30));

        CancelarTicket_Button.setBorder(null);
        CancelarTicket_Button.setContentAreaFilled(false);
        CancelarTicket_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarTicket_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(CancelarTicket_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 220, 30));

        VenderTicket_Button.setBorder(null);
        VenderTicket_Button.setContentAreaFilled(false);
        VenderTicket_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VenderTicket_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(VenderTicket_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 220, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Menuinicial.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VenderTicket_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VenderTicket_ButtonActionPerformed
        VenderTicket pasar = new VenderTicket(Asiento, Funcion);
        pasar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_VenderTicket_ButtonActionPerformed

    private void CancelarTicket_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarTicket_ButtonActionPerformed
        CancelarTicket pasar = new CancelarTicket(Asiento, Funcion);
        pasar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_CancelarTicket_ButtonActionPerformed

    private void ListaPasajeros_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListaPasajeros_ButtonActionPerformed
        ListaPasajeros pasar = new ListaPasajeros(Asiento,Funcion);
        pasar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ListaPasajeros_ButtonActionPerformed

    private void DespacharVuelo_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DespacharVuelo_ButtonActionPerformed
   
        boolean ListaVacia = false;

        for (Ticket ticket : Asiento) {
            if (ticket != null) {
                ListaVacia = true;
                break;
            }
        }

        if (ListaVacia) {
            Funcion.reset();
            JOptionPane.showMessageDialog(null, "El vuelo ha despachado.");
        } else {
            JOptionPane.showMessageDialog(null, "No hay asientos vendidos para despachar.");
        }


    }//GEN-LAST:event_DespacharVuelo_ButtonActionPerformed

    
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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu(null,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelarTicket_Button;
    private javax.swing.JButton DespacharVuelo_Button;
    private javax.swing.JButton ListaPasajeros_Button;
    private javax.swing.JButton VenderTicket_Button;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
