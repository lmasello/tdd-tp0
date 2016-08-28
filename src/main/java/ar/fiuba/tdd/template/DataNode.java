package ar.fiuba.tdd.template;

/**
 * #### Tecnicas de disenio ####
 * #TP: 0
 * Author: Leandro Masello
 * Padron: 93106
 */

public class DataNode<T> implements Node<T> {
    private T data;
    private Node<T> nextNode = new NullNode<T> ();

    public DataNode(T data) {
        this.data = data;
    }

    public T getData() {
        return this.data;
    }

    public Node<T> getNext() {
        return this.nextNode;
    }

    public int getCountOfNodesFromThis() {
        return 1 + this.nextNode.getCountOfNodesFromThis();
    }

    public void addToEnd(Node<T> nodeToBeAdded, Node<T> previous) {
        this.getNext().addToEnd(nodeToBeAdded, this);
    }

    public void setNext(Node<T> nextNode) {
        this.nextNode = nextNode;
    }
}
