package ch.hslu.sw02;

public class Stack<T> implements Stackable<T> {
    private T[] items;
    private int index = 0;

    public Stack(int size) {
        this.items = (T[])new Object[size];
    }

    @Override
    public void push(T item) {
        if (index == this.items.length - 1) {
            throw new IllegalStateException();
        }

        this.items[index] = item;
        index++;
    }

    @Override
    public T pop() {
        T item = this.items[index];
        if (this.index > 0) this.index--;
        return item;
    }
}
