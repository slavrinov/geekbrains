package second;


import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<String> s = Arrays.asList("fasfasfasdf", "fdfsa", "aaa", "b", "cd");
        Collections.sort(s, new LengthComparator());
        System.out.println(s);

    }

}
