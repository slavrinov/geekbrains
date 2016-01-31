import java.util.PriorityQueue;

/**
 * Created by Сергей on 20.01.2016.
 */
public class Ex1<T> {

    PriorityQueue<Object> objects = new PriorityQueue<Object>();

    public static void main(String[] args) {
        Ex1<Integer> intBox = new Ex1<Integer>();

        // If the actual type argument is omitted, you create a raw type of Box<T>:

        Ex1<Integer> rawBox = new Ex1();           // rawBox is a raw type of Box<T>

        Ex1<String> stringBox = new Ex1<String>();
        //rawBox = stringBox;               // OK

        //But if you assign a raw type to a parameterized type, you get a warning:

        intBox = rawBox;     // warning: unchecked conversion


        Ex1<String> stringBox2 = new Ex1<String>();
        Ex1 rawBox2 = stringBox;
        rawBox2.set(8);  // warning: unchecked invocation to set(T)
    }

    public void set(Object o) {
        objects.add(o);
    }

}