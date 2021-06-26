/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crypto;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

/**
 *
 * @author mamadou
 */
// #  ___       __   ________  ________   _______
// # |\  \     |\  \|\   __  \|\   ___  \|\  ___ \
// # \ \  \    \ \  \ \  \|\  \ \  \\ \  \ \   __/|
// #  \ \  \  __\ \  \ \  \\\  \ \  \\ \  \ \  \_|/__
// #   \ \  \|\__\_\  \ \  \\\  \ \  \\ \  \ \  \_|\ \
// #    \ \____________\ \_______\ \__\\ \__\ \_______\
// #     \|____________|\|_______|\|__| \|__|\|_______|
public interface ICipher {

    public static final IvParameterSpec iv = new IvParameterSpec("MamadouIbnHamire".getBytes());
    public static final String cipherAlgorithm = "AES/CBC/PKCS5Padding";
    public static final String keyAlgorithme = "AES";
    public static final int keySize = 128;

    /**
     * *
     *
     * @param cipherAlgorithm L'algorithme de Chiffrement
     * @param iv Le vecteur d'initialisation
     * @param key la clé secrete
     * @param mode le mode ENCRYPT/DECRYPT
     * @return L'instance de Pour le Dechiffrement
     */
    public Cipher getCipher(String cipherAlgorithm, IvParameterSpec iv, SecretKey key, int mode);

    /**
     * *
     *
     * @param c L'instance (Chiffement ou Dechiffrement)
     * @param originalFilePath Le chemein du fichier à chiffrer
     * @param encryptFilePath Le chemin du fichier à enregistrer
     * @return True si l'opération s'est bien déroulée sinon false
     */
    public boolean encryptFile(Cipher c, String originalFilePath, String encryptFilePath);

    /**
     * *
     *
     * @param c L'instance (Chiffement ou Dechiffrement)
     * @param encryptFilePath Le chemein du fichier chiffrer
     * @param decryptedFilePath Le chemin du fichier déchiffrer
     * @return True si l'opération s'est bien déroulée sinon false
     */
    public boolean decryptFile(Cipher c, String encryptFilePath, String decryptedFilePath);
}
