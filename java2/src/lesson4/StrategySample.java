package lesson4;

import lesson4.Encryption;
import lesson4.Md5Strategy;
import lesson4.Strategy;

/**
 * Created on 13/08/14.
 */
public class StrategySample {

    public static void main(String[] args) {
        Encryption md5 = new Encryption(new Md5Strategy());
        System.out.println(md5.encode(""));


        Encryption aes = new Encryption(new AesStrategy());
        System.out.println(aes.encode(""));

        Encryption my = new Encryption(new Strategy() {
            @Override
            public String algorithm(String str) {
                return "My!";
            }
        });
    }

}
