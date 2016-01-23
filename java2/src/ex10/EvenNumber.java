package ex10;

/*
    *
    You can add null.
    You can invoke clear.
    You can get the iterator and invoke remove.
    You can capture the wildcard and write elements that you've read from the list.
    * */


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
        /*List<EvenNumber> le = new ArrayList<>();
        List<? extends NaturalNumber> ln = le;
        ln.add(new EvenNumber(35));*/
    }
}
