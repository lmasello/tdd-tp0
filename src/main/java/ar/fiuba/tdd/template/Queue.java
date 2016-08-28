package ar.fiuba.tdd.template;

/**
 * #### Tecnicas de disenio ####
 * #TP: 0
 * Author: Leandro Masello
 * Padron: 93106
 */
public class Queue<T> {

    private LinkedList<T> listOfItems;

    public Queue() {
        listOfItems = new LinkedList<T>();
    }

    public boolean isEmpty() {
        return (this.size() == 0);
    }

    public int size() {
        return this.listOfItems.size();
    }

    public void add(T item) {
        listOfItems.append(item);
    }

    /*
    It returns the first item or raises an exception if the queue is empty.
     */
    public T top() throws AssertionError {
        return listOfItems.getFirst();
    }

    /*
    It removes the first item or raises an exception if the queue is empty.
     */
    public void remove() throws AssertionError {
        listOfItems.removeFirst();
    }
}
