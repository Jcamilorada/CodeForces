package primitive_types;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test suite for {@link ClosestInteger}
 *
 */
public class ClosestIntegerTest
{

    @Test
    public void testClosestInteger() throws Exception
    {
        assertEquals(0b1011010, ClosestInteger.closestInteger(0b1011100));
    }
}