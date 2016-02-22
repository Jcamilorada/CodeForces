package primitive_types;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test suite for {@link Quotient}
 *
 */
public class QuotientTest
{

    @Test
    public void testQuotient() throws Exception
    {
        assertEquals(10, Quotient.quotient(20, 2));
    }
}