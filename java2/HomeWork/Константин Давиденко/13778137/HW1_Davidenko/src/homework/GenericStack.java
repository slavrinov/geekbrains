package homework;

import java.util.Collection;
import java.util.LinkedList;

public class GenericStack<E> implements Stack<E> {

    private LinkedList<E> stack; // stack (LastInFirstOut)
    private final int MAX_SIZE = 10000; // заполненность стека сделал так;
    // как-то можно по-другому проверять?
//    private int size; // не стал использовать, пользуюсь методом size() у LinkedList

    public GenericStack() {
//        size = 0;
        stack = new LinkedList<>();
    }

    @Override
    public void push(E element) throws StackException {
        if (element == null) // запретил добавление null
            return;
        if (isFull())
            throw new StackException("stack is full, nowhere to push");

        stack.add(element);
//        size++;
    }

    @Override
    public E pop() throws StackException {
        if (isEmpty())
            throw new StackException("stack is empty, nothing to pop");

        E toReturn = peek();
        stack.removeLast();
//        size--;
        return toReturn;
    }

    @Override
    public E peek() throws StackException {
        // добавил throws StackException, так как и в случае pop()
        // стэк может оказаться пустым, верно?
        if (isEmpty())
            throw new StackException("stack is empty, nothing to peek");

        return stack.getLast();
    }

    @Override
    public int getSize() {
//        return size;
        return stack.size();
    }

    @Override
    public boolean isEmpty() {
        return getSize() == 0;
    }

    @Override
    public boolean isFull() {
        return getSize() == MAX_SIZE;
    }

    @Override
    public void pushAll(Collection<? extends E> src) throws StackException {
        for (E e : src) {
            try {
                push(e);
            } catch (StackException se) {
                throw se; // прокидываем StackException наверх
            }
        }
    }

    @Override
    public void popAll(Collection<? super E> dst) throws StackException {
        if (isEmpty())
            throw new StackException("stack is empty, nothing to pop to dst");

        while (!isEmpty())
            dst.add(pop());
    }
}
