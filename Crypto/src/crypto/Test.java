/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crypto;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

/**
 *
 * @author mamadou
 */
public class Test {

//    public static void main(String[] args) {
//
//        //CHIFFREMENT
//        CryptoImpl crypto = new CryptoImpl();
//        SecretKey key = crypto.genKey("AES", 128);
//        try {
//            Cipher c = Cipher.getInstance("AES/CBC/PKCS5Padding");
//            IvParameterSpec iv = new IvParameterSpec("BonjourlaFamille".getBytes());
//            c.init(Cipher.ENCRYPT_MODE, key, iv);
//            try {
//                BufferedInputStream file = new BufferedInputStream(new FileInputStream("source.txt"));
//                BufferedOutputStream buffer = new BufferedOutputStream(new FileOutputStream("test.txt"));
//                CipherOutputStream cos = new CipherOutputStream(buffer, c);
//                int lines = 0;
//                while ((lines = file.read()) != -1) {
//                   // System.out.print((char) lines);
//                    cos.write(lines);
//                    
//                }
//                buffer.close();
//                file.close();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
////            BufferedInputStream decrypt = new BufferedInputStream(new FileInputStream("test.txt"));
////            BufferedOutputStream buffer2 = new BufferedOutputStream(new FileOutputStream("test.txt"));
//            FileInputStream decrypt = new FileInputStream("test.txt");
//            CipherInputStream in = new CipherInputStream(decrypt, c);
//            c.init(Cipher.DECRYPT_MODE, key, iv);
//            int d_lines = 0;
//            while ((d_lines = in.read()) != -1) {                
//                System.out.print(((char)d_lines));
//            }
//            in.close();
//            decrypt.close();
//           
//            
//            byte[] cipherText = c.doFinal("Bonjour".getBytes());
//            String encoding = Base64.getEncoder().encodeToString(cipherText);
//            System.out.println(encoding);
//
//            //DECHIFFREMENT
//            c.init(Cipher.DECRYPT_MODE, key, iv);
//            byte[] plainText = c.doFinal(cipherText);
//            System.out.println(new String(plainText));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }
}
