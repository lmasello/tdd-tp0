package ar.fiuba.tdd.template;

/* Tecnicas de disenio
 * #TP: 0
 * Author: Leandro Masello
 * Padron: 93106
 */

public class Main {
    public static void main(String[] args) {
        Queue<Integer> myQueue = new Queue<Integer>();
        System.out.println(myQueue.size());
        System.out.println(myQueue.isEmpty());

        myQueue.add(4);
        myQueue.add(6);

        System.out.println(myQueue.size());
        System.out.println(myQueue.isEmpty());
        System.out.println(myQueue.top());

        myQueue.remove();
        System.out.println(myQueue.top());
        myQueue.remove();

        System.out.println(myQueue.size());
        System.out.println(myQueue.isEmpty());
    }
}