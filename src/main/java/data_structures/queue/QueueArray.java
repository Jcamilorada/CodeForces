package data_structures.queue;

/**
 * @author Juan Camilo Rada
 *
 * @author Juan Rada
 *
 */
public class QueueArray<T> implements IQueue<T>
{
    private Object[] dataArray = new Object[5];
    private int head = 0;
    private int tail = 0;


    @Override
    public void enqueve(T data)
    {
        if (head == dataArray.length) updateInternalArray();

        dataArray[head++] = data;
    }

    @Override
    public T dequeve()
    {
        return (T)dataArray[tail++];
    }

    private void updateInternalArray()
    {
        Object[] newArray = new Object[dataArray.length * 2];
        System.arraycopy(
            dataArray,
            tail,
            newArray,
            0,
            dataArray.length - tail);

        head = dataArray.length - tail;
        tail = 0;
        dataArray = newArray;
    }
}
