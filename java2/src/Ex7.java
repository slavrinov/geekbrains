import java.util.ArrayList;
import java.util.List;

/**
 * Created by Сергей on 22.01.2016.
 */
public class Ex7 {

    public static void printList1(List<Object> list) {
        for (Object elem : list)
            System.out.println(elem + " ");
        System.out.println();
    }

    //he goal of printList is to print a list of any type, but it fails to achieve that goal
    // — it prints only a list of Object instances; it cannot print List<Integer>, List<String>,
    // List<Double>, and so on, because they are not subtypes of List<Object>. To write a generic printList method, use List<?>:

    public static void printList2(List<?> list) {
        for (Object elem : list)
            System.out.print(elem + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        List<Object> list = new ArrayList<Object>();
        list.add(1);
        list.add(2);
        list.add(3);
        List<Number> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        printList2(list2);

        List<Double> list3 = new ArrayList<>();
        list3.add(1.1);
        list3.add(2.2);
        list3.add(3.2);
        printList2(list3);

        List<String> list4 = new ArrayList<>();
        list4.add("eferf");
        list4.add("rfrf");
        list4.add("ferferferf");
        printList2(list4);



    }
}
