package ch.hslu.sw02;

public class Node<T> {
    private T item;
    private Node<T> next;
    private Node<T> previous;

    public Node(T item, Node<T> previous, Node<T> next) {
        this.item = item;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public void setPrevious(Node<T> previous) {
        this.previous = previous;
    }

    public Node<T> getNext() {
        return this.next;
    }

    public Node<T> getPrevious() {
        return this.previous;
    }

    public T getItem() {
        return this.item;
    }
}
