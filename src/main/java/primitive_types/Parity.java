package primitive_types;

/**
 * Parity calculations methods.
 *
 * @author Juan Rada
 */
public class Parity
{
    public static int parity(int number)
    {
        short result = 0;
        while (number > 0)
        {
            result ^= (number & 1);
            number = number >> 1;
        }

        return result;
    }

    public static int parity_2(int number)
    {
        short result = 0;
        while (number > 0)
        {
            result ^= 1;
            number = number & (number - 1);
        }

        return result;
    }
}
