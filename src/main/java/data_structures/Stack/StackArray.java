package data_structures.stack;


/**
 * Stack implementation using an Array.
 *
 * @author Juan Rada
 */
public class StackArray <T> implements IStack<T>
{
    private Object[] dataArray = new Object[20];
    private int currentIndex = 0;

    public void push(T data)
    {
        if (currentIndex == dataArray.length)
            copyAndIncreaseSize();

        dataArray[currentIndex] = data;
        currentIndex ++;
    }

    public T pop()
    {
        return (T)dataArray[currentIndex--];
    }

    private void copyAndIncreaseSize()
    {
        Object[] tmp = new Object[dataArray.length * 2];

        for (int i =0; i < dataArray.length; i++)
        {
            tmp[i] = dataArray[i];
        }

        dataArray = tmp;
    }
}
