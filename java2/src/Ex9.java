import java.util.Arrays;
import java.util.List;

/**
 * Created by Сергей on 23.01.2016.
 */
public class Ex9 {

    //скомпилируется ли код?
        static void swapFirst(List<Number> l1,List<Number> l2) {
            Number temp = l1.get(0);
            l1.set(0,l2.get(0));
            l2.set(0,temp);

   }

    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1, 2, 3);
        List<Double> ld = Arrays.asList(10.10, 20.20, 30.30);
        //swapFirst(li, ld);
    }
}
