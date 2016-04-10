/**
 * Created by Сергей on 22.01.2016.
 */
public class Ex4 {

    public static void boxTest(Box<Number> n) { /* ... */ }

    public static void main(String[] args) {
        //скомплируется ли код?
        boxTest(new Box<Number>());
        //boxTest(new Box<Float>());

    }

    static class Box<T> {
    }
}
