package sorting;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Test instance for {@link MergeSort}
 *
 *
 */
public class SortTest
{
    @Test
    public void testMergeSort() throws Exception
    {
        int[] array = new int[]{3, 8, 2, 1, 5, 4, 6, 7, 10};

        int[] expected = array.clone();
        Arrays.sort(expected);

        array = new MergeSort().sort(array);

        assertArrayEquals(expected, array);
    }

    @Test
    public void testBubbleSort() throws Exception
    {
        int[] array = new int[]{3, 8, 2, 1, 5, 4, 6, 7, 10};

        int[] expected = array.clone();
        Arrays.sort(expected);

        array = new BubbleSort().sort(array);

        assertArrayEquals(expected, array);
    }

    @Test
    public void testSelectionSort() throws Exception
    {
        int[] array = new int[]{3, 8, 2, 1, 5, 4, 6, 7, 10};

        int[] expected = array.clone();
        Arrays.sort(expected);

        array = new SelectionSort().sort(array);

        assertArrayEquals(expected, array);
    }

    @Test
    public void testInsertionSort() throws Exception
    {
        int[] array = new int[]{3, 8, 2, 1, 5, 4, 6, 7, 10};

        int[] expected = array.clone();
        Arrays.sort(expected);

        array = new InsertionSort().sort(array);

        assertArrayEquals(expected, array);
    }

    @Test
    public void testQuickSort() throws Exception
    {
        int[] array = new int[]{3, 8, 8, 1, 5, 4, 6, 7, 10};

        int[] expected = array.clone();
        Arrays.sort(expected);

        new QuickSort().sort(array);

        assertArrayEquals(expected, array);
    }
}