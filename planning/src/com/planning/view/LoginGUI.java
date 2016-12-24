/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.planning.view;

import com.planning.dao.implement.EnseignantDAO;
import com.planning.view.Enseignant.AcceuilEnseignant;
import com.planning.dao.implement.UsersDAO;
import com.planning.model.ConnexionBD;
import com.planning.model.Enseignant;
import com.planning.model.Users;
import com.planning.view.Enseignant.MonCompteEnseignant;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Azough Mehdi
 */
public class LoginGUI extends javax.swing.JFrame {
     
    /**
     * Creates new form LoginGUI
     */
    
    
    public LoginGUI() {
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

        Connexion = new javax.swing.JButton();
        identifiant = new javax.swing.JTextField();
        motdepasse = new javax.swing.JPasswordField();
        loginbackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 600));

        Connexion.setFont(new java.awt.Font("Champagne & Limousines", 1, 24)); // NOI18N
        Connexion.setText("Connexion");
        Connexion.setToolTipText("");
        Connexion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Connexion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConnexionMouseClicked(evt);
            }
        });
        Connexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConnexionActionPerformed(evt);
            }
        });

        identifiant.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        identifiant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                identifiantActionPerformed(evt);
            }
        });

        motdepasse.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        loginbackground.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginbackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("../images/LoginBG.png")));
        loginbackground.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        loginbackground.setPreferredSize(new java.awt.Dimension(900, 600));
        loginbackground.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                loginbackgroundKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(420, 420, 420)
                        .addComponent(identifiant, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(420, 420, 420)
                        .addComponent(motdepasse, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(370, 370, 370)
                        .addComponent(Connexion, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(loginbackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginbackground, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(320, 320, 320)
                .addComponent(identifiant, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(400, 400, 400)
                .addComponent(motdepasse, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(510, 510, 510)
                .addComponent(Connexion))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void identifiantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_identifiantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_identifiantActionPerformed

    private void ConnexionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConnexionMouseClicked
       
    }//GEN-LAST:event_ConnexionMouseClicked

    private void ConnexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConnexionActionPerformed
         UsersDAO usersDAO = new UsersDAO(ConnexionBD.init());
        Users user = usersDAO.find(identifiant.getText());
        String passwordtext = new String(motdepasse.getPassword());
        
        if(user != null ) {
            String passworduser = user.getMotDePasse();
            if(passworduser.equals(passwordtext)) {
                
                String id = new String(identifiant.getText());                   
                AcceuilEnseignant AE = new AcceuilEnseignant();
  
                AE.desktop.removeAll();
                AE.desktop.repaint();
               
                AE.setidUser(id);
                
                MonCompteEnseignant mce = new MonCompteEnseignant();
                
                AE.desktop.add(mce);
                AE.setME(mce);
                
                
                try {
                    mce.setMaximum(true);
                 } catch (PropertyVetoException ex) {
                    Logger.getLogger(AcceuilEnseignant.class.getName()).log(Level.SEVERE, null, ex);
                 }
                mce.show();
                
                 dispose();
                 AE.setVisible(true);
                 
                
            }
            
            else {
            JOptionPane.showMessageDialog(null, "Identifiant ou Mot de passe incorrect ! \nVeuillez Réessayer ");
            }
              
        } else {
            
            JOptionPane.showMessageDialog(null, "Identifiant ou Mot de passe incorrect ! \nVeuillez Réessayer");
        }
    }//GEN-LAST:event_ConnexionActionPerformed

    private void loginbackgroundKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loginbackgroundKeyPressed
        
    }//GEN-LAST:event_loginbackgroundKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set th{e Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Connexion;
    private javax.swing.JTextField identifiant;
    private javax.swing.JLabel loginbackground;
    private javax.swing.JPasswordField motdepasse;
    // End of variables declaration//GEN-END:variables
}
