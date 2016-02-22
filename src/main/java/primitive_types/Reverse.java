package primitive_types;

/**
 * Solution for reverse a 64 bits words.
 *
 * @author Juan Rada
 */
public class Reverse
{
    public static long reverse(long value)
    {
        long newValue = 0;

        while (value > 0)
        {
            newValue <<= 1;

            newValue |= (value & 1);
            value >>= 1;
        }

        return newValue;
    }
}
