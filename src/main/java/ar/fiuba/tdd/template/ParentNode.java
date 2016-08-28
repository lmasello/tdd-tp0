package ar.fiuba.tdd.template;
/**
 * #### Tecnicas de disenio ####
 * #TP: 0
 * Author: Leandro Masello
 * Padron: 93106
 */

public class ParentNode<T> implements Node<T> {
    private Node<T> nextNode = new NullNode<T>();

    public T getData() throws AssertionError {
        throw new AssertionError();
    }

    public Node<T> getNext() {
        return this.nextNode;
    }

    public int getCountOfNodesFromThis() {
        return this.nextNode.getCountOfNodesFromThis();
    }

    public void addToEnd(Node<T> nodeToBeAdded, Node<T> previous) {
        this.getNext().addToEnd(nodeToBeAdded, this);
    }

    public void setNext(Node<T> nextNode) {
        this.nextNode = nextNode;
    }
}
