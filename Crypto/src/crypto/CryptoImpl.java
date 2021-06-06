/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crypto;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

/**
 *
 * @author mamadou
 */
public class CryptoImpl implements ICrypto{

    @Override
    public SecretKey genKey(String algo, int keySize) {      
        try {
            KeyGenerator gen = KeyGenerator.getInstance(algo);
            gen.init(keySize);
            SecretKey key = gen.generateKey();
            return key;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public String saveKey(SecretKey key, String filePath) {
        try {
            FileOutputStream fos = new FileOutputStream(filePath);
            ObjectOutputStream obj = new ObjectOutputStream(fos);
            obj.writeObject(key);
            obj.close();
            fos.close();
            return filePath;
        } catch (Exception ex) {
            ex.printStackTrace();
        } 
        return null;
    }

    @Override
    public SecretKey getKey(String filePath) {
        try {
            FileInputStream fis = new FileInputStream(filePath);
            ObjectInputStream ois = new ObjectInputStream(fis);
            SecretKey key = (SecretKey) ois.readObject();
            return key;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    
    
}
