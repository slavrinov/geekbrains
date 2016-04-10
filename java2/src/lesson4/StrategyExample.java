package lesson4;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.util.Arrays;

/**
 *
 */
public class StrategyExample {

    public static void main(String[] args) throws Exception {
        System.out.println("AES: " + encrypt("helloworld_test!", new Aes()));
        System.out.println("MD5: " + encrypt("helloworld", new Md5()));
    }

    static String encrypt(String string, Strategy2 strategy) throws Exception {
        return strategy.encrypt(string);
    }
}

interface Strategy2 {
    String encrypt(String s) throws Exception;

    String decrypt(String s) throws Exception;
}

class Aes implements Strategy2 {

    private static final String IV = "AAAAAAAAAAAAAAAA";
    static String encryptionKey = "0123456789abcdef";

    @Override
    public String encrypt(String plainText) throws Exception {
        Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding", "SunJCE");
        SecretKeySpec key = new SecretKeySpec(encryptionKey.getBytes("UTF-8"), "AES");
        cipher.init(Cipher.ENCRYPT_MODE, key, new IvParameterSpec(IV.getBytes("UTF-8")));
        return Arrays.toString(cipher.doFinal(plainText.getBytes("UTF-8")));
    }

    @Override
    public String decrypt(String s) throws Exception {
        Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding", "SunJCE");
        SecretKeySpec key = new SecretKeySpec(encryptionKey.getBytes("UTF-8"), "AES");
        cipher.init(Cipher.DECRYPT_MODE, key, new IvParameterSpec(IV.getBytes("UTF-8")));
        return new String(cipher.doFinal(s.getBytes()), "UTF-8");
    }
}

class Md5 implements Strategy2 {


    private MessageDigest md;

    public Md5() throws Exception {
        md = MessageDigest.getInstance("MD5");
    }

    @Override
    public String encrypt(String s) {
        return Arrays.toString(md.digest(s.getBytes()));
    }

    @Override
    public String decrypt(String s) {
        return "MD5 decryption: " + s;
    }
}

