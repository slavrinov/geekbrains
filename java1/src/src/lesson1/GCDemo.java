package lesson1;

/**
 * Created by Сергей on 27.03.2016.
 */
public class GCDemo {

    // сколько объектов подлежат утилизации после строки 7
    public static void main(String[] args) {
        Object a = new Integer(100);  // Line1
        Object b = new Long(100);     // Line2
        Object c = new String("100"); // Line3
        a = null;                     // Line4
        a = c;                        // Line5
        c = b;                        // Line6
        b = a;                        // Line7
        // Rest of the code here
    }
}

