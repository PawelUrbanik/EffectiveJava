package pl.pawel.EffectiveJava.R1_tworzenie_i_usuwanie_obiektów.usuwanie_referencji_do_obiektow;

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
}
