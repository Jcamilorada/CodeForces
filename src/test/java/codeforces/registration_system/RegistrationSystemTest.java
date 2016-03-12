package codeforces.registration_system;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

/**
 * Created by JuanC on 2/23/16.
 */
public class RegistrationSystemTest
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
    public void testSolution() throws Exception
    {
        RegistrationSystem.solution(new String[]{"abacaba", "acaba", "abacaba", "acab"});
    }
}