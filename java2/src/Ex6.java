/**
 * Created by Сергей on 22.01.2016.
 */
public class Ex6 {


    public static <T extends Comparable<T>> int countGreaterThan(T[] anArray, T elem) {
        int count = 0;
        for (T e : anArray)
            if (e.compareTo(elem) > 0)
                ++count;
        return count;
    }

    interface Comparable<T> {
        public int compareTo(T o);
    }
}
