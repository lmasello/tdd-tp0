package ar.fiuba.tdd.template;
/**
 * #### Tecnicas de disenio ####
 * #TP: 0
 * Author: Leandro Masello
 * Padron: 93106
 */

interface Node<T> {

    public T getData();

    public Node<T> getNext();

    /*
     * This returns the number of nodes with data which follow the current node. This number also takes into
     * account the current node.
     */
    public int getCountOfNodesFromThis();

    public void addToEnd(Node<T> nodeToBeAdded, Node<T> previous);

    public void setNext(Node<T> nodeToBeAdded);
}