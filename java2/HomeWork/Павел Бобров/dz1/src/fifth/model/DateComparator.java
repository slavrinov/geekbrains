package fifth.model;

import java.util.Comparator;

public class DateComparator implements Comparator {


    @Override
    public int compare(Object o1, Object o2) {
        return o2.toString().compareTo(o1.toString());
    }
}
