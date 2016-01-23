/**
 * Created by Сергей on 22.01.2016.
 */
public class Ex4 {

    public static void boxTest(Box<Number> n) { /* ... */ }

    public static void main(String[] args) {
        //скомплируется ли код?
        //boxTest(11);
        //boxTest(44f);
    }

    class Box<T> {
    }
}
