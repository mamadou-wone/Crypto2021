/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crypto;

import java.util.Base64;
import javax.crypto.SecretKey;
import javax.swing.JFileChooser;
import javax.swing.plaf.FileChooserUI;

/**
 *
 * @author mamadou
 */
public class Main {
    //SecretKeyFactory
    public static void main(String[] args) {
        CryptoImpl crypto = new CryptoImpl();
        SecretKey key = crypto.genKey("AES", 128);
        SecretKey key2 = null;
        JFileChooser jfc = new JFileChooser();
        int option = jfc.showSaveDialog(jfc);
        if (option == JFileChooser.APPROVE_OPTION) {
            String filePath = jfc.getSelectedFile().getAbsolutePath();
            crypto.saveKey(key, filePath);
        }
        
        option = jfc.showOpenDialog(jfc);
        if (option == JFileChooser.APPROVE_OPTION) {
            String filePath = jfc.getSelectedFile().getAbsolutePath();
            key2 = crypto.getKey(filePath);
        }
        
        
       String encoding = Base64.getEncoder().encodeToString(key.getEncoded());
       System.out.println(encoding);
       String encoding2 = Base64.getEncoder().encodeToString(key2.getEncoded());
       System.out.println(encoding);
    }
}
