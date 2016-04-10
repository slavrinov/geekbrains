package lesson4;

/**
 *
 */
public class AccessTest2 {

    public void testAccess(AccessTest accessTest) {
        // Доступ к приватному полю из другого класса
        System.out.println(accessTest.protectedField);
    }
}
