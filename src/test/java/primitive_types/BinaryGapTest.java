package primitive_types;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Test suite for {@link BinaryGap}
 *
 */
public class BinaryGapTest
{
    private BinaryGap testInstance = new BinaryGap();

    @Test
    public void solution() throws Exception
    {
        assertEquals(5, testInstance.solution(1041));
        assertEquals(4, testInstance.solution(529));
        assertEquals(1, testInstance.solution(20));

        assertEquals(5, testInstance.solution2(1041));
        assertEquals(4, testInstance.solution2(529));
        assertEquals(1, testInstance.solution2(20));
    }
}
