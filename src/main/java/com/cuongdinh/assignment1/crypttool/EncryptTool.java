/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cuongdinh.assignment1.crypttool;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.stream.Stream;

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
public class EncryptTool {

    public EncryptTool() {

    }

    public void EncryptFile(String srcPath, String destinationPath, SecretKey secretKey) {
        try {
            File encFile = new File(srcPath);
            byte[] encByte = Files.readAllBytes(Paths.get(srcPath));
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5PADDING");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            byte[] b = cipher.doFinal(encByte);
            FileOutputStream out = new FileOutputStream(destinationPath + "\\" + encFile.getName() + ".aes");
            out.write(b);
            out.close();
        } catch (IOException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException
                | IllegalBlockSizeException | BadPaddingException e) {
            JOptionPane.showMessageDialog(null, "Error", "Warning", JOptionPane.WARNING_MESSAGE);
            System.err.println("Error in EncryptFile " + e.toString());
        }
        
    }

    public void EncryptFolder(String srcPath, String destinationPath, SecretKey secretKey) {
        // srcPath is Directory
        try {
            Stream<Path> paths = Files.walk(Paths.get(srcPath));
            paths.forEach(filePath -> {
                if (Files.isRegularFile(filePath)) {
                    EncryptFile(filePath.toString(), destinationPath, secretKey);
                }
            });
            paths.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error", "Warning", JOptionPane.WARNING_MESSAGE);
            System.err.println("Error in EncryptFolder " + e.toString());
        }
    }

    public SecretKey loadSecretKey(String AESKeyPath, String RSAKeyPath) throws IOException, NoSuchAlgorithmException,
            InvalidKeySpecException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException,
            BadPaddingException {
        SecretKey secretKey;
        
        byte[] keybytes = Files.readAllBytes(Paths.get(AESKeyPath));

        if (RSAKeyPath.equals("")) {
            secretKey = new SecretKeySpec(keybytes, "AES");
        } else {
            PublicKey publicKey;
            byte[] publicKeyByte = Files.readAllBytes(Paths.get(RSAKeyPath));
            X509EncodedKeySpec ks = new X509EncodedKeySpec(publicKeyByte);
            KeyFactory kf = KeyFactory.getInstance("RSA");
            publicKey = kf.generatePublic(ks);

            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(Cipher.DECRYPT_MODE, publicKey);
            byte[] b = cipher.doFinal(keybytes);

            System.err.println(b.length);
            secretKey = new SecretKeySpec(b, "AES");
        }
        return secretKey;
    }
}
