package j2l1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;


public class GenericStack<E> implements Stack<E>{

    private int maxSize = 0;
    public static int StackPointer = 0;
    ArrayList<E> theStack; 

    public GenericStack(int element) {
        theStack = new ArrayList<>(element);
        this.maxSize = element;
    }
    
    public int getMaxSize() {
        return maxSize;
    }
    
    
    @Override
    public void push(E element) throws StackException {
        if(StackPointer > getMaxSize())  
            throw new StackException();
        theStack.add(element);
        StackPointer++;
    }

    @Override
    public E pop() throws StackException {
        if(StackPointer < 0)  
            throw new StackException();
        StackPointer -=1;//
        return theStack.remove(StackPointer);
    }

    @Override
    public E peek() {
        return theStack.get(StackPointer);
    }

    @Override
    public int getSize() {
        return theStack.size();
    }

    @Override
    public boolean isEmty() {
        return theStack.isEmpty();
    }

    @Override
    public boolean isFull() {
        boolean full = true;
        if(!theStack.isEmpty() && (maxSize == StackPointer)){
            full = true;
        } else {
            full = false;
        }
        return full;
    }

    @Override
    public void pushAll(Collection<? extends E> src) {
        for (E e : src) {
            try {
                push(e);
            } catch (StackException ex) {
                Logger.getLogger(GenericStack.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void popAll(Collection<? super E> dst) {
        while (!isEmty()){
            try {
                dst.add(pop());
            } catch (StackException ex) {
                Logger.getLogger(GenericStack.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        }
    }
    
    public void displayStack() {
        System.out.print("Stack: ");
        for (E e : theStack) {
            System.out.print(e + " ");
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        //enter the number in the argument array index in the stack:
        GenericStack gs = new GenericStack(5);
        
        ArrayList<String> string = new ArrayList<String>();
        string.add("Строка1");
        string.add("Строка1");
        
        
        try {
            gs.push(20);
            gs.push(40);
            gs.displayStack();
            
            gs.push(60);
            gs.push(80);
            gs.push("Hello");
            gs.displayStack();
            
            gs.pop();
            gs.pop();
            gs.pop();
            gs.displayStack();
           
            gs.pushAll(string);
            gs.displayStack();
            
            gs.popAll(string);
            gs.displayStack();
        } catch (StackException ex) {
            Logger.getLogger(GenericStack.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("max elements: "+gs.getMaxSize());
        System.out.println("size of stack: "+gs.getSize()+" stackPointer: "+StackPointer);
    
        System.out.println("is stack emty: "+gs.isEmty());
        System.out.println("is stack full: "+gs.isFull());
        
        
        
    }

    

    
    
}