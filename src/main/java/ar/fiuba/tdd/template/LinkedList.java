package ar.fiuba.tdd.template;

/* Tecnicas de disenio
 * #TP: 0
 * Author: Leandro Masello
 * Padron: 93106
 */

/* The structure of the LinkedList is:
 * ParentNode -> NullNode
 * ParentNode -> DataNode -> NullNode
 */

public class LinkedList<T> {

    private Node<T> firstElement;

    public LinkedList() {
        firstElement = new ParentNode<T>();
    }

    public int size() {
        return this.firstElement.getCountOfNodesFromThis();
    }

    public void append(T item) {
        this.firstElement.addToEnd(new DataNode<T>(item), this.firstElement);
    }

    public T getFirst() throws AssertionError {
        return this.firstElement.getNext().getData();
    }

    public void removeFirst() throws AssertionError {
        this.firstElement.setNext(this.firstElement.getNext().getNext());
    }
}
