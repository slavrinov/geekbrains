package lesson4;

import java.util.HashMap;

/**
 *
 */
public class AccessTest {


    private int privateField;

    protected int protectedField;

    HashMap map =new HashMap();
    public AccessTest() {
    }

    AccessTest(int privateField) {
        this.privateField = privateField;
    }

    // Доступно ли приватное поле из другого экземпляра того же класса?
    public void foo(AccessTest other) {
        if (this.privateField > other.privateField) {
            System.out.println("TEST completed.");

        }
    }


    public static void main(String[] args) {
        AccessTest s1 = new AccessTest(42);
        AccessTest s2 = new AccessTest(20);

        s1.foo(s2);
    }
}
