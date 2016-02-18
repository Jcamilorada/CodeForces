package amr_and_music;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 *  Test suite for {@link ArmMusic}
 *
 * @author Juan Rada
 */
public class ArmMusicTest
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
    public void test1()
    {
        int[] learningDaysArray = {4, 3, 1, 2};
        int days = 10;

        ArmMusic.solution(learningDaysArray.clone(), days);
        outContent.toString();
    }
}
