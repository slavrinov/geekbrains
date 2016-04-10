package lesson1.homework;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 *
 */
public class Util {

    // Raw type version
    public static <T extends Number> Set<T> union(Set<T> s1, Set<T> s2) {
        Set<T> result = new HashSet<>();
        result.addAll(s1);
        result.addAll(s2);
        return result;
    }

    public static <T> T getMax(List<T> list, Comparator<T> cmp) {
        Iterator<T> iter = list.iterator();
        T max = iter.next();
        while (iter.hasNext()) {
            T t = iter.next();
            if (cmp.compare(t, max) > 0) {
                max = t;
            }
        }
        return max;
    }
}
