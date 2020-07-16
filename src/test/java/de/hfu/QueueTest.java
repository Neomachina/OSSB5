package de.hfu;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {
    @Test
    public void testtheTest() {
        Queue testqueue = new Queue(3);
        testqueue.enqueue(1);
        testqueue.enqueue(2);
        testqueue.enqueue(3);

        //statements
        assertEquals(1, testqueue.queue[0]);
        assertEquals(2, testqueue.queue[1]);
        assertEquals(3, testqueue.queue[2]);

        testqueue.enqueue(4);

        assertEquals(1, testqueue.dequeue());
        assertEquals(2, testqueue.queue[1]);
        assertEquals(4, testqueue.queue[2]);

        testqueue.enqueue(5);

        assertEquals(5, testqueue.queue[0]);
    }
}