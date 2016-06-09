package sorting;

import java.util.Arrays;

/**
 * Merge sort implementation using arrays creations. Memory complexity is higher.
 *
 * @author Juan Rada
 */
public class MergeSort
{
    public int[] sort(int[] array)
    {
        if (array.length > 1)
        {
            int[] arrayA = Arrays.copyOfRange(array, 0, array.length/2);
            int[] arrayB = Arrays.copyOfRange(array, array.length/2, array.length);
            return merge(sort(arrayA), sort(arrayB));
        }

        return array;
    }

    private int[] merge(int[] arrayA, int[] arrayB)
    {
        int[] array = new int[arrayA.length + arrayB.length];

        int i = 0;
        int j = 0;
        while (i < arrayA.length || j < arrayB.length)
        {
            if (i < arrayA.length &&
                (j == arrayB.length || arrayA[i] < arrayB[j]))
            {
                array[i + j] = arrayA[i];
                i++;
            }

            else
            {
                array[i + j] = arrayB[j];
                j ++;
            }
        }

        return array;
    }
}
