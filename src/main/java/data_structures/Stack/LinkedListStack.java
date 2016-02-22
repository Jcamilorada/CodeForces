package data_structures.stack;

import java.util.LinkedList;

/**
 * Stack Implementation using linked list.
 */
public class LinkedListStack<T>
{
    private LinkedList<T> linkedList = new LinkedList<>();

    public void push(T element)
    {
        linkedList.addFirst(element);
    }

    public T pop()
    {
        T element = linkedList.getFirst();
        linkedList.removeFirst();

        return element;
    }
}
