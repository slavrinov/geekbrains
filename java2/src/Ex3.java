import java.util.*;

/**
 * Created by Сергей on 21.01.2016.
 */
public class Ex3<E> {

    Object[] queue;

    int size;

    Comparator comparator;

    public Ex3(Collection<? extends E> c) {
        if (c instanceof SortedSet<?>) {
            SortedSet<? extends E> ss = (SortedSet<? extends E>) c;
            this.comparator = (Comparator<? super E>) ss.comparator();
            initElementsFromCollection(ss);
        } else if (c instanceof PriorityQueue<?>) {
            PriorityQueue<? extends E> pq = (PriorityQueue<? extends E>) c;
            this.comparator = (Comparator<? super E>) pq.comparator();
            //initFromPriorityQueue(pq);
        } else {
            this.comparator = null;
            //initFromCollection(c);
        }
    }

    public static void main(String[] args) {

        Ex3 pq = new Ex3<>(new PriorityQueue<>(10));

        Ex3 set = new Ex3<>(new HashSet<>());

    }

    private void initElementsFromCollection(Collection<? extends E> c) {
        Object[] a = c.toArray();
        // If c.toArray incorrectly doesn't return Object[], copy it.
        if (a.getClass() != Object[].class)
            a = Arrays.copyOf(a, a.length, Object[].class);
        int len = a.length;
        if (len == 1 || this.comparator != null)
            for (int i = 0; i < len; i++)
                if (a[i] == null)
                    throw new NullPointerException();
        this.queue = a;
        this.size = a.length;
    }

    private void initFromPriorityQueue(PriorityQueue<? extends E> c) {
        if (c.getClass() == PriorityQueue.class) {
            this.queue = c.toArray();
            this.size = c.size();
        } else {
            initFromCollection(c);
        }
    }

    private void initFromCollection(Collection<? extends E> c) {
        initElementsFromCollection(c);
        //heapify();
    }
}
