package ch.hslu.sw03;

public class BinaryTreeNode<T> {
    private T value;
    private BinaryTreeNode<T> leftNode;
    private BinaryTreeNode<T> rightNode;

    public BinaryTreeNode(T value) {
        this.value = value;
    }

    public BinaryTreeNode<T> getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(BinaryTreeNode<T> leftNode) {
        this.leftNode = leftNode;
    }

    public BinaryTreeNode<T> getRightNode() {
        return rightNode;
    }

    public void setRightNode(BinaryTreeNode<T> rightNode) {
        this.rightNode = rightNode;
    }

    public T getValue() {
        return value;
    }
}
