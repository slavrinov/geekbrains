/**
 * Created by Сергей on 22.01.2016.
 */
public class Ex2<K, V> {

    private K key;
    private V value;

    public Ex2(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public static <K, V> boolean compare(Ex2<K, V> p1, Ex2<K, V> p2) {
        return p1.getKey().equals(p2.getKey()) &&
                p1.getValue().equals(p2.getValue());
    }

    public static void main(String[] args) {
        Ex2<Integer, String> p1 = new Ex2<>(1, "apple");
        Ex2<Integer, String> p2 = new Ex2<>(2, "pear");
        boolean same = Ex2.<Integer, String>compare(p1, p2);
        System.out.println("same1 = " + same);

        Ex2<Integer, String> p3 = new Ex2<>(1, "pear");
        Ex2<Integer, String> p4 = new Ex2<>(2, "pear");
        boolean same2 = Ex2.compare(p3, p4);
        System.out.println("same2 = " + same2);

        Ex2<Integer, String> p5 = new Ex2<>(1, "apple");
        Ex2<Integer, String> p6 = new Ex2<>(1, "apple");
        boolean same3 = Ex2.compare(p5, p6);
        System.out.println("same3 = " + same3);
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}

