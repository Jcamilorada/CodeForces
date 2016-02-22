package primitive_types;

/**
 * Calculate x/y using just addition, subtraction and shifting operators.
 *
 * @author Juan Rada
 */
public class Quotient
{
    public static int quotient(int x, int y)
    {
        int result = 1;
        int currentValue = y;

        while (currentValue < x)
        {
            result ++;
            currentValue += y;
        }

        return result;
    }
}
