package primitive_types;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author Juan Rada
 */
public class MinAdjacentDistanceTest
{
    private MinAdjacentDistance minAdjacentDistance = new MinAdjacentDistance();

    @Test
    public void testSolution()
    {
        assertEquals(0, minAdjacentDistance.solution(new int[]{3, 3, 3, 3}));
    }
}
