/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cuongdinh.assignment1;

import java.io.File;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileSystemView;

import com.cuongdinh.assignment1.crypttool.EncryptTool;

/**
 *
 * @author CuongDinh
 */
public class EncryptLayout extends javax.swing.JFrame {

    /**
     * Creates new form EncryptLayout
     */
    public EncryptLayout() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jlbSelectSource = new javax.swing.JLabel();
        jtfSelectSource = new javax.swing.JTextField();
        btnSelectSource = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jtfSelectDestination = new javax.swing.JTextField();
        btnSelectDestination = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jtfSelectAESKey = new javax.swing.JTextField();
        btnSelectAESKey = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jtfSelectRSAKey = new javax.swing.JTextField();
        btnSelectRSAKey = new javax.swing.JButton();
        btnEncrypt = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jcbSelectMode = new javax.swing.JComboBox<>();

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        jLabel4.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        jLabel4.setText("Encrypt for Fun");

        jtfSelectRSAKey.setVisible(false);
        btnSelectRSAKey.setVisible(false);
        jtfSelectDestination.setEditable(false);
        jtfSelectSource.setEditable(false);
        jtfSelectAESKey.setEditable(false);
        jtfSelectRSAKey.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup().addGap(140, 140, 140).addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(41, Short.MAX_VALUE).addComponent(jLabel4).addGap(39, 39, 39)));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jlbSelectSource.setText("Select File to Encrypt");

        btnSelectSource.setText("Browser");
        btnSelectSource.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectSourceActionPerformed(evt);
            }
        });

        jLabel2.setText("Select Folder to Save Encrypt File");

        btnSelectDestination.setText("Browser");
        btnSelectDestination.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectDestinationActionPerformed(evt);
            }
        });

        jLabel3.setText("Select AES Key");

        btnSelectAESKey.setText("Browser");
        btnSelectAESKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectAESKeyActionPerformed(evt);
            }
        });

        jLabel5.setText("Decrypt AES Key");
        jLabel5.setVisible(false);

        btnSelectRSAKey.setText("Browser");
        btnSelectRSAKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectRSAKeyActionPerformed(evt);
            }
        });

        btnEncrypt.setText("Encrypt");
        btnEncrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncryptActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jcbSelectMode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "File", "Folder" }));
        jcbSelectMode.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbSelectModeItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup().addGap(36, 36, 36).addGroup(jPanel3Layout
                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jcbSelectMode, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createSequentialGroup().addComponent(btnEncrypt).addGap(18, 18, 18)
                                .addComponent(btnBack))
                        .addComponent(jLabel5).addComponent(jLabel3).addComponent(jLabel2).addComponent(jlbSelectSource)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jtfSelectRSAKey, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jtfSelectAESKey, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jtfSelectDestination, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jtfSelectSource, javax.swing.GroupLayout.Alignment.LEADING,
                                                javax.swing.GroupLayout.PREFERRED_SIZE, 249,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnSelectSource).addComponent(btnSelectDestination)
                                        .addComponent(btnSelectAESKey).addComponent(btnSelectRSAKey))))
                        .addContainerGap(38, Short.MAX_VALUE)));
        jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jcbSelectMode, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlbSelectSource)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jtfSelectSource, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnSelectSource))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jtfSelectDestination, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnSelectDestination))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jtfSelectAESKey, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnSelectAESKey))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jtfSelectRSAKey, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnSelectRSAKey))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnEncrypt).addComponent(btnBack))
                        .addContainerGap(21, Short.MAX_VALUE)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                        Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                        Short.MAX_VALUE));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jPanel3,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                                Short.MAX_VALUE)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
                jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
                jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        pack();
        jtfSelectDestination.setMaximumSize(jtfSelectDestination.getSize());
        jtfSelectAESKey.setMaximumSize(jtfSelectAESKey.getSize());
        jtfSelectSource.setMaximumSize(jtfSelectSource.getSize());
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jcbSelectModeItemStateChanged(java.awt.event.ItemEvent evt) {
        jtfSelectSource.setText("");
        if (jcbSelectMode.getSelectedItem().toString().equals("File")) {
            jlbSelectSource.setText("Select File to Encrypt");
            jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
            jfc.setDialogTitle("Select File");
        } else {
            jlbSelectSource.setText("Select Folder containing the files to Encrypt");
            jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            jfc.setDialogTitle("Select Folder");
        }
    }

    private void btnSelectSourceActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnSelectSourceActionPerformed
        int retvalue = jfc.showOpenDialog(null);
        if (retvalue == JFileChooser.APPROVE_OPTION) {
            File selectFile = jfc.getSelectedFile();
            jtfSelectSource.setText(selectFile.getAbsolutePath());
        }
    }// GEN-LAST:event_btnSelectSourceActionPerformed

    private void btnSelectDestinationActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnSelectDestinationActionPerformed
        jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        jfc.setDialogTitle("Select Folder");
        int retvalue = jfc.showOpenDialog(null);
        if (retvalue == JFileChooser.APPROVE_OPTION) {
            File selectFile = jfc.getSelectedFile();
            jtfSelectDestination.setText(selectFile.getAbsolutePath());
        }
    }// GEN-LAST:event_btnSelectDestinationActionPerformed

    private void btnSelectAESKeyActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnSelectAESKeyActionPerformed
        jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        jfc.setDialogTitle("Select File");
        int retvalue = jfc.showOpenDialog(null);
        if (retvalue == JFileChooser.APPROVE_OPTION) {
            File selectFile = jfc.getSelectedFile();
            String fileName = selectFile.getName();
            if ((fileName.substring(fileName.length() - 4)).equals(".enc")) {
                JOptionPane.showMessageDialog(this, "The AES Key is encrypt, pls choose RSA Key to decrypt", "Warning",
                        JOptionPane.WARNING_MESSAGE);
                jLabel5.setVisible(true);
                jtfSelectRSAKey.setVisible(true);
                btnSelectRSAKey.setVisible(true);
                pack();
                jtfSelectRSAKey.setMaximumSize(jtfSelectRSAKey.getSize());
            } else {
                jLabel5.setVisible(false);
                jtfSelectRSAKey.setVisible(false);
                btnSelectRSAKey.setVisible(false);
                pack();
            }
            jtfSelectAESKey.setText(selectFile.getAbsolutePath());
        }
    }// GEN-LAST:event_btnSelectAESKeyActionPerformed

    private void btnSelectRSAKeyActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnSelectRSAKeyActionPerformed
        jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        jfc.setDialogTitle("Select File");
        int retvalue = jfc.showOpenDialog(null);
        if (retvalue == JFileChooser.APPROVE_OPTION) {
            File selectFile = jfc.getSelectedFile();
            jtfSelectRSAKey.setText(selectFile.getAbsolutePath());
        }
    }// GEN-LAST:event_btnSelectRSAKeyActionPerformed

    private void btnEncryptActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnEncryptActionPerformed
        EncryptTool encryptTool = new EncryptTool();
        try {
            SecretKey secretKey = encryptTool.loadSecretKey(jtfSelectAESKey.getText(), jtfSelectRSAKey.getText());
            if (jcbSelectMode.getSelectedItem().toString().equals("File")) {
                encryptTool.EncryptFile(jtfSelectSource.getText(), jtfSelectDestination.getText(), secretKey);
            }
            else {
                encryptTool.EncryptFolder(jtfSelectSource.getText(), jtfSelectDestination.getText(), secretKey);
            }
            JOptionPane.showMessageDialog(this, "Encrypt file successfully", "Message", JOptionPane.PLAIN_MESSAGE);
        } catch (InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | NoSuchPaddingException
                | IllegalBlockSizeException | BadPaddingException | IOException e) {
            System.err.println("Error in loadSecretKey " + e.toString());
        }

    }//GEN-LAST:event_btnEncryptActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    public void Show() {
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
            java.util.logging.Logger.getLogger(EncryptLayout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EncryptLayout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EncryptLayout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EncryptLayout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnEncrypt;
    private javax.swing.JButton btnSelectAESKey;
    private javax.swing.JButton btnSelectDestination;
    private javax.swing.JButton btnSelectRSAKey;
    private javax.swing.JButton btnSelectSource;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JComboBox<String> jcbSelectMode;
    private javax.swing.JLabel jlbSelectSource;
    private javax.swing.JTextField jtfSelectAESKey;
    private javax.swing.JTextField jtfSelectDestination;
    private javax.swing.JTextField jtfSelectRSAKey;
    private javax.swing.JTextField jtfSelectSource;

    private JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
    // End of variables declaration//GEN-END:variables
}