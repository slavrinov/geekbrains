package j2l1;

import java.util.Collection;


public interface Stack<E> {

    //толкает новый элемент в top стека
    public void push(E element) throws StackException;
    
    //выталкивает и удаляет элемент из topа
    public E pop() throws StackException;
    
    //чтение элемента из topа но не стирая его
    public E peek();
    
    public int getSize();
    public boolean isEmty();
    public boolean isFull();
    
    //толкает все элементы из src в стек(элемнты класса E и всех его потомков)
    public void pushAll(Collection<? extends E> src) throws StackException;
    
    //выталкивает все элементы из стека в dst(элементы класса E и всех его родителей)
    public void popAll(Collection<? super E> dst) throws StackException;
    

}
