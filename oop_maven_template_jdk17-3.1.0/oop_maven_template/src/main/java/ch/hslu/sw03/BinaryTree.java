package ch.hslu.sw03;

import java.util.NoSuchElementException;

public class BinaryTree<T extends Comparable<T>>  {
    private BinaryTreeNode<T> root;

    public T search(T value) {
        return this.search(this.root, value);
    }

    private T search(BinaryTreeNode<T> node, T value) {
        int comparison = node.getValue().compareTo(value);
        if (comparison == 0) {
            return node.getValue();
        }

        if (comparison < 0) {
            if (node.getLeftNode() == null) {
                throw new NoSuchElementException();
            }

            this.search(node.getLeftNode(), value);
        }
        if (comparison > 0) {
            if (node.getRightNode() == null) {
                throw new NoSuchElementException();
            }

            this.search(node.getRightNode(), value);
        }

        throw new NoSuchElementException();
    }

    public void add(T value) {
        if (this.root == null) {
            this.root = new BinaryTreeNode<>(value);
            return;
        }

        add(this.root, value);
    }

    private void add(BinaryTreeNode<T> node, T value) {
        int comparison = node.getValue().compareTo(value);
        if (comparison == 0) {
            return;
        }

        if (comparison < 0) {
            if (node.getLeftNode() != null) {
                add(node.getLeftNode(), value);
            }
            else {
                node.setLeftNode(new BinaryTreeNode<>(value));
            }
        } else if (comparison > 0) {
            if (node.getRightNode() != null) {
                add(node.getRightNode(), value);
            }
            else {
                node.setRightNode(new BinaryTreeNode<>(value));
            }
        }
    }
}
