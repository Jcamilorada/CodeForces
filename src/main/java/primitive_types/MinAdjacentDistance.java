package primitive_types;

import java.util.Arrays;

/**
 * @author Juan Rada
 */
public class MinAdjacentDistance
{
    private static final int maxDistance = 100000001;

    public int solution(int[] A)
    {
        if (A.length == 1)
            return -2;
        Arrays.sort(A);

        int distance = maxDistance;
        for (int _1dx = 0; _1dx < A.length -1; _1dx ++)
        {
            distance = Math.min(distance, Math.abs(A[_1dx] - A[_1dx +1]));
        }

        if (distance == maxDistance)
            return -1;

        return distance;
    }
}
