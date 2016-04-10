package ex10;

/*
    *
    You can add null.
    You can invoke clear.
    You can get the iterator and invoke remove.
    You can capture the wildcard and write elements that you've read from the list.
    * */


import java.util.ArrayList;
import java.util.List;

/**
 * Created by Сергей on 23.01.2016.
 */
public class EvenNumber extends NaturalNumber {

    public EvenNumber(int i) {
        super(i);
    }
    // ...


    public static void main(String[] args) {

        //Скомпилируется ли код?
        //List<Integer> le = new ArrayList<>();
        List<? super Number> ln = new ArrayList<>();
        ln.add(new Integer(1));
        ln.add(new Double(1.4));
        ln.add(new Float(1.4));
        //ln.add(new Object());

        //todo explain
        List<? extends Integer> ln2 = new ArrayList<>();
        //ln2.add(new Object());
    }
}
