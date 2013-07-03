/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csl.common.util;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.binary.Base64;

/**
 *
 * @author Deni Husni FR
 */
public class AESUtil {

    private static final org.apache.log4j.Logger LOGGER = org.apache.log4j.Logger.getLogger(AESUtil.class);

    public static String getAESEncription(String input, byte[] keyValue, String typeEncription) {

        SecretKeySpec key = new SecretKeySpec(keyValue, "AES");
        byte[] encVal = null;
        try {
            Cipher cipher = Cipher.getInstance(typeEncription);
            cipher.init(Cipher.ENCRYPT_MODE, key);
            encVal = cipher.doFinal(input.getBytes());
        } catch (NoSuchAlgorithmException ex) {
            LOGGER.error("Error", ex);
        } catch (NoSuchPaddingException ex) {
            LOGGER.error("Error", ex);
        } catch (InvalidKeyException ex) {
            LOGGER.error("Error", ex);
        } catch (IllegalBlockSizeException ex) {
            LOGGER.error("Error", ex);
        } catch (BadPaddingException ex) {
            LOGGER.error("Error", ex);
        }
        return Base64.encodeBase64String(encVal);
    }

    public static String getAESDescription(String ouput, byte[] keyValue, String typeEncription) {
        SecretKeySpec key = new SecretKeySpec(keyValue, "AES");
        byte[] encVal = null;
        try {
            Cipher cipher = Cipher.getInstance(typeEncription);
            cipher.init(Cipher.DECRYPT_MODE, key);
            byte[] decordedValue = Base64.decodeBase64(ouput);
            encVal = cipher.doFinal(decordedValue);
        } catch (NoSuchAlgorithmException ex) {
                LOGGER.error("Error", ex);
        } catch (NoSuchPaddingException ex) {
                LOGGER.error("Error", ex);
        } catch (InvalidKeyException ex) {
               LOGGER.error("Error", ex);
        } catch (IllegalBlockSizeException ex) {
               LOGGER.error("Error", ex);
        } catch (BadPaddingException ex) {
                 LOGGER.error("Error", ex);
        }

        return new String(encVal);
    }
}
