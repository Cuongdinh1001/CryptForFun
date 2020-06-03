/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cuongdinh.assignment1.crypttool;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Arrays;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JOptionPane;

/**
 *
 * @author CuongDinh
 */
public class Genkey {

    public Genkey() {

    }

    public void GenAndSaveAESKeyWithEncryt(String keyName, String Content, String destinationPath, String RSAKeyPath) {
        try {
            // create aes key
            SecretKey secretKey;
            byte[] key = Content.getBytes("UTF-8");
            MessageDigest sha = MessageDigest.getInstance("SHA-256");
            key = sha.digest(key);
            key = Arrays.copyOf(key, 32);
            secretKey = new SecretKeySpec(key, "AES");
            // load private rsa key
            PrivateKey privateKey;
            key = Files.readAllBytes(Paths.get(RSAKeyPath));
            PKCS8EncodedKeySpec ks = new PKCS8EncodedKeySpec(key);
            KeyFactory kf = KeyFactory.getInstance("RSA");
            privateKey = kf.generatePrivate(ks);
            // encrypt aes key
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(Cipher.ENCRYPT_MODE, privateKey);

            FileOutputStream out = new FileOutputStream(destinationPath + "\\" + keyName + ".enc");
            byte[] b = cipher.doFinal(secretKey.getEncoded());
            out.write(b);
            out.close();
            JOptionPane.showMessageDialog(null, "Gen key successfully", "Message", JOptionPane.PLAIN_MESSAGE);
        } catch (NoSuchAlgorithmException | IOException | InvalidKeySpecException | NoSuchPaddingException
                | InvalidKeyException | IllegalBlockSizeException | BadPaddingException e) {
            JOptionPane.showMessageDialog(null, "Error", "Message", JOptionPane.ERROR_MESSAGE);
            System.err.println("Gen AES Key With RSA " + e.toString());
        }

    }

    public void GenAndSaveAESKeyWithoutEncrypt(String keyName, String Content, String destinationPath) {
        try {
            // create aes key
            SecretKey secretKey;
            byte[] key = Content.getBytes("UTF-8");
            MessageDigest sha = MessageDigest.getInstance("SHA-256");
            key = sha.digest(key);
            key = Arrays.copyOf(key, 32);
            secretKey = new SecretKeySpec(key, "AES");
            // save aes key

            FileOutputStream out = new FileOutputStream(destinationPath + "\\" + keyName + ".txt");
            out.write(secretKey.getEncoded());
            out.close();
            JOptionPane.showMessageDialog(null, "Gen key successfully", "Message", JOptionPane.PLAIN_MESSAGE);
        } catch (NoSuchAlgorithmException | IOException e) {
            JOptionPane.showMessageDialog(null, "Error", "Message", JOptionPane.ERROR_MESSAGE);
            System.err.println("Gen AES Key Without RSA " + e.toString());
        }
    }

    public void GenAndSaveRSAKey(String srcPath, int KeySize) {
        try {
            KeyPairGenerator keyGen;
            keyGen = KeyPairGenerator.getInstance("RSA");
            keyGen.initialize(KeySize);
            KeyPair keyPair = keyGen.genKeyPair();
            PrivateKey privateKey = keyPair.getPrivate();
            PublicKey publicKey = keyPair.getPublic();

            FileOutputStream out1 = new FileOutputStream(srcPath + "\\public.pub");
            out1.write(publicKey.getEncoded());
            FileOutputStream out2 = new FileOutputStream(srcPath + "\\private.pri");
            out2.write(privateKey.getEncoded());
            out1.close();
            out2.close();
            JOptionPane.showMessageDialog(null, "Gen key successfully", "Message", JOptionPane.PLAIN_MESSAGE);
        } catch (NoSuchAlgorithmException | IOException e) {
            JOptionPane.showMessageDialog(null, "Error", "Message", JOptionPane.ERROR_MESSAGE);
            System.err.println("Gen RSA Key " + e.toString());
        }
        
    }
}
