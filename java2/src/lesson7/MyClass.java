package lesson7;

/**
 * Created by Сергей on 03.04.2016.
 */
public class MyClass<T extends Comparable<T>> {

    int compareTo(T t, T t2) {
        //do some work
       return t.compareTo(t2);
    }



    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        int res = myClass.compareTo(10, 15);
        System.out.println("res = " + res);

        int res2 = myClass.compareTo("afroifjr", "rfrfrf");
        System.out.println("res = " + res2);

    }

}
