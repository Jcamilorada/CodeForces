package sorting;

/**
 * Selection sort algorithm implementation. The algoritm start sort the array searching the smallest value in the not
 * sorted array part.
 *
 * @author Juan Rada
 *
 */
public class SelectionSort
{
    public int[] sort(int[] array)
    {
        for (int i = 0; i < array.length; i ++)
        {
            int minPosition = minPositionValue(array, i);
            if (minPosition != i) swap(array, i, minPosition);
        }

        return array;
    }

    /**
     * Find the smalles value position starting on the given position value.
     *
     * @param array the array to find min value.
     * @param position the starting position.
     * @return the min value position.
     */
    private int minPositionValue(int[] array, int position)
    {
        for (int i = position + 1; i < array.length; i ++)
        {
            if (array[i] < array[position])
            {
                position = i;
            }
        }

        return position;
    }


    private void swap(int[] array, int i, int j)
    {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}
