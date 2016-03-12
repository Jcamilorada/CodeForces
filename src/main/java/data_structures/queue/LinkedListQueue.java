package data_structures.queue;

import java.util.LinkedList;

/**
 * Queue implementation using a Linked list.
 *
 * @author Juan Camilo Rada
 */
public class LinkedListQueue <T> implements IQueue<T>
{
    private LinkedList<T> linkedList = new LinkedList<>();

    @Override
    public void enqueve(T data)
    {
        linkedList.addLast(data);
    }

    @Override
    public T dequeve()
    {
        return linkedList.getFirst();
    }
}
