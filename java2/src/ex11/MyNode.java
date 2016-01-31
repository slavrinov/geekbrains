package ex11;

/**
 * Created by Сергей on 23.01.2016.
 */
public class MyNode extends Ex11_Node<Integer> {
    public MyNode(Integer data) {
        super(data);
    }

    public static void main(String[] args) {
        //что произойдет при выполнении данного кода?
        MyNode mn = new MyNode(5);
        Ex11_Node n = mn;
        n.setData("Hello");
        //Integer x = mn.data;
    }

    public void setData(Integer data) {
        System.out.println(data);
        super.setData(data);
    }
}
