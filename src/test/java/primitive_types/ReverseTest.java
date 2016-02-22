package primitive_types;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Juan Rada
 */
public class ReverseTest
{

    @Test
    public void testReverse() throws Exception
    {
        assertEquals(0b011, Reverse.reverse(0b110));
        assertEquals(0b111010101, Reverse.reverse(0b101010111));
    }
}