package lesson4;


import java.util.Arrays;
import java.util.List;

//import java.util.logging.Logger;
//import java.util.logging.LoggerFactory;
/**
 * Полиморфизм - единый интерфейс, но индивидуальное поведение
 */
public class Shapes {


    //static Logger log = LoggerFactory.getLogger(Shapes.class);

    public static void main(String[] args) {

        Circle circle = new Circle(0, 0, 10);

        // доступны только методы класса Object
        Object object = circle;

        // доступны только методы Drawable (& Object)
        Drawable drawable = circle;

        // доступны методы Shape (& Drawable & Object)
        Shape shape = circle;


        Rectangle rectangle = new Rectangle(20, 20, 4, 5);

        // Единым образом обрабатываем набор элементов
        List<Drawable> drawables = Arrays.asList(circle, rectangle);

        for (Drawable d : drawables) {
            d.draw();
            System.out.println(d.toString());
        }


    }

}

// Интерфейс описывает поведение - может быть отрисован
interface Drawable {
    void draw();
}

// Абстрактный родительский класс - переиспользуем его код в потомках
abstract class Shape implements Drawable {
    protected int x, y;

    protected Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Circle extends Shape  {
    private int radius;

    Circle(int x, int y, int r) {
        super(x, y);
        radius = r;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public void draw() {
        //Shapes.log.info("A circle with r={}, ({}, {})", radius, x, y);
    }

    @Override
    public String toString() {
        return "Override toString()";
    }

}

class Rectangle extends Shape {

    private int width, height;
    private int x1, x2, y1, y2;


    Rectangle(int x, int y, int width, int heigth) {
        super(x, y);
        this.width = width;
        this.height = heigth;
    }

    public int getWidth() {
        return x2 - x1;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int width) {
        if (width < 0) {
            throw new IllegalArgumentException("Must be >0");
        }
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void draw() {
        //Shapes.log.info("A rectangle ({}, {}), {}x{}", x, y, width, height);
    }
}
