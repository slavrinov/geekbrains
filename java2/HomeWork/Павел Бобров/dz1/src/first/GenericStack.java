package first;

import java.util.Collection;

public class GenericStack<E> implements IStack<E> {

    private int maxSize;
    private int top;
    private E[] elements;

    public GenericStack(int maxSize) {
        this.maxSize = maxSize;
        this.elements = (E[]) new Object[maxSize];
        top = -1;
    }

    @Override
    public void push(E element) throws StackException {

        if (isFull()) {
            throw new StackException("Stack is full");
        }

        elements[++top] = element;

    }

    @Override
    public E pop() throws StackException {

        if (isEmpty()) {
            throw new StackException("Stack is empty");
        }
        return elements[top--] = null;

    }

    @Override
    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return elements[top];
    }

    @Override
    public int getSize() {
        return maxSize;
    }

    @Override
    public boolean isEmpty() {
        if (top == -1) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isFull() {

        if (top == maxSize - 1) {
            return true;
        }
        return false;
    }

    @Override
    public void pushAll(Collection<? extends E> src) throws StackException {

        for (E e : src) {
            push(e);
        }
    }

    @Override
    public void popAll(Collection<? super E> dst) throws StackException {

        while (isEmpty()) {
            dst.add(pop());
        }
    }

}
