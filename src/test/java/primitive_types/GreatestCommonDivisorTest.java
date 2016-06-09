package primitive_types;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Test suite for {@link GreatestCommonDivisor}
 *
 */
public class GreatestCommonDivisorTest
{
    private GreatestCommonDivisor testInstance = new GreatestCommonDivisor();

    @Test
    public void solution() throws Exception
    {
        assertEquals(6, testInstance.solution(24, 18));
        assertEquals(3, testInstance.solution(123, 321));
    }
}
