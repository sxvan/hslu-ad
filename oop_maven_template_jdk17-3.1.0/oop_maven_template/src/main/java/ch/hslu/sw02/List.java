package ch.hslu.sw02;

public class List<T> {
    private Node<T> head;
    private Node<T> tail;

    public void add(T item) {
        Node<T> node = new Node<>(item, null, null);

        if (this.head == null) {
            this.head = node;
            this.tail = node;
        } else {
            node.setPrevious(this.tail);
            this.tail.setNext(node);
        }
    }

    public void remove(T item) {
        Node<T> node = this.getNodeFromItem(item);
        Node<T> previous = node.getPrevious();
        Node<T> next = node.getNext();

        previous.setNext(next);
        next.setPrevious(previous);
    }

    private Node<T> getNodeFromItem(T item) {
        return null;
    }
}
