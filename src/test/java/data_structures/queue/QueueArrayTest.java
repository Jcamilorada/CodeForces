package data_structures.queue;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 *  Test for {@link QueueArray}
 */
public class QueueArrayTest
{
    @Test
    public void testQueue()
    {
        QueueArray<Integer> queue = new QueueArray<>();
        queue.enqueve(1);
        queue.enqueve(2);
        queue.enqueve(3);
        queue.enqueve(4);
        queue.enqueve(5);
        queue.enqueve(6);
        queue.enqueve(7);

        assertTrue(1 == queue.dequeve());
        assertTrue(2 == queue.dequeve());
        assertTrue(3 == queue.dequeve());
        assertTrue(4 == queue.dequeve());
        assertTrue(5 == queue.dequeve());
        assertTrue(6 == queue.dequeve());
        assertTrue(7 == queue.dequeve());
    }
}