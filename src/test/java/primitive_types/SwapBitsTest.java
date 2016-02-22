package primitive_types;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Juan Rada
 */
public class SwapBitsTest
{

    @Test
    public void testSwap() throws Exception
    {
        int number = 0b110000000;
        assertEquals(0b100000010, SwapBits.swap(number, 1, 7));
    }
}