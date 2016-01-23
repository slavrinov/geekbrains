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

}
