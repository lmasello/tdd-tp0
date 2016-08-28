package ar.fiuba.tdd.template;

/*
 * Tecnicas de disenio
 * #TP: 0
 * Author: Leandro Masello
 * Padron: 93106
 */

public class NullNode<T> implements Node<T> {

    public T getData() throws AssertionError {
        throw  new AssertionError();
    }

    public Node<T> getNext() throws AssertionError {
        throw  new AssertionError();
    }

    public int getCountOfNodesFromThis() {
        return 0;
    }

    /*
     * The nodeToBeAdded will be linked to the previous node to this NullNode.
     * previous -> NullNode
     * previous -> nodeToBeAdded
     */
    public void addToEnd(Node<T> nodeToBeAdded, Node<T> previous) {
        previous.setNext(nodeToBeAdded);
    }

    public void setNext(Node<T> nextNode) {
        throw new AssertionError();
    }
}
