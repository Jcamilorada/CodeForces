package primitive_types;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 *  Test suite for {@link Parity}
 */
public class ParityTest
{

    @Test
    public void testParityWhenIsEven() throws Exception
    {
        assertEquals(0, Parity.parity(0b1110001000010001));
        assertEquals(0, Parity.parity_2(0b1110001000010001));
    }

    @Test
    public void testParityWhenIsOdd() throws Exception
    {
        assertEquals(1, Parity.parity(0b1110001000010011));
        assertEquals(1, Parity.parity_2(0b1110001000010011));
    }
}