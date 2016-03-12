package sorting;

/**
 * Insertion sort algoritm implementaiton. The algortim start checking elements from right to left. Each new element is
 * inserting in the right position. As value cannot be "inserted" on an array consecutive swaping are performed.
 *
 * @author Juan Rada
 */
public class InsertionSort
{
    public int[] sort(int[] array)
    {
        int currentPivot = 1;

        while (currentPivot < array.length)
        {
            insertElement(array, currentPivot);
            currentPivot ++;
        }

        return array;
    }

    private void insertElement(int[] array, int position)
    {
        int value = array[position];

        while (position > 0 &&
            value < array[position -1])
        {
            swap(array, position, position -1);
            position --;
        }
    }

    private void swap(int[] array, int i, int j)
    {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}
