package lesson1.homework;
/**
 *
 */
public class Apple extends Fruit {

    public Apple(double weight) {
        super(weight);
    }

    @Override
    public String toString() {
        return "Apple: " + weight + "g";
    }
}
