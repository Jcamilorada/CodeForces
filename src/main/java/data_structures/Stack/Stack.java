package data_structures.stack;

/**
 * Stack simple implementation.
 *
 * @author Juan Rada
 */
public class Stack <T>
{
    private Node<T> head;

    public void push(T element)
    {
        Node<T> tmp = head;
        head = new Node<>(element);
        head.nextNode = tmp;
    }

    public T pop()
    {
        Node<T> tmp = head;
        head = head.nextNode;

        return tmp.data;
    }

    private class Node<T>
    {
        public Node<T> nextNode;
        public T data;

        Node(T data)
        {
            this.data = data;
        }
    }
}
