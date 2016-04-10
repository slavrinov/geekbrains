package lesson4;


public class NestedInner {
    int a;
    static int b;

    // Вложенный
    static class Nested {
        int b;
    }

    // Внутренний
    class Inner {
        int a;

        void foo() {
            this.a = 10; // Inner
            NestedInner.this.a = 12; // Main
        }
    }

    public static void foo() {

    }

    public static void main(String[] args) {
        NestedInner.b = 100;

        // объекта еще нет!
        foo();

        NestedInner n = new NestedInner();
        n.a = 10;


        Nested nested = new Nested();

    }

}
