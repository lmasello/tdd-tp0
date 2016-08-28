package ar.fiuba.tdd.template;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTests {

    Queue<Integer> myQueue = new Queue<Integer>();

    @Test
    public void theInitialSizeIsZero() {
        assertEquals(0, myQueue.size());
    }

    @Test
    public void atFirstItIsEmpty() { assertEquals(true, myQueue.isEmpty());}

    @Test
    public void withElementsItIsNotEmpty() {
        assertEquals(true, myQueue.isEmpty());
        myQueue.add(4);
        assertEquals(false, myQueue.isEmpty());
    }

    @Test
    public void sizeIncreaseWithNewElements(){
        assertEquals(0, myQueue.size());
        myQueue.add(4);
        assertEquals(1, myQueue.size());
        myQueue.add(4);
        assertEquals(2, myQueue.size());
        myQueue.add(5);
        assertEquals(3, myQueue.size());
    }

    @Test
    public void sizeDecreaseWhenRemoveElements(){
        myQueue.add(4);
        myQueue.add(4);
        assertEquals(2, myQueue.size());
        myQueue.remove();
        assertEquals(1, myQueue.size());
        myQueue.remove();
        assertEquals(0, myQueue.size());
    }

    @Test
    public void theQueueWorksAsFIFO(){
        myQueue.add(4);
        myQueue.add(5);
        myQueue.add(6);
        assertEquals(new Integer(4), myQueue.top());
        myQueue.remove();
        assertEquals(new Integer(5), myQueue.top());
        myQueue.remove();
        assertEquals(new Integer(6), myQueue.top());
        myQueue.remove();
        myQueue.add(5);
        assertEquals(new Integer(5), myQueue.top());
    }

    @Test(expected = AssertionError.class)
    public void throwAssertionErrorWithTopAndEdgeConditions(){
        assertEquals(true, myQueue.isEmpty());
        myQueue.top();
//        assertEquals(new AssertionError(), myQueue.remove());
    }

    @Test(expected = AssertionError.class)
    public void throwAssertionErrorWithRemoveAndEdgeConditions(){
        assertEquals(true, myQueue.isEmpty());
        myQueue.remove();
    }
}
