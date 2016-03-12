package data_structures.stack;

import java.util.LinkedList;

/**
 * Stack Implementation using linked list.
 */
public class LinkedListStack<T> implements IStack<T>
{
    private LinkedList<T> linkedList = new LinkedList<>();

    @Override
    public void push(T element)
    {
        linkedList.addFirst(element);
    }

    @Override
    public T pop()
    {
        T element = linkedList.getFirst();
        linkedList.removeFirst();

        return element;
    }
}
