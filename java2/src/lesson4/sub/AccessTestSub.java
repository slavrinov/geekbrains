package lesson4.sub;

import lesson4.AccessTest;

/**
 *
 */
public class AccessTestSub extends AccessTest {

    public AccessTestSub(int field) {
    }

    // Доступно ли protected поле родительского класса?
    public void func(AccessTest other) {
        //if (this.protectedField == other.protectedField) {
        //    System.out.println("TEST");
        //}
    }
}
