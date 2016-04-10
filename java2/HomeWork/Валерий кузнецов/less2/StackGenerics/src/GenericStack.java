import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

/**
 * Created by kuznetsov_vb on 08.04.2016.
 */
class GenericStack<E> implements Stack<E> {
    private int size;
    private E[] arrayStack;
    private int top;

    public GenericStack(int m){
        this.size = m;
        arrayStack = (E[]) new Object[size];
        top = -1;
    }

    @Override
    public void push(E element) throws StackException {
        if(!isFull()) {
            arrayStack[++top] = element;
        } else {
            System.out.println("Stack is full!");
        }
    }

    @Override
    public E pop() throws StackException {
        if(!isEmpty()) {
            return arrayStack[top--];
        }else{
            System.out.println("Stack is empty!");
        }
        return null;
    }

    @Override
    public E peek() {
        return arrayStack[top];
    }

    @Override
    public int getSize() {
        return size+1;
    }

    @Override
    public boolean isEmpty() {
        return (top == -1);
    }

    @Override
    public boolean isFull() {
        return (top == size - 1);
    }

    @Override
    public void pushAll(Collection<? extends E> src) throws StackException {
        for (E e : src) {
            push(e);
        }
    }

    @Override
    public void popAll(Collection<? super E> dst) throws StackException {
        while (!isEmpty()) {
            dst.add(pop());
        }
    }
}
