package homework;

import java.util.Collection;
import java.util.LinkedList;

/**
 * Created by Zagorsky Vitaly on 07.04.2016.
 */
public class GenericStack<E> implements Stack<E> {

    private LinkedList<E> storage = new LinkedList<>();

    public void push(E element) throws StackException {  //add element
        storage.addFirst(element);
    }

    public E pop() throws StackException {  //return element and delete from stack
        return storage.removeFirst();
    }

    public void popAll(Collection<? super E> dst) throws StackException {  // delete collection

        while (!isEmpty()) {
            dst.add(pop());
        }
    }

    public void pushAll(Collection<? extends E> src) throws StackException { //add collection

        for (E e : src) {
            push(e);
        }
    }

    public boolean isEmpty() {

        return storage.isEmpty();
    }

    public boolean isFull() {
        return storage.indexOf(storage.getFirst()) == storage.size();
    }

    public E peek() {
        return storage.getFirst();
    }   //check top element

    public int getSize() {
        return storage.size();
    }

}




//    private int size;
//    private E[] data;
//    private int top = -1;
//
//    public void push(E element) throws StackException {  //add element
//        data[top++] = element;
//    }
//
//    public E pop() throws StackException {  //return element and delete from stack
//        System.out.println(data[top]);
//        return data[top--];
//    }
//
//    public void popAll(Collection<? super E> dst) throws StackException {  // delete collection
//
//        while (!isEmpty()) {
//            dst.add(pop());
//        }
//    }
//
//    public void pushAll(Collection<? extends E> src) throws StackException { //add collection
//
//        for (E e : src) {
//            push(e);
//        }
//    }
//
//    public boolean isEmpty() {
//
//        return top == -1;
//    }
//
//    public boolean isFull() {
//        return top == size - 1;
//    }
//
//    public E peek() {
//        return data[top];
//    }   //check top element
//
//    public int getSize() {
//        return this.size;
//    }