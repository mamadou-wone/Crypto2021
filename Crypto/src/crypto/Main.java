/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crypto;

import javax.crypto.SecretKey;

/**
 *
 * @author mamadou
 */
public class Main {
    public static void main(String[] args) {
        CryptoImpl crypto = new CryptoImpl();
        SecretKey key = crypto.genKey("AES", 128);
        System.out.println(key.getEncoded().length * 8);
    }
}
