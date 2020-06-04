package com.cuongdinh.assignment1.crypttool;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class Checkfile {

    public Checkfile() {

    }

    public String HashFile(String Path, String algorithm) throws NoSuchAlgorithmException, IOException {
        MessageDigest md = MessageDigest.getInstance(algorithm);
        byte[] file = Files.readAllBytes(Paths.get(Path));
        byte[] checkSum = md.digest(file);
        StringBuffer hexStringBuffer = new StringBuffer();
        for (byte b : checkSum) {
            hexStringBuffer.append(String.format("%02X", b));
        }
        return hexStringBuffer.toString().toUpperCase();
    }
    
}