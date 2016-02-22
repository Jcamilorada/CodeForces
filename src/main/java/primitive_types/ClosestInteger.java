package primitive_types;

/**
 * Finds the closet number in terms of numbers of 1 on its binary representation.
 *
 * @author Juan Rada
 */
public class ClosestInteger
{
    public static int closestInteger(int number)
    {
        int carry = 0;

        while(true)
        {
            if (((number >> carry)  & 0b10) != ((number >> carry) & 1))
            {
                number ^= (1 << carry);
                number ^= (0b10 << carry);
                break;
            }

            carry ++;
        }

        return number;
    }
}
