package com.von.demotransaction;

import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

/**
 * @author ： fjl
 * @date ： 2019/5/7/007 15:44
 */
public class JavaCryp {

    public static void main(String[] args) throws Exception {

        String pwd="12345";

        aes(pwd);
    }

    public static void des(String pwd) throws Exception{
        //密钥key
        KeyGenerator aes = KeyGenerator.getInstance("DES");
        aes.init(56);
        SecretKey secretKey = aes.generateKey();
        byte[] key = secretKey.getEncoded();

        //加密
        SecretKeySpec keySpec = new SecretKeySpec(key, "DES");
        Cipher cipher = Cipher.getInstance("DES");
        cipher.init(Cipher.ENCRYPT_MODE,keySpec);
        byte[] bytes = cipher.doFinal(pwd.getBytes());

        //解密
        SecretKeySpec deKeySpec = new SecretKeySpec(key, "DES");
        Cipher decipher = Cipher.getInstance("DES");
        decipher.init(Cipher.DECRYPT_MODE,deKeySpec);
        byte[] bytes1 = decipher.doFinal(bytes);
        System.out.println(new String(bytes1));
    }


    public static void aes(String pwd) throws Exception{
        //密钥key
        KeyGenerator aes = KeyGenerator.getInstance("AES");
        aes.init(128);
        SecretKey secretKey = aes.generateKey();
        byte[] key = secretKey.getEncoded();

        //加密
        SecretKeySpec keySpec = new SecretKeySpec(key, "AES");
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE,keySpec);
        byte[] bytes = cipher.doFinal(pwd.getBytes());

        //解密
        SecretKeySpec deKeySpec = new SecretKeySpec(key, "AES");
        Cipher decipher = Cipher.getInstance("AES");
        decipher.init(Cipher.DECRYPT_MODE,deKeySpec);
        byte[] bytes1 = decipher.doFinal(bytes);
        System.out.println(new String(bytes1));
    }
}
