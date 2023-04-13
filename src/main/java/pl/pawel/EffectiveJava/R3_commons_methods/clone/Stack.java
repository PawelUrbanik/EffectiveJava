package pl.pawel.EffectiveJava.R3_commons_methods.clone;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack {

    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 16;


    public Stack(int initialCapacity) {
        if (initialCapacity < 1) {
            this.elements = new Object[DEFAULT_CAPACITY];
        } else {
            this.elements = new Object[initialCapacity];
        }
    }

    public void push(Object object) {
        ensureCapacity();
        this.elements[size++] = object;
    }

    public Object pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        Object result = this.elements[--size];
        this.elements[size] = null;
        return result;
     }

    private void ensureCapacity(){
        if (size == elements.length) {
            this.elements = Arrays.copyOf(this.elements, size*2 +1);
        }
    }

    @Override
    protected Object clone() {
        try {
            Stack result = (Stack) super.clone();
            result.elements = elements.clone();
            return result;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
