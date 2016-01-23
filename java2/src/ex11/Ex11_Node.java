package ex11;

/**
 * Created by Сергей on 23.01.2016.
 */
public class Ex11_Node<T> {

    public T data;

    public Ex11_Node(T data) {
        this.data = data;
    }

    public void setData(T data) {
        System.out.println("Node.setData");
        this.data = data;
    }

}


