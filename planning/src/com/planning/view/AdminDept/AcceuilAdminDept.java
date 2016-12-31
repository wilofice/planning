/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.planning.view.AdminDept;

import com.planning.view.Deconnexion;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Azough Mehdi
 */
public class AcceuilAdminDept extends javax.swing.JFrame {
    
    GererEmploi ge;
    MonCompteDept mcd;
    GererGroupe gg;
    GererMatiere gm;
    /**
     * Creates new form AcceuilEnseignant
     */
    public AcceuilAdminDept() {
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        deconnexion = new javax.swing.JButton();
        desktop = new javax.swing.JDesktopPane();
        moncompte = new javax.swing.JButton();
        monemploi = new javax.swing.JButton();
        gerergroupe = new javax.swing.JButton();
        gerermat = new javax.swing.JButton();
        photo = new javax.swing.JLabel();
        acceuilBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 700));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        deconnexion.setText("Deconnexion");
        deconnexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deconnexionActionPerformed(evt);
            }
        });
        getContentPane().add(deconnexion, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 90, -1, 30));

        mcd = new MonCompteDept();
        this.desktop.add(mcd);
        try {
            mcd.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(com.planning.view.AdminDept.AcceuilAdminDept.class.getName()).log(Level.SEVERE, null, ex);
        }
        mcd.show();
        desktop.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(desktop, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 860, 560));

        moncompte.setText("Mon Compte");
        moncompte.setBorderPainted(false);
        moncompte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                moncompteMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                moncompteMouseExited(evt);
            }
        });
        moncompte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moncompteActionPerformed(evt);
            }
        });
        getContentPane().add(moncompte, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 60, 110, 30));

        monemploi.setBackground(new java.awt.Color(204, 204, 204));
        monemploi.setFont(new java.awt.Font("Champagne & Limousines", 1, 15)); // NOI18N
        monemploi.setText("Emploi du temps");
        monemploi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                monemploiMouseClicked(evt);
            }
        });
        monemploi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monemploiActionPerformed(evt);
            }
        });
        getContentPane().add(monemploi, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 130, 160, 80));

        gerergroupe.setBackground(new java.awt.Color(204, 204, 204));
        gerergroupe.setFont(new java.awt.Font("Champagne & Limousines", 1, 15)); // NOI18N
        gerergroupe.setText("Groupes");
        gerergroupe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gerergroupeMouseClicked(evt);
            }
        });
        gerergroupe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerergroupeActionPerformed(evt);
            }
        });
        getContentPane().add(gerergroupe, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 200, 160, 90));

        gerermat.setFont(new java.awt.Font("Champagne & Limousines", 1, 15)); // NOI18N
        gerermat.setText("Matières");
        gerermat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gerermatMouseClicked(evt);
            }
        });
        gerermat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerermatActionPerformed(evt);
            }
        });
        getContentPane().add(gerermat, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 280, 160, 90));

        photo.setForeground(new java.awt.Color(255, 255, 255));
        photo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        photo.setText("photo");
        getContentPane().add(photo, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, 90, 110));

        acceuilBG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        acceuilBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/planning/view/AdminDept/AcceuilBG.png"))); // NOI18N
        acceuilBG.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(acceuilBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1000, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void init() {
        ge = new GererEmploi();
        gg = new GererGroupe();
        gm = new GererMatiere();
    }
    private void moncompteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moncompteMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_moncompteMouseExited

    private void moncompteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moncompteActionPerformed
        moncompte.setBackground(java.awt.SystemColor.activeCaption);
        monemploi.setBackground(new java.awt.Color(240, 240, 240));
        gerergroupe.setBackground(new java.awt.Color(240, 240, 240));
        gerermat.setBackground(new java.awt.Color(240, 240, 240));
        this.desktop.removeAll();
        this.desktop.repaint();
        this.desktop.add(mcd);
        try {
            mcd.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(AcceuilAdminDept.class.getName()).log(Level.SEVERE, null, ex);
        }
        mcd.show();
    }//GEN-LAST:event_moncompteActionPerformed

    private void monemploiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_monemploiMouseClicked
      
    }//GEN-LAST:event_monemploiMouseClicked

    private void moncompteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moncompteMouseClicked
        
    }//GEN-LAST:event_moncompteMouseClicked

    private void gerergroupeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gerergroupeMouseClicked
        
    }//GEN-LAST:event_gerergroupeMouseClicked

    private void monemploiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monemploiActionPerformed
        monemploi.setBackground(java.awt.SystemColor.activeCaption);
        moncompte.setBackground(new java.awt.Color(240, 240, 240));
        gerergroupe.setBackground(new java.awt.Color(240, 240, 240));
        gerermat.setBackground(new java.awt.Color(240, 240, 240));
        this.desktop.removeAll();
        this.desktop.repaint();  
        
        //ge.setAcceuilAdminDept(this);
        this.desktop.add(ge);
        try {
            ge.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(AcceuilAdminDept.class.getName()).log(Level.SEVERE, null, ex);
        }
        ge.show();
    }//GEN-LAST:event_monemploiActionPerformed

    private void gerermatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gerermatMouseClicked
        
    }//GEN-LAST:event_gerermatMouseClicked

    private void gerergroupeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerergroupeActionPerformed
        gerergroupe.setBackground(java.awt.SystemColor.activeCaption);
        moncompte.setBackground(new java.awt.Color(240, 240, 240));
        monemploi.setBackground(new java.awt.Color(240, 240, 240));
        gerermat.setBackground(new java.awt.Color(240, 240, 240));
        this.desktop.removeAll();
        this.desktop.repaint();
        this.desktop.add(gg);
        try {
            gg.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(AcceuilAdminDept.class.getName()).log(Level.SEVERE, null, ex);
        }
        gg.show();
        
    }//GEN-LAST:event_gerergroupeActionPerformed

    private void gerermatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerermatActionPerformed
        gerermat.setBackground(java.awt.SystemColor.activeCaption);
        moncompte.setBackground(new java.awt.Color(240, 240, 240));
        gerergroupe.setBackground(new java.awt.Color(240, 240, 240));
        monemploi.setBackground(new java.awt.Color(240, 240, 240));
        this.desktop.removeAll();
        this.desktop.repaint();

        this.desktop.add(gm);
        try {
            gm.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(AcceuilAdminDept.class.getName()).log(Level.SEVERE, null, ex);
        }
        gm.show();
    }//GEN-LAST:event_gerermatActionPerformed

    private void deconnexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deconnexionActionPerformed
        this.dispose();
        new Deconnexion().setVisible(true);
    }//GEN-LAST:event_deconnexionActionPerformed

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
            java.util.logging.Logger.getLogger(AcceuilAdminDept.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AcceuilAdminDept.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AcceuilAdminDept.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AcceuilAdminDept.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AcceuilAdminDept().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acceuilBG;
    private javax.swing.JButton deconnexion;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JButton gerergroupe;
    private javax.swing.JButton gerermat;
    private javax.swing.JButton moncompte;
    private javax.swing.JButton monemploi;
    private javax.swing.JLabel photo;
    // End of variables declaration//GEN-END:variables
}
