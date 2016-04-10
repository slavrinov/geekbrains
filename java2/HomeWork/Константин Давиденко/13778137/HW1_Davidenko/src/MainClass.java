import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainClass {

    public static void main(String[] args) {
        List<Number> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        List<? super Number> consumer = list;
        consumer.add(new Integer(2));
        consumer.add(new Double(1.2));

        List<? extends Number> producer = list;
        for (Number n : producer)
            System.out.println(n);

        System.out.println(countGreaterThan(new Integer[]{1, 2, 3, 4}, new Integer(1)));

        List<? super C> lc = new ArrayList<>(); // can add C and its children, read only Object
        //lc.add(new A()); // A is higher than C
        // lc.add(new B()); // B is higher than C
        lc.add(new C());
        lc.add(new D());
        for (Object o : lc)
            System.out.println(o);

        List<? extends C> lc1 = new ArrayList<D>(); // can read C
        for (C c : lc1) // ok, because D is a C
            c.cMethod(); // or c.aMethod(); // but not c.dMethod();


        List<String> strs = new ArrayList<>();
//        List<Object> objs = strs;
        List<? extends Object> objs = strs;

//        String[] strings = new String[1];
//        Object[] objects = strings;
//        objects[0] = new Integer(1);
    }

    public static <T extends Number & Comparable<T>> int countGreaterThan(T[] array, T elem) {
        int count = 0;

        for (T e : array)
            if (e.compareTo(elem) > 0)
                count++;

        return count;
    }

    class MyClass<T extends Comparable<T>> {
        public boolean less(T t1, T t2) {
            return t1.compareTo(t2) < 0;
        }

        <T extends Number> void foo(List<T> l1, List<T> l2) {
            l1.set(0, l2.get(0));
        }
    }

    static class A {
        public static void aMethod() {
        }
    }

    static class B extends A {
        public static void bMethod() {
        }
    }

    static class C extends B {
        public static void cMethod() {
        }
    }

    static class D extends C {
        public static void dMethod() {
        }
    }
}