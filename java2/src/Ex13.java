import java.util.List;

/**
 * Created by Сергей on 24.01.2016.
 */
public class Ex13 {

    public static <E> void append(List<E> list) {
        E elem = new E();  // compile-time error
        //list.add(elem);
    }
}
