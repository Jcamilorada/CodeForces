package codeforces.table_bowling;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import codeforces.table_bowling.TableBowling.Score;

/**
 * @author Juan Rada
 */
public class TableBowlingTest
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
        Score score1 = new Score("a", 1);
        Score score2 = new Score("b", 13);
        Score score3 = new Score("c", 1);

        TableBowling.solution(new Score[]{score1, score2, score3});
    }
}
