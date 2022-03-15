package ch.hslu.sw02;

public interface Stackable<T> {
    void push(T item);

    T pop();
}
