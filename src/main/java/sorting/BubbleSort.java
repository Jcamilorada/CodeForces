package sorting;

/**
 * Buble sort algoritm implementation. Algoritm swap continues positions.
 *
 * @author Juan Rada
 *
 */
public class BubbleSort
{
    public int[] sort(int[] array)
    {
        for (int i = 0; i < array.length-1; i++)
            for (int j = 0; j< array.length - 1; j ++)
                if (array[j] > array[j + 1]) swap(array, j, j + 1);

        return array;
    }

    private void swap(int[] array, int i, int j)
    {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}
