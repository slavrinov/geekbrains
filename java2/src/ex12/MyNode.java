package ex12;

/**
 * Created by Сергей on 24.01.2016.
 */
public class MyNode extends Node {

    public MyNode(Integer data) {
        super(data);
    }

    public void setData(Integer data) {
        System.out.println("MyNode.setData");
        super.setData(data);
    }
}

