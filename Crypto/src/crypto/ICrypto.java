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
public interface ICrypto {
    
    /**
     * Cette Méthode permet de générer une clé 
     * @param algo : L'algorithme de chiffrement (ex:"AES","DES")
     * @param keySize : La Taille de la clé (ex: 128 ou 256)
     * @return : La clé générée
     */
    public SecretKey genKey(String algo, int keySize);
    
    //Cette Méthode permet de stocké la clé
    /**
     * 
     * @param key
     * @param filePath
     * @return 
     */
    public String saveKey(SecretKey key, String filePath);
    
    /**
     * 
     * @param filePath
     * @return 
     */
    public SecretKey getKey(String filePath);
}
