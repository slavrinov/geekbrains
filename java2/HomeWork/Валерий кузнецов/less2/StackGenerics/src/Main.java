
public class Main {
    public static void main(String[] args) throws StackException {
        GenericStack<Integer> myStack = new GenericStack<Integer>(3);
        myStack.push(79);
        myStack.push(80);
        myStack.push(81);


        int value = myStack.peek();
        System.out.println(value);
        myStack.pop();
        value = myStack.peek();
        System.out.println(value);
    }
}

