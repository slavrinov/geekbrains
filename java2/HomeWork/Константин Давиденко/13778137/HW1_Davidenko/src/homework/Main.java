package homework;

import java.util.*;

public class Main {

    public static void main(String[] args) throws StackException {

        // Задание 1
        GenericStack<String> genericStack = new GenericStack<>();

        List<String> list = Arrays.asList("a", "b", "c");
        genericStack.pushAll(list);

        LinkedList<Object> dst = new LinkedList<>();
        genericStack.popAll(dst);

        System.out.println(dst);

        // Задание 2
        List<String> s = Arrays.asList("aaaa", "d", "cc", "bb");
        Collections.sort(s, new LengthComparator());
        System.out.println(s);
    }
}
