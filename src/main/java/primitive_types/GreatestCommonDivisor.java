package primitive_types;

/**
 * Greatest common divisor problem.
 *
 * @author Juan Rada
 */
public class GreatestCommonDivisor
{
    public int solution(int x, int y)
    {
        int greatest = Math.max(x, y);
        int lowest = Math.min(x, y);

        int remaining = lowest;
        while (remaining != 0)
        {
            lowest = remaining;
            remaining =  greatest % lowest;
        }

        return lowest;
    }
}
