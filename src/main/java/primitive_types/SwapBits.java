package primitive_types;

/**
 * Solution for swaping bits on a binary number.
 *
 * @author Juan Rada
 */
public class SwapBits
{
    public static int swap(int number, int i, int j)
    {
        int iDigit = (number >> i) & 1;
        int jDigit = (number >> j) & 1;

        if (iDigit != jDigit)
        {
            number = number ^ (1 << i);
            number = number ^ (1 << j);
        }

        return number;

    }
}
