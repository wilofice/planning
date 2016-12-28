/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.planning.view.AdminDept;

import com.planning.dao.implement.FiliereDAO;
import com.planning.dao.implement.GroupeDAO;
import com.planning.model.ConnexionBD;
import com.planning.model.Filiere;
import com.planning.model.Groupe;
import java.awt.Color;
import java.sql.Connection;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Azough Mehdi
 */
public class Ajouter extends javax.swing.JFrame {
    Groupe groupe;
    GroupeDAO groupeD;
    FiliereDAO filD;
    ArrayList listefil;
    Filiere fil;
    Connection conn = ConnexionBD.init();
    GererGroupe gerergrp;
    public Ajouter() {
        initComponents();
        this.getContentPane().setBackground(Color.white);
        filD = new FiliereDAO(conn);
        listefil = filD.findAll();
        for (int i = 0; i < listefil.size(); i++) {
            
            fil= (Filiere)listefil.get(i);
            filierecombo.addItem(fil.getNomFiliere());
            
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

        indication = new javax.swing.JLabel();
        Sauvegarder = new javax.swing.JButton();
        annulerButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        niveaucombo = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        filierecombo = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nomgroupefield = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ajouter ");
        setMinimumSize(new java.awt.Dimension(400, 400));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        indication.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        indication.setText("Veuillez remplir les informations suivantes :");
        getContentPane().add(indication, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        Sauvegarder.setText("Enregistrer");
        Sauvegarder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SauvegarderActionPerformed(evt);
            }
        });
        getContentPane().add(Sauvegarder, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 120, 30));

        annulerButton.setText("Annuler");
        annulerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annulerButtonActionPerformed(evt);
            }
        });
        getContentPane().add(annulerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Niveau *");
        jPanel1.add(jLabel4);

        niveaucombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));
        niveaucombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                niveaucomboActionPerformed(evt);
            }
        });
        jPanel1.add(niveaucombo);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 140, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Filière *");
        jPanel2.add(jLabel3);

        filierecombo.setPreferredSize(new java.awt.Dimension(200, 25));
        filierecombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filierecomboActionPerformed(evt);
            }
        });
        jPanel2.add(filierecombo);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 290, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Nom du groupe *");
        jPanel3.add(jLabel2);

        nomgroupefield.setPreferredSize(new java.awt.Dimension(200, 27));
        jPanel3.add(nomgroupefield);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 370, 40));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void getgerergroupe(GererGroupe g){
        this.gerergrp=g;
        
    }
    
    private void SauvegarderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SauvegarderActionPerformed
        String nomgroupe = nomgroupefield.getText();
        if(!nomgroupe.equals("")) {
            int p = JOptionPane.showConfirmDialog(null,"Etes-vous sur de vouloir sauvegarder?","Confirmation",JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null);
            if(p == JOptionPane.YES_OPTION){

                int numFiliere = 0;
                String fils = (String) filierecombo.getSelectedItem();
                for (int i = 0; i < listefil.size(); i++) {
                    fil = (Filiere) listefil.get(i);
                    if(fils.equals(fil.getNomFiliere())) {
                        numFiliere = fil.getNumFiliere();
                        break;
                    }
                }
                int niveau = niveaucombo.getSelectedIndex() + 1;
                groupe = new Groupe(1, numFiliere, nomgroupe, niveau);
                groupeD = new GroupeDAO(conn);
                groupeD.create(groupe);
                this.gerergrp.affichage();
                this.dispose();

            } else if(p == JOptionPane.NO_OPTION) {

                this.dispose();
            } 
        } else {
            JOptionPane.showMessageDialog(null,"Le champ Nom du Groupe est obligatoire!","Formulaire incomplet!", JOptionPane.QUESTION_MESSAGE, null);
        }
    }//GEN-LAST:event_SauvegarderActionPerformed

    private void filierecomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filierecomboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_filierecomboActionPerformed

    private void niveaucomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_niveaucomboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_niveaucomboActionPerformed

    private void annulerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annulerButtonActionPerformed
        
        this.dispose();
    }//GEN-LAST:event_annulerButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Ajouter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ajouter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ajouter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ajouter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ajouter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Sauvegarder;
    private javax.swing.JButton annulerButton;
    private javax.swing.JComboBox<String> filierecombo;
    public javax.swing.JLabel indication;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JComboBox<String> niveaucombo;
    public javax.swing.JTextField nomgroupefield;
    // End of variables declaration//GEN-END:variables
}
