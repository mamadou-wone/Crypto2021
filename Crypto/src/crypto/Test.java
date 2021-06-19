/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crypto;

import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

/**
 *
 * @author mamadou
 */
public class Test {
    public static void main(String[] args) {
        
        //CHIFFREMENT
        CryptoImpl crypto = new CryptoImpl();
        SecretKey key = crypto.genKey("AES", 128);
        try {       
        Cipher c = Cipher.getInstance("AES/CBC/PKCS5Padding");
        IvParameterSpec iv = new IvParameterSpec("BonjourlaFamille".getBytes());
        c.init(Cipher.ENCRYPT_MODE, key, iv);
        byte[] cipherText = c.doFinal("Bonjour".getBytes());
        String encoding = Base64.getEncoder().encodeToString(cipherText);
        System.out.println(encoding);
        
        //DECHIFFREMENT
        c.init(Cipher.DECRYPT_MODE, key, iv);
        byte[] plainText = c.doFinal(cipherText);
        System.out.println(new String(plainText));
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
