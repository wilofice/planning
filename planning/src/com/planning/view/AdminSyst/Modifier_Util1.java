/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.planning.view.AdminSyst;

import com.planning.dao.implement.EnseignantDAO;
import com.planning.dao.implement.UsersDAO;
import com.planning.model.ConnexionBD;
import com.planning.model.Enseignant;
import com.planning.model.Users;
import javax.swing.JOptionPane;

/**
 *
 * @author Azough Mehdi
 */
public class Modifier_Util1 extends javax.swing.JFrame {
    GererUtilisateurs gu = new GererUtilisateurs();
    /**
     * Creates new form Ajouter_Modifier_Util
     */
    public Modifier_Util1() {
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

        jLabel3 = new javax.swing.JLabel();
        nomfield = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        prenomfield = new javax.swing.JTextField();
        mailfield = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        telfield = new javax.swing.JTextField();
        idfield = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Enregistrer = new javax.swing.JButton();
        Annuler = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Modifier utilisateur");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        nomfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomfieldActionPerformed(evt);
            }
        });
        getContentPane().add(nomfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 250, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Nom");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Prenom");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        prenomfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prenomfieldActionPerformed(evt);
            }
        });
        getContentPane().add(prenomfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 250, 30));
        getContentPane().add(mailfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 250, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("mail");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Tel");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));
        getContentPane().add(telfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 250, 30));

        idfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        idfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idfieldActionPerformed(evt);
            }
        });
        getContentPane().add(idfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 220, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Saisir l'identifiant de l'utilisateur");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, -1, -1));

        Enregistrer.setText("Enregistrer");
        Enregistrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnregistrerActionPerformed(evt);
            }
        });
        getContentPane().add(Enregistrer, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 120, 30));

        Annuler.setText("Annuler");
        Annuler.setToolTipText("");
        Annuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnnulerActionPerformed(evt);
            }
        });
        getContentPane().add(Annuler, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 120, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void prenomfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prenomfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prenomfieldActionPerformed

    private void idfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idfieldActionPerformed

    private void nomfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomfieldActionPerformed

    private void AnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnnulerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AnnulerActionPerformed

    private void EnregistrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnregistrerActionPerformed
        // TODO add your handling code here:
        UsersDAO usersDAO = new UsersDAO(ConnexionBD.init());
        EnseignantDAO enseignantDAO = new EnseignantDAO(ConnexionBD.init());

        int row = gu.listeutilisateur.getSelectedRow();
        String nom = new String(nomfield.getText());
        String prenom = new String(prenomfield.getText());
        String mail = new String(mailfield.getText());
        String tel = new String(telfield.getText());
        String id = new String(idfield.getText());

        if ( nom!= null){
            if(prenom != null){
                if(mail != null){
                    if(tel != null){
                        if(id != null){
                            Users user = new Users(id);
                            Enseignant ens = new Enseignant(10,nom,prenom,mail,tel,id);
                            usersDAO.update(user);
                            enseignantDAO.update(ens);
                            gu.listeutilisateur.getModel().setValueAt(nom, row, 0);
                            gu.listeutilisateur.getModel().setValueAt(prenom, row, 1);
                            gu.listeutilisateur.getModel().setValueAt(mail, row, 2);
                            gu.listeutilisateur.getModel().setValueAt(tel, row, 3);
                            gu.listeutilisateur.getModel().setValueAt(id, row, 4);
                            JOptionPane.showMessageDialog(null, "Enseignant modifié avec succès");
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Veuillez remplir tous les champs");
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Veuillez remplir tous les champs");
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Veuillez remplir tous les champs");
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Veuillez remplir tous les champs");
            }  
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Veuillez remplir tous les champs");
        }

    }//GEN-LAST:event_EnregistrerActionPerformed

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
            java.util.logging.Logger.getLogger(Modifier_Util1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modifier_Util1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modifier_Util1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modifier_Util1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modifier_Util1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Annuler;
    private javax.swing.JButton Enregistrer;
    public javax.swing.JTextField idfield;
    public javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    public javax.swing.JTextField mailfield;
    public javax.swing.JTextField nomfield;
    public javax.swing.JTextField prenomfield;
    public javax.swing.JTextField telfield;
    // End of variables declaration//GEN-END:variables
}
