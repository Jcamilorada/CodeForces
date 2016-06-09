package sorting;

/**
 * Quicksort algoritm implementation. A pivot is select from the middle if the array and elements are order around it.
 * if is greater at right it not at left. After ordering recursive call is performed using elements.
 *
 * @author Juan Rada
 *
 */
public class QuickSort
{

    public void sort(int[] array)
    {
        quicksort(0, array.length - 1, array);
    }

    private void quicksort(int start, int end, int[] array)
    {
        int i = start;
        int j = end;
        int pivot = array[(start + (end - start)/2)];

        while (i <= j)
        {
            while (array[i] < pivot)
                i ++;

            while (array[j] > pivot)
                j --;

            if (i <= j)
            {
                swap(array, i, j);
                i++;
                j--;
            }
        }

        if (start < j)
            quicksort(start, j, array);

        if (end > i)
            quicksort(i, end, array);
    }

    private void swap(int[] array, int i, int j)
    {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

}
