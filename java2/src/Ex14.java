import java.util.ArrayList;
import java.util.List;

/**
 * Created by Сергей on 24.01.2016.
 */
public class Ex14 {

    public static <E> void one(List<E> list) {
        /*if (list instanceof ArrayList<Integer>) {  // compile-time error
            // ...
        }*/
    }

    public static void two() {
        List<Integer> li = new ArrayList<>();
        //   List<Number> ln = (List<Number>) li;  // compile-time error

        //However, in some cases the compiler knows that a type parameter is always valid and allows the cast. For example:

        List<String> l1 = new ArrayList<>();
        ArrayList<String> l2 = (ArrayList<String>) l1;  // OK

    }
}
