package ex12;

/**
 * Created by Сергей on 24.01.2016.
 */

// Bridge method generated by the compiler
//
/*public void setData(Object data) {
        setData((Integer) data);
        }*/


public class Node {

    public Object data;

    public Node(Object data) {
        this.data = data;
    }

    public void setData(Object data) {
        System.out.println("Node.setData");
        this.data = data;
    }
}

