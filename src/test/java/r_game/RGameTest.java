package r_game;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Juan Rada
 */
public class RGameTest
{
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams()
    {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
        System.setErr(null);
    }

    @Test
    public void test1() throws IOException
    {
        RGame.solution(1);
        assertEquals("1\r\n", outContent.toString());
    }

    @Test
    public void test2() throws IOException
    {
        RGame.solution(2);
        assertEquals("2\r\n", outContent.toString());
    }

    @Test
    public void test3() throws IOException
    {
        RGame.solution(3);
        assertEquals("1\r\n", outContent.toString());
    }

    @Test
    public void test4() throws IOException
    {
        RGame.solution(5);
        assertEquals("1\r\n", outContent.toString());
    }
}
