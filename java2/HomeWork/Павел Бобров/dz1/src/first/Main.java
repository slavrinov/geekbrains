package first;


import java.util.Collection;

public class Main {

    public static void main(String[] args) throws StackException {

        GenericStack<Integer> genericStack = new GenericStack(5);

        genericStack.push(1);
        System.out.println(genericStack.peek());
        genericStack.push(2);
        System.out.println(genericStack.peek());
        genericStack.push(3);
        System.out.println(genericStack.peek());
        genericStack.push(4);
        System.out.println(genericStack.peek());
        genericStack.push(5);
        System.out.println(genericStack.peek());
        System.out.println("Stack is full: " + genericStack.isFull());
        System.out.println("----------------------");
        System.out.println(genericStack.peek());
        genericStack.pop();
        System.out.println(genericStack.peek());
        genericStack.pop();
        System.out.println(genericStack.peek());
        genericStack.pop();
        System.out.println(genericStack.peek());
        genericStack.pop();
        System.out.println(genericStack.peek());
        genericStack.pop();
        System.out.println("----------------------");
        System.out.println("Stack is empty: " + genericStack.isEmpty());


    }
}
